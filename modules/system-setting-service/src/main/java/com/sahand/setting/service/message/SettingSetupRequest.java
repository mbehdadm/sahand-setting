package com.sahand.setting.service.message;

import com.sahand.common.util.message.RequestHeader;
import com.sahand.setting.data.SystemLookupInformation;

public class SettingSetupRequest extends RequestHeader{
	
	private SystemLookupInformation lookupInformation;

	public SystemLookupInformation getLookupInformation() {
		return lookupInformation;
	}

	public void setLookupInformation(SystemLookupInformation lookupInformation) {
		this.lookupInformation = lookupInformation;
	}

	@Override
	public String toString() {
		return "IssuerSetupRequest [lookupInformation=" + lookupInformation
				+ ", toString()=" + super.toString() + "]";
	}
		
	
	
}
