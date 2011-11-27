package com.sahand.setting.service;

import com.sahand.setting.service.message.SettingSetupRequest;
import com.sahand.setting.service.message.SettingSetupResponse;

//@WebService 
//@SOAPBinding(style=Style.RPC)
public interface SettingSetup {
	
	public SettingSetupResponse createSystemLookup(SettingSetupRequest request);
}
