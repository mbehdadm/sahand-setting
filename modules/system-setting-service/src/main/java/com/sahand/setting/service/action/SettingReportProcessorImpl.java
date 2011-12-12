package com.sahand.setting.service.action;

import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import org.slf4j.Logger;

import com.sahand.common.util.logger.SahandLogger;
import com.sahand.setting.data.SystemLookupInformation;
import com.sahand.setting.persistence.action.SystemLookupManagementImpl;
import com.sahand.setting.persistence.model.SystemLookupTable;
import com.sahand.setting.service.message.SettingReportRequest;
import com.sahand.setting.service.message.SettingReportResponse;

@Stateless
public class SettingReportProcessorImpl {
	private static Logger logger = SahandLogger.getSahandLogger(SettingReportProcessorImpl.class);

	@Resource
	private SessionContext context;

	@EJB
	private SystemLookupManagementImpl lookupManagementImpl;

	private SystemLookupTable lookupTable;

	public SettingReportResponse loadLookup(SettingReportRequest request) {
		SettingReportResponse response = new SettingReportResponse();
		try {
			SystemLookupInformation systemLookupInformation = request.getLookupInformation();

			List<SystemLookupTable> systemLookupTables = lookupManagementImpl.findAll(systemLookupInformation);
			
			for (SystemLookupTable systemLookupTable : systemLookupTables) {
				SystemLookupInformation information = new SystemLookupInformation(); 
				information = lookupManagementImpl.convertFrom(systemLookupTable,null);				
				response.getLookupInformations().add(information);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(response.toString());
		return response;
	}
}
