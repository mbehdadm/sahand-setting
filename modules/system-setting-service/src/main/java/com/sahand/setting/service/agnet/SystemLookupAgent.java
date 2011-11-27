package com.sahand.setting.service.agnet;

import java.io.Serializable;
import javax.ejb.EJB;
import org.slf4j.Logger;

import com.sahand.setting.data.*;
import com.sahand.setting.persistence.management.*;
import com.sahand.common.util.logger.SahandLogger;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

//@Named
//@SessionScoped
public class SystemLookupAgent implements Serializable {
	private static final long serialVersionUID = 1L;

	private Logger logger = SahandLogger.getSahandLogger(SystemLookupAgent.class);

	private String action;
	private boolean edited;
	private boolean created;

	@EJB
	private SystemLookupManagement systemLookupManagement;

	public boolean isCreated() {
		return created;
	}
	public void setCreated(boolean created) {
		this.created = created;
	}

	public boolean isEdited() {
		return edited;
	}
	public void setEdited(boolean edited) {
		this.edited = edited;
	}

	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String create(SystemLookupInformation systemLookupInformation) {
		String result = "... !";
		if (systemLookupInformation != null) {
			System.out.println("in SystemLookupAgent : "+systemLookupInformation.toString());
			System.out.println("in SystemLookupAgent : Call -> systemLookupManagement.create(systemLookupInformation) ");
			created = systemLookupManagement.create(systemLookupInformation);
			result = "result to import system lookup = " + created;
		}
		return result;
	}
}
