
package com.sahand.setting.proxy.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3.1-hudson-417-SNAPSHOT
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SettingService", targetNamespace = "http://service.setting.sahand.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SettingService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String systemLookupCreate(
        @WebParam(name = "arg0", partName = "arg0")
        SystemLookupInformation arg0);

}