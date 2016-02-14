/**
 */
package com.sodius.mdw.metamodel.fiacre;

import com.sodius.mdw.core.model.emf.MDWEObject;

import com.sodius.mdw.core.model.emf.MDWEList;

import org.eclipse.emf.ecore.EModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.Component#getProcess <em>Process</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.Component#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.Component#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getComponent()
 * @model annotation="http://www.sodius.com/metamodels/MDWProperties logicalPackage='td1'"
 * @extends MDWEObject
 * @generated
 */
public interface Component extends MDWEObject, EModelElement
{
  /**
   * Returns the value of the '<em><b>Process</b></em>' containment reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacre.Process}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' containment reference list.
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getComponent_Process()
   * @model containment="true"
   * @generated
   */
  MDWEList<com.sodius.mdw.metamodel.fiacre.Process> getProcess();

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacre.Variable}.
   * It is bidirectional and its opposite is '{@link com.sodius.mdw.metamodel.fiacre.Variable#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference list.
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getComponent_Variable()
   * @see com.sodius.mdw.metamodel.fiacre.Variable#getComponent
   * @model opposite="component"
   * @generated
   */
  MDWEList<Variable> getVariable();

  /**
   * Returns the value of the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>ID</em>' attribute.
   * @see #setID(Character)
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getComponent_ID()
   * @model
   * @generated
   */
  Character getID();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacre.Component#getID <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ID</em>' attribute.
   * @see #getID()
   * @generated
   */
  void setID(Character value);

} // Component
