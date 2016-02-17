/**
 */
package com.sodius.mdw.metamodel.fiacremm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMFactory
 * @model kind="package"
 * @generated
 */
public interface FiacreMMPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fiacremm";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mdworkbench.com/fiacreMM";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fiacreMM";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FiacreMMPackage eINSTANCE = com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl.init();

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacremm.impl.StateImpl
   * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getState()
   * @generated
   */
  int STATE = 0;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Out Transitions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__OUT_TRANSITIONS = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>In Transitions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__IN_TRANSITIONS = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Process</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__PROCESS = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacremm.impl.ProcessImpl
   * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 1;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__TRANSITIONS = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__VARIABLES = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__NAME = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__STATES = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Init State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__INIT_STATE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>State Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__STATE_SIZE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Var Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__VAR_SIZE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__PORTS = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacremm.impl.TransitionImpl
   * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 2;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__SOURCE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TARGET = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__GUARD = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TRIGGER = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__ACTION = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__NAME = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacremm.impl.DataTypeImpl
   * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 3;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__SIZE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__ELEMENT_TYPE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacremm.impl.VariableImpl
   * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 4;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__DATATYPE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Processes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__PROCESSES = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Components</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__COMPONENTS = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Init Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__INIT_VAL = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacremm.impl.ComponentImpl
   * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 5;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__INSTANCES = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__VARIABLES = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Process Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PROCESS_SIZE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Var Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__VAR_SIZE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PORTS = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacremm.impl.ProgramImpl
   * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 6;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__COMPONENTS = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__VARIABLE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Processes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PROCESSES = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__DATATYPES = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Component Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__COMPONENT_SIZE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.GuardImpl <em>Guard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacremm.impl.GuardImpl
   * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getGuard()
   * @generated
   */
  int GUARD = 7;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__NAME = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__BODY = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Code Fiacre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__CODE_FIACRE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Guard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.TriggerImpl <em>Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacremm.impl.TriggerImpl
   * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getTrigger()
   * @generated
   */
  int TRIGGER = 8;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__NAME = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__BODY = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__ARGUMENTS = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Code Fiacre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__CODE_FIACRE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacremm.impl.ActionImpl
   * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getAction()
   * @generated
   */
  int ACTION = 9;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__BODY = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Code Fiacre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__CODE_FIACRE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacremm.impl.PortImpl
   * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getPort()
   * @generated
   */
  int PORT = 10;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Process</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__PROCESS = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Components</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__COMPONENTS = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacremm.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the reference list '{@link com.sodius.mdw.metamodel.fiacremm.State#getOutTransitions <em>Out Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Out Transitions</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.State#getOutTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_OutTransitions();

  /**
   * Returns the meta object for the reference list '{@link com.sodius.mdw.metamodel.fiacremm.State#getInTransitions <em>In Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>In Transitions</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.State#getInTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_InTransitions();

  /**
   * Returns the meta object for the reference '{@link com.sodius.mdw.metamodel.fiacremm.State#getProcess <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Process</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.State#getProcess()
   * @see #getState()
   * @generated
   */
  EReference getState_Process();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacremm.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the containment reference list '{@link com.sodius.mdw.metamodel.fiacremm.Process#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Process#getTransitions()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_Transitions();

  /**
   * Returns the meta object for the reference list '{@link com.sodius.mdw.metamodel.fiacremm.Process#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Variables</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Process#getVariables()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_Variables();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Process#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Process#getName()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.sodius.mdw.metamodel.fiacremm.Process#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Process#getStates()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_States();

  /**
   * Returns the meta object for the reference '{@link com.sodius.mdw.metamodel.fiacremm.Process#getInitState <em>Init State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Init State</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Process#getInitState()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_InitState();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Process#getStateSize <em>State Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State Size</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Process#getStateSize()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_StateSize();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Process#getVarSize <em>Var Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Size</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Process#getVarSize()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_VarSize();

  /**
   * Returns the meta object for the containment reference list '{@link com.sodius.mdw.metamodel.fiacremm.Process#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Process#getPorts()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_Ports();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacremm.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the reference '{@link com.sodius.mdw.metamodel.fiacremm.Transition#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Transition#getSource()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Source();

  /**
   * Returns the meta object for the reference '{@link com.sodius.mdw.metamodel.fiacremm.Transition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Transition#getTarget()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Target();

  /**
   * Returns the meta object for the containment reference '{@link com.sodius.mdw.metamodel.fiacremm.Transition#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Transition#getGuard()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Guard();

  /**
   * Returns the meta object for the containment reference '{@link com.sodius.mdw.metamodel.fiacremm.Transition#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trigger</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Transition#getTrigger()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Trigger();

  /**
   * Returns the meta object for the containment reference '{@link com.sodius.mdw.metamodel.fiacremm.Transition#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Transition#getAction()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Action();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Transition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Transition#getName()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Name();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacremm.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.DataType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.DataType#getName()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Name();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.DataType#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.DataType#getSize()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Size();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.DataType#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element Type</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.DataType#getElementType()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_ElementType();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacremm.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the reference '{@link com.sodius.mdw.metamodel.fiacremm.Variable#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Datatype</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Variable#getDatatype()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Datatype();

  /**
   * Returns the meta object for the reference list '{@link com.sodius.mdw.metamodel.fiacremm.Variable#getProcesses <em>Processes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Processes</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Variable#getProcesses()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Processes();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for the reference list '{@link com.sodius.mdw.metamodel.fiacremm.Variable#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Components</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Variable#getComponents()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Components();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Variable#getInitVal <em>Init Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Init Val</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Variable#getInitVal()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_InitVal();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacremm.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the containment reference list '{@link com.sodius.mdw.metamodel.fiacremm.Component#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Component#getInstances()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Instances();

  /**
   * Returns the meta object for the reference list '{@link com.sodius.mdw.metamodel.fiacremm.Component#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Variables</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Component#getVariables()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Variables();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Component#getProcessSize <em>Process Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process Size</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Component#getProcessSize()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_ProcessSize();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Component#getVarSize <em>Var Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Size</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Component#getVarSize()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_VarSize();

  /**
   * Returns the meta object for the containment reference list '{@link com.sodius.mdw.metamodel.fiacremm.Component#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Component#getPorts()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Ports();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacremm.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link com.sodius.mdw.metamodel.fiacremm.Program#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Program#getComponents()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Components();

  /**
   * Returns the meta object for the containment reference list '{@link com.sodius.mdw.metamodel.fiacremm.Program#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Program#getVariable()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Variable();

  /**
   * Returns the meta object for the containment reference list '{@link com.sodius.mdw.metamodel.fiacremm.Program#getProcesses <em>Processes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Processes</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Program#getProcesses()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Processes();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.sodius.mdw.metamodel.fiacremm.Program#getDatatypes <em>Datatypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Datatypes</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Program#getDatatypes()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Datatypes();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Program#getComponentSize <em>Component Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component Size</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Program#getComponentSize()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_ComponentSize();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacremm.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Guard
   * @generated
   */
  EClass getGuard();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Guard#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Guard#getName()
   * @see #getGuard()
   * @generated
   */
  EAttribute getGuard_Name();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Guard#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Guard#getBody()
   * @see #getGuard()
   * @generated
   */
  EAttribute getGuard_Body();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Guard#getCodeFiacre <em>Code Fiacre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code Fiacre</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Guard#getCodeFiacre()
   * @see #getGuard()
   * @generated
   */
  EAttribute getGuard_CodeFiacre();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacremm.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Trigger
   * @generated
   */
  EClass getTrigger();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Trigger#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Trigger#getName()
   * @see #getTrigger()
   * @generated
   */
  EAttribute getTrigger_Name();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Trigger#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Trigger#getBody()
   * @see #getTrigger()
   * @generated
   */
  EAttribute getTrigger_Body();

  /**
   * Returns the meta object for the containment reference list '{@link com.sodius.mdw.metamodel.fiacremm.Trigger#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Trigger#getArguments()
   * @see #getTrigger()
   * @generated
   */
  EReference getTrigger_Arguments();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Trigger#getCodeFiacre <em>Code Fiacre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code Fiacre</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Trigger#getCodeFiacre()
   * @see #getTrigger()
   * @generated
   */
  EAttribute getTrigger_CodeFiacre();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacremm.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Action#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Action#getBody()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Body();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Action#getCodeFiacre <em>Code Fiacre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code Fiacre</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Action#getCodeFiacre()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_CodeFiacre();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacremm.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacremm.Port#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Port#getName()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Name();

  /**
   * Returns the meta object for the reference '{@link com.sodius.mdw.metamodel.fiacremm.Port#getProcess <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Process</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Port#getProcess()
   * @see #getPort()
   * @generated
   */
  EReference getPort_Process();

  /**
   * Returns the meta object for the reference list '{@link com.sodius.mdw.metamodel.fiacremm.Port#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Components</em>'.
   * @see com.sodius.mdw.metamodel.fiacremm.Port#getComponents()
   * @see #getPort()
   * @generated
   */
  EReference getPort_Components();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FiacreMMFactory getFiacreMMFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacremm.impl.StateImpl
     * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Out Transitions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__OUT_TRANSITIONS = eINSTANCE.getState_OutTransitions();

    /**
     * The meta object literal for the '<em><b>In Transitions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__IN_TRANSITIONS = eINSTANCE.getState_InTransitions();

    /**
     * The meta object literal for the '<em><b>Process</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__PROCESS = eINSTANCE.getState_Process();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacremm.impl.ProcessImpl
     * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__TRANSITIONS = eINSTANCE.getProcess_Transitions();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__VARIABLES = eINSTANCE.getProcess_Variables();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__STATES = eINSTANCE.getProcess_States();

    /**
     * The meta object literal for the '<em><b>Init State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__INIT_STATE = eINSTANCE.getProcess_InitState();

    /**
     * The meta object literal for the '<em><b>State Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS__STATE_SIZE = eINSTANCE.getProcess_StateSize();

    /**
     * The meta object literal for the '<em><b>Var Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS__VAR_SIZE = eINSTANCE.getProcess_VarSize();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__PORTS = eINSTANCE.getProcess_Ports();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacremm.impl.TransitionImpl
     * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

    /**
     * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TRIGGER = eINSTANCE.getTransition_Trigger();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__ACTION = eINSTANCE.getTransition_Action();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacremm.impl.DataTypeImpl
     * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__SIZE = eINSTANCE.getDataType_Size();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__ELEMENT_TYPE = eINSTANCE.getDataType_ElementType();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacremm.impl.VariableImpl
     * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__DATATYPE = eINSTANCE.getVariable_Datatype();

    /**
     * The meta object literal for the '<em><b>Processes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__PROCESSES = eINSTANCE.getVariable_Processes();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__COMPONENTS = eINSTANCE.getVariable_Components();

    /**
     * The meta object literal for the '<em><b>Init Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__INIT_VAL = eINSTANCE.getVariable_InitVal();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacremm.impl.ComponentImpl
     * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__INSTANCES = eINSTANCE.getComponent_Instances();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__VARIABLES = eINSTANCE.getComponent_Variables();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Process Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__PROCESS_SIZE = eINSTANCE.getComponent_ProcessSize();

    /**
     * The meta object literal for the '<em><b>Var Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__VAR_SIZE = eINSTANCE.getComponent_VarSize();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__PORTS = eINSTANCE.getComponent_Ports();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacremm.impl.ProgramImpl
     * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__COMPONENTS = eINSTANCE.getProgram_Components();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__VARIABLE = eINSTANCE.getProgram_Variable();

    /**
     * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PROCESSES = eINSTANCE.getProgram_Processes();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

    /**
     * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__DATATYPES = eINSTANCE.getProgram_Datatypes();

    /**
     * The meta object literal for the '<em><b>Component Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__COMPONENT_SIZE = eINSTANCE.getProgram_ComponentSize();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.GuardImpl <em>Guard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacremm.impl.GuardImpl
     * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getGuard()
     * @generated
     */
    EClass GUARD = eINSTANCE.getGuard();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUARD__NAME = eINSTANCE.getGuard_Name();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUARD__BODY = eINSTANCE.getGuard_Body();

    /**
     * The meta object literal for the '<em><b>Code Fiacre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUARD__CODE_FIACRE = eINSTANCE.getGuard_CodeFiacre();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.TriggerImpl <em>Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacremm.impl.TriggerImpl
     * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getTrigger()
     * @generated
     */
    EClass TRIGGER = eINSTANCE.getTrigger();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRIGGER__NAME = eINSTANCE.getTrigger_Name();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRIGGER__BODY = eINSTANCE.getTrigger_Body();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER__ARGUMENTS = eINSTANCE.getTrigger_Arguments();

    /**
     * The meta object literal for the '<em><b>Code Fiacre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRIGGER__CODE_FIACRE = eINSTANCE.getTrigger_CodeFiacre();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacremm.impl.ActionImpl
     * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__BODY = eINSTANCE.getAction_Body();

    /**
     * The meta object literal for the '<em><b>Code Fiacre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__CODE_FIACRE = eINSTANCE.getAction_CodeFiacre();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacremm.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacremm.impl.PortImpl
     * @see com.sodius.mdw.metamodel.fiacremm.impl.FiacreMMPackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__NAME = eINSTANCE.getPort_Name();

    /**
     * The meta object literal for the '<em><b>Process</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__PROCESS = eINSTANCE.getPort_Process();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__COMPONENTS = eINSTANCE.getPort_Components();

  }

} //FiacreMMPackage
