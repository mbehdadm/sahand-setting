
package com.sahand.setting.proxy.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for settingReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="settingReportResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.setting.sahand.com/}responseHeader">
 *       &lt;sequence>
 *         &lt;element name="lookupInformations" type="{http://service.setting.sahand.com/}systemLookupInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "settingReportResponse", propOrder = {
    "lookupInformations",
    "totalCount"
})
public class SettingReportResponse
    extends ResponseHeader
{

    @XmlElement(nillable = true)
    protected List<SystemLookupInformation> lookupInformations;
    protected Integer totalCount;

    /**
     * Gets the value of the lookupInformations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lookupInformations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLookupInformations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemLookupInformation }
     * 
     * 
     */
    public List<SystemLookupInformation> getLookupInformations() {
        if (lookupInformations == null) {
            lookupInformations = new ArrayList<SystemLookupInformation>();
        }
        return this.lookupInformations;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
    }

}
