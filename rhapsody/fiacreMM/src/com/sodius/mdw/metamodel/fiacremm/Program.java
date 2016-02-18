/**
 */
package com.sodius.mdw.metamodel.fiacremm;

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
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Program#getComponents <em>Components</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Program#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Program#getProcesses <em>Processes</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Program#getName <em>Name</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Program#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Program#getComponentSize <em>Component Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProgram()
 * @model annotation="http://www.sodius.com/metamodels/MDWProperties logicalPackage='td1'"
 * @extends MDWEObject
 * @generated
 */
public interface Program extends MDWEObject, EModelElement
{
  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacremm.Component}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProgram_Components()
   * @model containment="true" required="true"
   * @generated
   */
  MDWEList<Component> getComponents();

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacremm.Variable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProgram_Variable()
   * @model containment="true"
   * @generated
   */
  MDWEList<Variable> getVariable();

  /**
   * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacremm.Process}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processes</em>' containment reference list.
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProgram_Processes()
   * @model containment="true" required="true"
   * @generated
   */
  MDWEList<com.sodius.mdw.metamodel.fiacremm.Process> getProcesses();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProgram_Name()
   * @model default=""
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Program#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacremm.DataType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatypes</em>' containment reference list.
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProgram_Datatypes()
   * @model containment="true"
   * @generated
   */
  MDWEList<DataType> getDatatypes();

  /**
   * Returns the value of the '<em><b>Component Size</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Size</em>' attribute.
   * @see #setComponentSize(int)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getProgram_ComponentSize()
   * @model default="0"
   * @generated
   */
  int getComponentSize();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Program#getComponentSize <em>Component Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component Size</em>' attribute.
   * @see #getComponentSize()
   * @generated
   */
  void setComponentSize(int value);

} // Program