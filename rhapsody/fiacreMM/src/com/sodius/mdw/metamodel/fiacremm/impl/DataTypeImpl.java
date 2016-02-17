/**
 */
package com.sodius.mdw.metamodel.fiacremm.impl;

import com.sodius.mdw.metamodel.fiacremm.DataType;
import com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import com.sodius.mdw.corext.model.emf.DefaultMDWEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.DataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.DataTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.DataTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeImpl extends DefaultMDWEObject implements DataType
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
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final int SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected int size = SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementType()
   * @generated
   * @ordered
   */
  protected static final String ELEMENT_TYPE_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementType()
   * @generated
   * @ordered
   */
  protected String elementType = ELEMENT_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataTypeImpl()
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
    return FiacreMMPackage.Literals.DATA_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.DATA_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(int newSize)
  {
    int oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.DATA_TYPE__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElementType()
  {
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementType(String newElementType)
  {
    String oldElementType = elementType;
    elementType = newElementType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.DATA_TYPE__ELEMENT_TYPE, oldElementType, elementType));
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
      case FiacreMMPackage.DATA_TYPE__NAME:
        return getName();
      case FiacreMMPackage.DATA_TYPE__SIZE:
        return getSize();
      case FiacreMMPackage.DATA_TYPE__ELEMENT_TYPE:
        return getElementType();
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
      case FiacreMMPackage.DATA_TYPE__NAME:
        setName((String)newValue);
        return;
      case FiacreMMPackage.DATA_TYPE__SIZE:
        setSize((Integer)newValue);
        return;
      case FiacreMMPackage.DATA_TYPE__ELEMENT_TYPE:
        setElementType((String)newValue);
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
      case FiacreMMPackage.DATA_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FiacreMMPackage.DATA_TYPE__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case FiacreMMPackage.DATA_TYPE__ELEMENT_TYPE:
        setElementType(ELEMENT_TYPE_EDEFAULT);
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
      case FiacreMMPackage.DATA_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FiacreMMPackage.DATA_TYPE__SIZE:
        return size != SIZE_EDEFAULT;
      case FiacreMMPackage.DATA_TYPE__ELEMENT_TYPE:
        return ELEMENT_TYPE_EDEFAULT == null ? elementType != null : !ELEMENT_TYPE_EDEFAULT.equals(elementType);
    }
    return super.eIsSet(featureID);
  }

} //DataTypeImpl
