/**
 */
package com.sodius.mdw.metamodel.fiacremm;

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
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Variable#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Variable#getProcesses <em>Processes</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Variable#getName <em>Name</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Variable#getComponents <em>Components</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Variable#getInitVal <em>Init Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getVariable()
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
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getVariable_Datatype()
   * @model required="true"
   * @generated
   */
  DataType getDatatype();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Variable#getDatatype <em>Datatype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype</em>' reference.
   * @see #getDatatype()
   * @generated
   */
  void setDatatype(DataType value);

  /**
   * Returns the value of the '<em><b>Processes</b></em>' reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacremm.Process}.
   * It is bidirectional and its opposite is '{@link com.sodius.mdw.metamodel.fiacremm.Process#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processes</em>' reference list.
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getVariable_Processes()
   * @see com.sodius.mdw.metamodel.fiacremm.Process#getVariables
   * @model opposite="variables"
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
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getVariable_Name()
   * @model default=""
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Variable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Components</b></em>' reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacremm.Component}.
   * It is bidirectional and its opposite is '{@link com.sodius.mdw.metamodel.fiacremm.Component#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' reference list.
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getVariable_Components()
   * @see com.sodius.mdw.metamodel.fiacremm.Component#getVariables
   * @model opposite="variables"
   * @generated
   */
  MDWEList<Component> getComponents();

  /**
   * Returns the value of the '<em><b>Init Val</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Val</em>' attribute.
   * @see #setInitVal(String)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getVariable_InitVal()
   * @model default=""
   * @generated
   */
  String getInitVal();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Variable#getInitVal <em>Init Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Val</em>' attribute.
   * @see #getInitVal()
   * @generated
   */
  void setInitVal(String value);

} // Variable
