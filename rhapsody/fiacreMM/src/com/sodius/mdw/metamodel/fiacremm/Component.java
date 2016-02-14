/**
 */
package com.sodius.mdw.metamodel.fiacremm;

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
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Component#getInstances <em>Instances</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Component#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Component#getName <em>Name</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Component#getProcessSize <em>Process Size</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Component#getVarSize <em>Var Size</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Component#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getComponent()
 * @model annotation="http://www.sodius.com/metamodels/MDWProperties logicalPackage='td1'"
 * @extends MDWEObject
 * @generated
 */
public interface Component extends MDWEObject, EModelElement
{
  /**
   * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacremm.Process}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instances</em>' containment reference list.
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getComponent_Instances()
   * @model containment="true" required="true"
   * @generated
   */
  MDWEList<com.sodius.mdw.metamodel.fiacremm.Process> getInstances();

  /**
   * Returns the value of the '<em><b>Variables</b></em>' reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacremm.Variable}.
   * It is bidirectional and its opposite is '{@link com.sodius.mdw.metamodel.fiacremm.Variable#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' reference list.
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getComponent_Variables()
   * @see com.sodius.mdw.metamodel.fiacremm.Variable#getComponents
   * @model opposite="components"
   * @generated
   */
  MDWEList<Variable> getVariables();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getComponent_Name()
   * @model default=""
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Component#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Process Size</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Size</em>' attribute.
   * @see #setProcessSize(int)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getComponent_ProcessSize()
   * @model default="0"
   * @generated
   */
  int getProcessSize();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Component#getProcessSize <em>Process Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process Size</em>' attribute.
   * @see #getProcessSize()
   * @generated
   */
  void setProcessSize(int value);

  /**
   * Returns the value of the '<em><b>Var Size</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Size</em>' attribute.
   * @see #setVarSize(int)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getComponent_VarSize()
   * @model default="0"
   * @generated
   */
  int getVarSize();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Component#getVarSize <em>Var Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Size</em>' attribute.
   * @see #getVarSize()
   * @generated
   */
  void setVarSize(int value);

  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link com.sodius.mdw.metamodel.fiacremm.Port}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getComponent_Ports()
   * @model containment="true"
   * @generated
   */
  MDWEList<Port> getPorts();

} // Component
