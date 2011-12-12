
package com.sahand.setting.proxy.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemLookupInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemLookupInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoGenerate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fdesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ldesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemLookupInformation", propOrder = {
    "autoGenerate",
    "fdesc",
    "id",
    "ldesc",
    "tag"
})
public class SystemLookupInformation {

    protected boolean autoGenerate;
    protected String fdesc;
    protected Integer id;
    protected String ldesc;
    protected String tag;

    /**
     * Gets the value of the autoGenerate property.
     * 
     */
    public boolean isAutoGenerate() {
        return autoGenerate;
    }

    /**
     * Sets the value of the autoGenerate property.
     * 
     */
    public void setAutoGenerate(boolean value) {
        this.autoGenerate = value;
    }

    /**
     * Gets the value of the fdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdesc() {
        return fdesc;
    }

    /**
     * Sets the value of the fdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdesc(String value) {
        this.fdesc = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the ldesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdesc() {
        return ldesc;
    }

    /**
     * Sets the value of the ldesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdesc(String value) {
        this.ldesc = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

}
