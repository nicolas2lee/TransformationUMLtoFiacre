/**
 */
package com.sodius.mdw.metamodel.fiacre;

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
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.Process#getState <em>State</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.Process#getTransition <em>Transition</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.Process#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.Process#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getProcess()
 * @model annotation="http://www.sodius.com/metamodels/MDWProperties logicalPackage='td1'"
 * @extends MDWEObject
 * @generated
 */
public interface Process extends MDWEObject, EModelElement
{
  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacre.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference list.
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getProcess_State()
   * @model containment="true"
   * @generated
   */
  MDWEList<State> getState();

  /**
   * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacre.Transition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' containment reference list.
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getProcess_Transition()
   * @model containment="true"
   * @generated
   */
  MDWEList<Transition> getTransition();

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacre.Variable}.
   * It is bidirectional and its opposite is '{@link com.sodius.mdw.metamodel.fiacre.Variable#getProcess <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference list.
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getProcess_Variable()
   * @see com.sodius.mdw.metamodel.fiacre.Variable#getProcess
   * @model opposite="process"
   * @generated
   */
  MDWEList<Variable> getVariable();

  /**
   * Returns the value of the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>ID</em>' attribute.
   * @see #setID(Character)
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getProcess_ID()
   * @model
   * @generated
   */
  Character getID();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacre.Process#getID <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ID</em>' attribute.
   * @see #getID()
   * @generated
   */
  void setID(Character value);

} // Process
