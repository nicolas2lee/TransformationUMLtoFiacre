/**
 */
package com.sodius.mdw.metamodel.fiacre;

import com.sodius.mdw.core.model.emf.MDWEObject;

import com.sodius.mdw.core.model.emf.MDWEList;

import org.eclipse.emf.ecore.EModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.Variable#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.Variable#getProcess <em>Process</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.Variable#getID <em>ID</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.Variable#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getVariable()
 * @model annotation="http://www.sodius.com/metamodels/MDWProperties logicalPackage='td1'"
 * @extends MDWEObject
 * @generated
 */
public interface Variable extends MDWEObject, EModelElement
{
  /**
   * Returns the value of the '<em><b>Datatype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype</em>' reference.
   * @see #setDatatype(DataType)
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getVariable_Datatype()
   * @model
   * @generated
   */
  DataType getDatatype();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacre.Variable#getDatatype <em>Datatype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype</em>' reference.
   * @see #getDatatype()
   * @generated
   */
  void setDatatype(DataType value);

  /**
   * Returns the value of the '<em><b>Process</b></em>' reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacre.Process}.
   * It is bidirectional and its opposite is '{@link com.sodius.mdw.metamodel.fiacre.Process#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' reference list.
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getVariable_Process()
   * @see com.sodius.mdw.metamodel.fiacre.Process#getVariable
   * @model opposite="variable"
   * @generated
   */
  MDWEList<com.sodius.mdw.metamodel.fiacre.Process> getProcess();

  /**
   * Returns the value of the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>ID</em>' attribute.
   * @see #setID(Character)
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getVariable_ID()
   * @model
   * @generated
   */
  Character getID();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacre.Variable#getID <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ID</em>' attribute.
   * @see #getID()
   * @generated
   */
  void setID(Character value);

  /**
   * Returns the value of the '<em><b>Component</b></em>' reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacre.Component}.
   * It is bidirectional and its opposite is '{@link com.sodius.mdw.metamodel.fiacre.Component#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' reference list.
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getVariable_Component()
   * @see com.sodius.mdw.metamodel.fiacre.Component#getVariable
   * @model opposite="variable"
   * @generated
   */
  MDWEList<Component> getComponent();

} // Variable
