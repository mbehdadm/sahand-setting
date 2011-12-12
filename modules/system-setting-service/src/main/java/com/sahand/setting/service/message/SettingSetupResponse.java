package com.sahand.setting.service.message;

import com.sahand.common.util.message.ResponseHeader;
import com.sahand.setting.data.SystemLookupInformation;

public class SettingSetupResponse extends ResponseHeader {

	private SystemLookupInformation lookupInformation;

	public SystemLookupInformation getLookupInformation() {
		return lookupInformation;
	}

	public void setLookupInformation(SystemLookupInformation lookupInformation) {
		this.lookupInformation = lookupInformation;
	}

	@Override
	public String toString() {
		return "IssuerSetupResponse [lookupInformation=" + lookupInformation
				+ ", toString()=" + super.toString() + "]";
	}
}
