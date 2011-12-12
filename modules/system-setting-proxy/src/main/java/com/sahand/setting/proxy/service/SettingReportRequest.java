
package com.sahand.setting.proxy.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for settingReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="settingReportRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.setting.sahand.com/}requestHeader">
 *       &lt;sequence>
 *         &lt;element name="firstResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lookupInformation" type="{http://service.setting.sahand.com/}systemLookupInformation" minOccurs="0"/>
 *         &lt;element name="maxResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "settingReportRequest", propOrder = {
    "firstResult",
    "lookupInformation",
    "maxResult"
})
public class SettingReportRequest
    extends RequestHeader
{

    protected Integer firstResult;
    protected SystemLookupInformation lookupInformation;
    protected Integer maxResult;

    /**
     * Gets the value of the firstResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstResult() {
        return firstResult;
    }

    /**
     * Sets the value of the firstResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstResult(Integer value) {
        this.firstResult = value;
    }

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

    /**
     * Gets the value of the maxResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResult() {
        return maxResult;
    }

    /**
     * Sets the value of the maxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResult(Integer value) {
        this.maxResult = value;
    }

}
