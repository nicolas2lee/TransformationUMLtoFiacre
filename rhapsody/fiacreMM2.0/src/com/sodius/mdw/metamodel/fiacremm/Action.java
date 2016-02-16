/**
 */
package com.sodius.mdw.metamodel.fiacremm;

import com.sodius.mdw.core.model.emf.MDWEObject;

import org.eclipse.emf.ecore.EModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Action#getName <em>Name</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Action#getBody <em>Body</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.Action#getCodeFiacre <em>Code Fiacre</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getAction()
 * @model annotation="http://www.sodius.com/metamodels/MDWProperties logicalPackage='td1'"
 * @extends MDWEObject
 * @generated
 */
public interface Action extends MDWEObject, EModelElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getAction_Name()
   * @model default=""
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Action#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' attribute.
   * @see #setBody(String)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getAction_Body()
   * @model default=""
   * @generated
   */
  String getBody();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Action#getBody <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' attribute.
   * @see #getBody()
   * @generated
   */
  void setBody(String value);

  /**
   * Returns the value of the '<em><b>Code Fiacre</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code Fiacre</em>' attribute.
   * @see #setCodeFiacre(String)
   * @see com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage#getAction_CodeFiacre()
   * @model default=""
   * @generated
   */
  String getCodeFiacre();

  /**
   * Sets the value of the '{@link com.sodius.mdw.metamodel.fiacremm.Action#getCodeFiacre <em>Code Fiacre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code Fiacre</em>' attribute.
   * @see #getCodeFiacre()
   * @generated
   */
  void setCodeFiacre(String value);

} // Action