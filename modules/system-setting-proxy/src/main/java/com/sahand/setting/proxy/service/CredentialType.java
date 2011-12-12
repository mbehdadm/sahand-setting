
package com.sahand.setting.proxy.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for credentialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="credentialType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PASSWORD"/>
 *     &lt;enumeration value="FINGERPRINT"/>
 *     &lt;enumeration value="SMARTCARD"/>
 *     &lt;enumeration value="TICKET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "credentialType")
@XmlEnum
public enum CredentialType {

    PASSWORD,
    FINGERPRINT,
    SMARTCARD,
    TICKET;

    public String value() {
        return name();
    }

    public static CredentialType fromValue(String v) {
        return valueOf(v);
    }

}
