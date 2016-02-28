/**
 */
package com.sodius.mdw.metamodel.fiacremm.impl;

import com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage;
import com.sodius.mdw.metamodel.fiacremm.Guard;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import com.sodius.mdw.corext.model.emf.DefaultMDWEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.GuardImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.GuardImpl#getBody <em>Body</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.GuardImpl#getCodeFiacre <em>Code Fiacre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardImpl extends DefaultMDWEObject implements Guard
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected static final String BODY_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected String body = BODY_EDEFAULT;

  /**
   * The default value of the '{@link #getCodeFiacre() <em>Code Fiacre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeFiacre()
   * @generated
   * @ordered
   */
  protected static final String CODE_FIACRE_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getCodeFiacre() <em>Code Fiacre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeFiacre()
   * @generated
   * @ordered
   */
  protected String codeFiacre = CODE_FIACRE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GuardImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FiacreMMPackage.Literals.GUARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.GUARD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(String newBody)
  {
    String oldBody = body;
    body = newBody;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.GUARD__BODY, oldBody, body));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCodeFiacre()
  {
    return codeFiacre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCodeFiacre(String newCodeFiacre)
  {
    String oldCodeFiacre = codeFiacre;
    codeFiacre = newCodeFiacre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.GUARD__CODE_FIACRE, oldCodeFiacre, codeFiacre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FiacreMMPackage.GUARD__NAME:
        return getName();
      case FiacreMMPackage.GUARD__BODY:
        return getBody();
      case FiacreMMPackage.GUARD__CODE_FIACRE:
        return getCodeFiacre();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FiacreMMPackage.GUARD__NAME:
        setName((String)newValue);
        return;
      case FiacreMMPackage.GUARD__BODY:
        setBody((String)newValue);
        return;
      case FiacreMMPackage.GUARD__CODE_FIACRE:
        setCodeFiacre((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FiacreMMPackage.GUARD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FiacreMMPackage.GUARD__BODY:
        setBody(BODY_EDEFAULT);
        return;
      case FiacreMMPackage.GUARD__CODE_FIACRE:
        setCodeFiacre(CODE_FIACRE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FiacreMMPackage.GUARD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FiacreMMPackage.GUARD__BODY:
        return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
      case FiacreMMPackage.GUARD__CODE_FIACRE:
        return CODE_FIACRE_EDEFAULT == null ? codeFiacre != null : !CODE_FIACRE_EDEFAULT.equals(codeFiacre);
    }
    return super.eIsSet(featureID);
  }

} //GuardImpl
