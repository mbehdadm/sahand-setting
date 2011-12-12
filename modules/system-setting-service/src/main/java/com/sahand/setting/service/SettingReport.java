package com.sahand.setting.service;

import com.sahand.setting.service.message.SettingReportRequest;
import com.sahand.setting.service.message.SettingReportResponse;

public interface SettingReport {	
	
	public SettingReportResponse loadSystemLookup(SettingReportRequest request);
}
