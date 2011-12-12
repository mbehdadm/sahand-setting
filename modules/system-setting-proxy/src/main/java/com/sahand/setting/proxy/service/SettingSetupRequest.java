
package com.sahand.setting.proxy.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for settingSetupRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="settingSetupRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.setting.sahand.com/}requestHeader">
 *       &lt;sequence>
 *         &lt;element name="lookupInformation" type="{http://service.setting.sahand.com/}systemLookupInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "settingSetupRequest", propOrder = {
    "lookupInformation"
})
public class SettingSetupRequest
    extends RequestHeader
{

    protected SystemLookupInformation lookupInformation;

    /**
     * Gets the value of the lookupInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SystemLookupInformation }
     *     
     */
    public SystemLookupInformation getLookupInformation() {
        return lookupInformation;
    }

    /**
     * Sets the value of the lookupInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemLookupInformation }
     *     
     */
    public void setLookupInformation(SystemLookupInformation value) {
        this.lookupInformation = value;
    }

}
