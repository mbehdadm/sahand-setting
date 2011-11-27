package com.sahand.setting.proxy;

import com.sahand.setting.proxy.service.SettingService;
import com.sahand.setting.proxy.service.SettingServiceImplService;
import com.sahand.setting.proxy.service.SystemLookupInformation;


public class TestProxy {
	public static void main(String[] args) {
		
		SettingServiceImplService settingServiceImplService = new SettingServiceImplService();
		
		SettingService settingService = settingServiceImplService.getSettingServiceImplPort();
		
		SystemLookupInformation systemLookupInformation = new SystemLookupInformation ();
		systemLookupInformation.setId(10);
		systemLookupInformation.setTag("Jooooobs");
		systemLookupInformation.setFdesc("شغل1");
		systemLookupInformation.setLdesc("jooobs1");
		
		System.out.println(settingService.systemLookupCreate(systemLookupInformation));
		
	}
}
