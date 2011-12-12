
package com.sahand.setting.proxy.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.setting.sahand.com/}sahandCore">
 *       &lt;sequence>
 *         &lt;element name="failureReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messages" type="{http://service.setting.sahand.com/}messages" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://service.setting.sahand.com/}statusCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseHeader", propOrder = {
    "failureReasonCode",
    "messages",
    "statusCode"
})
@XmlSeeAlso({
    SettingReportResponse.class
})
public class ResponseHeader
    extends SahandCore
{

    protected String failureReasonCode;
    protected Messages messages;
    protected StatusCode statusCode;

    /**
     * Gets the value of the failureReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureReasonCode() {
        return failureReasonCode;
    }

    /**
     * Sets the value of the failureReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureReasonCode(String value) {
        this.failureReasonCode = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link Messages }
     *     
     */
    public Messages getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messages }
     *     
     */
    public void setMessages(Messages value) {
        this.messages = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    public StatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setStatusCode(StatusCode value) {
        this.statusCode = value;
    }

}
