/**
 */
package com.sodius.mdw.metamodel.fiacre;

import com.sodius.mdw.core.model.emf.MDWEObject;

import com.sodius.mdw.core.model.emf.MDWEList;

import org.eclipse.emf.ecore.EModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.Transition#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getTransition()
 * @model annotation="http://www.sodius.com/metamodels/MDWProperties logicalPackage='td1'"
 * @extends MDWEObject
 * @generated
 */
public interface Transition extends MDWEObject, EModelElement
{
  /**
   * Returns the value of the '<em><b>State</b></em>' reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacre.State}.
   * It is bidirectional and its opposite is '{@link com.sodius.mdw.metamodel.fiacre.State#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference list.
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getTransition_State()
   * @see com.sodius.mdw.metamodel.fiacre.State#getTransition
   * @model opposite="transition"
   * @generated
   */
  MDWEList<State> getState();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void Guard();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void Trigger();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void Action();

} // Transition
