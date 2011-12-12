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
import com.sahand.common.util.enumeration.OperationType;
import com.sahand.common.util.logger.SahandLogger;
import com.sahand.setting.service.action.SettingSetupProcessorImpl;
import com.sahand.setting.service.message.SettingSetupRequest;
import com.sahand.setting.service.message.SettingSetupResponse;

@Stateless
@WebService
@WebContext(contextRoot = "setting-service")
public class SettingSetupImpl implements SettingSetup {
	private static Logger logger = SahandLogger.getSahandLogger(SettingSetupImpl.class);

	@Resource
	private WebServiceContext wsContext;

	@EJB
	private SettingSetupProcessorImpl setupProcessorImpl;

	@Override
	public SettingSetupResponse createSystemLookup(SettingSetupRequest request) {
		SettingSetupResponse response = new SettingSetupResponse();

		MessageContext mc = wsContext.getMessageContext();
		HttpServletRequest req = (HttpServletRequest) mc.get(MessageContext.SERVLET_REQUEST);
		String ip = req.getRemoteAddr();
		logger.debug("Client Ip : " + ip);
		request.setClientIpAddress(ip);

		response = setupProcessorImpl.lookupFactory(request,OperationType.CREATE);

		return response;
	}

	@Override
	public SettingSetupResponse deleteSystemLookup(SettingSetupRequest request) {
		
		MessageContext mc = wsContext.getMessageContext();
		HttpServletRequest req = (HttpServletRequest) mc.get(MessageContext.SERVLET_REQUEST);
		String ip = req.getRemoteAddr();
		logger.debug("Client Ip : " + ip);
		request.setClientIpAddress(ip);
		
		SettingSetupResponse settingSetupResponse = new SettingSetupResponse(); 
		
		settingSetupResponse = setupProcessorImpl.lookupFactory(request,OperationType.DELETE);
		
		return settingSetupResponse;
	}

	@Override
	public SettingSetupResponse editSystemLookup(SettingSetupRequest request) {

		MessageContext mc = wsContext.getMessageContext();
		HttpServletRequest req = (HttpServletRequest) mc.get(MessageContext.SERVLET_REQUEST);
		String ip = req.getRemoteAddr();
		logger.debug("Client Ip : " + ip);
		request.setClientIpAddress(ip);
		
		SettingSetupResponse settingSetupResponse = new SettingSetupResponse(); 
		
		settingSetupResponse = setupProcessorImpl.lookupFactory(request,OperationType.UPDATE);
		
		return settingSetupResponse;
		
	}
}