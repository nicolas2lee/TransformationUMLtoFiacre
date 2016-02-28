/**
 */
package com.sodius.mdw.metamodel.fiacremm;

import com.sodius.mdw.core.model.emf.MDWEObject;

import com.sodius.mdw.core.model.emf.MDWEList;

import org.eclipse.emf.ecore.EModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Process#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Process#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Process#getName <em>Name</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Process#getStates <em>States</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Process#getInitState <em>Init State</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Process#getStateSize <em>State Size</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Process#getVarSize <em>Var Size</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Process#getPorts <em>Ports</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Process#getAlluniqueTriggers <em>Allunique Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProcess()
 * @model annotation="http://www.sodius.com/metamodels/MDWProperties logicalPackage='td1'"
 * @extends MDWEObject
 * @generated
 */
public interface Process extends MDWEObject, EModelElement
{
  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacremm.Transition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProcess_Transitions()
   * @model containment="true" required="true"
   * @generated
   */
  MDWEList<Transition> getTransitions();

  /**
   * Returns the value of the '<em><b>Variables</b></em>' reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacremm.Variable}.
   * It is bidirectional and its opposite is '{@link com.sodius.mdw.metamodel.fiacremm.Variable#getProcesses <em>Processes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' reference list.
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProcess_Variables()
   * @see com.sodius.mdw.metamodel.fiacremm.Variable#getProcesses
   * @model opposite="processes"
   * @generated
   */
  MDWEList<Variable> getVariables();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProcess_Name()
   * @model default=""
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Process#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacremm.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProcess_States()
   * @model containment="true" required="true"
   * @generated
   */
  MDWEList<State> getStates();

  /**
   * Returns the value of the '<em><b>Init State</b></em>' reference.
   * It is bidirectional and its opposite is '{@link com.sodius.mdw.metamodel.fiacremm.State#getProcess <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init State</em>' reference.
   * @see #setInitState(State)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProcess_InitState()
   * @see com.sodius.mdw.metamodel.fiacremm.State#getProcess
   * @model opposite="process" required="true"
   * @generated
   */
  State getInitState();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Process#getInitState <em>Init State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init State</em>' reference.
   * @see #getInitState()
   * @generated
   */
  void setInitState(State value);

  /**
   * Returns the value of the '<em><b>State Size</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Size</em>' attribute.
   * @see #setStateSize(int)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProcess_StateSize()
   * @model default="0"
   * @generated
   */
  int getStateSize();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Process#getStateSize <em>State Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Size</em>' attribute.
   * @see #getStateSize()
   * @generated
   */
  void setStateSize(int value);

  /**
   * Returns the value of the '<em><b>Var Size</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Size</em>' attribute.
   * @see #setVarSize(int)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProcess_VarSize()
   * @model default="0"
   * @generated
   */
  int getVarSize();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Process#getVarSize <em>Var Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Size</em>' attribute.
   * @see #getVarSize()
   * @generated
   */
  void setVarSize(int value);

  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacremm.Port}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProcess_Ports()
   * @model containment="true"
   * @generated
   */
  MDWEList<Port> getPorts();

  /**
   * Returns the value of the '<em><b>Allunique Triggers</b></em>' containment reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacremm.Trigger}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Allunique Triggers</em>' containment reference list.
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProcess_AlluniqueTriggers()
   * @model containment="true"
   * @generated
   */
  MDWEList<Trigger> getAlluniqueTriggers();

} // Process
