//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.16 alle 10:57:04 AM CET 
//


package org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tMailclientProperties complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tMailclientProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="mailserver" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMailclientProperties", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/MailclientProperties")
public class TMailclientProperties {

    @XmlAttribute(name = "mailserver", required = true)
    protected String mailserver;

    /**
     * Recupera il valore della propriet� mailserver.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailserver() {
        return mailserver;
    }

    /**
     * Imposta il valore della propriet� mailserver.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailserver(String value) {
        this.mailserver = value;
    }

}
