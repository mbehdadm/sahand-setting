package com.sahand.setting.persistence.action;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import org.slf4j.Logger;
import com.sahand.common.util.SequenceGenerator;
import com.sahand.common.util.logger.SahandLogger;
import com.sahand.setting.config.SettingConfigLoader;
import com.sahand.setting.data.SystemLookupInformation;
import com.sahand.setting.persistence.exception.SettingException;
import com.sahand.setting.persistence.model.SystemLookupTable;
import com.sahand.setting.persistence.model.SystemLookupTableId;

@Stateless
public class SystemLookupManagementImpl {
	private static Logger logger = SahandLogger.getSahandLogger(SystemLookupManagementImpl.class);
	
	@Inject
	@SystemSettingRepository
	private EntityManager entityManager;

	public SystemLookupInformation convertFrom(SystemLookupTable lookupTable,SystemLookupInformation lookupInformation) {
		if(lookupInformation == null)
			lookupInformation = new SystemLookupInformation();
		
		lookupInformation.setLdesc(lookupTable.getLatinDescription());
		lookupInformation.setId(lookupTable.getLookUpId().getId());
		lookupInformation.setFdesc(lookupTable.getDescription());
		lookupInformation.setTag(lookupTable.getLookUpId().getTag());
		
		return lookupInformation;
	}
	
	public SystemLookupTable convertFrom(SystemLookupInformation lookupInformation,SystemLookupTable lookupTable) {
		if(lookupTable == null)
			lookupTable = new SystemLookupTable();
		lookupTable.setLatinDescription(lookupInformation.getLdesc());
		SystemLookupTableId id = new SystemLookupTableId();
		id.setId(lookupInformation.getId());
		id.setTag(lookupInformation.getTag());
		
		lookupTable.setLookUpId(id);
		lookupTable.setDescription(lookupInformation.getFdesc());
		return lookupTable;
		
	}

	public SystemLookupTable edit(SystemLookupInformation lookupInformation) throws Exception {
		SystemLookupTable lookupTable = null;
		try {
			SystemLookupTableId id = new SystemLookupTableId();
			id.setId(lookupInformation.getId());
			id.setTag(lookupInformation.getTag());
			lookupTable = find(id);
			if(lookupTable == null)
				throw new SettingException("lookup.not.find");
			lookupTable = checkAndConvertFrom(lookupInformation,lookupTable);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return lookupTable;
	}

	public SystemLookupTable create(SystemLookupInformation lookupInformation) throws Exception {
		SystemLookupTable lookupTable = null;
		try {
			String lookupID ="";
			lookupTable = checkAndConvertFrom(lookupInformation,lookupTable);
			SystemLookupTableId id = new SystemLookupTableId();
			id.setTag(lookupTable.getLookUpId().getTag());
			if(lookupInformation.isAutoGenerate()){
				SystemLookupTable lookupTable_  = new SystemLookupTable();
				while(lookupTable_ != null){
					String key = SettingConfigLoader.getValue("lookup-seq");
					lookupID = SequenceGenerator.sequenceGenerator(entityManager, lookupID,key,null);
					id.setId(Integer.valueOf(lookupID));
					lookupTable_ = find(id);
				}
			}
			else{
				String key = SettingConfigLoader.getValue("lookup-seq");
				lookupID = String.valueOf(lookupInformation.getId());
				lookupID = SequenceGenerator.sequenceGenerator(null, lookupID,key,null);
				
				id.setId(Integer.valueOf(lookupID));
				SystemLookupTable lookupTable_  = find(id);
				if(lookupTable_ != null)
					throw new SettingException("duplicate.lookup.exist");
			}
			lookupTable.setLookUpId(id);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return lookupTable;
	}

	public SystemLookupTable find(SystemLookupTableId id) throws Exception {
		SystemLookupTable lookupTable = null;
		try {
			lookupTable = entityManager.find(SystemLookupTable.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lookupTable;
	}

	public List<SystemLookupTable> findAll(SystemLookupInformation information) throws Exception {
		List<SystemLookupTable> slts = new ArrayList<SystemLookupTable>();
		try {
			String query = "SELECT l FROM SystemLookupTable l WHERE ";
			if(information.getId() != null){
				query += "l.id.id = " +information.getId() +" AND ";	
			}
			if(information.getTag() != null && information.getTag().length() > 0){
				query += "l.id.tag = '" +information.getTag() + "' AND ";
			}
			if(information.getFdesc() != null && information.getFdesc().length() > 0){
				query += "l.id.description ='" +information.getFdesc() + "' AND ";
			}
			if(information.getLdesc() != null && information.getLdesc().length() > 0){
				query += "l.id.latinDescription = '" +information.getLdesc() + "' AND ";
			}
			
			query += "1=1";
			
			slts = (List<SystemLookupTable>) entityManager.createQuery(query).getResultList();
			System.out.println(slts.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return slts;
	}
	
	public void persist(SystemLookupTable lookupTable) throws Exception {
		try {
			entityManager.persist(lookupTable);
			entityManager.flush();

		} catch (Exception e) {
			e.printStackTrace();
			throw new SettingException("lookup.persist.exception");
		}
	}
	
	public void update(SystemLookupTable lookupTable) throws Exception {
		try {
			entityManager.merge(lookupTable);
		} catch (Exception e) {
			e.printStackTrace();
			throw new SettingException("lookup.update.exception");
		}
	}
	
	public void delete(SystemLookupTableId id) throws Exception {
		SystemLookupTable lookupTable = null;
		try {
			lookupTable = find(id);
			if(lookupTable == null)
				throw new SettingException("lookup.not.find");
			entityManager.remove(lookupTable);
		} catch (SettingException e) {
			throw e;
		}catch (Exception e) {
			e.printStackTrace();
			throw new SettingException("lookup.delete.exception");
		}
	}
	
	public SystemLookupTable checkAndConvertFrom(SystemLookupInformation lookupInformation,SystemLookupTable lookupTable) throws Exception{
		if(lookupTable == null)
			lookupTable = new SystemLookupTable();
		lookupTable.setLatinDescription(lookupInformation.getLdesc());
		SystemLookupTableId id = new SystemLookupTableId();
		id.setId(lookupInformation.getId());
		id.setTag(lookupInformation.getTag());
		lookupTable.setLookUpId(id);
		lookupTable.setDescription(lookupInformation.getFdesc());
		logger.debug(lookupTable.toString());
		return lookupTable;
	}

	public SystemLookupTable getSystemLookupTable(SystemLookupTableId id) throws Exception {
		SystemLookupTable lookupTable = null;
		try {
			lookupTable = find(id);
			if(lookupTable == null)
				throw new SettingException("lookup.not.find");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return lookupTable;
	}
}
