//
// Questo file Ŕ stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrÓ persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.16 alle 10:57:04 AM CET 
//


package org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tNodeTemplate complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tNodeTemplate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/tosca/ns/2011/12}tEntityTemplate">
 *       &lt;sequence>
 *         &lt;element name="Requirements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Requirement" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tRequirement" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Capabilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Capability" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tCapability" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Policies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Policy" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tPolicy" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DeploymentArtifacts" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tDeploymentArtifacts" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="minInstances" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;attribute name="maxInstances" default="1">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *                 &lt;pattern value="([1-9]+[0-9]*)"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="unbounded"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tNodeTemplate", propOrder = {
    "requirements",
    "capabilities",
    "policies",
    "deploymentArtifacts"
})
public class TNodeTemplate
    extends TEntityTemplate
{

    @XmlElement(name = "Requirements")
    protected TNodeTemplate.Requirements requirements;
    @XmlElement(name = "Capabilities")
    protected TNodeTemplate.Capabilities capabilities;
    @XmlElement(name = "Policies")
    protected TNodeTemplate.Policies policies;
    @XmlElement(name = "DeploymentArtifacts")
    protected TDeploymentArtifacts deploymentArtifacts;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "minInstances")
    protected Integer minInstances;
    @XmlAttribute(name = "maxInstances")
    protected String maxInstances;

    /**
     * Recupera il valore della proprietÓ requirements.
     * 
     * @return
     *     possible object is
     *     {@link TNodeTemplate.Requirements }
     *     
     */
    public TNodeTemplate.Requirements getRequirements() {
        return requirements;
    }

    /**
     * Imposta il valore della proprietÓ requirements.
     * 
     * @param value
     *     allowed object is
     *     {@link TNodeTemplate.Requirements }
     *     
     */
    public void setRequirements(TNodeTemplate.Requirements value) {
        this.requirements = value;
    }

    /**
     * Recupera il valore della proprietÓ capabilities.
     * 
     * @return
     *     possible object is
     *     {@link TNodeTemplate.Capabilities }
     *     
     */
    public TNodeTemplate.Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Imposta il valore della proprietÓ capabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link TNodeTemplate.Capabilities }
     *     
     */
    public void setCapabilities(TNodeTemplate.Capabilities value) {
        this.capabilities = value;
    }

    /**
     * Recupera il valore della proprietÓ policies.
     * 
     * @return
     *     possible object is
     *     {@link TNodeTemplate.Policies }
     *     
     */
    public TNodeTemplate.Policies getPolicies() {
        return policies;
    }

    /**
     * Imposta il valore della proprietÓ policies.
     * 
     * @param value
     *     allowed object is
     *     {@link TNodeTemplate.Policies }
     *     
     */
    public void setPolicies(TNodeTemplate.Policies value) {
        this.policies = value;
    }

    /**
     * Recupera il valore della proprietÓ deploymentArtifacts.
     * 
     * @return
     *     possible object is
     *     {@link TDeploymentArtifacts }
     *     
     */
    public TDeploymentArtifacts getDeploymentArtifacts() {
        return deploymentArtifacts;
    }

    /**
     * Imposta il valore della proprietÓ deploymentArtifacts.
     * 
     * @param value
     *     allowed object is
     *     {@link TDeploymentArtifacts }
     *     
     */
    public void setDeploymentArtifacts(TDeploymentArtifacts value) {
        this.deploymentArtifacts = value;
    }

    /**
     * Recupera il valore della proprietÓ name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietÓ name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietÓ minInstances.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMinInstances() {
        if (minInstances == null) {
            return  1;
        } else {
            return minInstances;
        }
    }

    /**
     * Imposta il valore della proprietÓ minInstances.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinInstances(Integer value) {
        this.minInstances = value;
    }

    /**
     * Recupera il valore della proprietÓ maxInstances.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxInstances() {
        if (maxInstances == null) {
            return "1";
        } else {
            return maxInstances;
        }
    }

    /**
     * Imposta il valore della proprietÓ maxInstances.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxInstances(String value) {
        this.maxInstances = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Capability" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tCapability" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "capability"
    })
    public static class Capabilities {

        @XmlElement(name = "Capability", required = true)
        protected List<TCapability> capability;

        /**
         * Gets the value of the capability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the capability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCapability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TCapability }
         * 
         * 
         */
        public List<TCapability> getCapability() {
            if (capability == null) {
                capability = new ArrayList<TCapability>();
            }
            return this.capability;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Policy" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tPolicy" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "policy"
    })
    public static class Policies {

        @XmlElement(name = "Policy", required = true)
        protected List<TPolicy> policy;

        /**
         * Gets the value of the policy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the policy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPolicy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TPolicy }
         * 
         * 
         */
        public List<TPolicy> getPolicy() {
            if (policy == null) {
                policy = new ArrayList<TPolicy>();
            }
            return this.policy;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Requirement" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tRequirement" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requirement"
    })
    public static class Requirements {

        @XmlElement(name = "Requirement", required = true)
        protected List<TRequirement> requirement;

        /**
         * Gets the value of the requirement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requirement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequirement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRequirement }
         * 
         * 
         */
        public List<TRequirement> getRequirement() {
            if (requirement == null) {
                requirement = new ArrayList<TRequirement>();
            }
            return this.requirement;
        }

    }

}
