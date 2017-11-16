//
// Questo file Ŕ stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrÓ persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.16 alle 10:57:04 AM CET 
//


package org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per tNodeTypeImplementation complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tNodeTypeImplementation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/tosca/ns/2011/12}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="Tags" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tTags" minOccurs="0"/>
 *         &lt;element name="DerivedFrom" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="nodeTypeImplementationRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequiredContainerFeatures" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tRequiredContainerFeatures" minOccurs="0"/>
 *         &lt;element name="ImplementationArtifacts" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tImplementationArtifacts" minOccurs="0"/>
 *         &lt;element name="DeploymentArtifacts" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tDeploymentArtifacts" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="nodeType" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="abstract" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoolean" default="no" />
 *       &lt;attribute name="final" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoolean" default="no" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tNodeTypeImplementation", propOrder = {
    "tags",
    "derivedFrom",
    "requiredContainerFeatures",
    "implementationArtifacts",
    "deploymentArtifacts"
})
public class TNodeTypeImplementation
    extends TExtensibleElements
{

    @XmlElement(name = "Tags")
    protected TTags tags;
    @XmlElement(name = "DerivedFrom")
    protected TNodeTypeImplementation.DerivedFrom derivedFrom;
    @XmlElement(name = "RequiredContainerFeatures")
    protected TRequiredContainerFeatures requiredContainerFeatures;
    @XmlElement(name = "ImplementationArtifacts")
    protected TImplementationArtifacts implementationArtifacts;
    @XmlElement(name = "DeploymentArtifacts")
    protected TDeploymentArtifacts deploymentArtifacts;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "targetNamespace")
    @XmlSchemaType(name = "anyURI")
    protected String targetNamespace;
    @XmlAttribute(name = "nodeType", required = true)
    protected QName nodeType;
    @XmlAttribute(name = "abstract")
    protected TBoolean _abstract;
    @XmlAttribute(name = "final")
    protected TBoolean _final;

    /**
     * Recupera il valore della proprietÓ tags.
     * 
     * @return
     *     possible object is
     *     {@link TTags }
     *     
     */
    public TTags getTags() {
        return tags;
    }

    /**
     * Imposta il valore della proprietÓ tags.
     * 
     * @param value
     *     allowed object is
     *     {@link TTags }
     *     
     */
    public void setTags(TTags value) {
        this.tags = value;
    }

    /**
     * Recupera il valore della proprietÓ derivedFrom.
     * 
     * @return
     *     possible object is
     *     {@link TNodeTypeImplementation.DerivedFrom }
     *     
     */
    public TNodeTypeImplementation.DerivedFrom getDerivedFrom() {
        return derivedFrom;
    }

    /**
     * Imposta il valore della proprietÓ derivedFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link TNodeTypeImplementation.DerivedFrom }
     *     
     */
    public void setDerivedFrom(TNodeTypeImplementation.DerivedFrom value) {
        this.derivedFrom = value;
    }

    /**
     * Recupera il valore della proprietÓ requiredContainerFeatures.
     * 
     * @return
     *     possible object is
     *     {@link TRequiredContainerFeatures }
     *     
     */
    public TRequiredContainerFeatures getRequiredContainerFeatures() {
        return requiredContainerFeatures;
    }

    /**
     * Imposta il valore della proprietÓ requiredContainerFeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link TRequiredContainerFeatures }
     *     
     */
    public void setRequiredContainerFeatures(TRequiredContainerFeatures value) {
        this.requiredContainerFeatures = value;
    }

    /**
     * Recupera il valore della proprietÓ implementationArtifacts.
     * 
     * @return
     *     possible object is
     *     {@link TImplementationArtifacts }
     *     
     */
    public TImplementationArtifacts getImplementationArtifacts() {
        return implementationArtifacts;
    }

    /**
     * Imposta il valore della proprietÓ implementationArtifacts.
     * 
     * @param value
     *     allowed object is
     *     {@link TImplementationArtifacts }
     *     
     */
    public void setImplementationArtifacts(TImplementationArtifacts value) {
        this.implementationArtifacts = value;
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
     * Recupera il valore della proprietÓ targetNamespace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * Imposta il valore della proprietÓ targetNamespace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNamespace(String value) {
        this.targetNamespace = value;
    }

    /**
     * Recupera il valore della proprietÓ nodeType.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getNodeType() {
        return nodeType;
    }

    /**
     * Imposta il valore della proprietÓ nodeType.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setNodeType(QName value) {
        this.nodeType = value;
    }

    /**
     * Recupera il valore della proprietÓ abstract.
     * 
     * @return
     *     possible object is
     *     {@link TBoolean }
     *     
     */
    public TBoolean getAbstract() {
        if (_abstract == null) {
            return TBoolean.NO;
        } else {
            return _abstract;
        }
    }

    /**
     * Imposta il valore della proprietÓ abstract.
     * 
     * @param value
     *     allowed object is
     *     {@link TBoolean }
     *     
     */
    public void setAbstract(TBoolean value) {
        this._abstract = value;
    }

    /**
     * Recupera il valore della proprietÓ final.
     * 
     * @return
     *     possible object is
     *     {@link TBoolean }
     *     
     */
    public TBoolean getFinal() {
        if (_final == null) {
            return TBoolean.NO;
        } else {
            return _final;
        }
    }

    /**
     * Imposta il valore della proprietÓ final.
     * 
     * @param value
     *     allowed object is
     *     {@link TBoolean }
     *     
     */
    public void setFinal(TBoolean value) {
        this._final = value;
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
     *       &lt;attribute name="nodeTypeImplementationRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DerivedFrom {

        @XmlAttribute(name = "nodeTypeImplementationRef", required = true)
        protected QName nodeTypeImplementationRef;

        /**
         * Recupera il valore della proprietÓ nodeTypeImplementationRef.
         * 
         * @return
         *     possible object is
         *     {@link QName }
         *     
         */
        public QName getNodeTypeImplementationRef() {
            return nodeTypeImplementationRef;
        }

        /**
         * Imposta il valore della proprietÓ nodeTypeImplementationRef.
         * 
         * @param value
         *     allowed object is
         *     {@link QName }
         *     
         */
        public void setNodeTypeImplementationRef(QName value) {
            this.nodeTypeImplementationRef = value;
        }

    }

}
