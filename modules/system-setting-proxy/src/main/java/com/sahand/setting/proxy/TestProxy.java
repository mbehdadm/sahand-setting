package com.sahand.setting.proxy;

import com.sahand.setting.proxy.service.*;

public class TestProxy {
	public static void main(String[] args) {
		/*
		 * SettingSetupImplService settingSetupImplService = new
		 * SettingSetupImplService();
		 * 
		 * SettingSetupImpl settingService =
		 * settingSetupImplService.getSettingSetupImplPort();
		 * 
		 * SystemLookupInformation systemLookupInformation = new
		 * SystemLookupInformation (); systemLookupInformation.setId(10);
		 * systemLookupInformation.setTag("Jobs");
		 * systemLookupInformation.setFdesc("شغل1");
		 * systemLookupInformation.setLdesc("jobs1");
		 * 
		 * SettingSetupRequest settingSetupRequest = new SettingSetupRequest();
		 * settingSetupRequest.setLookupInformation(systemLookupInformation);
		 * 
		 * settingService.createSystemLookup(settingSetupRequest);
		 */
		
		SettingReportImplService settingReportImplService = new SettingReportImplService();
		SettingReportImpl settingReportImpl = settingReportImplService.getSettingReportImplPort();
		
		SettingReportRequest settingReportRequest = new SettingReportRequest(); 
		SystemLookupInformation systemLookupInformation = new SystemLookupInformation();
		systemLookupInformation.setTag("Jobs");
		settingReportRequest.setLookupInformation(systemLookupInformation);
		
		SettingReportResponse settingReportResponse = settingReportImpl.loadSystemLookup(settingReportRequest);
		
		for(SystemLookupInformation sli : settingReportResponse.getLookupInformations()){
			System.out.println(sli.getId());
			System.out.println(sli.getTag());
			System.out.println(sli.getFdesc());
			System.out.println(sli.getLdesc());
		}
	}
}
