package com.sahand.setting.service.message;

import java.util.ArrayList;
import java.util.List;

import com.sahand.common.util.message.ResponseHeader;
import com.sahand.setting.data.SystemLookupInformation;

public class SettingReportResponse extends ResponseHeader {

	private List<SystemLookupInformation> lookupInformations = new ArrayList<SystemLookupInformation>();
	
	private Integer totalCount;
	

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<SystemLookupInformation> getLookupInformations() {
		return lookupInformations;
	}

	public void setLookupInformations(
			List<SystemLookupInformation> lookupInformations) {
		this.lookupInformations = lookupInformations;
	}

	@Override
	public String toString() {
		return "SettingReportResponse [lookupInformations="
				+ lookupInformations + ", totalCount=" + totalCount
				+ ", toString()=" + super.toString() + "]";
	}

 }
