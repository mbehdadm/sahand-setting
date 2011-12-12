package com.sahand.setting.web.Jobs;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;

import com.sahand.setting.data.SystemLookupInformation;

@Named("AddJob")
public class AddJob implements Serializable{
	
	private com.sahand.setting.data.SystemLookupInformation systemLookupInformation;
	
	public com.sahand.setting.data.SystemLookupInformation getSystemLookupInformation() {
		return systemLookupInformation;
	}
	public void setSystemLookupInformation(
			com.sahand.setting.data.SystemLookupInformation systemLookupInformation) {
		this.systemLookupInformation = systemLookupInformation;
	}

	private Integer id;
	private String tag;
	private String fDesc;
	private String lDesc;
	
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
	public String getfDesc() {
		return fDesc;
	}
	public void setfDesc(String fDesc) {
		this.fDesc = fDesc;
	}
	public String getlDesc() {
		return lDesc;
	}
	public void setlDesc(String lDesc) {
		this.lDesc = lDesc;
	}
	
	public AddJob(){
		systemLookupInformation = new SystemLookupInformation();
	}
	
	public void AddJob(){
		
		System.out.println("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r in  AddJob.java : "+
			" getId = "+ getId()+
			" getTag = "+ getTag()+
			" getfDesc = "+ getfDesc()+
			" getlDesc = "+ getlDesc() +		
			"\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r");

		System.out.println("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r in  AddJob.java : systemLookupInformation -> "+
				" ID = "+ systemLookupInformation.getId()+
				" Tag = "+ systemLookupInformation.getTag()+
				" fDesc = "+ systemLookupInformation.getFdesc()+
				" lDesc = "+ systemLookupInformation.getLdesc() +		
				"\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r"
			);
	}
}
