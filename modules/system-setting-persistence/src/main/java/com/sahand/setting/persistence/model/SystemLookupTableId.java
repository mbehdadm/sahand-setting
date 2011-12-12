package com.sahand.setting.persistence.model;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class SystemLookupTableId implements Serializable {

	@Column(name = "LKID", nullable = false, length = 6)
	private Integer id;
	@Column(name = "LKTAG", nullable = false, length = 30)
	private String tag;

	public SystemLookupTableId() {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SystemLookupTableId other = (SystemLookupTableId) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tag == null) {
			if (other.tag != null)
				return false;
		} else if (!tag.equals(other.tag))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SystemLookupTableId [id=" + id + ", tag=" + tag + "]";
	}
	
}