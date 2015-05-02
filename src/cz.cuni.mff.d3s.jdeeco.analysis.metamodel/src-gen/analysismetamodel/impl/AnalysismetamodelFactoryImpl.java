/**
 */
package analysismetamodel.impl;

import analysismetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysismetamodelFactoryImpl extends EFactoryImpl implements AnalysismetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnalysismetamodelFactory init() {
		try {
			AnalysismetamodelFactory theAnalysismetamodelFactory = (AnalysismetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(AnalysismetamodelPackage.eNS_URI);
			if (theAnalysismetamodelFactory != null) {
				return theAnalysismetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnalysismetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysismetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AnalysismetamodelPackage.COMPONENT: return createComponent();
			case AnalysismetamodelPackage.COMPONENT_PROCESS: return createComponentProcess();
			case AnalysismetamodelPackage.GENERIC_KNOWLEDGE: return createGenericKnowledge();
			case AnalysismetamodelPackage.COMPONENT_INSTANCE: return createComponentInstance();
			case AnalysismetamodelPackage.STATIC_ENSEMBLE: return createStaticEnsemble();
			case AnalysismetamodelPackage.UPPER_BOUND_TABLE: return createUpperBoundTable();
			case AnalysismetamodelPackage.TABLE_ROW: return createTableRow();
			case AnalysismetamodelPackage.TABLE_OF_DERIVATIVES: return createTableOfDerivatives();
			case AnalysismetamodelPackage.MODEL: return createModel();
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_ENUMERATION: return createDefaultValueByEnumeration();
			case AnalysismetamodelPackage.DEFAULT_VALUE_BY_GENERATOR: return createDefaultValueByGenerator();
			case AnalysismetamodelPackage.CUSTOM_INTERVAL: return createCustomInterval();
			case AnalysismetamodelPackage.CUSTOM_GENERATOR: return createCustomGenerator();
			case AnalysismetamodelPackage.ALERT: return createAlert();
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE_BINDING: return createNumericKnowledgeBinding();
			case AnalysismetamodelPackage.LOWER_BOUND_TABLE: return createLowerBoundTable();
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_EQ_SET: return createEnsembleInvocableByEQSet();
			case AnalysismetamodelPackage.NUMERIC_KNOWLEDGE: return createNumericKnowledge();
			case AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_EQ_SET: return createProcessInvocableByEQSet();
			case AnalysismetamodelPackage.PROCESS_INVOCABLE_BY_CUSTOM_FUNC: return createProcessInvocableByCustomFunc();
			case AnalysismetamodelPackage.KNOWLEDGE_BINDING: return createKnowledgeBinding();
			case AnalysismetamodelPackage.ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC: return createEnsembleInvocableByCustomFunc();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AnalysismetamodelPackage.ENSEMBLE_SIDE:
				return createEnsembleSideFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AnalysismetamodelPackage.ENSEMBLE_SIDE:
				return convertEnsembleSideToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentProcess createComponentProcess() {
		ComponentProcessImpl componentProcess = new ComponentProcessImpl();
		return componentProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericKnowledge createGenericKnowledge() {
		GenericKnowledgeImpl genericKnowledge = new GenericKnowledgeImpl();
		return genericKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticEnsemble createStaticEnsemble() {
		StaticEnsembleImpl staticEnsemble = new StaticEnsembleImpl();
		return staticEnsemble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundTable createUpperBoundTable() {
		UpperBoundTableImpl upperBoundTable = new UpperBoundTableImpl();
		return upperBoundTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableRow createTableRow() {
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableOfDerivatives createTableOfDerivatives() {
		TableOfDerivativesImpl tableOfDerivatives = new TableOfDerivativesImpl();
		return tableOfDerivatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultValueByEnumeration createDefaultValueByEnumeration() {
		DefaultValueByEnumerationImpl defaultValueByEnumeration = new DefaultValueByEnumerationImpl();
		return defaultValueByEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultValueByGenerator createDefaultValueByGenerator() {
		DefaultValueByGeneratorImpl defaultValueByGenerator = new DefaultValueByGeneratorImpl();
		return defaultValueByGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomInterval createCustomInterval() {
		CustomIntervalImpl customInterval = new CustomIntervalImpl();
		return customInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomGenerator createCustomGenerator() {
		CustomGeneratorImpl customGenerator = new CustomGeneratorImpl();
		return customGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alert createAlert() {
		AlertImpl alert = new AlertImpl();
		return alert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericKnowledgeBinding createNumericKnowledgeBinding() {
		NumericKnowledgeBindingImpl numericKnowledgeBinding = new NumericKnowledgeBindingImpl();
		return numericKnowledgeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerBoundTable createLowerBoundTable() {
		LowerBoundTableImpl lowerBoundTable = new LowerBoundTableImpl();
		return lowerBoundTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnsembleInvocableByEQSet createEnsembleInvocableByEQSet() {
		EnsembleInvocableByEQSetImpl ensembleInvocableByEQSet = new EnsembleInvocableByEQSetImpl();
		return ensembleInvocableByEQSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericKnowledge createNumericKnowledge() {
		NumericKnowledgeImpl numericKnowledge = new NumericKnowledgeImpl();
		return numericKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInvocableByEQSet createProcessInvocableByEQSet() {
		ProcessInvocableByEQSetImpl processInvocableByEQSet = new ProcessInvocableByEQSetImpl();
		return processInvocableByEQSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInvocableByCustomFunc createProcessInvocableByCustomFunc() {
		ProcessInvocableByCustomFuncImpl processInvocableByCustomFunc = new ProcessInvocableByCustomFuncImpl();
		return processInvocableByCustomFunc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeBinding createKnowledgeBinding() {
		KnowledgeBindingImpl knowledgeBinding = new KnowledgeBindingImpl();
		return knowledgeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnsembleInvocableByCustomFunc createEnsembleInvocableByCustomFunc() {
		EnsembleInvocableByCustomFuncImpl ensembleInvocableByCustomFunc = new EnsembleInvocableByCustomFuncImpl();
		return ensembleInvocableByCustomFunc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnsembleSide createEnsembleSideFromString(EDataType eDataType, String initialValue) {
		EnsembleSide result = EnsembleSide.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnsembleSideToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysismetamodelPackage getAnalysismetamodelPackage() {
		return (AnalysismetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnalysismetamodelPackage getPackage() {
		return AnalysismetamodelPackage.eINSTANCE;
	}

} //AnalysismetamodelFactoryImpl
