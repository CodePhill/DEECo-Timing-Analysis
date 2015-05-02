/**
 */
package analysismetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see analysismetamodel.AnalysismetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface AnalysismetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "analysismetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cz.cuni.mff.d3s.jdeeco.analysis.model.metamodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cz.cuni.mff.d3s.jdeeco.analysis.model.metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysismetamodelPackage eINSTANCE = analysismetamodel.impl.AnalysismetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.ComponentImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Component Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_PROCESSES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Knowledges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__KNOWLEDGES = 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.TaskImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 5;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEADLINE = 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.ComponentProcessImpl <em>Component Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.ComponentProcessImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getComponentProcess()
	 * @generated
	 */
	int COMPONENT_PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROCESS__PERIOD = TASK__PERIOD;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROCESS__DEADLINE = TASK__DEADLINE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROCESS__NAME = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROCESS__COMPONENT = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invocables By EQ Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROCESS__INVOCABLES_BY_EQ_SET = TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invocables By Custom Func</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROCESS__INVOCABLES_BY_CUSTOM_FUNC = TASK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROCESS_FEATURE_COUNT = TASK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Component Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROCESS_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.KnowledgeImpl <em>Knowledge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.KnowledgeImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getKnowledge()
	 * @generated
	 */
	int KNOWLEDGE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Pivot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE__IS_PIVOT = 1;

	/**
	 * The feature id for the '<em><b>Show Pivot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE__SHOW_PIVOT = 2;

	/**
	 * The feature id for the '<em><b>Default Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE__DEFAULT_VALUES = 3;

	/**
	 * The number of structural features of the '<em>Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.GenericKnowledgeImpl <em>Generic Knowledge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.GenericKnowledgeImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getGenericKnowledge()
	 * @generated
	 */
	int GENERIC_KNOWLEDGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_KNOWLEDGE__NAME = KNOWLEDGE__NAME;

	/**
	 * The feature id for the '<em><b>Is Pivot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_KNOWLEDGE__IS_PIVOT = KNOWLEDGE__IS_PIVOT;

	/**
	 * The feature id for the '<em><b>Show Pivot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_KNOWLEDGE__SHOW_PIVOT = KNOWLEDGE__SHOW_PIVOT;

	/**
	 * The feature id for the '<em><b>Default Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_KNOWLEDGE__DEFAULT_VALUES = KNOWLEDGE__DEFAULT_VALUES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_KNOWLEDGE__TYPE = KNOWLEDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_KNOWLEDGE_FEATURE_COUNT = KNOWLEDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generic Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_KNOWLEDGE_OPERATION_COUNT = KNOWLEDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.ComponentInstanceImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.StaticEnsembleImpl <em>Static Ensemble</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.StaticEnsembleImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getStaticEnsemble()
	 * @generated
	 */
	int STATIC_ENSEMBLE = 4;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENSEMBLE__PERIOD = TASK__PERIOD;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENSEMBLE__DEADLINE = TASK__DEADLINE;

	/**
	 * The feature id for the '<em><b>Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENSEMBLE__COORDINATOR = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENSEMBLE__MEMBER = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENSEMBLE__NAME = TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invocables By EQ Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENSEMBLE__INVOCABLES_BY_EQ_SET = TASK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invocables By Custom Func</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENSEMBLE__INVOCABLES_BY_CUSTOM_FUNC = TASK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Static Ensemble</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENSEMBLE_FEATURE_COUNT = TASK_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Static Ensemble</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ENSEMBLE_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.UpperBoundTableImpl <em>Upper Bound Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.UpperBoundTableImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getUpperBoundTable()
	 * @generated
	 */
	int UPPER_BOUND_TABLE = 6;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_TABLE__ROWS = 0;

	/**
	 * The number of structural features of the '<em>Upper Bound Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Upper Bound Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.TableRowImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Derivative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__DERIVATIVE = 1;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.TableOfDerivativesImpl <em>Table Of Derivatives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.TableOfDerivativesImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getTableOfDerivatives()
	 * @generated
	 */
	int TABLE_OF_DERIVATIVES = 8;

	/**
	 * The feature id for the '<em><b>Upper Bound Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_DERIVATIVES__UPPER_BOUND_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_DERIVATIVES__NAME = 1;

	/**
	 * The feature id for the '<em><b>Values Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_DERIVATIVES__VALUES_MULTIPLIER = 2;

	/**
	 * The feature id for the '<em><b>Lower Bound Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_DERIVATIVES__LOWER_BOUND_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Derivatives Mutliplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_DERIVATIVES__DERIVATIVES_MUTLIPLIER = 4;

	/**
	 * The number of structural features of the '<em>Table Of Derivatives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_DERIVATIVES_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Table Of Derivatives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_DERIVATIVES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.ModelImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 9;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Static Ensembles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__STATIC_ENSEMBLES = 1;

	/**
	 * The feature id for the '<em><b>Component Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COMPONENT_INSTANCES = 2;

	/**
	 * The feature id for the '<em><b>Belief Propagation Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__BELIEF_PROPAGATION_DELAY = 3;

	/**
	 * The feature id for the '<em><b>Custom Intervals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CUSTOM_INTERVALS = 4;

	/**
	 * The feature id for the '<em><b>Custom Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CUSTOM_GENERATORS = 5;

	/**
	 * The feature id for the '<em><b>Alerts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ALERTS = 6;

	/**
	 * The feature id for the '<em><b>Tables Of Derivatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TABLES_OF_DERIVATIVES = 7;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.DefaultValueImpl <em>Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.DefaultValueImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getDefaultValue()
	 * @generated
	 */
	int DEFAULT_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE__COMPONENT_INSTANCE = 0;

	/**
	 * The number of structural features of the '<em>Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.DefaultValueByEnumerationImpl <em>Default Value By Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.DefaultValueByEnumerationImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getDefaultValueByEnumeration()
	 * @generated
	 */
	int DEFAULT_VALUE_BY_ENUMERATION = 11;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_BY_ENUMERATION__COMPONENT_INSTANCE = DEFAULT_VALUE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_BY_ENUMERATION__VALUE = DEFAULT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Default Value By Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_BY_ENUMERATION_FEATURE_COUNT = DEFAULT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Default Value By Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_BY_ENUMERATION_OPERATION_COUNT = DEFAULT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.DefaultValueByGeneratorImpl <em>Default Value By Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.DefaultValueByGeneratorImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getDefaultValueByGenerator()
	 * @generated
	 */
	int DEFAULT_VALUE_BY_GENERATOR = 12;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_BY_GENERATOR__COMPONENT_INSTANCE = DEFAULT_VALUE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_BY_GENERATOR__START = DEFAULT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_BY_GENERATOR__END = DEFAULT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_BY_GENERATOR__COUNT = DEFAULT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_BY_GENERATOR__GENERATOR = DEFAULT_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Default Value By Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_BY_GENERATOR_FEATURE_COUNT = DEFAULT_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Default Value By Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_BY_GENERATOR_OPERATION_COUNT = DEFAULT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.CustomIntervalImpl <em>Custom Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.CustomIntervalImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getCustomInterval()
	 * @generated
	 */
	int CUSTOM_INTERVAL = 13;

	/**
	 * The feature id for the '<em><b>Wrapped Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTERVAL__WRAPPED_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTERVAL__CLAZZ = 1;

	/**
	 * The number of structural features of the '<em>Custom Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTERVAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Custom Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INTERVAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.CustomGeneratorImpl <em>Custom Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.CustomGeneratorImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getCustomGenerator()
	 * @generated
	 */
	int CUSTOM_GENERATOR = 14;

	/**
	 * The feature id for the '<em><b>Generated Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_GENERATOR__GENERATED_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_GENERATOR__CLAZZ = 1;

	/**
	 * The number of structural features of the '<em>Custom Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_GENERATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Custom Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_GENERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.AlertImpl <em>Alert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.AlertImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getAlert()
	 * @generated
	 */
	int ALERT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__KNOWLEDGE = 1;

	/**
	 * The number of structural features of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.NumericKnowledgeBindingImpl <em>Numeric Knowledge Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.NumericKnowledgeBindingImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getNumericKnowledgeBinding()
	 * @generated
	 */
	int NUMERIC_KNOWLEDGE_BINDING = 16;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_KNOWLEDGE_BINDING__KNOWLEDGE = 0;

	/**
	 * The feature id for the '<em><b>Ensemble Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_KNOWLEDGE_BINDING__ENSEMBLE_SIDE = 1;

	/**
	 * The number of structural features of the '<em>Numeric Knowledge Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_KNOWLEDGE_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Numeric Knowledge Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_KNOWLEDGE_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.LowerBoundTableImpl <em>Lower Bound Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.LowerBoundTableImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getLowerBoundTable()
	 * @generated
	 */
	int LOWER_BOUND_TABLE = 17;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BOUND_TABLE__ROWS = 0;

	/**
	 * The number of structural features of the '<em>Lower Bound Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BOUND_TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lower Bound Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BOUND_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.EnsembleInvocableByEQSetImpl <em>Ensemble Invocable By EQ Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.EnsembleInvocableByEQSetImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getEnsembleInvocableByEQSet()
	 * @generated
	 */
	int ENSEMBLE_INVOCABLE_BY_EQ_SET = 18;

	/**
	 * The feature id for the '<em><b>Input Knowledge Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_INVOCABLE_BY_EQ_SET__INPUT_KNOWLEDGE_BINDINGS = 0;

	/**
	 * The feature id for the '<em><b>Output Knowledge Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_INVOCABLE_BY_EQ_SET__OUTPUT_KNOWLEDGE_BINDING = 1;

	/**
	 * The feature id for the '<em><b>Do Cartesian Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_INVOCABLE_BY_EQ_SET__DO_CARTESIAN_PRODUCT = 2;

	/**
	 * The number of structural features of the '<em>Ensemble Invocable By EQ Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_INVOCABLE_BY_EQ_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ensemble Invocable By EQ Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_INVOCABLE_BY_EQ_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.NumericKnowledgeImpl <em>Numeric Knowledge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.NumericKnowledgeImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getNumericKnowledge()
	 * @generated
	 */
	int NUMERIC_KNOWLEDGE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_KNOWLEDGE__NAME = KNOWLEDGE__NAME;

	/**
	 * The feature id for the '<em><b>Is Pivot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_KNOWLEDGE__IS_PIVOT = KNOWLEDGE__IS_PIVOT;

	/**
	 * The feature id for the '<em><b>Show Pivot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_KNOWLEDGE__SHOW_PIVOT = KNOWLEDGE__SHOW_PIVOT;

	/**
	 * The feature id for the '<em><b>Default Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_KNOWLEDGE__DEFAULT_VALUES = KNOWLEDGE__DEFAULT_VALUES;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_KNOWLEDGE__MULTIPLIER = KNOWLEDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Of Derivatives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_KNOWLEDGE__TABLE_OF_DERIVATIVES = KNOWLEDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_KNOWLEDGE__PRECISION = KNOWLEDGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Numeric Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_KNOWLEDGE_FEATURE_COUNT = KNOWLEDGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Numeric Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_KNOWLEDGE_OPERATION_COUNT = KNOWLEDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.ProcessInvocableByEQSetImpl <em>Process Invocable By EQ Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.ProcessInvocableByEQSetImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getProcessInvocableByEQSet()
	 * @generated
	 */
	int PROCESS_INVOCABLE_BY_EQ_SET = 20;

	/**
	 * The feature id for the '<em><b>Input Knowledges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INVOCABLE_BY_EQ_SET__INPUT_KNOWLEDGES = 0;

	/**
	 * The feature id for the '<em><b>Output Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INVOCABLE_BY_EQ_SET__OUTPUT_KNOWLEDGE = 1;

	/**
	 * The feature id for the '<em><b>Do Cartesian Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INVOCABLE_BY_EQ_SET__DO_CARTESIAN_PRODUCT = 2;

	/**
	 * The number of structural features of the '<em>Process Invocable By EQ Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INVOCABLE_BY_EQ_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Process Invocable By EQ Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INVOCABLE_BY_EQ_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.ProcessInvocableByCustomFuncImpl <em>Process Invocable By Custom Func</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.ProcessInvocableByCustomFuncImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getProcessInvocableByCustomFunc()
	 * @generated
	 */
	int PROCESS_INVOCABLE_BY_CUSTOM_FUNC = 21;

	/**
	 * The feature id for the '<em><b>Input Knowledges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INVOCABLE_BY_CUSTOM_FUNC__INPUT_KNOWLEDGES = 0;

	/**
	 * The feature id for the '<em><b>Output Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE = 1;

	/**
	 * The feature id for the '<em><b>Do Cartesian Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INVOCABLE_BY_CUSTOM_FUNC__DO_CARTESIAN_PRODUCT = 2;

	/**
	 * The number of structural features of the '<em>Process Invocable By Custom Func</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INVOCABLE_BY_CUSTOM_FUNC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Process Invocable By Custom Func</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INVOCABLE_BY_CUSTOM_FUNC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.KnowledgeBindingImpl <em>Knowledge Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.KnowledgeBindingImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getKnowledgeBinding()
	 * @generated
	 */
	int KNOWLEDGE_BINDING = 23;

	/**
	 * The feature id for the '<em><b>Ensemble Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BINDING__ENSEMBLE_SIDE = 0;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BINDING__KNOWLEDGE = 1;

	/**
	 * The number of structural features of the '<em>Knowledge Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Knowledge Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.impl.EnsembleInvocableByCustomFuncImpl <em>Ensemble Invocable By Custom Func</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.impl.EnsembleInvocableByCustomFuncImpl
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getEnsembleInvocableByCustomFunc()
	 * @generated
	 */
	int ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC = 24;

	/**
	 * The feature id for the '<em><b>Output Knowledge Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE_BINDING = 0;

	/**
	 * The feature id for the '<em><b>Input Knowledge Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__INPUT_KNOWLEDGE_BINDINGS = 1;

	/**
	 * The feature id for the '<em><b>Do Cartesian Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__DO_CARTESIAN_PRODUCT = 2;

	/**
	 * The number of structural features of the '<em>Ensemble Invocable By Custom Func</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ensemble Invocable By Custom Func</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link analysismetamodel.EnsembleSide <em>Ensemble Side</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see analysismetamodel.EnsembleSide
	 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getEnsembleSide()
	 * @generated
	 */
	int ENSEMBLE_SIDE = 25;


	/**
	 * Returns the meta object for class '{@link analysismetamodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see analysismetamodel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.Component#getComponentProcesses <em>Component Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Processes</em>'.
	 * @see analysismetamodel.Component#getComponentProcesses()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ComponentProcesses();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see analysismetamodel.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.Component#getKnowledges <em>Knowledges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Knowledges</em>'.
	 * @see analysismetamodel.Component#getKnowledges()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Knowledges();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.ComponentProcess <em>Component Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Process</em>'.
	 * @see analysismetamodel.ComponentProcess
	 * @generated
	 */
	EClass getComponentProcess();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.ComponentProcess#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see analysismetamodel.ComponentProcess#getName()
	 * @see #getComponentProcess()
	 * @generated
	 */
	EAttribute getComponentProcess_Name();

	/**
	 * Returns the meta object for the reference '{@link analysismetamodel.ComponentProcess#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see analysismetamodel.ComponentProcess#getComponent()
	 * @see #getComponentProcess()
	 * @generated
	 */
	EReference getComponentProcess_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.ComponentProcess#getInvocablesByEQSet <em>Invocables By EQ Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invocables By EQ Set</em>'.
	 * @see analysismetamodel.ComponentProcess#getInvocablesByEQSet()
	 * @see #getComponentProcess()
	 * @generated
	 */
	EReference getComponentProcess_InvocablesByEQSet();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.ComponentProcess#getInvocablesByCustomFunc <em>Invocables By Custom Func</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invocables By Custom Func</em>'.
	 * @see analysismetamodel.ComponentProcess#getInvocablesByCustomFunc()
	 * @see #getComponentProcess()
	 * @generated
	 */
	EReference getComponentProcess_InvocablesByCustomFunc();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.GenericKnowledge <em>Generic Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Knowledge</em>'.
	 * @see analysismetamodel.GenericKnowledge
	 * @generated
	 */
	EClass getGenericKnowledge();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.GenericKnowledge#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see analysismetamodel.GenericKnowledge#getType()
	 * @see #getGenericKnowledge()
	 * @generated
	 */
	EAttribute getGenericKnowledge_Type();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see analysismetamodel.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.ComponentInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see analysismetamodel.ComponentInstance#getName()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Name();

	/**
	 * Returns the meta object for the reference '{@link analysismetamodel.ComponentInstance#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see analysismetamodel.ComponentInstance#getComponent()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Component();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.StaticEnsemble <em>Static Ensemble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Ensemble</em>'.
	 * @see analysismetamodel.StaticEnsemble
	 * @generated
	 */
	EClass getStaticEnsemble();

	/**
	 * Returns the meta object for the reference '{@link analysismetamodel.StaticEnsemble#getCoordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinator</em>'.
	 * @see analysismetamodel.StaticEnsemble#getCoordinator()
	 * @see #getStaticEnsemble()
	 * @generated
	 */
	EReference getStaticEnsemble_Coordinator();

	/**
	 * Returns the meta object for the reference '{@link analysismetamodel.StaticEnsemble#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member</em>'.
	 * @see analysismetamodel.StaticEnsemble#getMember()
	 * @see #getStaticEnsemble()
	 * @generated
	 */
	EReference getStaticEnsemble_Member();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.StaticEnsemble#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see analysismetamodel.StaticEnsemble#getName()
	 * @see #getStaticEnsemble()
	 * @generated
	 */
	EAttribute getStaticEnsemble_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.StaticEnsemble#getInvocablesByEQSet <em>Invocables By EQ Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invocables By EQ Set</em>'.
	 * @see analysismetamodel.StaticEnsemble#getInvocablesByEQSet()
	 * @see #getStaticEnsemble()
	 * @generated
	 */
	EReference getStaticEnsemble_InvocablesByEQSet();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.StaticEnsemble#getInvocablesByCustomFunc <em>Invocables By Custom Func</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invocables By Custom Func</em>'.
	 * @see analysismetamodel.StaticEnsemble#getInvocablesByCustomFunc()
	 * @see #getStaticEnsemble()
	 * @generated
	 */
	EReference getStaticEnsemble_InvocablesByCustomFunc();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see analysismetamodel.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.Task#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see analysismetamodel.Task#getPeriod()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Period();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.Task#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see analysismetamodel.Task#getDeadline()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Deadline();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.UpperBoundTable <em>Upper Bound Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upper Bound Table</em>'.
	 * @see analysismetamodel.UpperBoundTable
	 * @generated
	 */
	EClass getUpperBoundTable();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.UpperBoundTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see analysismetamodel.UpperBoundTable#getRows()
	 * @see #getUpperBoundTable()
	 * @generated
	 */
	EReference getUpperBoundTable_Rows();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see analysismetamodel.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.TableRow#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see analysismetamodel.TableRow#getValue()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_Value();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.TableRow#getDerivative <em>Derivative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derivative</em>'.
	 * @see analysismetamodel.TableRow#getDerivative()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_Derivative();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.TableOfDerivatives <em>Table Of Derivatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Of Derivatives</em>'.
	 * @see analysismetamodel.TableOfDerivatives
	 * @generated
	 */
	EClass getTableOfDerivatives();

	/**
	 * Returns the meta object for the containment reference '{@link analysismetamodel.TableOfDerivatives#getUpperBoundTable <em>Upper Bound Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound Table</em>'.
	 * @see analysismetamodel.TableOfDerivatives#getUpperBoundTable()
	 * @see #getTableOfDerivatives()
	 * @generated
	 */
	EReference getTableOfDerivatives_UpperBoundTable();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.TableOfDerivatives#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see analysismetamodel.TableOfDerivatives#getName()
	 * @see #getTableOfDerivatives()
	 * @generated
	 */
	EAttribute getTableOfDerivatives_Name();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.TableOfDerivatives#getValuesMultiplier <em>Values Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values Multiplier</em>'.
	 * @see analysismetamodel.TableOfDerivatives#getValuesMultiplier()
	 * @see #getTableOfDerivatives()
	 * @generated
	 */
	EAttribute getTableOfDerivatives_ValuesMultiplier();

	/**
	 * Returns the meta object for the containment reference '{@link analysismetamodel.TableOfDerivatives#getLowerBoundTable <em>Lower Bound Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound Table</em>'.
	 * @see analysismetamodel.TableOfDerivatives#getLowerBoundTable()
	 * @see #getTableOfDerivatives()
	 * @generated
	 */
	EReference getTableOfDerivatives_LowerBoundTable();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.TableOfDerivatives#getDerivativesMutliplier <em>Derivatives Mutliplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derivatives Mutliplier</em>'.
	 * @see analysismetamodel.TableOfDerivatives#getDerivativesMutliplier()
	 * @see #getTableOfDerivatives()
	 * @generated
	 */
	EAttribute getTableOfDerivatives_DerivativesMutliplier();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see analysismetamodel.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.Model#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see analysismetamodel.Model#getComponents()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.Model#getStaticEnsembles <em>Static Ensembles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Static Ensembles</em>'.
	 * @see analysismetamodel.Model#getStaticEnsembles()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_StaticEnsembles();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.Model#getComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Instances</em>'.
	 * @see analysismetamodel.Model#getComponentInstances()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ComponentInstances();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.Model#getBeliefPropagationDelay <em>Belief Propagation Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Belief Propagation Delay</em>'.
	 * @see analysismetamodel.Model#getBeliefPropagationDelay()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_BeliefPropagationDelay();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.Model#getCustomIntervals <em>Custom Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Intervals</em>'.
	 * @see analysismetamodel.Model#getCustomIntervals()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_CustomIntervals();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.Model#getCustomGenerators <em>Custom Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Generators</em>'.
	 * @see analysismetamodel.Model#getCustomGenerators()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_CustomGenerators();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.Model#getAlerts <em>Alerts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alerts</em>'.
	 * @see analysismetamodel.Model#getAlerts()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Alerts();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.Model#getTablesOfDerivatives <em>Tables Of Derivatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables Of Derivatives</em>'.
	 * @see analysismetamodel.Model#getTablesOfDerivatives()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_TablesOfDerivatives();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.DefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Value</em>'.
	 * @see analysismetamodel.DefaultValue
	 * @generated
	 */
	EClass getDefaultValue();

	/**
	 * Returns the meta object for the reference '{@link analysismetamodel.DefaultValue#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance</em>'.
	 * @see analysismetamodel.DefaultValue#getComponentInstance()
	 * @see #getDefaultValue()
	 * @generated
	 */
	EReference getDefaultValue_ComponentInstance();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.DefaultValueByEnumeration <em>Default Value By Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Value By Enumeration</em>'.
	 * @see analysismetamodel.DefaultValueByEnumeration
	 * @generated
	 */
	EClass getDefaultValueByEnumeration();

	/**
	 * Returns the meta object for the attribute list '{@link analysismetamodel.DefaultValueByEnumeration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see analysismetamodel.DefaultValueByEnumeration#getValue()
	 * @see #getDefaultValueByEnumeration()
	 * @generated
	 */
	EAttribute getDefaultValueByEnumeration_Value();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.DefaultValueByGenerator <em>Default Value By Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Value By Generator</em>'.
	 * @see analysismetamodel.DefaultValueByGenerator
	 * @generated
	 */
	EClass getDefaultValueByGenerator();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.DefaultValueByGenerator#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see analysismetamodel.DefaultValueByGenerator#getStart()
	 * @see #getDefaultValueByGenerator()
	 * @generated
	 */
	EAttribute getDefaultValueByGenerator_Start();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.DefaultValueByGenerator#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see analysismetamodel.DefaultValueByGenerator#getEnd()
	 * @see #getDefaultValueByGenerator()
	 * @generated
	 */
	EAttribute getDefaultValueByGenerator_End();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.DefaultValueByGenerator#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see analysismetamodel.DefaultValueByGenerator#getCount()
	 * @see #getDefaultValueByGenerator()
	 * @generated
	 */
	EAttribute getDefaultValueByGenerator_Count();

	/**
	 * Returns the meta object for the reference '{@link analysismetamodel.DefaultValueByGenerator#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generator</em>'.
	 * @see analysismetamodel.DefaultValueByGenerator#getGenerator()
	 * @see #getDefaultValueByGenerator()
	 * @generated
	 */
	EReference getDefaultValueByGenerator_Generator();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.CustomInterval <em>Custom Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Interval</em>'.
	 * @see analysismetamodel.CustomInterval
	 * @generated
	 */
	EClass getCustomInterval();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.CustomInterval#getWrappedType <em>Wrapped Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrapped Type</em>'.
	 * @see analysismetamodel.CustomInterval#getWrappedType()
	 * @see #getCustomInterval()
	 * @generated
	 */
	EAttribute getCustomInterval_WrappedType();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.CustomInterval#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clazz</em>'.
	 * @see analysismetamodel.CustomInterval#getClazz()
	 * @see #getCustomInterval()
	 * @generated
	 */
	EAttribute getCustomInterval_Clazz();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.CustomGenerator <em>Custom Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Generator</em>'.
	 * @see analysismetamodel.CustomGenerator
	 * @generated
	 */
	EClass getCustomGenerator();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.CustomGenerator#getGeneratedType <em>Generated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Type</em>'.
	 * @see analysismetamodel.CustomGenerator#getGeneratedType()
	 * @see #getCustomGenerator()
	 * @generated
	 */
	EAttribute getCustomGenerator_GeneratedType();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.CustomGenerator#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clazz</em>'.
	 * @see analysismetamodel.CustomGenerator#getClazz()
	 * @see #getCustomGenerator()
	 * @generated
	 */
	EAttribute getCustomGenerator_Clazz();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.Alert <em>Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert</em>'.
	 * @see analysismetamodel.Alert
	 * @generated
	 */
	EClass getAlert();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.Alert#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see analysismetamodel.Alert#getName()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_Name();

	/**
	 * Returns the meta object for the reference '{@link analysismetamodel.Alert#getKnowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Knowledge</em>'.
	 * @see analysismetamodel.Alert#getKnowledge()
	 * @see #getAlert()
	 * @generated
	 */
	EReference getAlert_Knowledge();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.NumericKnowledgeBinding <em>Numeric Knowledge Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Knowledge Binding</em>'.
	 * @see analysismetamodel.NumericKnowledgeBinding
	 * @generated
	 */
	EClass getNumericKnowledgeBinding();

	/**
	 * Returns the meta object for the reference '{@link analysismetamodel.NumericKnowledgeBinding#getKnowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Knowledge</em>'.
	 * @see analysismetamodel.NumericKnowledgeBinding#getKnowledge()
	 * @see #getNumericKnowledgeBinding()
	 * @generated
	 */
	EReference getNumericKnowledgeBinding_Knowledge();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.NumericKnowledgeBinding#getEnsembleSide <em>Ensemble Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ensemble Side</em>'.
	 * @see analysismetamodel.NumericKnowledgeBinding#getEnsembleSide()
	 * @see #getNumericKnowledgeBinding()
	 * @generated
	 */
	EAttribute getNumericKnowledgeBinding_EnsembleSide();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.LowerBoundTable <em>Lower Bound Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Bound Table</em>'.
	 * @see analysismetamodel.LowerBoundTable
	 * @generated
	 */
	EClass getLowerBoundTable();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.LowerBoundTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see analysismetamodel.LowerBoundTable#getRows()
	 * @see #getLowerBoundTable()
	 * @generated
	 */
	EReference getLowerBoundTable_Rows();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.EnsembleInvocableByEQSet <em>Ensemble Invocable By EQ Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ensemble Invocable By EQ Set</em>'.
	 * @see analysismetamodel.EnsembleInvocableByEQSet
	 * @generated
	 */
	EClass getEnsembleInvocableByEQSet();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.EnsembleInvocableByEQSet#getInputKnowledgeBindings <em>Input Knowledge Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Knowledge Bindings</em>'.
	 * @see analysismetamodel.EnsembleInvocableByEQSet#getInputKnowledgeBindings()
	 * @see #getEnsembleInvocableByEQSet()
	 * @generated
	 */
	EReference getEnsembleInvocableByEQSet_InputKnowledgeBindings();

	/**
	 * Returns the meta object for the containment reference '{@link analysismetamodel.EnsembleInvocableByEQSet#getOutputKnowledgeBinding <em>Output Knowledge Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Knowledge Binding</em>'.
	 * @see analysismetamodel.EnsembleInvocableByEQSet#getOutputKnowledgeBinding()
	 * @see #getEnsembleInvocableByEQSet()
	 * @generated
	 */
	EReference getEnsembleInvocableByEQSet_OutputKnowledgeBinding();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.EnsembleInvocableByEQSet#isDoCartesianProduct <em>Do Cartesian Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Cartesian Product</em>'.
	 * @see analysismetamodel.EnsembleInvocableByEQSet#isDoCartesianProduct()
	 * @see #getEnsembleInvocableByEQSet()
	 * @generated
	 */
	EAttribute getEnsembleInvocableByEQSet_DoCartesianProduct();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.NumericKnowledge <em>Numeric Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Knowledge</em>'.
	 * @see analysismetamodel.NumericKnowledge
	 * @generated
	 */
	EClass getNumericKnowledge();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.NumericKnowledge#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see analysismetamodel.NumericKnowledge#getMultiplier()
	 * @see #getNumericKnowledge()
	 * @generated
	 */
	EAttribute getNumericKnowledge_Multiplier();

	/**
	 * Returns the meta object for the reference '{@link analysismetamodel.NumericKnowledge#getTableOfDerivatives <em>Table Of Derivatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Of Derivatives</em>'.
	 * @see analysismetamodel.NumericKnowledge#getTableOfDerivatives()
	 * @see #getNumericKnowledge()
	 * @generated
	 */
	EReference getNumericKnowledge_TableOfDerivatives();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.NumericKnowledge#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see analysismetamodel.NumericKnowledge#getPrecision()
	 * @see #getNumericKnowledge()
	 * @generated
	 */
	EAttribute getNumericKnowledge_Precision();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.ProcessInvocableByEQSet <em>Process Invocable By EQ Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Invocable By EQ Set</em>'.
	 * @see analysismetamodel.ProcessInvocableByEQSet
	 * @generated
	 */
	EClass getProcessInvocableByEQSet();

	/**
	 * Returns the meta object for the reference list '{@link analysismetamodel.ProcessInvocableByEQSet#getInputKnowledges <em>Input Knowledges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Knowledges</em>'.
	 * @see analysismetamodel.ProcessInvocableByEQSet#getInputKnowledges()
	 * @see #getProcessInvocableByEQSet()
	 * @generated
	 */
	EReference getProcessInvocableByEQSet_InputKnowledges();

	/**
	 * Returns the meta object for the reference '{@link analysismetamodel.ProcessInvocableByEQSet#getOutputKnowledge <em>Output Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Knowledge</em>'.
	 * @see analysismetamodel.ProcessInvocableByEQSet#getOutputKnowledge()
	 * @see #getProcessInvocableByEQSet()
	 * @generated
	 */
	EReference getProcessInvocableByEQSet_OutputKnowledge();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.ProcessInvocableByEQSet#isDoCartesianProduct <em>Do Cartesian Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Cartesian Product</em>'.
	 * @see analysismetamodel.ProcessInvocableByEQSet#isDoCartesianProduct()
	 * @see #getProcessInvocableByEQSet()
	 * @generated
	 */
	EAttribute getProcessInvocableByEQSet_DoCartesianProduct();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.ProcessInvocableByCustomFunc <em>Process Invocable By Custom Func</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Invocable By Custom Func</em>'.
	 * @see analysismetamodel.ProcessInvocableByCustomFunc
	 * @generated
	 */
	EClass getProcessInvocableByCustomFunc();

	/**
	 * Returns the meta object for the reference list '{@link analysismetamodel.ProcessInvocableByCustomFunc#getInputKnowledges <em>Input Knowledges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Knowledges</em>'.
	 * @see analysismetamodel.ProcessInvocableByCustomFunc#getInputKnowledges()
	 * @see #getProcessInvocableByCustomFunc()
	 * @generated
	 */
	EReference getProcessInvocableByCustomFunc_InputKnowledges();

	/**
	 * Returns the meta object for the reference '{@link analysismetamodel.ProcessInvocableByCustomFunc#getOutputKnowledge <em>Output Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Knowledge</em>'.
	 * @see analysismetamodel.ProcessInvocableByCustomFunc#getOutputKnowledge()
	 * @see #getProcessInvocableByCustomFunc()
	 * @generated
	 */
	EReference getProcessInvocableByCustomFunc_OutputKnowledge();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.ProcessInvocableByCustomFunc#isDoCartesianProduct <em>Do Cartesian Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Cartesian Product</em>'.
	 * @see analysismetamodel.ProcessInvocableByCustomFunc#isDoCartesianProduct()
	 * @see #getProcessInvocableByCustomFunc()
	 * @generated
	 */
	EAttribute getProcessInvocableByCustomFunc_DoCartesianProduct();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.Knowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge</em>'.
	 * @see analysismetamodel.Knowledge
	 * @generated
	 */
	EClass getKnowledge();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.Knowledge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see analysismetamodel.Knowledge#getName()
	 * @see #getKnowledge()
	 * @generated
	 */
	EAttribute getKnowledge_Name();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.Knowledge#isIsPivot <em>Is Pivot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Pivot</em>'.
	 * @see analysismetamodel.Knowledge#isIsPivot()
	 * @see #getKnowledge()
	 * @generated
	 */
	EAttribute getKnowledge_IsPivot();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.Knowledge#isShowPivot <em>Show Pivot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Pivot</em>'.
	 * @see analysismetamodel.Knowledge#isShowPivot()
	 * @see #getKnowledge()
	 * @generated
	 */
	EAttribute getKnowledge_ShowPivot();

	/**
	 * Returns the meta object for the containment reference list '{@link analysismetamodel.Knowledge#getDefaultValues <em>Default Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Values</em>'.
	 * @see analysismetamodel.Knowledge#getDefaultValues()
	 * @see #getKnowledge()
	 * @generated
	 */
	EReference getKnowledge_DefaultValues();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.KnowledgeBinding <em>Knowledge Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Binding</em>'.
	 * @see analysismetamodel.KnowledgeBinding
	 * @generated
	 */
	EClass getKnowledgeBinding();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.KnowledgeBinding#getEnsembleSide <em>Ensemble Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ensemble Side</em>'.
	 * @see analysismetamodel.KnowledgeBinding#getEnsembleSide()
	 * @see #getKnowledgeBinding()
	 * @generated
	 */
	EAttribute getKnowledgeBinding_EnsembleSide();

	/**
	 * Returns the meta object for the reference '{@link analysismetamodel.KnowledgeBinding#getKnowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Knowledge</em>'.
	 * @see analysismetamodel.KnowledgeBinding#getKnowledge()
	 * @see #getKnowledgeBinding()
	 * @generated
	 */
	EReference getKnowledgeBinding_Knowledge();

	/**
	 * Returns the meta object for class '{@link analysismetamodel.EnsembleInvocableByCustomFunc <em>Ensemble Invocable By Custom Func</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ensemble Invocable By Custom Func</em>'.
	 * @see analysismetamodel.EnsembleInvocableByCustomFunc
	 * @generated
	 */
	EClass getEnsembleInvocableByCustomFunc();

	/**
	 * Returns the meta object for the containment reference '{@link analysismetamodel.EnsembleInvocableByCustomFunc#getOutputKnowledgeBinding <em>Output Knowledge Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Knowledge Binding</em>'.
	 * @see analysismetamodel.EnsembleInvocableByCustomFunc#getOutputKnowledgeBinding()
	 * @see #getEnsembleInvocableByCustomFunc()
	 * @generated
	 */
	EReference getEnsembleInvocableByCustomFunc_OutputKnowledgeBinding();

	/**
	 * Returns the meta object for the reference list '{@link analysismetamodel.EnsembleInvocableByCustomFunc#getInputKnowledgeBindings <em>Input Knowledge Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Knowledge Bindings</em>'.
	 * @see analysismetamodel.EnsembleInvocableByCustomFunc#getInputKnowledgeBindings()
	 * @see #getEnsembleInvocableByCustomFunc()
	 * @generated
	 */
	EReference getEnsembleInvocableByCustomFunc_InputKnowledgeBindings();

	/**
	 * Returns the meta object for the attribute '{@link analysismetamodel.EnsembleInvocableByCustomFunc#isDoCartesianProduct <em>Do Cartesian Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Cartesian Product</em>'.
	 * @see analysismetamodel.EnsembleInvocableByCustomFunc#isDoCartesianProduct()
	 * @see #getEnsembleInvocableByCustomFunc()
	 * @generated
	 */
	EAttribute getEnsembleInvocableByCustomFunc_DoCartesianProduct();

	/**
	 * Returns the meta object for enum '{@link analysismetamodel.EnsembleSide <em>Ensemble Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ensemble Side</em>'.
	 * @see analysismetamodel.EnsembleSide
	 * @generated
	 */
	EEnum getEnsembleSide();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnalysismetamodelFactory getAnalysismetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.ComponentImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Component Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT_PROCESSES = eINSTANCE.getComponent_ComponentProcesses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Knowledges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__KNOWLEDGES = eINSTANCE.getComponent_Knowledges();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.ComponentProcessImpl <em>Component Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.ComponentProcessImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getComponentProcess()
		 * @generated
		 */
		EClass COMPONENT_PROCESS = eINSTANCE.getComponentProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PROCESS__NAME = eINSTANCE.getComponentProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROCESS__COMPONENT = eINSTANCE.getComponentProcess_Component();

		/**
		 * The meta object literal for the '<em><b>Invocables By EQ Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROCESS__INVOCABLES_BY_EQ_SET = eINSTANCE.getComponentProcess_InvocablesByEQSet();

		/**
		 * The meta object literal for the '<em><b>Invocables By Custom Func</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROCESS__INVOCABLES_BY_CUSTOM_FUNC = eINSTANCE.getComponentProcess_InvocablesByCustomFunc();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.GenericKnowledgeImpl <em>Generic Knowledge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.GenericKnowledgeImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getGenericKnowledge()
		 * @generated
		 */
		EClass GENERIC_KNOWLEDGE = eINSTANCE.getGenericKnowledge();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_KNOWLEDGE__TYPE = eINSTANCE.getGenericKnowledge_Type();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.ComponentInstanceImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__NAME = eINSTANCE.getComponentInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__COMPONENT = eINSTANCE.getComponentInstance_Component();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.StaticEnsembleImpl <em>Static Ensemble</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.StaticEnsembleImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getStaticEnsemble()
		 * @generated
		 */
		EClass STATIC_ENSEMBLE = eINSTANCE.getStaticEnsemble();

		/**
		 * The meta object literal for the '<em><b>Coordinator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_ENSEMBLE__COORDINATOR = eINSTANCE.getStaticEnsemble_Coordinator();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_ENSEMBLE__MEMBER = eINSTANCE.getStaticEnsemble_Member();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_ENSEMBLE__NAME = eINSTANCE.getStaticEnsemble_Name();

		/**
		 * The meta object literal for the '<em><b>Invocables By EQ Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_ENSEMBLE__INVOCABLES_BY_EQ_SET = eINSTANCE.getStaticEnsemble_InvocablesByEQSet();

		/**
		 * The meta object literal for the '<em><b>Invocables By Custom Func</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_ENSEMBLE__INVOCABLES_BY_CUSTOM_FUNC = eINSTANCE.getStaticEnsemble_InvocablesByCustomFunc();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.TaskImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PERIOD = eINSTANCE.getTask_Period();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DEADLINE = eINSTANCE.getTask_Deadline();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.UpperBoundTableImpl <em>Upper Bound Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.UpperBoundTableImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getUpperBoundTable()
		 * @generated
		 */
		EClass UPPER_BOUND_TABLE = eINSTANCE.getUpperBoundTable();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPPER_BOUND_TABLE__ROWS = eINSTANCE.getUpperBoundTable_Rows();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.TableRowImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__VALUE = eINSTANCE.getTableRow_Value();

		/**
		 * The meta object literal for the '<em><b>Derivative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__DERIVATIVE = eINSTANCE.getTableRow_Derivative();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.TableOfDerivativesImpl <em>Table Of Derivatives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.TableOfDerivativesImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getTableOfDerivatives()
		 * @generated
		 */
		EClass TABLE_OF_DERIVATIVES = eINSTANCE.getTableOfDerivatives();

		/**
		 * The meta object literal for the '<em><b>Upper Bound Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_OF_DERIVATIVES__UPPER_BOUND_TABLE = eINSTANCE.getTableOfDerivatives_UpperBoundTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OF_DERIVATIVES__NAME = eINSTANCE.getTableOfDerivatives_Name();

		/**
		 * The meta object literal for the '<em><b>Values Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OF_DERIVATIVES__VALUES_MULTIPLIER = eINSTANCE.getTableOfDerivatives_ValuesMultiplier();

		/**
		 * The meta object literal for the '<em><b>Lower Bound Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_OF_DERIVATIVES__LOWER_BOUND_TABLE = eINSTANCE.getTableOfDerivatives_LowerBoundTable();

		/**
		 * The meta object literal for the '<em><b>Derivatives Mutliplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OF_DERIVATIVES__DERIVATIVES_MUTLIPLIER = eINSTANCE.getTableOfDerivatives_DerivativesMutliplier();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.ModelImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__COMPONENTS = eINSTANCE.getModel_Components();

		/**
		 * The meta object literal for the '<em><b>Static Ensembles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__STATIC_ENSEMBLES = eINSTANCE.getModel_StaticEnsembles();

		/**
		 * The meta object literal for the '<em><b>Component Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__COMPONENT_INSTANCES = eINSTANCE.getModel_ComponentInstances();

		/**
		 * The meta object literal for the '<em><b>Belief Propagation Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__BELIEF_PROPAGATION_DELAY = eINSTANCE.getModel_BeliefPropagationDelay();

		/**
		 * The meta object literal for the '<em><b>Custom Intervals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CUSTOM_INTERVALS = eINSTANCE.getModel_CustomIntervals();

		/**
		 * The meta object literal for the '<em><b>Custom Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CUSTOM_GENERATORS = eINSTANCE.getModel_CustomGenerators();

		/**
		 * The meta object literal for the '<em><b>Alerts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ALERTS = eINSTANCE.getModel_Alerts();

		/**
		 * The meta object literal for the '<em><b>Tables Of Derivatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TABLES_OF_DERIVATIVES = eINSTANCE.getModel_TablesOfDerivatives();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.DefaultValueImpl <em>Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.DefaultValueImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getDefaultValue()
		 * @generated
		 */
		EClass DEFAULT_VALUE = eINSTANCE.getDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_VALUE__COMPONENT_INSTANCE = eINSTANCE.getDefaultValue_ComponentInstance();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.DefaultValueByEnumerationImpl <em>Default Value By Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.DefaultValueByEnumerationImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getDefaultValueByEnumeration()
		 * @generated
		 */
		EClass DEFAULT_VALUE_BY_ENUMERATION = eINSTANCE.getDefaultValueByEnumeration();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_VALUE_BY_ENUMERATION__VALUE = eINSTANCE.getDefaultValueByEnumeration_Value();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.DefaultValueByGeneratorImpl <em>Default Value By Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.DefaultValueByGeneratorImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getDefaultValueByGenerator()
		 * @generated
		 */
		EClass DEFAULT_VALUE_BY_GENERATOR = eINSTANCE.getDefaultValueByGenerator();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_VALUE_BY_GENERATOR__START = eINSTANCE.getDefaultValueByGenerator_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_VALUE_BY_GENERATOR__END = eINSTANCE.getDefaultValueByGenerator_End();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_VALUE_BY_GENERATOR__COUNT = eINSTANCE.getDefaultValueByGenerator_Count();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_VALUE_BY_GENERATOR__GENERATOR = eINSTANCE.getDefaultValueByGenerator_Generator();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.CustomIntervalImpl <em>Custom Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.CustomIntervalImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getCustomInterval()
		 * @generated
		 */
		EClass CUSTOM_INTERVAL = eINSTANCE.getCustomInterval();

		/**
		 * The meta object literal for the '<em><b>Wrapped Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_INTERVAL__WRAPPED_TYPE = eINSTANCE.getCustomInterval_WrappedType();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_INTERVAL__CLAZZ = eINSTANCE.getCustomInterval_Clazz();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.CustomGeneratorImpl <em>Custom Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.CustomGeneratorImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getCustomGenerator()
		 * @generated
		 */
		EClass CUSTOM_GENERATOR = eINSTANCE.getCustomGenerator();

		/**
		 * The meta object literal for the '<em><b>Generated Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_GENERATOR__GENERATED_TYPE = eINSTANCE.getCustomGenerator_GeneratedType();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_GENERATOR__CLAZZ = eINSTANCE.getCustomGenerator_Clazz();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.AlertImpl <em>Alert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.AlertImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getAlert()
		 * @generated
		 */
		EClass ALERT = eINSTANCE.getAlert();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__NAME = eINSTANCE.getAlert_Name();

		/**
		 * The meta object literal for the '<em><b>Knowledge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALERT__KNOWLEDGE = eINSTANCE.getAlert_Knowledge();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.NumericKnowledgeBindingImpl <em>Numeric Knowledge Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.NumericKnowledgeBindingImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getNumericKnowledgeBinding()
		 * @generated
		 */
		EClass NUMERIC_KNOWLEDGE_BINDING = eINSTANCE.getNumericKnowledgeBinding();

		/**
		 * The meta object literal for the '<em><b>Knowledge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_KNOWLEDGE_BINDING__KNOWLEDGE = eINSTANCE.getNumericKnowledgeBinding_Knowledge();

		/**
		 * The meta object literal for the '<em><b>Ensemble Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_KNOWLEDGE_BINDING__ENSEMBLE_SIDE = eINSTANCE.getNumericKnowledgeBinding_EnsembleSide();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.LowerBoundTableImpl <em>Lower Bound Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.LowerBoundTableImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getLowerBoundTable()
		 * @generated
		 */
		EClass LOWER_BOUND_TABLE = eINSTANCE.getLowerBoundTable();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOWER_BOUND_TABLE__ROWS = eINSTANCE.getLowerBoundTable_Rows();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.EnsembleInvocableByEQSetImpl <em>Ensemble Invocable By EQ Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.EnsembleInvocableByEQSetImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getEnsembleInvocableByEQSet()
		 * @generated
		 */
		EClass ENSEMBLE_INVOCABLE_BY_EQ_SET = eINSTANCE.getEnsembleInvocableByEQSet();

		/**
		 * The meta object literal for the '<em><b>Input Knowledge Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSEMBLE_INVOCABLE_BY_EQ_SET__INPUT_KNOWLEDGE_BINDINGS = eINSTANCE.getEnsembleInvocableByEQSet_InputKnowledgeBindings();

		/**
		 * The meta object literal for the '<em><b>Output Knowledge Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSEMBLE_INVOCABLE_BY_EQ_SET__OUTPUT_KNOWLEDGE_BINDING = eINSTANCE.getEnsembleInvocableByEQSet_OutputKnowledgeBinding();

		/**
		 * The meta object literal for the '<em><b>Do Cartesian Product</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEMBLE_INVOCABLE_BY_EQ_SET__DO_CARTESIAN_PRODUCT = eINSTANCE.getEnsembleInvocableByEQSet_DoCartesianProduct();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.NumericKnowledgeImpl <em>Numeric Knowledge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.NumericKnowledgeImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getNumericKnowledge()
		 * @generated
		 */
		EClass NUMERIC_KNOWLEDGE = eINSTANCE.getNumericKnowledge();

		/**
		 * The meta object literal for the '<em><b>Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_KNOWLEDGE__MULTIPLIER = eINSTANCE.getNumericKnowledge_Multiplier();

		/**
		 * The meta object literal for the '<em><b>Table Of Derivatives</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_KNOWLEDGE__TABLE_OF_DERIVATIVES = eINSTANCE.getNumericKnowledge_TableOfDerivatives();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_KNOWLEDGE__PRECISION = eINSTANCE.getNumericKnowledge_Precision();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.ProcessInvocableByEQSetImpl <em>Process Invocable By EQ Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.ProcessInvocableByEQSetImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getProcessInvocableByEQSet()
		 * @generated
		 */
		EClass PROCESS_INVOCABLE_BY_EQ_SET = eINSTANCE.getProcessInvocableByEQSet();

		/**
		 * The meta object literal for the '<em><b>Input Knowledges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INVOCABLE_BY_EQ_SET__INPUT_KNOWLEDGES = eINSTANCE.getProcessInvocableByEQSet_InputKnowledges();

		/**
		 * The meta object literal for the '<em><b>Output Knowledge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INVOCABLE_BY_EQ_SET__OUTPUT_KNOWLEDGE = eINSTANCE.getProcessInvocableByEQSet_OutputKnowledge();

		/**
		 * The meta object literal for the '<em><b>Do Cartesian Product</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INVOCABLE_BY_EQ_SET__DO_CARTESIAN_PRODUCT = eINSTANCE.getProcessInvocableByEQSet_DoCartesianProduct();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.ProcessInvocableByCustomFuncImpl <em>Process Invocable By Custom Func</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.ProcessInvocableByCustomFuncImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getProcessInvocableByCustomFunc()
		 * @generated
		 */
		EClass PROCESS_INVOCABLE_BY_CUSTOM_FUNC = eINSTANCE.getProcessInvocableByCustomFunc();

		/**
		 * The meta object literal for the '<em><b>Input Knowledges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INVOCABLE_BY_CUSTOM_FUNC__INPUT_KNOWLEDGES = eINSTANCE.getProcessInvocableByCustomFunc_InputKnowledges();

		/**
		 * The meta object literal for the '<em><b>Output Knowledge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE = eINSTANCE.getProcessInvocableByCustomFunc_OutputKnowledge();

		/**
		 * The meta object literal for the '<em><b>Do Cartesian Product</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INVOCABLE_BY_CUSTOM_FUNC__DO_CARTESIAN_PRODUCT = eINSTANCE.getProcessInvocableByCustomFunc_DoCartesianProduct();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.KnowledgeImpl <em>Knowledge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.KnowledgeImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getKnowledge()
		 * @generated
		 */
		EClass KNOWLEDGE = eINSTANCE.getKnowledge();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWLEDGE__NAME = eINSTANCE.getKnowledge_Name();

		/**
		 * The meta object literal for the '<em><b>Is Pivot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWLEDGE__IS_PIVOT = eINSTANCE.getKnowledge_IsPivot();

		/**
		 * The meta object literal for the '<em><b>Show Pivot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWLEDGE__SHOW_PIVOT = eINSTANCE.getKnowledge_ShowPivot();

		/**
		 * The meta object literal for the '<em><b>Default Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE__DEFAULT_VALUES = eINSTANCE.getKnowledge_DefaultValues();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.KnowledgeBindingImpl <em>Knowledge Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.KnowledgeBindingImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getKnowledgeBinding()
		 * @generated
		 */
		EClass KNOWLEDGE_BINDING = eINSTANCE.getKnowledgeBinding();

		/**
		 * The meta object literal for the '<em><b>Ensemble Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWLEDGE_BINDING__ENSEMBLE_SIDE = eINSTANCE.getKnowledgeBinding_EnsembleSide();

		/**
		 * The meta object literal for the '<em><b>Knowledge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_BINDING__KNOWLEDGE = eINSTANCE.getKnowledgeBinding_Knowledge();

		/**
		 * The meta object literal for the '{@link analysismetamodel.impl.EnsembleInvocableByCustomFuncImpl <em>Ensemble Invocable By Custom Func</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.impl.EnsembleInvocableByCustomFuncImpl
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getEnsembleInvocableByCustomFunc()
		 * @generated
		 */
		EClass ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC = eINSTANCE.getEnsembleInvocableByCustomFunc();

		/**
		 * The meta object literal for the '<em><b>Output Knowledge Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__OUTPUT_KNOWLEDGE_BINDING = eINSTANCE.getEnsembleInvocableByCustomFunc_OutputKnowledgeBinding();

		/**
		 * The meta object literal for the '<em><b>Input Knowledge Bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__INPUT_KNOWLEDGE_BINDINGS = eINSTANCE.getEnsembleInvocableByCustomFunc_InputKnowledgeBindings();

		/**
		 * The meta object literal for the '<em><b>Do Cartesian Product</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEMBLE_INVOCABLE_BY_CUSTOM_FUNC__DO_CARTESIAN_PRODUCT = eINSTANCE.getEnsembleInvocableByCustomFunc_DoCartesianProduct();

		/**
		 * The meta object literal for the '{@link analysismetamodel.EnsembleSide <em>Ensemble Side</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see analysismetamodel.EnsembleSide
		 * @see analysismetamodel.impl.AnalysismetamodelPackageImpl#getEnsembleSide()
		 * @generated
		 */
		EEnum ENSEMBLE_SIDE = eINSTANCE.getEnsembleSide();

	}

} //AnalysismetamodelPackage
