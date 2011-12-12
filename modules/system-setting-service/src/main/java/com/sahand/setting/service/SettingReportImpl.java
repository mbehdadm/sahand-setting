package com.sahand.setting.service;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.jboss.wsf.spi.annotation.WebContext;
import org.slf4j.Logger;

import com.sahand.common.util.logger.SahandLogger;
import com.sahand.setting.service.action.SettingReportProcessorImpl;
import com.sahand.setting.service.message.SettingReportRequest;
import com.sahand.setting.service.message.SettingReportResponse;

@Stateless
@WebService
@WebContext(contextRoot = "setting-service")
public class SettingReportImpl implements SettingReport {
	private static Logger logger = SahandLogger.getSahandLogger(SettingReportImpl.class);

	@Resource
	private WebServiceContext wsContext;

	@EJB
	private SettingReportProcessorImpl reportProcessorImpl;


	@Override
	public SettingReportResponse loadSystemLookup(SettingReportRequest request) {
		SettingReportResponse responses = new SettingReportResponse();
		MessageContext mc = wsContext.getMessageContext();
		HttpServletRequest req = (HttpServletRequest) mc.get(MessageContext.SERVLET_REQUEST);
		String ip = req.getRemoteAddr();
		logger.debug("Client Ip : " + ip);
		request.setClientIpAddress(ip);

		responses = reportProcessorImpl.loadLookup(request);

		return responses;
	}
}