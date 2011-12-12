package com.sahand.setting.data;

import java.io.Serializable;

public class SystemLookupInformation implements Serializable{
	
	private static final long serialVersionUID = -3279973169966050774L;
	
	private Integer id;
	private String tag;
	private String fdesc;
	private String ldesc;
	
	private boolean autoGenerate = false;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getFdesc() {
		return fdesc;
	}
	public void setFdesc(String fdesc) {
		this.fdesc = fdesc;
	}

	public String getLdesc() {
		return ldesc;
	}
	public void setLdesc(String ldesc) {
		this.ldesc = ldesc;
	}
	

	public boolean isAutoGenerate() {
		return autoGenerate;
	}
	public void setAutoGenerate(boolean autoGenerate) {
		this.autoGenerate = autoGenerate;
	}
	@Override
	public String toString() {
		return "SystemLookupInformation [id=" + id + ", tag=" + tag
				+ ", fdesc=" + fdesc + ", ldesc=" + ldesc + ", autoGenerate="
				+ autoGenerate + "]";
	}
}
