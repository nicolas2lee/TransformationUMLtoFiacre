/**
 */
package com.sodius.mdw.metamodel.fiacre;

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
 * @see com.sodius.mdw.metamodel.fiacre.FiacreFactory
 * @model kind="package"
 * @generated
 */
public interface FiacrePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fiacre";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mdworkbench.com/fiacre";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fiacre";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FiacrePackage eINSTANCE = com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl.init();

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacre.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacre.impl.StateImpl
   * @see com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl#getState()
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
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ID = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transition</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TRANSITION = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacre.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacre.impl.ProcessImpl
   * @see com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl#getProcess()
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
   * The feature id for the '<em><b>State</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__STATE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__TRANSITION = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__VARIABLE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__ID = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacre.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacre.impl.TransitionImpl
   * @see com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl#getTransition()
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
   * The feature id for the '<em><b>State</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__STATE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacre.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacre.impl.DataTypeImpl
   * @see com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl#getDataType()
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
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacre.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacre.impl.VariableImpl
   * @see com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl#getVariable()
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
   * The feature id for the '<em><b>Process</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__PROCESS = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__ID = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Component</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__COMPONENT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacre.impl.InitImpl <em>Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacre.impl.InitImpl
   * @see com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl#getInit()
   * @generated
   */
  int INIT = 5;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT__EANNOTATIONS = STATE__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT__ID = STATE__ID;

  /**
   * The feature id for the '<em><b>Transition</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT__TRANSITION = STATE__TRANSITION;

  /**
   * The number of structural features of the '<em>Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacre.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacre.impl.ComponentImpl
   * @see com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 6;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Process</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PROCESS = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__VARIABLE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__ID = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.sodius.mdw.metamodel.fiacre.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sodius.mdw.metamodel.fiacre.impl.ProgramImpl
   * @see com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 7;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__COMPONENT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__VARIABLE = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Process</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PROCESS = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacre.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacre.State#getID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ID</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.State#getID()
   * @see #getState()
   * @generated
   */
  EAttribute getState_ID();

  /**
   * Returns the meta object for the reference list '{@link com.sodius.mdw.metamodel.fiacre.State#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Transition</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.State#getTransition()
   * @see #getState()
   * @generated
   */
  EReference getState_Transition();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacre.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the containment reference list '{@link com.sodius.mdw.metamodel.fiacre.Process#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Process#getState()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_State();

  /**
   * Returns the meta object for the containment reference list '{@link com.sodius.mdw.metamodel.fiacre.Process#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transition</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Process#getTransition()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_Transition();

  /**
   * Returns the meta object for the reference list '{@link com.sodius.mdw.metamodel.fiacre.Process#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Variable</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Process#getVariable()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_Variable();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacre.Process#getID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ID</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Process#getID()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_ID();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacre.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the reference list '{@link com.sodius.mdw.metamodel.fiacre.Transition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>State</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Transition#getState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_State();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacre.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacre.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the reference '{@link com.sodius.mdw.metamodel.fiacre.Variable#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Datatype</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Variable#getDatatype()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Datatype();

  /**
   * Returns the meta object for the reference list '{@link com.sodius.mdw.metamodel.fiacre.Variable#getProcess <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Process</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Variable#getProcess()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Process();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacre.Variable#getID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ID</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Variable#getID()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_ID();

  /**
   * Returns the meta object for the reference list '{@link com.sodius.mdw.metamodel.fiacre.Variable#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Component</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Variable#getComponent()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Component();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacre.Init <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Init
   * @generated
   */
  EClass getInit();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacre.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the containment reference list '{@link com.sodius.mdw.metamodel.fiacre.Component#getProcess <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Process</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Component#getProcess()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Process();

  /**
   * Returns the meta object for the reference list '{@link com.sodius.mdw.metamodel.fiacre.Component#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Variable</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Component#getVariable()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Variable();

  /**
   * Returns the meta object for the attribute '{@link com.sodius.mdw.metamodel.fiacre.Component#getID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ID</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Component#getID()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_ID();

  /**
   * Returns the meta object for class '{@link com.sodius.mdw.metamodel.fiacre.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link com.sodius.mdw.metamodel.fiacre.Program#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Program#getComponent()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Component();

  /**
   * Returns the meta object for the containment reference list '{@link com.sodius.mdw.metamodel.fiacre.Program#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Program#getVariable()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Variable();

  /**
   * Returns the meta object for the containment reference list '{@link com.sodius.mdw.metamodel.fiacre.Program#getProcess <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Process</em>'.
   * @see com.sodius.mdw.metamodel.fiacre.Program#getProcess()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Process();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FiacreFactory getFiacreFactory();

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
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacre.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacre.impl.StateImpl
     * @see com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__ID = eINSTANCE.getState_ID();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__TRANSITION = eINSTANCE.getState_Transition();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacre.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacre.impl.ProcessImpl
     * @see com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__STATE = eINSTANCE.getProcess_State();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__TRANSITION = eINSTANCE.getProcess_Transition();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__VARIABLE = eINSTANCE.getProcess_Variable();

    /**
     * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS__ID = eINSTANCE.getProcess_ID();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacre.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacre.impl.TransitionImpl
     * @see com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__STATE = eINSTANCE.getTransition_State();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacre.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacre.impl.DataTypeImpl
     * @see com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacre.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacre.impl.VariableImpl
     * @see com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl#getVariable()
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
     * The meta object literal for the '<em><b>Process</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__PROCESS = eINSTANCE.getVariable_Process();

    /**
     * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__ID = eINSTANCE.getVariable_ID();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__COMPONENT = eINSTANCE.getVariable_Component();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacre.impl.InitImpl <em>Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacre.impl.InitImpl
     * @see com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl#getInit()
     * @generated
     */
    EClass INIT = eINSTANCE.getInit();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacre.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacre.impl.ComponentImpl
     * @see com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__PROCESS = eINSTANCE.getComponent_Process();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__VARIABLE = eINSTANCE.getComponent_Variable();

    /**
     * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__ID = eINSTANCE.getComponent_ID();

    /**
     * The meta object literal for the '{@link com.sodius.mdw.metamodel.fiacre.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sodius.mdw.metamodel.fiacre.impl.ProgramImpl
     * @see com.sodius.mdw.metamodel.fiacre.impl.FiacrePackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__COMPONENT = eINSTANCE.getProgram_Component();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__VARIABLE = eINSTANCE.getProgram_Variable();

    /**
     * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PROCESS = eINSTANCE.getProgram_Process();

  }

} //FiacrePackage
