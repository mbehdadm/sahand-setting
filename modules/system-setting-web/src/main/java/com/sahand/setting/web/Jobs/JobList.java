package com.sahand.setting.web.Jobs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.sahand.setting.proxy.service.SettingReportImpl;
import com.sahand.setting.proxy.service.SettingReportImplService;
import com.sahand.setting.proxy.service.SettingReportRequest;
import com.sahand.setting.proxy.service.SettingReportResponse;
import com.sahand.setting.proxy.service.SettingSetupImpl;
import com.sahand.setting.proxy.service.SettingSetupImplService;
import com.sahand.setting.proxy.service.SettingSetupRequest;
import com.sahand.setting.proxy.service.SystemLookupInformation;

@Named
@SessionScoped
public class JobList implements Serializable {

	private List<SystemLookupInformation> systemLookupInformations = new ArrayList<SystemLookupInformation>();
	private SystemLookupInformation systemLookupInformation = new SystemLookupInformation();
	
	private Integer id;
	private String tag;
	private String fdesc;
	private String ldesc;
	
	private static String action;
	private static boolean operation;
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		
		System.out.println("set action "+action);
		if(action.equals("Edit"))
			operation = true;
		else
			operation= false;
		System.out.println(operation+"set action "+action);

		this.action = action;
	}
	public boolean getOperation() {
		return operation;
	}
	public void setOperation(boolean operation) {
		this.operation = operation;
	}
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
	public List<SystemLookupInformation> getSystemLookupInformations() {
		return systemLookupInformations;
	}
	public void setSystemLookupInformations(
			List<SystemLookupInformation> systemLookupInformations) {
		this.systemLookupInformations = systemLookupInformations;
	}
	public SystemLookupInformation getSystemLookupInformation() {
		return systemLookupInformation;
	}
	public void setSystemLookupInformation(SystemLookupInformation systemLookupInformation) {
		this.systemLookupInformation = systemLookupInformation;

		System.out.println("in setSystemLookupInformation ... : id = "	+ systemLookupInformation.getId() + " tag = "+ systemLookupInformation.getTag() + " fdesc = "+ systemLookupInformation.getFdesc() + " ldesc = "+ systemLookupInformation.getLdesc());
	}

	public JobList() {
		super();

		LoadAll();
	}
	
	private void LoadAll(){		
		systemLookupInformations = GetAllJobs(systemLookupInformations);
	}
	
	private List<SystemLookupInformation> GetAllJobs(List<SystemLookupInformation> sli) {
		SettingReportImplService settingReportImplService = new SettingReportImplService();
		SettingReportImpl settingReportImpl = settingReportImplService.getSettingReportImplPort();
		SettingReportRequest settingReportRequest = new SettingReportRequest();
		SystemLookupInformation systemLookupInformation = new SystemLookupInformation();
		systemLookupInformation.setTag("Jobs");
		settingReportRequest.setLookupInformation(systemLookupInformation);
		SettingReportResponse settingReportResponse = settingReportImpl.loadSystemLookup(settingReportRequest);
		return settingReportResponse.getLookupInformations();
	}

	public void Delete() {
		System.out.println("in JobAction delete SystemLookupInformation : id"+ systemLookupInformation.getId() + " tag :"+ systemLookupInformation.getTag() + " Ldesc :"+ systemLookupInformation.getLdesc());

		SettingSetupImplService settingSetupImplService = new SettingSetupImplService();
		SettingSetupImpl settingSetupImpl = settingSetupImplService.getSettingSetupImplPort();
		SettingSetupRequest settingSetupRequest = new SettingSetupRequest();
		settingSetupRequest.setLookupInformation(systemLookupInformation);
		settingSetupImpl.deleteSystemLookup(settingSetupRequest);		
		
		LoadAll();
	}

	public void Edit() {
		System.out.println("in Edit setSystemLookupInformation ... : id = "
				+ systemLookupInformation.getId() + " tag = "
				+ systemLookupInformation.getTag() + " fdesc = "
				+ systemLookupInformation.getFdesc() + " ldesc = "
				+ systemLookupInformation.getLdesc());		
		
		SettingSetupImplService settingSetupImplService = new SettingSetupImplService();
		SettingSetupImpl settingSetupImpl = settingSetupImplService.getSettingSetupImplPort();
		SettingSetupRequest settingSetupRequest = new SettingSetupRequest();		
		settingSetupRequest.setLookupInformation(systemLookupInformation);
		settingSetupImpl.editSystemLookup(settingSetupRequest);	
		
		LoadAll();	
	}
	
	public void Add() {
		System.out.println("in Add ... : id = "+ getId() + " tag = "+ getTag() + " fdesc = " + getFdesc() + " ldesc = "+ getLdesc());
		
		SettingSetupImplService settingSetupImplService = new SettingSetupImplService();
		SettingSetupImpl settingSetupImpl = settingSetupImplService.getSettingSetupImplPort();
		SettingSetupRequest settingSetupRequest = new SettingSetupRequest();
		
		systemLookupInformation.setId(getId());
		systemLookupInformation.setTag(getTag());
		systemLookupInformation.setFdesc(getFdesc());
		systemLookupInformation.setLdesc(getLdesc());
		
		settingSetupRequest.setLookupInformation(systemLookupInformation);
		settingSetupImpl.createSystemLookup(settingSetupRequest);	
		
		LoadAll();		
	}
	
	public void setSelected(SystemLookupInformation information){
		System.out.println("injaaaaaaaaam");
		
		systemLookupInformation = information;
		
		
		
		
	}
}