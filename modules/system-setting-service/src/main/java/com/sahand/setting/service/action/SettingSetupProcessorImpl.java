package com.sahand.setting.service.action;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import org.slf4j.Logger;

import com.sahand.common.util.enumeration.OperationType;
import com.sahand.common.util.logger.SahandLogger;
import com.sahand.common.util.message.ResponseGenerator;
import com.sahand.common.util.message.StatusCode;
import com.sahand.setting.data.SystemLookupInformation;
import com.sahand.setting.persistence.action.SystemLookupManagementImpl;
import com.sahand.setting.persistence.exception.SettingException;
import com.sahand.setting.persistence.model.SystemLookupTable;
import com.sahand.setting.persistence.model.SystemLookupTableId;
import com.sahand.setting.service.message.SettingSetupRequest;
import com.sahand.setting.service.message.SettingSetupResponse;


@Stateless
public class SettingSetupProcessorImpl {


	private static Logger logger = SahandLogger.getSahandLogger(SettingSetupProcessorImpl.class);

	@Resource
	private SessionContext context;

	
	@EJB
	private SystemLookupManagementImpl lookupManagementImpl;
	
	private SystemLookupTable lookupTable;

	public SettingSetupResponse lookupFactory(SettingSetupRequest request,
			OperationType type) {
		SettingSetupResponse response = new SettingSetupResponse();
		try {
			SystemLookupInformation lookupInformation = request.getLookupInformation();
			String key = null;
			logger.debug("Operation type : "+type);
			if(type == OperationType.UPDATE){
				key = "lookup.update.success";
				lookupInformation = editLookup(lookupInformation);
			}
			else if(type == OperationType.CREATE){
				key = "lookup.create.success";
				lookupInformation = createLookup(lookupInformation);
				
			}
			else if(type == OperationType.DELETE){
				key = "lookup.delete.success";
				SystemLookupTableId id = new SystemLookupTableId();
				id.setId(lookupInformation.getId());
				id.setTag(lookupInformation.getTag());
				deleteLookup(id);
			}
			else{
				throw new SettingException("operation.type.not.define");

			}

			response = (SettingSetupResponse)ResponseGenerator.generate(StatusCode.SUCCESSFUL, key,SettingSetupResponse.class);
			response.setLookupInformation(lookupInformation);

		} catch (SettingException e) {
			context.setRollbackOnly();
			response = (SettingSetupResponse)ResponseGenerator.generate(StatusCode.FAILED,e.getMessage(),SettingSetupResponse.class);
		}catch (Exception e) {
			e.printStackTrace();
			context.setRollbackOnly();
			response = (SettingSetupResponse)ResponseGenerator.generate(StatusCode.FAILED,"unkwnown.error.occured",SettingSetupResponse.class);
		}
		return response;
	}



	// Lookup create - edit
	public SystemLookupInformation createLookup(SystemLookupInformation lookupInformation) throws Exception{
		lookupTable = lookupManagementImpl.create(lookupInformation);
		logger.debug(lookupTable.toString());
		lookupManagementImpl.persist(lookupTable);
		lookupInformation = lookupManagementImpl.convertFrom(lookupTable,lookupInformation);
		return lookupInformation;
	}
	public SystemLookupInformation editLookup(SystemLookupInformation lookupInformation) throws Exception{
		lookupTable = lookupManagementImpl.edit(lookupInformation);
		logger.debug(lookupTable.toString());
		lookupManagementImpl.update(lookupTable);
		lookupInformation = lookupManagementImpl.convertFrom(lookupTable,lookupInformation);
		return lookupInformation;
	}
	public void deleteLookup(SystemLookupTableId id) throws Exception{
		lookupManagementImpl.delete(id);
	}



}
