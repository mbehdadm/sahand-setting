package com.sahand.setting.service.message;

import com.sahand.common.util.message.RequestHeader;
import com.sahand.setting.data.SystemLookupInformation;

public class SettingReportRequest extends RequestHeader{
	
	private SystemLookupInformation lookupInformation;
	private Integer firstResult = 0;
	private Integer maxResult = 20; 
	
	public SystemLookupInformation getLookupInformation() {
		return lookupInformation;
	}

	public void setLookupInformation(SystemLookupInformation lookupInformation) {
		this.lookupInformation = lookupInformation;
	}
	

	public Integer getFirstResult() {
		return firstResult;
	}

	public void setFirstResult(Integer firstResult) {
		this.firstResult = firstResult;
	}

	public Integer getMaxResult() {
		return maxResult;
	}

	public void setMaxResult(Integer maxResult) {
		this.maxResult = maxResult;
	}

	@Override
	public String toString() {
		return "SettingReportRequest [lookupInformation=" + lookupInformation
				+ ", firstResult=" + firstResult + ", maxResult=" + maxResult
				+ ", toString()=" + super.toString() + "]";
	}
}
