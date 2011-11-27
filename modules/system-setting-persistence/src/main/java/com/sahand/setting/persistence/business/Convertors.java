package com.sahand.setting.persistence.business;

import java.io.Serializable;
import org.slf4j.Logger;
import com.sahand.common.util.logger.SahandLogger;
import com.sahand.setting.data.SystemLookupInformation;
import com.sahand.setting.persistence.management.SystemLookupManagement;
import com.sahand.setting.persistence.model.SystemLookupTableTmp;

public class Convertors implements Serializable {
	private static final long serialVersionUID = 1L;

	private Logger logger = SahandLogger
			.getSahandLogger(SystemLookupManagement.class);

	public void convert(SystemLookupInformation systemLookupInformation,
			SystemLookupTableTmp systemLookupTable) {
		systemLookupTable.setId(systemLookupInformation.getId());
		systemLookupTable.setTag(systemLookupInformation.getTag());
		systemLookupTable.setFdesc(systemLookupInformation.getFdesc());
		systemLookupTable.setLdesc(systemLookupInformation.getLdesc());
	}
}
