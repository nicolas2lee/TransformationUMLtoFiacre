/**
 */
package com.sodius.mdw.metamodel.fiacre.impl;

import com.sodius.mdw.metamodel.fiacre.Component;
import com.sodius.mdw.metamodel.fiacre.DataType;
import com.sodius.mdw.metamodel.fiacre.FiacrePackage;
import com.sodius.mdw.metamodel.fiacre.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import com.sodius.mdw.core.model.emf.MDWEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import com.sodius.mdw.corext.model.emf.DefaultMDWEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.sodius.mdw.corext.model.emf.MDWEObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.impl.VariableImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.impl.VariableImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.impl.VariableImpl#getID <em>ID</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.impl.VariableImpl#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends DefaultMDWEObject implements Variable
{
  /**
   * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatype()
   * @generated
   * @ordered
   */
  protected DataType datatype;

  /**
   * The cached value of the '{@link #getProcess() <em>Process</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess()
   * @generated
   * @ordered
   */
  protected MDWEList<com.sodius.mdw.metamodel.fiacre.Process> process;

  /**
   * The default value of the '{@link #getID() <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getID()
   * @generated
   * @ordered
   */
  protected static final Character ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getID()
   * @generated
   * @ordered
   */
  protected Character id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected MDWEList<Component> component;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableImpl()
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
    return FiacrePackage.Literals.VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getDatatype()
  {
    if (datatype != null && datatype.eIsProxy())
    {
      InternalEObject oldDatatype = (InternalEObject)datatype;
      datatype = (DataType)eResolveProxy(oldDatatype);
      if (datatype != oldDatatype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiacrePackage.VARIABLE__DATATYPE, oldDatatype, datatype));
      }
    }
    return datatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType basicGetDatatype()
  {
    return datatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatatype(DataType newDatatype)
  {
    DataType oldDatatype = datatype;
    datatype = newDatatype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiacrePackage.VARIABLE__DATATYPE, oldDatatype, datatype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDWEList<com.sodius.mdw.metamodel.fiacre.Process> getProcess()
  {
    if (process == null)
    {
      process = new MDWEObjectWithInverseResolvingEList.ManyInverse<com.sodius.mdw.metamodel.fiacre.Process>(com.sodius.mdw.metamodel.fiacre.Process.class, this, FiacrePackage.VARIABLE__PROCESS, FiacrePackage.PROCESS__VARIABLE);
    }
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Character getID()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setID(Character newID)
  {
    Character oldID = id;
    id = newID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiacrePackage.VARIABLE__ID, oldID, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDWEList<Component> getComponent()
  {
    if (component == null)
    {
      component = new MDWEObjectWithInverseResolvingEList.ManyInverse<Component>(Component.class, this, FiacrePackage.VARIABLE__COMPONENT, FiacrePackage.COMPONENT__VARIABLE);
    }
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FiacrePackage.VARIABLE__PROCESS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcess()).basicAdd(otherEnd, msgs);
      case FiacrePackage.VARIABLE__COMPONENT:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponent()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FiacrePackage.VARIABLE__PROCESS:
        return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
      case FiacrePackage.VARIABLE__COMPONENT:
        return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case FiacrePackage.VARIABLE__DATATYPE:
        if (resolve) return getDatatype();
        return basicGetDatatype();
      case FiacrePackage.VARIABLE__PROCESS:
        return getProcess();
      case FiacrePackage.VARIABLE__ID:
        return getID();
      case FiacrePackage.VARIABLE__COMPONENT:
        return getComponent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FiacrePackage.VARIABLE__DATATYPE:
        setDatatype((DataType)newValue);
        return;
      case FiacrePackage.VARIABLE__PROCESS:
        getProcess().clear();
        getProcess().addAll((Collection<? extends com.sodius.mdw.metamodel.fiacre.Process>)newValue);
        return;
      case FiacrePackage.VARIABLE__ID:
        setID((Character)newValue);
        return;
      case FiacrePackage.VARIABLE__COMPONENT:
        getComponent().clear();
        getComponent().addAll((Collection<? extends Component>)newValue);
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
      case FiacrePackage.VARIABLE__DATATYPE:
        setDatatype((DataType)null);
        return;
      case FiacrePackage.VARIABLE__PROCESS:
        getProcess().clear();
        return;
      case FiacrePackage.VARIABLE__ID:
        setID(ID_EDEFAULT);
        return;
      case FiacrePackage.VARIABLE__COMPONENT:
        getComponent().clear();
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
      case FiacrePackage.VARIABLE__DATATYPE:
        return datatype != null;
      case FiacrePackage.VARIABLE__PROCESS:
        return process != null && !process.isEmpty();
      case FiacrePackage.VARIABLE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case FiacrePackage.VARIABLE__COMPONENT:
        return component != null && !component.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VariableImpl
