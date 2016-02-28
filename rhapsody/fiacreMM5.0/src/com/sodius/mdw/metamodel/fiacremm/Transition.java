/**
 */
package com.sodius.mdw.metamodel.fiacremm;

import com.sodius.mdw.core.model.emf.MDWEObject;

import org.eclipse.emf.ecore.EModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Transition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Transition#getAction <em>Action</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Transition#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getTransition()
 * @model annotation="http://www.sodius.com/metamodels/MDWProperties logicalPackage='td1'"
 * @extends MDWEObject
 * @generated
 */
public interface Transition extends MDWEObject, EModelElement
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * It is bidirectional and its opposite is '{@link com.sodius.mdw.metamodel.fiacremm.State#getOutTransitions <em>Out Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(State)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getTransition_Source()
   * @see com.sodius.mdw.metamodel.fiacremm.State#getOutTransitions
   * @model opposite="outTransitions" required="true"
   * @generated
   */
  State getSource();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Transition#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(State value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * It is bidirectional and its opposite is '{@link com.sodius.mdw.metamodel.fiacremm.State#getInTransitions <em>In Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(State)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getTransition_Target()
   * @see com.sodius.mdw.metamodel.fiacremm.State#getInTransitions
   * @model opposite="inTransitions" required="true"
   * @generated
   */
  State getTarget();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Transition#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(State value);

  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Guard)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getTransition_Guard()
   * @model containment="true"
   * @generated
   */
  Guard getGuard();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Transition#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Guard value);

  /**
   * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' containment reference.
   * @see #setTrigger(Trigger)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getTransition_Trigger()
   * @model containment="true"
   * @generated
   */
  Trigger getTrigger();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Transition#getTrigger <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' containment reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(Trigger value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(Action)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getTransition_Action()
   * @model containment="true"
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Transition#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getTransition_Name()
   * @model default=""
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Transition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Transition
