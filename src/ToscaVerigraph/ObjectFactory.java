//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.16 alle 10:57:04 AM CET 
//


package org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph package. 
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

    private final static QName _FirewallProperties_QNAME = new QName("http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/FirewallProperties", "FirewallProperties");
    private final static QName _Documentation_QNAME = new QName("http://docs.oasis-open.org/tosca/ns/2011/12", "documentation");
    private final static QName _MailserverProperties_QNAME = new QName("http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/MailserverProperties", "MailserverProperties");
    private final static QName _WebserverProperties_QNAME = new QName("http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/WebserverProperties", "WebserverProperties");
    private final static QName _EndpointProperties_QNAME = new QName("http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/EndpointProperties", "EndpointProperties");
    private final static QName _VpnExitProperties_QNAME = new QName("http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/VpnExitProperties", "VpnExitProperties");
    private final static QName _MailclientProperties_QNAME = new QName("http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/MailclientProperties", "MailclientProperties");
    private final static QName _DpiProperties_QNAME = new QName("http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/DpiProperties", "DpiProperties");
    private final static QName _FieldModifierProperties_QNAME = new QName("http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/FieldModifierProperties", "FieldModifierProperties");
    private final static QName _CacheProperties_QNAME = new QName("http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/CacheProperties", "CacheProperties");
    private final static QName _NatProperties_QNAME = new QName("http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/NatProperties", "NatProperties");
    private final static QName _AntispamProperties_QNAME = new QName("http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/AntispamProperties", "AntispamProperties");
    private final static QName _VpnAccessProperties_QNAME = new QName("http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/VpnAccessProperties", "VpnAccessProperties");
    private final static QName _WebclientProperties_QNAME = new QName("http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/WebclientProperties", "WebclientProperties");
    private final static QName _EndhostProperties_QNAME = new QName("http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/EndhostProperties", "EndhostProperties");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TDefinitions }
     * 
     */
    public TDefinitions createTDefinitions() {
        return new TDefinitions();
    }

    /**
     * Create an instance of {@link TFirewallProperties }
     * 
     */
    public TFirewallProperties createTFirewallProperties() {
        return new TFirewallProperties();
    }

    /**
     * Create an instance of {@link TExportedOperation }
     * 
     */
    public TExportedOperation createTExportedOperation() {
        return new TExportedOperation();
    }

    /**
     * Create an instance of {@link TImplementationArtifacts }
     * 
     */
    public TImplementationArtifacts createTImplementationArtifacts() {
        return new TImplementationArtifacts();
    }

    /**
     * Create an instance of {@link TNodeTemplate }
     * 
     */
    public TNodeTemplate createTNodeTemplate() {
        return new TNodeTemplate();
    }

    /**
     * Create an instance of {@link TRelationshipTemplate }
     * 
     */
    public TRelationshipTemplate createTRelationshipTemplate() {
        return new TRelationshipTemplate();
    }

    /**
     * Create an instance of {@link TRelationshipTemplate.RelationshipConstraints }
     * 
     */
    public TRelationshipTemplate.RelationshipConstraints createTRelationshipTemplateRelationshipConstraints() {
        return new TRelationshipTemplate.RelationshipConstraints();
    }

    /**
     * Create an instance of {@link TPlan }
     * 
     */
    public TPlan createTPlan() {
        return new TPlan();
    }

    /**
     * Create an instance of {@link TAppliesTo }
     * 
     */
    public TAppliesTo createTAppliesTo() {
        return new TAppliesTo();
    }

    /**
     * Create an instance of {@link TCapabilityDefinition }
     * 
     */
    public TCapabilityDefinition createTCapabilityDefinition() {
        return new TCapabilityDefinition();
    }

    /**
     * Create an instance of {@link TArtifactReference }
     * 
     */
    public TArtifactReference createTArtifactReference() {
        return new TArtifactReference();
    }

    /**
     * Create an instance of {@link TRequirementDefinition }
     * 
     */
    public TRequirementDefinition createTRequirementDefinition() {
        return new TRequirementDefinition();
    }

    /**
     * Create an instance of {@link TTopologyElementInstanceStates }
     * 
     */
    public TTopologyElementInstanceStates createTTopologyElementInstanceStates() {
        return new TTopologyElementInstanceStates();
    }

    /**
     * Create an instance of {@link TBoundaryDefinitions }
     * 
     */
    public TBoundaryDefinitions createTBoundaryDefinitions() {
        return new TBoundaryDefinitions();
    }

    /**
     * Create an instance of {@link TBoundaryDefinitions.Properties }
     * 
     */
    public TBoundaryDefinitions.Properties createTBoundaryDefinitionsProperties() {
        return new TBoundaryDefinitions.Properties();
    }

    /**
     * Create an instance of {@link TOperation }
     * 
     */
    public TOperation createTOperation() {
        return new TOperation();
    }

    /**
     * Create an instance of {@link TArtifactTemplate }
     * 
     */
    public TArtifactTemplate createTArtifactTemplate() {
        return new TArtifactTemplate();
    }

    /**
     * Create an instance of {@link TRelationshipTypeImplementation }
     * 
     */
    public TRelationshipTypeImplementation createTRelationshipTypeImplementation() {
        return new TRelationshipTypeImplementation();
    }

    /**
     * Create an instance of {@link TRelationshipType }
     * 
     */
    public TRelationshipType createTRelationshipType() {
        return new TRelationshipType();
    }

    /**
     * Create an instance of {@link TNodeTypeImplementation }
     * 
     */
    public TNodeTypeImplementation createTNodeTypeImplementation() {
        return new TNodeTypeImplementation();
    }

    /**
     * Create an instance of {@link TNodeType }
     * 
     */
    public TNodeType createTNodeType() {
        return new TNodeType();
    }

    /**
     * Create an instance of {@link TDocumentation }
     * 
     */
    public TDocumentation createTDocumentation() {
        return new TDocumentation();
    }

    /**
     * Create an instance of {@link Definitions }
     * 
     */
    public Definitions createDefinitions() {
        return new Definitions();
    }

    /**
     * Create an instance of {@link TExtensibleElements }
     * 
     */
    public TExtensibleElements createTExtensibleElements() {
        return new TExtensibleElements();
    }

    /**
     * Create an instance of {@link TDefinitions.Extensions }
     * 
     */
    public TDefinitions.Extensions createTDefinitionsExtensions() {
        return new TDefinitions.Extensions();
    }

    /**
     * Create an instance of {@link TImport }
     * 
     */
    public TImport createTImport() {
        return new TImport();
    }

    /**
     * Create an instance of {@link TDefinitions.Types }
     * 
     */
    public TDefinitions.Types createTDefinitionsTypes() {
        return new TDefinitions.Types();
    }

    /**
     * Create an instance of {@link TServiceTemplate }
     * 
     */
    public TServiceTemplate createTServiceTemplate() {
        return new TServiceTemplate();
    }

    /**
     * Create an instance of {@link TRequirementType }
     * 
     */
    public TRequirementType createTRequirementType() {
        return new TRequirementType();
    }

    /**
     * Create an instance of {@link TCapabilityType }
     * 
     */
    public TCapabilityType createTCapabilityType() {
        return new TCapabilityType();
    }

    /**
     * Create an instance of {@link TArtifactType }
     * 
     */
    public TArtifactType createTArtifactType() {
        return new TArtifactType();
    }

    /**
     * Create an instance of {@link TPolicyType }
     * 
     */
    public TPolicyType createTPolicyType() {
        return new TPolicyType();
    }

    /**
     * Create an instance of {@link TPolicyTemplate }
     * 
     */
    public TPolicyTemplate createTPolicyTemplate() {
        return new TPolicyTemplate();
    }

    /**
     * Create an instance of {@link TExportedInterface }
     * 
     */
    public TExportedInterface createTExportedInterface() {
        return new TExportedInterface();
    }

    /**
     * Create an instance of {@link TInterface }
     * 
     */
    public TInterface createTInterface() {
        return new TInterface();
    }

    /**
     * Create an instance of {@link TCapability }
     * 
     */
    public TCapability createTCapability() {
        return new TCapability();
    }

    /**
     * Create an instance of {@link TExtension }
     * 
     */
    public TExtension createTExtension() {
        return new TExtension();
    }

    /**
     * Create an instance of {@link TTags }
     * 
     */
    public TTags createTTags() {
        return new TTags();
    }

    /**
     * Create an instance of {@link TParameter }
     * 
     */
    public TParameter createTParameter() {
        return new TParameter();
    }

    /**
     * Create an instance of {@link TTag }
     * 
     */
    public TTag createTTag() {
        return new TTag();
    }

    /**
     * Create an instance of {@link TPropertyConstraint }
     * 
     */
    public TPropertyConstraint createTPropertyConstraint() {
        return new TPropertyConstraint();
    }

    /**
     * Create an instance of {@link TExtensions }
     * 
     */
    public TExtensions createTExtensions() {
        return new TExtensions();
    }

    /**
     * Create an instance of {@link TCapabilityRef }
     * 
     */
    public TCapabilityRef createTCapabilityRef() {
        return new TCapabilityRef();
    }

    /**
     * Create an instance of {@link TDeploymentArtifact }
     * 
     */
    public TDeploymentArtifact createTDeploymentArtifact() {
        return new TDeploymentArtifact();
    }

    /**
     * Create an instance of {@link TRequiredContainerFeatures }
     * 
     */
    public TRequiredContainerFeatures createTRequiredContainerFeatures() {
        return new TRequiredContainerFeatures();
    }

    /**
     * Create an instance of {@link TRequirement }
     * 
     */
    public TRequirement createTRequirement() {
        return new TRequirement();
    }

    /**
     * Create an instance of {@link TRequirementRef }
     * 
     */
    public TRequirementRef createTRequirementRef() {
        return new TRequirementRef();
    }

    /**
     * Create an instance of {@link TImplementationArtifact }
     * 
     */
    public TImplementationArtifact createTImplementationArtifact() {
        return new TImplementationArtifact();
    }

    /**
     * Create an instance of {@link TPlans }
     * 
     */
    public TPlans createTPlans() {
        return new TPlans();
    }

    /**
     * Create an instance of {@link TPropertyMapping }
     * 
     */
    public TPropertyMapping createTPropertyMapping() {
        return new TPropertyMapping();
    }

    /**
     * Create an instance of {@link TDeploymentArtifacts }
     * 
     */
    public TDeploymentArtifacts createTDeploymentArtifacts() {
        return new TDeploymentArtifacts();
    }

    /**
     * Create an instance of {@link TRequiredContainerFeature }
     * 
     */
    public TRequiredContainerFeature createTRequiredContainerFeature() {
        return new TRequiredContainerFeature();
    }

    /**
     * Create an instance of {@link TPolicy }
     * 
     */
    public TPolicy createTPolicy() {
        return new TPolicy();
    }

    /**
     * Create an instance of {@link TCondition }
     * 
     */
    public TCondition createTCondition() {
        return new TCondition();
    }

    /**
     * Create an instance of {@link TConstraint }
     * 
     */
    public TConstraint createTConstraint() {
        return new TConstraint();
    }

    /**
     * Create an instance of {@link TTopologyTemplate }
     * 
     */
    public TTopologyTemplate createTTopologyTemplate() {
        return new TTopologyTemplate();
    }

    /**
     * Create an instance of {@link TAntispamProperties }
     * 
     */
    public TAntispamProperties createTAntispamProperties() {
        return new TAntispamProperties();
    }

    /**
     * Create an instance of {@link TCacheProperties }
     * 
     */
    public TCacheProperties createTCacheProperties() {
        return new TCacheProperties();
    }

    /**
     * Create an instance of {@link TDpiProperties }
     * 
     */
    public TDpiProperties createTDpiProperties() {
        return new TDpiProperties();
    }

    /**
     * Create an instance of {@link TEndhostProperties }
     * 
     */
    public TEndhostProperties createTEndhostProperties() {
        return new TEndhostProperties();
    }

    /**
     * Create an instance of {@link TEndpointProperties }
     * 
     */
    public TEndpointProperties createTEndpointProperties() {
        return new TEndpointProperties();
    }

    /**
     * Create an instance of {@link TFieldModifierProperties }
     * 
     */
    public TFieldModifierProperties createTFieldModifierProperties() {
        return new TFieldModifierProperties();
    }

    /**
     * Create an instance of {@link TMailclientProperties }
     * 
     */
    public TMailclientProperties createTMailclientProperties() {
        return new TMailclientProperties();
    }

    /**
     * Create an instance of {@link TMailserverProperties }
     * 
     */
    public TMailserverProperties createTMailserverProperties() {
        return new TMailserverProperties();
    }

    /**
     * Create an instance of {@link TNatProperties }
     * 
     */
    public TNatProperties createTNatProperties() {
        return new TNatProperties();
    }

    /**
     * Create an instance of {@link TVpnAccessProperties }
     * 
     */
    public TVpnAccessProperties createTVpnAccessProperties() {
        return new TVpnAccessProperties();
    }

    /**
     * Create an instance of {@link TVpnExitProperties }
     * 
     */
    public TVpnExitProperties createTVpnExitProperties() {
        return new TVpnExitProperties();
    }

    /**
     * Create an instance of {@link TWebclientProperties }
     * 
     */
    public TWebclientProperties createTWebclientProperties() {
        return new TWebclientProperties();
    }

    /**
     * Create an instance of {@link TWebserverProperties }
     * 
     */
    public TWebserverProperties createTWebserverProperties() {
        return new TWebserverProperties();
    }

    /**
     * Create an instance of {@link TFirewallProperties.Elements }
     * 
     */
    public TFirewallProperties.Elements createTFirewallPropertiesElements() {
        return new TFirewallProperties.Elements();
    }

    /**
     * Create an instance of {@link TExportedOperation.NodeOperation }
     * 
     */
    public TExportedOperation.NodeOperation createTExportedOperationNodeOperation() {
        return new TExportedOperation.NodeOperation();
    }

    /**
     * Create an instance of {@link TExportedOperation.RelationshipOperation }
     * 
     */
    public TExportedOperation.RelationshipOperation createTExportedOperationRelationshipOperation() {
        return new TExportedOperation.RelationshipOperation();
    }

    /**
     * Create an instance of {@link TExportedOperation.Plan }
     * 
     */
    public TExportedOperation.Plan createTExportedOperationPlan() {
        return new TExportedOperation.Plan();
    }

    /**
     * Create an instance of {@link TImplementationArtifacts.ImplementationArtifact }
     * 
     */
    public TImplementationArtifacts.ImplementationArtifact createTImplementationArtifactsImplementationArtifact() {
        return new TImplementationArtifacts.ImplementationArtifact();
    }

    /**
     * Create an instance of {@link org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph.TEntityType.DerivedFrom }
     * 
     */
    public org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph.TEntityType.DerivedFrom createTEntityTypeDerivedFrom() {
        return new org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph.TEntityType.DerivedFrom();
    }

    /**
     * Create an instance of {@link org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph.TEntityType.PropertiesDefinition }
     * 
     */
    public org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph.TEntityType.PropertiesDefinition createTEntityTypePropertiesDefinition() {
        return new org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph.TEntityType.PropertiesDefinition();
    }

    /**
     * Create an instance of {@link org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph.TEntityTemplate.Properties }
     * 
     */
    public org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph.TEntityTemplate.Properties createTEntityTemplateProperties() {
        return new org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph.TEntityTemplate.Properties();
    }

    /**
     * Create an instance of {@link org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph.TEntityTemplate.PropertyConstraints }
     * 
     */
    public org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph.TEntityTemplate.PropertyConstraints createTEntityTemplatePropertyConstraints() {
        return new org.oasis_open.docs.tosca.ns._2011._12.ToscaVerigraph.TEntityTemplate.PropertyConstraints();
    }

    /**
     * Create an instance of {@link TNodeTemplate.Requirements }
     * 
     */
    public TNodeTemplate.Requirements createTNodeTemplateRequirements() {
        return new TNodeTemplate.Requirements();
    }

    /**
     * Create an instance of {@link TNodeTemplate.Capabilities }
     * 
     */
    public TNodeTemplate.Capabilities createTNodeTemplateCapabilities() {
        return new TNodeTemplate.Capabilities();
    }

    /**
     * Create an instance of {@link TNodeTemplate.Policies }
     * 
     */
    public TNodeTemplate.Policies createTNodeTemplatePolicies() {
        return new TNodeTemplate.Policies();
    }

    /**
     * Create an instance of {@link TRelationshipTemplate.SourceElement }
     * 
     */
    public TRelationshipTemplate.SourceElement createTRelationshipTemplateSourceElement() {
        return new TRelationshipTemplate.SourceElement();
    }

    /**
     * Create an instance of {@link TRelationshipTemplate.TargetElement }
     * 
     */
    public TRelationshipTemplate.TargetElement createTRelationshipTemplateTargetElement() {
        return new TRelationshipTemplate.TargetElement();
    }

    /**
     * Create an instance of {@link TRelationshipTemplate.RelationshipConstraints.RelationshipConstraint }
     * 
     */
    public TRelationshipTemplate.RelationshipConstraints.RelationshipConstraint createTRelationshipTemplateRelationshipConstraintsRelationshipConstraint() {
        return new TRelationshipTemplate.RelationshipConstraints.RelationshipConstraint();
    }

    /**
     * Create an instance of {@link TPlan.InputParameters }
     * 
     */
    public TPlan.InputParameters createTPlanInputParameters() {
        return new TPlan.InputParameters();
    }

    /**
     * Create an instance of {@link TPlan.OutputParameters }
     * 
     */
    public TPlan.OutputParameters createTPlanOutputParameters() {
        return new TPlan.OutputParameters();
    }

    /**
     * Create an instance of {@link TPlan.PlanModel }
     * 
     */
    public TPlan.PlanModel createTPlanPlanModel() {
        return new TPlan.PlanModel();
    }

    /**
     * Create an instance of {@link TPlan.PlanModelReference }
     * 
     */
    public TPlan.PlanModelReference createTPlanPlanModelReference() {
        return new TPlan.PlanModelReference();
    }

    /**
     * Create an instance of {@link TAppliesTo.NodeTypeReference }
     * 
     */
    public TAppliesTo.NodeTypeReference createTAppliesToNodeTypeReference() {
        return new TAppliesTo.NodeTypeReference();
    }

    /**
     * Create an instance of {@link TCapabilityDefinition.Constraints }
     * 
     */
    public TCapabilityDefinition.Constraints createTCapabilityDefinitionConstraints() {
        return new TCapabilityDefinition.Constraints();
    }

    /**
     * Create an instance of {@link TArtifactReference.Include }
     * 
     */
    public TArtifactReference.Include createTArtifactReferenceInclude() {
        return new TArtifactReference.Include();
    }

    /**
     * Create an instance of {@link TArtifactReference.Exclude }
     * 
     */
    public TArtifactReference.Exclude createTArtifactReferenceExclude() {
        return new TArtifactReference.Exclude();
    }

    /**
     * Create an instance of {@link TRequirementDefinition.Constraints }
     * 
     */
    public TRequirementDefinition.Constraints createTRequirementDefinitionConstraints() {
        return new TRequirementDefinition.Constraints();
    }

    /**
     * Create an instance of {@link TTopologyElementInstanceStates.InstanceState }
     * 
     */
    public TTopologyElementInstanceStates.InstanceState createTTopologyElementInstanceStatesInstanceState() {
        return new TTopologyElementInstanceStates.InstanceState();
    }

    /**
     * Create an instance of {@link TBoundaryDefinitions.PropertyConstraints }
     * 
     */
    public TBoundaryDefinitions.PropertyConstraints createTBoundaryDefinitionsPropertyConstraints() {
        return new TBoundaryDefinitions.PropertyConstraints();
    }

    /**
     * Create an instance of {@link TBoundaryDefinitions.Requirements }
     * 
     */
    public TBoundaryDefinitions.Requirements createTBoundaryDefinitionsRequirements() {
        return new TBoundaryDefinitions.Requirements();
    }

    /**
     * Create an instance of {@link TBoundaryDefinitions.Capabilities }
     * 
     */
    public TBoundaryDefinitions.Capabilities createTBoundaryDefinitionsCapabilities() {
        return new TBoundaryDefinitions.Capabilities();
    }

    /**
     * Create an instance of {@link TBoundaryDefinitions.Policies }
     * 
     */
    public TBoundaryDefinitions.Policies createTBoundaryDefinitionsPolicies() {
        return new TBoundaryDefinitions.Policies();
    }

    /**
     * Create an instance of {@link TBoundaryDefinitions.Interfaces }
     * 
     */
    public TBoundaryDefinitions.Interfaces createTBoundaryDefinitionsInterfaces() {
        return new TBoundaryDefinitions.Interfaces();
    }

    /**
     * Create an instance of {@link TBoundaryDefinitions.Properties.PropertyMappings }
     * 
     */
    public TBoundaryDefinitions.Properties.PropertyMappings createTBoundaryDefinitionsPropertiesPropertyMappings() {
        return new TBoundaryDefinitions.Properties.PropertyMappings();
    }

    /**
     * Create an instance of {@link TOperation.InputParameters }
     * 
     */
    public TOperation.InputParameters createTOperationInputParameters() {
        return new TOperation.InputParameters();
    }

    /**
     * Create an instance of {@link TOperation.OutputParameters }
     * 
     */
    public TOperation.OutputParameters createTOperationOutputParameters() {
        return new TOperation.OutputParameters();
    }

    /**
     * Create an instance of {@link TArtifactTemplate.ArtifactReferences }
     * 
     */
    public TArtifactTemplate.ArtifactReferences createTArtifactTemplateArtifactReferences() {
        return new TArtifactTemplate.ArtifactReferences();
    }

    /**
     * Create an instance of {@link TRelationshipTypeImplementation.DerivedFrom }
     * 
     */
    public TRelationshipTypeImplementation.DerivedFrom createTRelationshipTypeImplementationDerivedFrom() {
        return new TRelationshipTypeImplementation.DerivedFrom();
    }

    /**
     * Create an instance of {@link TRelationshipType.SourceInterfaces }
     * 
     */
    public TRelationshipType.SourceInterfaces createTRelationshipTypeSourceInterfaces() {
        return new TRelationshipType.SourceInterfaces();
    }

    /**
     * Create an instance of {@link TRelationshipType.TargetInterfaces }
     * 
     */
    public TRelationshipType.TargetInterfaces createTRelationshipTypeTargetInterfaces() {
        return new TRelationshipType.TargetInterfaces();
    }

    /**
     * Create an instance of {@link TRelationshipType.ValidSource }
     * 
     */
    public TRelationshipType.ValidSource createTRelationshipTypeValidSource() {
        return new TRelationshipType.ValidSource();
    }

    /**
     * Create an instance of {@link TRelationshipType.ValidTarget }
     * 
     */
    public TRelationshipType.ValidTarget createTRelationshipTypeValidTarget() {
        return new TRelationshipType.ValidTarget();
    }

    /**
     * Create an instance of {@link TNodeTypeImplementation.DerivedFrom }
     * 
     */
    public TNodeTypeImplementation.DerivedFrom createTNodeTypeImplementationDerivedFrom() {
        return new TNodeTypeImplementation.DerivedFrom();
    }

    /**
     * Create an instance of {@link TNodeType.RequirementDefinitions }
     * 
     */
    public TNodeType.RequirementDefinitions createTNodeTypeRequirementDefinitions() {
        return new TNodeType.RequirementDefinitions();
    }

    /**
     * Create an instance of {@link TNodeType.CapabilityDefinitions }
     * 
     */
    public TNodeType.CapabilityDefinitions createTNodeTypeCapabilityDefinitions() {
        return new TNodeType.CapabilityDefinitions();
    }

    /**
     * Create an instance of {@link TNodeType.Interfaces }
     * 
     */
    public TNodeType.Interfaces createTNodeTypeInterfaces() {
        return new TNodeType.Interfaces();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TFirewallProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/FirewallProperties", name = "FirewallProperties")
    public JAXBElement<TFirewallProperties> createFirewallProperties(TFirewallProperties value) {
        return new JAXBElement<TFirewallProperties>(_FirewallProperties_QNAME, TFirewallProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDocumentation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/tosca/ns/2011/12", name = "documentation")
    public JAXBElement<TDocumentation> createDocumentation(TDocumentation value) {
        return new JAXBElement<TDocumentation>(_Documentation_QNAME, TDocumentation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMailserverProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/MailserverProperties", name = "MailserverProperties")
    public JAXBElement<TMailserverProperties> createMailserverProperties(TMailserverProperties value) {
        return new JAXBElement<TMailserverProperties>(_MailserverProperties_QNAME, TMailserverProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TWebserverProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/WebserverProperties", name = "WebserverProperties")
    public JAXBElement<TWebserverProperties> createWebserverProperties(TWebserverProperties value) {
        return new JAXBElement<TWebserverProperties>(_WebserverProperties_QNAME, TWebserverProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEndpointProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/EndpointProperties", name = "EndpointProperties")
    public JAXBElement<TEndpointProperties> createEndpointProperties(TEndpointProperties value) {
        return new JAXBElement<TEndpointProperties>(_EndpointProperties_QNAME, TEndpointProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TVpnExitProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/VpnExitProperties", name = "VpnExitProperties")
    public JAXBElement<TVpnExitProperties> createVpnExitProperties(TVpnExitProperties value) {
        return new JAXBElement<TVpnExitProperties>(_VpnExitProperties_QNAME, TVpnExitProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMailclientProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/MailclientProperties", name = "MailclientProperties")
    public JAXBElement<TMailclientProperties> createMailclientProperties(TMailclientProperties value) {
        return new JAXBElement<TMailclientProperties>(_MailclientProperties_QNAME, TMailclientProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDpiProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/DpiProperties", name = "DpiProperties")
    public JAXBElement<TDpiProperties> createDpiProperties(TDpiProperties value) {
        return new JAXBElement<TDpiProperties>(_DpiProperties_QNAME, TDpiProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TFieldModifierProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/FieldModifierProperties", name = "FieldModifierProperties")
    public JAXBElement<TFieldModifierProperties> createFieldModifierProperties(TFieldModifierProperties value) {
        return new JAXBElement<TFieldModifierProperties>(_FieldModifierProperties_QNAME, TFieldModifierProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCacheProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/CacheProperties", name = "CacheProperties")
    public JAXBElement<TCacheProperties> createCacheProperties(TCacheProperties value) {
        return new JAXBElement<TCacheProperties>(_CacheProperties_QNAME, TCacheProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TNatProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/NatProperties", name = "NatProperties")
    public JAXBElement<TNatProperties> createNatProperties(TNatProperties value) {
        return new JAXBElement<TNatProperties>(_NatProperties_QNAME, TNatProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAntispamProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/AntispamProperties", name = "AntispamProperties")
    public JAXBElement<TAntispamProperties> createAntispamProperties(TAntispamProperties value) {
        return new JAXBElement<TAntispamProperties>(_AntispamProperties_QNAME, TAntispamProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TVpnAccessProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/VpnAccessProperties", name = "VpnAccessProperties")
    public JAXBElement<TVpnAccessProperties> createVpnAccessProperties(TVpnAccessProperties value) {
        return new JAXBElement<TVpnAccessProperties>(_VpnAccessProperties_QNAME, TVpnAccessProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TWebclientProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/WebclientProperties", name = "WebclientProperties")
    public JAXBElement<TWebclientProperties> createWebclientProperties(TWebclientProperties value) {
        return new JAXBElement<TWebclientProperties>(_WebclientProperties_QNAME, TWebclientProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEndhostProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/tosca/ns/2011/12/ToscaVerigraph/NodeTypes/EndhostProperties", name = "EndhostProperties")
    public JAXBElement<TEndhostProperties> createEndhostProperties(TEndhostProperties value) {
        return new JAXBElement<TEndhostProperties>(_EndhostProperties_QNAME, TEndhostProperties.class, null, value);
    }

}
