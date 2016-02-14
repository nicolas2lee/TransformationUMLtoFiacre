/**
 */
package com.sodius.mdw.metamodel.fiacre.impl;

import com.sodius.mdw.metamodel.fiacre.Component;
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
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.impl.ComponentImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.impl.ComponentImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.impl.ComponentImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends DefaultMDWEObject implements Component
{
  /**
   * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess()
   * @generated
   * @ordered
   */
  protected MDWEList<com.sodius.mdw.metamodel.fiacre.Process> process;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected MDWEList<Variable> variable;

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
    return FiacrePackage.Literals.COMPONENT;
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
      process = new MDWEObjectContainmentEList<com.sodius.mdw.metamodel.fiacre.Process>(com.sodius.mdw.metamodel.fiacre.Process.class, this, FiacrePackage.COMPONENT__PROCESS);
    }
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDWEList<Variable> getVariable()
  {
    if (variable == null)
    {
      variable = new MDWEObjectWithInverseResolvingEList.ManyInverse<Variable>(Variable.class, this, FiacrePackage.COMPONENT__VARIABLE, FiacrePackage.VARIABLE__COMPONENT);
    }
    return variable;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FiacrePackage.COMPONENT__ID, oldID, id));
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
      case FiacrePackage.COMPONENT__VARIABLE:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable()).basicAdd(otherEnd, msgs);
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
      case FiacrePackage.COMPONENT__PROCESS:
        return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
      case FiacrePackage.COMPONENT__VARIABLE:
        return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
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
      case FiacrePackage.COMPONENT__PROCESS:
        return getProcess();
      case FiacrePackage.COMPONENT__VARIABLE:
        return getVariable();
      case FiacrePackage.COMPONENT__ID:
        return getID();
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
      case FiacrePackage.COMPONENT__PROCESS:
        getProcess().clear();
        getProcess().addAll((Collection<? extends com.sodius.mdw.metamodel.fiacre.Process>)newValue);
        return;
      case FiacrePackage.COMPONENT__VARIABLE:
        getVariable().clear();
        getVariable().addAll((Collection<? extends Variable>)newValue);
        return;
      case FiacrePackage.COMPONENT__ID:
        setID((Character)newValue);
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
      case FiacrePackage.COMPONENT__PROCESS:
        getProcess().clear();
        return;
      case FiacrePackage.COMPONENT__VARIABLE:
        getVariable().clear();
        return;
      case FiacrePackage.COMPONENT__ID:
        setID(ID_EDEFAULT);
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
      case FiacrePackage.COMPONENT__PROCESS:
        return process != null && !process.isEmpty();
      case FiacrePackage.COMPONENT__VARIABLE:
        return variable != null && !variable.isEmpty();
      case FiacrePackage.COMPONENT__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
    }
    return super.eIsSet(featureID);
  }

} //ComponentImpl
