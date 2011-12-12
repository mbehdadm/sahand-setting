
package com.sahand.setting.proxy.service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sahand.setting.proxy.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sahand.setting.proxy.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseHeader }
     * 
     */
    public ResponseHeader createResponseHeader() {
        return new ResponseHeader();
    }

    /**
     * Create an instance of {@link SettingReportRequest }
     * 
     */
    public SettingReportRequest createSettingReportRequest() {
        return new SettingReportRequest();
    }

    /**
     * Create an instance of {@link Credential }
     * 
     */
    public Credential createCredential() {
        return new Credential();
    }

    /**
     * Create an instance of {@link SettingReportResponse }
     * 
     */
    public SettingReportResponse createSettingReportResponse() {
        return new SettingReportResponse();
    }

    /**
     * Create an instance of {@link SystemLookupInformation }
     * 
     */
    public SystemLookupInformation createSystemLookupInformation() {
        return new SystemLookupInformation();
    }

    /**
     * Create an instance of {@link LoadSystemLookup }
     * 
     */
    public LoadSystemLookup createLoadSystemLookup() {
        return new LoadSystemLookup();
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link LoadSystemLookupResponse }
     * 
     */
    public LoadSystemLookupResponse createLoadSystemLookupResponse() {
        return new LoadSystemLookupResponse();
    }

    /**
     * Create an instance of {@link Messages }
     * 
     */
    public Messages createMessages() {
        return new Messages();
    }

    /**
     * Create an instance of {@link SahandCore }
     * 
     */
    public SahandCore createSahandCore() {
        return new SahandCore();
    }

}
