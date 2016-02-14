/**
 */
package com.sodius.mdw.metamodel.fiacremm.impl;

import com.sodius.mdw.metamodel.fiacremm.Component;
import com.sodius.mdw.metamodel.fiacremm.DataType;
import com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage;
import com.sodius.mdw.metamodel.fiacremm.Variable;

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
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.VariableImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.VariableImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.VariableImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.VariableImpl#getInitVal <em>Init Val</em>}</li>
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
   * The cached value of the '{@link #getProcesses() <em>Processes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcesses()
   * @generated
   * @ordered
   */
  protected MDWEList<com.sodius.mdw.metamodel.fiacremm.Process> processes;

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
   * The cached value of the '{@link #getComponents() <em>Components</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected MDWEList<Component> components;

  /**
   * The default value of the '{@link #getInitVal() <em>Init Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitVal()
   * @generated
   * @ordered
   */
  protected static final String INIT_VAL_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getInitVal() <em>Init Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitVal()
   * @generated
   * @ordered
   */
  protected String initVal = INIT_VAL_EDEFAULT;

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
    return FiacreMMPackage.Literals.VARIABLE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiacreMMPackage.VARIABLE__DATATYPE, oldDatatype, datatype));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.VARIABLE__DATATYPE, oldDatatype, datatype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDWEList<com.sodius.mdw.metamodel.fiacremm.Process> getProcesses()
  {
    if (processes == null)
    {
      processes = new MDWEObjectWithInverseResolvingEList.ManyInverse<com.sodius.mdw.metamodel.fiacremm.Process>(com.sodius.mdw.metamodel.fiacremm.Process.class, this, FiacreMMPackage.VARIABLE__PROCESSES, FiacreMMPackage.PROCESS__VARIABLES);
    }
    return processes;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.VARIABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDWEList<Component> getComponents()
  {
    if (components == null)
    {
      components = new MDWEObjectWithInverseResolvingEList.ManyInverse<Component>(Component.class, this, FiacreMMPackage.VARIABLE__COMPONENTS, FiacreMMPackage.COMPONENT__VARIABLES);
    }
    return components;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInitVal()
  {
    return initVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitVal(String newInitVal)
  {
    String oldInitVal = initVal;
    initVal = newInitVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.VARIABLE__INIT_VAL, oldInitVal, initVal));
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
      case FiacreMMPackage.VARIABLE__PROCESSES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcesses()).basicAdd(otherEnd, msgs);
      case FiacreMMPackage.VARIABLE__COMPONENTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponents()).basicAdd(otherEnd, msgs);
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
      case FiacreMMPackage.VARIABLE__PROCESSES:
        return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
      case FiacreMMPackage.VARIABLE__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
      case FiacreMMPackage.VARIABLE__DATATYPE:
        if (resolve) return getDatatype();
        return basicGetDatatype();
      case FiacreMMPackage.VARIABLE__PROCESSES:
        return getProcesses();
      case FiacreMMPackage.VARIABLE__NAME:
        return getName();
      case FiacreMMPackage.VARIABLE__COMPONENTS:
        return getComponents();
      case FiacreMMPackage.VARIABLE__INIT_VAL:
        return getInitVal();
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
      case FiacreMMPackage.VARIABLE__DATATYPE:
        setDatatype((DataType)newValue);
        return;
      case FiacreMMPackage.VARIABLE__PROCESSES:
        getProcesses().clear();
        getProcesses().addAll((Collection<? extends com.sodius.mdw.metamodel.fiacremm.Process>)newValue);
        return;
      case FiacreMMPackage.VARIABLE__NAME:
        setName((String)newValue);
        return;
      case FiacreMMPackage.VARIABLE__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends Component>)newValue);
        return;
      case FiacreMMPackage.VARIABLE__INIT_VAL:
        setInitVal((String)newValue);
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
      case FiacreMMPackage.VARIABLE__DATATYPE:
        setDatatype((DataType)null);
        return;
      case FiacreMMPackage.VARIABLE__PROCESSES:
        getProcesses().clear();
        return;
      case FiacreMMPackage.VARIABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FiacreMMPackage.VARIABLE__COMPONENTS:
        getComponents().clear();
        return;
      case FiacreMMPackage.VARIABLE__INIT_VAL:
        setInitVal(INIT_VAL_EDEFAULT);
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
      case FiacreMMPackage.VARIABLE__DATATYPE:
        return datatype != null;
      case FiacreMMPackage.VARIABLE__PROCESSES:
        return processes != null && !processes.isEmpty();
      case FiacreMMPackage.VARIABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FiacreMMPackage.VARIABLE__COMPONENTS:
        return components != null && !components.isEmpty();
      case FiacreMMPackage.VARIABLE__INIT_VAL:
        return INIT_VAL_EDEFAULT == null ? initVal != null : !INIT_VAL_EDEFAULT.equals(initVal);
    }
    return super.eIsSet(featureID);
  }

} //VariableImpl
