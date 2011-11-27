package com.sahand.setting.persistence.management;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import org.slf4j.Logger;
import com.sahand.common.util.logger.SahandLogger;
import com.sahand.setting.data.SystemLookupInformation;
import com.sahand.setting.persistence.action.SystemSettingRepository;
import com.sahand.setting.persistence.business.Convertors;
import com.sahand.setting.persistence.model.SystemLookupTableTmp;

@Stateless
public class SystemLookupManagement implements Serializable {

	private static final long serialVersionUID = 1L;

	private Logger logger = SahandLogger.getSahandLogger(SystemLookupManagement.class);

	@Inject
	@SystemSettingRepository
	EntityManager entityManager;

	public boolean create(SystemLookupInformation systemLookupInformation) {
		System.out.println("in SystemLookupManagement : "+systemLookupInformation.toString());
		try {
			SystemLookupTableTmp systemLookupTable = new SystemLookupTableTmp();
			Convertors convertors = new Convertors();
			convertors.convert(systemLookupInformation, systemLookupTable);
			entityManager.persist(systemLookupTable);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
