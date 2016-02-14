/**
 */
package com.sodius.mdw.metamodel.fiacremm.impl;

import com.sodius.mdw.metamodel.fiacremm.Component;
import com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage;
import com.sodius.mdw.metamodel.fiacremm.Port;
import com.sodius.mdw.metamodel.fiacremm.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import com.sodius.mdw.core.model.emf.MDWEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import com.sodius.mdw.corext.model.emf.DefaultMDWEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.sodius.mdw.corext.model.emf.MDWEObjectContainmentEList;
import com.sodius.mdw.corext.model.emf.MDWEObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ComponentImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ComponentImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ComponentImpl#getProcessSize <em>Process Size</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ComponentImpl#getVarSize <em>Var Size</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ComponentImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends DefaultMDWEObject implements Component
{
  /**
   * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstances()
   * @generated
   * @ordered
   */
  protected MDWEList<com.sodius.mdw.metamodel.fiacremm.Process> instances;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected MDWEList<Variable> variables;

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
   * The default value of the '{@link #getProcessSize() <em>Process Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessSize()
   * @generated
   * @ordered
   */
  protected static final int PROCESS_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getProcessSize() <em>Process Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessSize()
   * @generated
   * @ordered
   */
  protected int processSize = PROCESS_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getVarSize() <em>Var Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarSize()
   * @generated
   * @ordered
   */
  protected static final int VAR_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVarSize() <em>Var Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarSize()
   * @generated
   * @ordered
   */
  protected int varSize = VAR_SIZE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected MDWEList<Port> ports;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentImpl()
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
    return FiacreMMPackage.Literals.COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDWEList<com.sodius.mdw.metamodel.fiacremm.Process> getInstances()
  {
    if (instances == null)
    {
      instances = new MDWEObjectContainmentEList<com.sodius.mdw.metamodel.fiacremm.Process>(com.sodius.mdw.metamodel.fiacremm.Process.class, this, FiacreMMPackage.COMPONENT__INSTANCES);
    }
    return instances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDWEList<Variable> getVariables()
  {
    if (variables == null)
    {
      variables = new MDWEObjectWithInverseResolvingEList.ManyInverse<Variable>(Variable.class, this, FiacreMMPackage.COMPONENT__VARIABLES, FiacreMMPackage.VARIABLE__COMPONENTS);
    }
    return variables;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.COMPONENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getProcessSize()
  {
    return processSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcessSize(int newProcessSize)
  {
    int oldProcessSize = processSize;
    processSize = newProcessSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.COMPONENT__PROCESS_SIZE, oldProcessSize, processSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getVarSize()
  {
    return varSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarSize(int newVarSize)
  {
    int oldVarSize = varSize;
    varSize = newVarSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.COMPONENT__VAR_SIZE, oldVarSize, varSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDWEList<Port> getPorts()
  {
    if (ports == null)
    {
      ports = new MDWEObjectContainmentEList<Port>(Port.class, this, FiacreMMPackage.COMPONENT__PORTS);
    }
    return ports;
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
      case FiacreMMPackage.COMPONENT__VARIABLES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariables()).basicAdd(otherEnd, msgs);
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
      case FiacreMMPackage.COMPONENT__INSTANCES:
        return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
      case FiacreMMPackage.COMPONENT__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case FiacreMMPackage.COMPONENT__PORTS:
        return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
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
      case FiacreMMPackage.COMPONENT__INSTANCES:
        return getInstances();
      case FiacreMMPackage.COMPONENT__VARIABLES:
        return getVariables();
      case FiacreMMPackage.COMPONENT__NAME:
        return getName();
      case FiacreMMPackage.COMPONENT__PROCESS_SIZE:
        return getProcessSize();
      case FiacreMMPackage.COMPONENT__VAR_SIZE:
        return getVarSize();
      case FiacreMMPackage.COMPONENT__PORTS:
        return getPorts();
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
      case FiacreMMPackage.COMPONENT__INSTANCES:
        getInstances().clear();
        getInstances().addAll((Collection<? extends com.sodius.mdw.metamodel.fiacremm.Process>)newValue);
        return;
      case FiacreMMPackage.COMPONENT__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Variable>)newValue);
        return;
      case FiacreMMPackage.COMPONENT__NAME:
        setName((String)newValue);
        return;
      case FiacreMMPackage.COMPONENT__PROCESS_SIZE:
        setProcessSize((Integer)newValue);
        return;
      case FiacreMMPackage.COMPONENT__VAR_SIZE:
        setVarSize((Integer)newValue);
        return;
      case FiacreMMPackage.COMPONENT__PORTS:
        getPorts().clear();
        getPorts().addAll((Collection<? extends Port>)newValue);
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
      case FiacreMMPackage.COMPONENT__INSTANCES:
        getInstances().clear();
        return;
      case FiacreMMPackage.COMPONENT__VARIABLES:
        getVariables().clear();
        return;
      case FiacreMMPackage.COMPONENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FiacreMMPackage.COMPONENT__PROCESS_SIZE:
        setProcessSize(PROCESS_SIZE_EDEFAULT);
        return;
      case FiacreMMPackage.COMPONENT__VAR_SIZE:
        setVarSize(VAR_SIZE_EDEFAULT);
        return;
      case FiacreMMPackage.COMPONENT__PORTS:
        getPorts().clear();
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
      case FiacreMMPackage.COMPONENT__INSTANCES:
        return instances != null && !instances.isEmpty();
      case FiacreMMPackage.COMPONENT__VARIABLES:
        return variables != null && !variables.isEmpty();
      case FiacreMMPackage.COMPONENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FiacreMMPackage.COMPONENT__PROCESS_SIZE:
        return processSize != PROCESS_SIZE_EDEFAULT;
      case FiacreMMPackage.COMPONENT__VAR_SIZE:
        return varSize != VAR_SIZE_EDEFAULT;
      case FiacreMMPackage.COMPONENT__PORTS:
        return ports != null && !ports.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ComponentImpl
