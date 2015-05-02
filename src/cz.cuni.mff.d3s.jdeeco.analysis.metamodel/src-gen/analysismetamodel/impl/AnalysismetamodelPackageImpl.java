/**
 */
package analysismetamodel.impl;

import analysismetamodel.Alert;
import analysismetamodel.AnalysismetamodelFactory;
import analysismetamodel.AnalysismetamodelPackage;
import analysismetamodel.Component;
import analysismetamodel.ComponentInstance;
import analysismetamodel.ComponentProcess;
import analysismetamodel.CustomGenerator;
import analysismetamodel.CustomInterval;
import analysismetamodel.DefaultValue;
import analysismetamodel.DefaultValueByEnumeration;
import analysismetamodel.DefaultValueByGenerator;
import analysismetamodel.EnsembleInvocableByCustomFunc;
import analysismetamodel.EnsembleInvocableByEQSet;
import analysismetamodel.EnsembleSide;
import analysismetamodel.GenericKnowledge;
import analysismetamodel.Knowledge;
import analysismetamodel.KnowledgeBinding;
import analysismetamodel.LowerBoundTable;
import analysismetamodel.Model;
import analysismetamodel.NumericKnowledge;
import analysismetamodel.NumericKnowledgeBinding;
import analysismetamodel.ProcessInvocableByCustomFunc;
import analysismetamodel.ProcessInvocableByEQSet;
import analysismetamodel.StaticEnsemble;
import analysismetamodel.TableOfDerivatives;
import analysismetamodel.TableRow;
import analysismetamodel.Task;
import analysismetamodel.UpperBoundTable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysismetamodelPackageImpl extends EPackageImpl implements AnalysismetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericKnowledgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticEnsembleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upperBoundTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableOfDerivativesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultValueByEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultValueByGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericKnowledgeBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowerBoundTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ensembleInvocableByEQSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericKnowledgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processInvocableByEQSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processInvocableByCustomFuncEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ensembleInvocableByCustomFuncEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ensembleSideEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see analysismetamodel.AnalysismetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnalysismetamodelPackageImpl() {
		super(eNS_URI, AnalysismetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AnalysismetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnalysismetamodelPackage init() {
		if (isInited) return (AnalysismetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(AnalysismetamodelPackage.eNS_URI);

		// Obtain or create and register package
		AnalysismetamodelPackageImpl theAnalysismetamodelPackage = (AnalysismetamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnalysismetamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnalysismetamodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAnalysismetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theAnalysismetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnalysismetamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnalysismetamodelPackage.eNS_URI, theAnalysismetamodelPackage);
		return theAnalysismetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ComponentProcesses() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Knowledges() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentProcess() {
		return componentProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentProcess_Name() {
		return (EAttribute)componentProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentProcess_Component() {
		return (EReference)componentProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentProcess_InvocablesByEQSet() {
		return (EReference)componentProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentProcess_InvocablesByCustomFunc() {
		return (EReference)componentProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericKnowledge() {
		return genericKnowledgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericKnowledge_Type() {
		return (EAttribute)genericKnowledgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstance() {
		return componentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInstance_Name() {
		return (EAttribute)componentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Component() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticEnsemble() {
		return staticEnsembleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticEnsemble_Coordinator() {
		return (EReference)staticEnsembleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticEnsemble_Member() {
		return (EReference)staticEnsembleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticEnsemble_Name() {
		return (EAttribute)staticEnsembleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticEnsemble_InvocablesByEQSet() {
		return (EReference)staticEnsembleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticEnsemble_InvocablesByCustomFunc() {
		return (EReference)staticEnsembleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Period() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Deadline() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpperBoundTable() {
		return upperBoundTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpperBoundTable_Rows() {
		return (EReference)upperBoundTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableRow() {
		return tableRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableRow_Value() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableRow_Derivative() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableOfDerivatives() {
		return tableOfDerivativesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableOfDerivatives_UpperBoundTable() {
		return (EReference)tableOfDerivativesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOfDerivatives_Name() {
		return (EAttribute)tableOfDerivativesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOfDerivatives_ValuesMultiplier() {
		return (EAttribute)tableOfDerivativesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableOfDerivatives_LowerBoundTable() {
		return (EReference)tableOfDerivativesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOfDerivatives_DerivativesMutliplier() {
		return (EAttribute)tableOfDerivativesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Components() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_StaticEnsembles() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_ComponentInstances() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_BeliefPropagationDelay() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_CustomIntervals() {
		return (EReference)modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_CustomGenerators() {
		return (EReference)modelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Alerts() {
		return (EReference)modelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_TablesOfDerivatives() {
		return (EReference)modelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultValue() {
		return defaultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultValue_ComponentInstance() {
		return (EReference)defaultValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultValueByEnumeration() {
		return defaultValueByEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultValueByEnumeration_Value() {
		return (EAttribute)defaultValueByEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultValueByGenerator() {
		return defaultValueByGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultValueByGenerator_Start() {
		return (EAttribute)defaultValueByGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultValueByGenerator_End() {
		return (EAttribute)defaultValueByGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultValueByGenerator_Count() {
		return (EAttribute)defaultValueByGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultValueByGenerator_Generator() {
		return (EReference)defaultValueByGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomInterval() {
		return customIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomInterval_WrappedType() {
		return (EAttribute)customIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomInterval_Clazz() {
		return (EAttribute)customIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomGenerator() {
		return customGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomGenerator_GeneratedType() {
		return (EAttribute)customGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomGenerator_Clazz() {
		return (EAttribute)customGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlert() {
		return alertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlert_Name() {
		return (EAttribute)alertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlert_Knowledge() {
		return (EReference)alertEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericKnowledgeBinding() {
		return numericKnowledgeBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericKnowledgeBinding_Knowledge() {
		return (EReference)numericKnowledgeBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericKnowledgeBinding_EnsembleSide() {
		return (EAttribute)numericKnowledgeBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLowerBoundTable() {
		return lowerBoundTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLowerBoundTable_Rows() {
		return (EReference)lowerBoundTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnsembleInvocableByEQSet() {
		return ensembleInvocableByEQSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsembleInvocableByEQSet_InputKnowledgeBindings() {
		return (EReference)ensembleInvocableByEQSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsembleInvocableByEQSet_OutputKnowledgeBinding() {
		return (EReference)ensembleInvocableByEQSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnsembleInvocableByEQSet_DoCartesianProduct() {
		return (EAttribute)ensembleInvocableByEQSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericKnowledge() {
		return numericKnowledgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericKnowledge_Multiplier() {
		return (EAttribute)numericKnowledgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericKnowledge_TableOfDerivatives() {
		return (EReference)numericKnowledgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericKnowledge_Precision() {
		return (EAttribute)numericKnowledgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessInvocableByEQSet() {
		return processInvocableByEQSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessInvocableByEQSet_InputKnowledges() {
		return (EReference)processInvocableByEQSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessInvocableByEQSet_OutputKnowledge() {
		return (EReference)processInvocableByEQSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessInvocableByEQSet_DoCartesianProduct() {
		return (EAttribute)processInvocableByEQSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessInvocableByCustomFunc() {
		return processInvocableByCustomFuncEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessInvocableByCustomFunc_InputKnowledges() {
		return (EReference)processInvocableByCustomFuncEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessInvocableByCustomFunc_OutputKnowledge() {
		return (EReference)processInvocableByCustomFuncEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessInvocableByCustomFunc_DoCartesianProduct() {
		return (EAttribute)processInvocableByCustomFuncEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledge() {
		return knowledgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnowledge_Name() {
		return (EAttribute)knowledgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnowledge_IsPivot() {
		return (EAttribute)knowledgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnowledge_ShowPivot() {
		return (EAttribute)knowledgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledge_DefaultValues() {
		return (EReference)knowledgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeBinding() {
		return knowledgeBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnowledgeBinding_EnsembleSide() {
		return (EAttribute)knowledgeBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeBinding_Knowledge() {
		return (EReference)knowledgeBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnsembleInvocableByCustomFunc() {
		return ensembleInvocableByCustomFuncEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsembleInvocableByCustomFunc_OutputKnowledgeBinding() {
		return (EReference)ensembleInvocableByCustomFuncEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnsembleInvocableByCustomFunc_InputKnowledgeBindings() {
		return (EReference)ensembleInvocableByCustomFuncEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnsembleInvocableByCustomFunc_DoCartesianProduct() {
		return (EAttribute)ensembleInvocableByCustomFuncEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnsembleSide() {
		return ensembleSideEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysismetamodelFactory getAnalysismetamodelFactory() {
		return (AnalysismetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__COMPONENT_PROCESSES);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEReference(componentEClass, COMPONENT__KNOWLEDGES);

		componentProcessEClass = createEClass(COMPONENT_PROCESS);
		createEAttribute(componentProcessEClass, COMPONENT_PROCESS__NAME);
		createEReference(componentProcessEClass, COMPONENT_PROCESS__COMPONENT);
		createEReference(componentProcessEClass, COMPONENT_PROCESS__INVOCABLES_BY_EQ_SET);
		createEReference(componentProcessEClass, COMPONENT_PROCESS__INVOCABLES_BY_CUSTOM_FUNC);

		genericKnowledgeEClass = createEClass(GENERIC_KNOWLEDGE);
		createEAttribute(genericKnowledgeEClass, GENERIC_KNOWLEDGE__TYPE);

		componentInstanceEClass = createEClass(COMPONENT_INSTANCE);
		createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__NAME);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__COMPONENT);

		staticEnsembleEClass = createEClass(STATIC_ENSEMBLE);
		createEReference(staticEnsembleEClass, STATIC_ENSEMBLE__COORDINATOR);
		createEReference(staticEnsembleEClass, STATIC_ENSEMBLE__MEMBER);
		createEAttribute(staticEnsembleEClass, STATIC_ENSEMBLE__NAME);
		createEReference(staticEnsembleEClass, STATIC_ENSEMBLE__INVOCABLES_BY_EQ_SET);
		createEReference(staticEnsembleEClass, STATIC_ENSEMBLE__INVOCABLES_BY_CUSTOM_FUNC);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__PERIOD);
		createEAttribute(taskEClass, TASK__DEADLINE);

		upperBoundTableEClass = createEClass(UPPER_BOUND_TABLE);
		createEReference(upperBoundTableEClass, UPPER_BOUND_TABLE__ROWS);

		tableRowEClass = createEClass(TABLE_ROW);
		createEAttribute(tableRowEClass, TABLE_ROW__VALUE);
		createEAttribute(tableRowEClass, TABLE_ROW__DERIVATIVE);

		tableOfDerivativesEClass = createEClass(TABLE_OF_DERIVATIVES);
		createEReference(tableOfDerivativesEClass, TABLE_OF_DERIVATIVES__UPPER_BOUND_TABLE);
		createEAttribute(tableOfDerivativesEClass, TABLE_OF_DERIVATIVES__NAME);
		createEAttribute(tableOfDerivativesEClass, TABLE_OF_DERIVATIVES__VALUES_MULTIPLIER);
		createEReference(tableOfDerivativesEClass, TABLE_OF_DERIVATIVES__LOWER_BOUND_TABLE);
		createEAttribute(tableOfDerivativesEClass, TABLE_OF_DERIVATIVES__DERIVATIVES_MUTLIPLIER);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__COMPONENTS);
		createEReference(modelEClass, MODEL__STATIC_ENSEMBLES);
		createEReference(modelEClass, MODEL__COMPONENT_INSTANCES);
		createEAttribute(modelEClass, MODEL__BELIEF_PROPAGATION_DELAY);
		createEReference(modelEClass, MODEL__CUSTOM_INTERVALS);
		createEReference(modelEClass, MODEL__CUSTOM_GENERATORS);
		createEReference(modelEClass, MODEL__ALERTS);
		createEReference(modelEClass, MODEL__TABLES_OF_DERIVATIVES);

		defaultValueEClass = createEClass(DEFAULT_VALUE);
		createEReference(defaultValueEClass, DEFAULT_VALUE__COMPONENT_INSTANCE);

		defaultValueByEnumerationEClass = createEClass(DEFAULT_VALUE_BY_ENUMERATION);
		createEAttribute(defaultValueByEnumerationEClass, DEFAULT_VALUE_BY_ENUMERATION__VALUE);

		defaultValueByGeneratorEClass = createEClass(DEFAULT_VALUE_BY_GENERATOR);
		createEAttribute(defaultValueByGeneratorEClass, DEFAULT_VALUE_BY_GENERATOR__START);
		createEAttribute(defaultValueByGeneratorEClass, DEFAULT_VALUE_BY_GENERATOR__END);
		createEAttribute(defaultValueByGeneratorEClass, DEFAULT_VALUE_BY_GENERATOR__COUNT);
		createEReference(defaultValueByGeneratorEClass, DEFAULT_VALUE_BY_GENERATOR__GENERATOR);

		customIntervalEClass = createEClass(CUSTOM_INTERVAL);
		createEAttribute(customIntervalEClass, CUSTOM_INTERVAL__WRAPPED_TYPE);
		createEAttribute(customIntervalEClass, CUSTOM_INTERVAL__CLAZZ);

		customGeneratorEClass = createEClass(CUSTOM_GENERATOR);
		createEAttribute(customGeneratorEClass, CUSTOM_GENERATOR__GENERATED_TYPE);
		createEAttribute(customGeneratorEClass, CUSTOM_GENERATOR__CLAZZ);

		alertEClass = createEClass(ALERT);
		createEAttribute(alertEClass, ALERT__NAME);
		createEReference(alertEClass, ALERT__KNOWLEDGE);

		numericKnowledgeBindingEClass = createEClass(NUMERIC_KNOWLEDGE_BINDING);
		createEReference(numericKnowledgeBindingEClass, NUMERIC_KNOWLEDGE_BINDING__KNOWLEDGE);
		createEAttribute(numericKnowledgeBindingEClass, NUMERIC_KNOWLEDGE_BINDING__ENSEMBLE_SIDE);

		lowerBoundTableEClass = createEClass(LOWER_BOUND_TABLE);
		createEReference(lowerBoundTableEClass, LOWER_BOUND_TABLE__ROWS);

		ensembleInvocableByEQSetEClass = createEClass(ENSEMBLE_INVOCABLE_BY_EQ_SET);
		createEReference(ensembleInvocableByEQSetEClass, ENSEMBLE_INVOCABLE_BY_EQ_SET__INPUT_KNOWLEDGE_BINDINGS);
		createEReference(ensembleInvocableByEQSetEClass, ENSEMBLE_INVOCABLE_BY_EQ_SET__OUTPUT_KNOWLEDGE_BINDING);
		createEAttribute(ensembleInvocableByEQSetEClass, ENSEMBLE_INVOCABLE_BY_EQ_SET__DO_CARTESIAN_PRODUCT);

		numericKnowledgeEClass = createEClass(NUMERIC_KNOWLEDGE);
		createEAttribute(numericKnowledgeEClass, NUMERIC_KNOWLEDGE__MULTIPLIER);
		createEReference(numericKnowledgeEClass, NUMERIC_KNOWLEDGE__TABLE_OF_DERIVATIVES);
		createEAttribute(numericKnowledgeEClass, NUMERIC_KNOWLEDGE__PRECISION);

		processInvocableByEQSetEClass = createEClass(PROCESS_INVOCABLE_BY_EQ_SET);
		createEReference(processInvocableByEQSetEClass, PROCESS_INVOCABLE_BY_EQ_SET__INPUT_KNOWLEDGES);
		createEReference(processInvocableByEQSetEClass, PROCESS_INVOCABLE_BY_EQ_SET__OUTPUT_KNOWLEDGE);
		createEAttribute(processInvocableByEQSetEClass, PROCESS_INVOCABLE_BY_EQ_SET__DO_CARTESIAN_PRODUCT);

		processInvocableByCustomFuncEClass = createEClass(PROCESS_INVOCABLE_BY_CUSTOM_FUNC);
		createEReference(processInvocableByCustomFuncEClass, PROCESS_INVOCABLE_BY_CUSTOM_FUNC__INPUT_KNOWLEDGES);
		createEReference(processInvocableByCustomFuncEClass, PROCESS_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE);
		createEAttribute(processInvocableByCustomFuncEClass, PROCESS_INVOCABLE_BY_CUSTOM_FUNC__DO_CARTESIAN_PRODUCT);

		knowledgeEClass = createEClass(KNOWLEDGE);
		createEAttribute(knowledgeEClass, KNOWLEDGE__NAME);
		createEAttribute(knowledgeEClass, KNOWLEDGE__IS_PIVOT);
		createEAttribute(knowledgeEClass, KNOWLEDGE__SHOW_PIVOT);
		createEReference(knowledgeEClass, KNOWLEDGE__DEFAULT_VALUES);

		knowledgeBindingEClass = createEClass(KNOWLEDGE_BINDING);
		createEAttribute(knowledgeBindingEClass, KNOWLEDGE_BINDING__ENSEMBLE_SIDE);
		createEReference(knowledgeBindingEClass, KNOWLEDGE_BINDING__KNOWLEDGE);

		ensembleInvocableByCustomFuncEClass = createEClass(ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC);
		createEReference(ensembleInvocableByCustomFuncEClass, ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE_BINDING);
		createEReference(ensembleInvocableByCustomFuncEClass, ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__INPUT_KNOWLEDGE_BINDINGS);
		createEAttribute(ensembleInvocableByCustomFuncEClass, ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__DO_CARTESIAN_PRODUCT);

		// Create enums
		ensembleSideEEnum = createEEnum(ENSEMBLE_SIDE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentProcessEClass.getESuperTypes().add(this.getTask());
		genericKnowledgeEClass.getESuperTypes().add(this.getKnowledge());
		staticEnsembleEClass.getESuperTypes().add(this.getTask());
		defaultValueByEnumerationEClass.getESuperTypes().add(this.getDefaultValue());
		defaultValueByGeneratorEClass.getESuperTypes().add(this.getDefaultValue());
		numericKnowledgeEClass.getESuperTypes().add(this.getKnowledge());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_ComponentProcesses(), this.getComponentProcess(), null, "ComponentProcesses", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Knowledges(), this.getKnowledge(), null, "Knowledges", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentProcessEClass, ComponentProcess.class, "ComponentProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentProcess_Name(), ecorePackage.getEString(), "Name", null, 1, 1, ComponentProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentProcess_Component(), this.getComponent(), null, "Component", null, 1, 1, ComponentProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentProcess_InvocablesByEQSet(), this.getProcessInvocableByEQSet(), null, "InvocablesByEQSet", null, 0, -1, ComponentProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentProcess_InvocablesByCustomFunc(), this.getProcessInvocableByCustomFunc(), null, "InvocablesByCustomFunc", null, 0, -1, ComponentProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericKnowledgeEClass, GenericKnowledge.class, "GenericKnowledge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericKnowledge_Type(), ecorePackage.getEString(), "Type", null, 1, 1, GenericKnowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentInstanceEClass, ComponentInstance.class, "ComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentInstance_Name(), ecorePackage.getEString(), "Name", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Component(), this.getComponent(), null, "Component", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticEnsembleEClass, StaticEnsemble.class, "StaticEnsemble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticEnsemble_Coordinator(), this.getComponentInstance(), null, "Coordinator", null, 1, 1, StaticEnsemble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaticEnsemble_Member(), this.getComponentInstance(), null, "Member", null, 1, 1, StaticEnsemble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticEnsemble_Name(), ecorePackage.getEString(), "Name", null, 1, 1, StaticEnsemble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaticEnsemble_InvocablesByEQSet(), this.getEnsembleInvocableByEQSet(), null, "InvocablesByEQSet", null, 1, -1, StaticEnsemble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaticEnsemble_InvocablesByCustomFunc(), this.getEnsembleInvocableByCustomFunc(), null, "InvocablesByCustomFunc", null, 0, -1, StaticEnsemble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Period(), ecorePackage.getEInt(), "Period", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Deadline(), ecorePackage.getEInt(), "Deadline", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(upperBoundTableEClass, UpperBoundTable.class, "UpperBoundTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpperBoundTable_Rows(), this.getTableRow(), null, "Rows", null, 1, -1, UpperBoundTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableRowEClass, TableRow.class, "TableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableRow_Value(), ecorePackage.getEDouble(), "Value", null, 1, 1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRow_Derivative(), ecorePackage.getEDouble(), "Derivative", null, 1, 1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableOfDerivativesEClass, TableOfDerivatives.class, "TableOfDerivatives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableOfDerivatives_UpperBoundTable(), this.getUpperBoundTable(), null, "UpperBoundTable", null, 1, 1, TableOfDerivatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOfDerivatives_Name(), ecorePackage.getEString(), "Name", null, 1, 1, TableOfDerivatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOfDerivatives_ValuesMultiplier(), ecorePackage.getEDouble(), "ValuesMultiplier", null, 1, 1, TableOfDerivatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableOfDerivatives_LowerBoundTable(), this.getLowerBoundTable(), null, "LowerBoundTable", null, 1, 1, TableOfDerivatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOfDerivatives_DerivativesMutliplier(), ecorePackage.getEDouble(), "DerivativesMutliplier", null, 1, 1, TableOfDerivatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Components(), this.getComponent(), null, "Components", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_StaticEnsembles(), this.getStaticEnsemble(), null, "StaticEnsembles", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ComponentInstances(), this.getComponentInstance(), null, "ComponentInstances", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_BeliefPropagationDelay(), ecorePackage.getEInt(), "BeliefPropagationDelay", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_CustomIntervals(), this.getCustomInterval(), null, "CustomIntervals", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_CustomGenerators(), this.getCustomGenerator(), null, "CustomGenerators", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Alerts(), this.getAlert(), null, "Alerts", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_TablesOfDerivatives(), this.getTableOfDerivatives(), null, "TablesOfDerivatives", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultValueEClass, DefaultValue.class, "DefaultValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultValue_ComponentInstance(), this.getComponentInstance(), null, "ComponentInstance", null, 0, 1, DefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultValueByEnumerationEClass, DefaultValueByEnumeration.class, "DefaultValueByEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultValueByEnumeration_Value(), ecorePackage.getEString(), "Value", null, 1, -1, DefaultValueByEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultValueByGeneratorEClass, DefaultValueByGenerator.class, "DefaultValueByGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultValueByGenerator_Start(), ecorePackage.getEString(), "Start", null, 1, 1, DefaultValueByGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultValueByGenerator_End(), ecorePackage.getEString(), "End", null, 1, 1, DefaultValueByGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultValueByGenerator_Count(), ecorePackage.getEInt(), "Count", null, 1, 1, DefaultValueByGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefaultValueByGenerator_Generator(), this.getCustomGenerator(), null, "Generator", null, 1, 1, DefaultValueByGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customIntervalEClass, CustomInterval.class, "CustomInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomInterval_WrappedType(), ecorePackage.getEString(), "WrappedType", null, 1, 1, CustomInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomInterval_Clazz(), ecorePackage.getEString(), "Clazz", null, 1, 1, CustomInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customGeneratorEClass, CustomGenerator.class, "CustomGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomGenerator_GeneratedType(), ecorePackage.getEString(), "GeneratedType", null, 1, 1, CustomGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomGenerator_Clazz(), ecorePackage.getEString(), "Clazz", null, 1, 1, CustomGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alertEClass, Alert.class, "Alert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlert_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Alert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlert_Knowledge(), this.getKnowledge(), null, "Knowledge", null, 1, 1, Alert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericKnowledgeBindingEClass, NumericKnowledgeBinding.class, "NumericKnowledgeBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumericKnowledgeBinding_Knowledge(), this.getNumericKnowledge(), null, "Knowledge", null, 1, 1, NumericKnowledgeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericKnowledgeBinding_EnsembleSide(), this.getEnsembleSide(), "EnsembleSide", null, 0, 1, NumericKnowledgeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lowerBoundTableEClass, LowerBoundTable.class, "LowerBoundTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLowerBoundTable_Rows(), this.getTableRow(), null, "Rows", null, 1, -1, LowerBoundTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ensembleInvocableByEQSetEClass, EnsembleInvocableByEQSet.class, "EnsembleInvocableByEQSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnsembleInvocableByEQSet_InputKnowledgeBindings(), this.getNumericKnowledgeBinding(), null, "InputKnowledgeBindings", null, 0, -1, EnsembleInvocableByEQSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnsembleInvocableByEQSet_OutputKnowledgeBinding(), this.getNumericKnowledgeBinding(), null, "OutputKnowledgeBinding", null, 1, 1, EnsembleInvocableByEQSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnsembleInvocableByEQSet_DoCartesianProduct(), ecorePackage.getEBoolean(), "DoCartesianProduct", null, 0, 1, EnsembleInvocableByEQSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericKnowledgeEClass, NumericKnowledge.class, "NumericKnowledge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericKnowledge_Multiplier(), ecorePackage.getEDouble(), "Multiplier", null, 0, 1, NumericKnowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericKnowledge_TableOfDerivatives(), this.getTableOfDerivatives(), null, "TableOfDerivatives", null, 0, 1, NumericKnowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericKnowledge_Precision(), ecorePackage.getEInt(), "Precision", null, 0, 1, NumericKnowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processInvocableByEQSetEClass, ProcessInvocableByEQSet.class, "ProcessInvocableByEQSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessInvocableByEQSet_InputKnowledges(), this.getNumericKnowledge(), null, "InputKnowledges", null, 0, -1, ProcessInvocableByEQSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessInvocableByEQSet_OutputKnowledge(), this.getNumericKnowledge(), null, "OutputKnowledge", null, 1, 1, ProcessInvocableByEQSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessInvocableByEQSet_DoCartesianProduct(), ecorePackage.getEBoolean(), "DoCartesianProduct", null, 0, 1, ProcessInvocableByEQSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processInvocableByCustomFuncEClass, ProcessInvocableByCustomFunc.class, "ProcessInvocableByCustomFunc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessInvocableByCustomFunc_InputKnowledges(), this.getKnowledge(), null, "InputKnowledges", null, 0, -1, ProcessInvocableByCustomFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessInvocableByCustomFunc_OutputKnowledge(), this.getKnowledge(), null, "OutputKnowledge", null, 1, 1, ProcessInvocableByCustomFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessInvocableByCustomFunc_DoCartesianProduct(), ecorePackage.getEBoolean(), "DoCartesianProduct", null, 0, 1, ProcessInvocableByCustomFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knowledgeEClass, Knowledge.class, "Knowledge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKnowledge_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Knowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnowledge_IsPivot(), ecorePackage.getEBoolean(), "IsPivot", null, 1, 1, Knowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnowledge_ShowPivot(), ecorePackage.getEBoolean(), "ShowPivot", null, 1, 1, Knowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledge_DefaultValues(), this.getDefaultValue(), null, "DefaultValues", null, 0, -1, Knowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knowledgeBindingEClass, KnowledgeBinding.class, "KnowledgeBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKnowledgeBinding_EnsembleSide(), this.getEnsembleSide(), "EnsembleSide", null, 1, 1, KnowledgeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeBinding_Knowledge(), this.getKnowledge(), null, "Knowledge", null, 1, 1, KnowledgeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ensembleInvocableByCustomFuncEClass, EnsembleInvocableByCustomFunc.class, "EnsembleInvocableByCustomFunc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnsembleInvocableByCustomFunc_OutputKnowledgeBinding(), this.getKnowledgeBinding(), null, "OutputKnowledgeBinding", null, 1, 1, EnsembleInvocableByCustomFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnsembleInvocableByCustomFunc_InputKnowledgeBindings(), this.getKnowledgeBinding(), null, "InputKnowledgeBindings", null, 0, -1, EnsembleInvocableByCustomFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnsembleInvocableByCustomFunc_DoCartesianProduct(), ecorePackage.getEBoolean(), "DoCartesianProduct", null, 0, 1, EnsembleInvocableByCustomFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ensembleSideEEnum, EnsembleSide.class, "EnsembleSide");
		addEEnumLiteral(ensembleSideEEnum, EnsembleSide.MEMBER);
		addEEnumLiteral(ensembleSideEEnum, EnsembleSide.COORDINATOR);

		// Create resource
		createResource(eNS_URI);
	}

} //AnalysismetamodelPackageImpl
