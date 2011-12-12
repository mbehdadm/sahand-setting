package com.sahand.setting.persistence.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "SYSLKUPTBL")
public class SystemLookupTableTmp implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // SYSLKUPTBL LKID
	private String tag; // SYSLKUPTBL LKTAG
	private String fdesc; // SYSLKUPTBL LKDESC
	private String ldesc; // SYSLKUPTBL LKLDESC

	public SystemLookupTableTmp() {
	}

	@Id
	@Column(name = "LKID")
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "LKTAG")
	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Column(name = "LKDESC")
	public String getFdesc() {
		return this.fdesc;
	}

	public void setFdesc(String fdesc) {
		this.fdesc = fdesc;
	}

	@Column(name = "LKLDESC")
	public String getLdesc() {
		return this.ldesc;
	}

	public void setLdesc(String ldesc) {
		this.ldesc = ldesc;
	}
}