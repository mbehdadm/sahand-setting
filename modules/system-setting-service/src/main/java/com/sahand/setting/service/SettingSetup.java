package com.sahand.setting.service;

import com.sahand.setting.service.message.SettingSetupRequest;
import com.sahand.setting.service.message.SettingSetupResponse;

public interface SettingSetup {	
	public SettingSetupResponse createSystemLookup(SettingSetupRequest request);
	
	public SettingSetupResponse editSystemLookup(SettingSetupRequest request);
	
	public SettingSetupResponse deleteSystemLookup(SettingSetupRequest request);
}
