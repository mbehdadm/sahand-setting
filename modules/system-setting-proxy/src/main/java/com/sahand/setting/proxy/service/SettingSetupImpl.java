
package com.sahand.setting.proxy.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3.1-hudson-417-SNAPSHOT
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SettingSetupImpl", targetNamespace = "http://service.setting.sahand.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SettingSetupImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.sahand.setting.proxy.service.SettingSetupResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createSystemLookup", targetNamespace = "http://service.setting.sahand.com/", className = "com.sahand.setting.proxy.service.CreateSystemLookup")
    @ResponseWrapper(localName = "createSystemLookupResponse", targetNamespace = "http://service.setting.sahand.com/", className = "com.sahand.setting.proxy.service.CreateSystemLookupResponse")
    public SettingSetupResponse createSystemLookup(
        @WebParam(name = "arg0", targetNamespace = "")
        SettingSetupRequest arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.sahand.setting.proxy.service.SettingSetupResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editSystemLookup", targetNamespace = "http://service.setting.sahand.com/", className = "com.sahand.setting.proxy.service.EditSystemLookup")
    @ResponseWrapper(localName = "editSystemLookupResponse", targetNamespace = "http://service.setting.sahand.com/", className = "com.sahand.setting.proxy.service.EditSystemLookupResponse")
    public SettingSetupResponse editSystemLookup(
        @WebParam(name = "arg0", targetNamespace = "")
        SettingSetupRequest arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.sahand.setting.proxy.service.SettingSetupResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteSystemLookup", targetNamespace = "http://service.setting.sahand.com/", className = "com.sahand.setting.proxy.service.DeleteSystemLookup")
    @ResponseWrapper(localName = "deleteSystemLookupResponse", targetNamespace = "http://service.setting.sahand.com/", className = "com.sahand.setting.proxy.service.DeleteSystemLookupResponse")
    public SettingSetupResponse deleteSystemLookup(
        @WebParam(name = "arg0", targetNamespace = "")
        SettingSetupRequest arg0);

}
