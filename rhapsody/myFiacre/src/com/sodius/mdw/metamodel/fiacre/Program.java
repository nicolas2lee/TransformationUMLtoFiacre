/**
 */
package com.sodius.mdw.metamodel.fiacre;

import com.sodius.mdw.core.model.emf.MDWEObject;

import com.sodius.mdw.core.model.emf.MDWEList;

import org.eclipse.emf.ecore.EModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.Program#getComponent <em>Component</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.Program#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.Program#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getProgram()
 * @model annotation="http://www.sodius.com/metamodels/MDWProperties logicalPackage='td1'"
 * @extends MDWEObject
 * @generated
 */
public interface Program extends MDWEObject, EModelElement
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' containment reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacre.Component}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' containment reference list.
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getProgram_Component()
   * @model containment="true"
   * @generated
   */
  MDWEList<Component> getComponent();

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacre.Variable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getProgram_Variable()
   * @model containment="true"
   * @generated
   */
  MDWEList<Variable> getVariable();

  /**
   * Returns the value of the '<em><b>Process</b></em>' containment reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacre.Process}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' containment reference list.
   * @see com.sodius.mdw.metamodel.fiacre.FiacrePackage#getProgram_Process()
   * @model containment="true"
   * @generated
   */
  MDWEList<com.sodius.mdw.metamodel.fiacre.Process> getProcess();

} // Program
