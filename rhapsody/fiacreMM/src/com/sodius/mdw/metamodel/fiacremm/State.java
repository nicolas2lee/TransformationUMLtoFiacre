/**
 */
package com.sodius.mdw.metamodel.fiacremm;

import com.sodius.mdw.core.model.emf.MDWEObject;

import com.sodius.mdw.core.model.emf.MDWEList;

import org.eclipse.emf.ecore.EModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.State#getName <em>Name</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.State#getOutTransitions <em>Out Transitions</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.State#getInTransitions <em>In Transitions</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.State#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getState()
 * @model annotation="http://www.sodius.com/metamodels/MDWProperties logicalPackage='td1'"
 * @extends MDWEObject
 * @generated
 */
public interface State extends MDWEObject, EModelElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getState_Name()
   * @model default=""
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Out Transitions</b></em>' reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacremm.Transition}.
   * It is bidirectional and its opposite is '{@link com.sodius.mdw.metamodel.fiacremm.Transition#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Transitions</em>' reference list.
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getState_OutTransitions()
   * @see com.sodius.mdw.metamodel.fiacremm.Transition#getSource
   * @model opposite="source" required="true"
   * @generated
   */
  MDWEList<Transition> getOutTransitions();

  /**
   * Returns the value of the '<em><b>In Transitions</b></em>' reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacremm.Transition}.
   * It is bidirectional and its opposite is '{@link com.sodius.mdw.metamodel.fiacremm.Transition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Transitions</em>' reference list.
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getState_InTransitions()
   * @see com.sodius.mdw.metamodel.fiacremm.Transition#getTarget
   * @model opposite="target" required="true"
   * @generated
   */
  MDWEList<Transition> getInTransitions();

  /**
   * Returns the value of the '<em><b>Process</b></em>' reference.
   * It is bidirectional and its opposite is '{@link com.sodius.mdw.metamodel.fiacremm.Process#getInitState <em>Init State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' reference.
   * @see #setProcess(com.sodius.mdw.metamodel.fiacremm.Process)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getState_Process()
   * @see com.sodius.mdw.metamodel.fiacremm.Process#getInitState
   * @model opposite="initState" required="true"
   * @generated
   */
  com.sodius.mdw.metamodel.fiacremm.Process getProcess();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.State#getProcess <em>Process</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process</em>' reference.
   * @see #getProcess()
   * @generated
   */
  void setProcess(com.sodius.mdw.metamodel.fiacremm.Process value);

} // State
