package com.sahand.setting.persistence.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "SYSLKUPTBL")
public class SystemLookupTable implements Serializable {

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "lkid", column = @Column(name = "LKID", nullable = false, length = 6)),
			@AttributeOverride(name = "lktag", column = @Column(name = "LKTAG", nullable = false, length = 30)) })
	private SystemLookupTableId lookUpId;
	@Column(name = "LKDESC", length = 63)
	private String description;
	@Column(name = "LKLDESC", length = 63)
	private String latinDescription;

	public SystemLookupTableId getLookUpId() {
		return lookUpId;
	}

	public void setLookUpId(SystemLookupTableId lookUpId) {
		this.lookUpId = lookUpId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLatinDescription() {
		return latinDescription;
	}

	public void setLatinDescription(String latinDescription) {
		this.latinDescription = latinDescription;
	}

	@Override
	public String toString() {
		return "SystemLookupTable [lookUpId=" + lookUpId + ", description="
				+ description + ", latinDescription=" + latinDescription + "]";
	}
	
}