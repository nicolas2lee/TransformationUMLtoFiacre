/**
 */
package com.sodius.mdw.metamodel.fiacre;

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
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.State#getID <em>ID</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.State#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getState()
 * @model annotation="http://www.sodius.com/metamodels/MDWProperties logicalPackage='td1'"
 * @extends MDWEObject
 * @generated
 */
public interface State extends MDWEObject, EModelElement
{
  /**
   * Returns the value of the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>ID</em>' attribute.
   * @see #setID(Character)
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getState_ID()
   * @model
   * @generated
   */
  Character getID();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacre.State#getID <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ID</em>' attribute.
   * @see #getID()
   * @generated
   */
  void setID(Character value);

  /**
   * Returns the value of the '<em><b>Transition</b></em>' reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacre.Transition}.
   * It is bidirectional and its opposite is '{@link com.sodius.mdw.metamodel.fiacre.Transition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' reference list.
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getState_Transition()
   * @see com.sodius.mdw.metamodel.fiacre.Transition#getState
   * @model opposite="state"
   * @generated
   */
  MDWEList<Transition> getTransition();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void StateInvariant();

} // State
