/**
 */
package com.sodius.mdw.metamodel.fiacre.impl;

import com.sodius.mdw.metamodel.fiacre.FiacrePackage;
import com.sodius.mdw.metamodel.fiacre.State;
import com.sodius.mdw.metamodel.fiacre.Transition;
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
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.impl.ProcessImpl#getState <em>State</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.impl.ProcessImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.impl.ProcessImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.impl.ProcessImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends DefaultMDWEObject implements com.sodius.mdw.metamodel.fiacre.Process
{
  /**
   * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected MDWEList<State> state;

  /**
   * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransition()
   * @generated
   * @ordered
   */
  protected MDWEList<Transition> transition;

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
  protected ProcessImpl()
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
    return FiacrePackage.Literals.PROCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDWEList<State> getState()
  {
    if (state == null)
    {
      state = new MDWEObjectContainmentEList<State>(State.class, this, FiacrePackage.PROCESS__STATE);
    }
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDWEList<Transition> getTransition()
  {
    if (transition == null)
    {
      transition = new MDWEObjectContainmentEList<Transition>(Transition.class, this, FiacrePackage.PROCESS__TRANSITION);
    }
    return transition;
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
      variable = new MDWEObjectWithInverseResolvingEList.ManyInverse<Variable>(Variable.class, this, FiacrePackage.PROCESS__VARIABLE, FiacrePackage.VARIABLE__PROCESS);
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
      eNotify(new ENotificationImpl(this, Notification.SET, FiacrePackage.PROCESS__ID, oldID, id));
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
      case FiacrePackage.PROCESS__VARIABLE:
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
      case FiacrePackage.PROCESS__STATE:
        return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
      case FiacrePackage.PROCESS__TRANSITION:
        return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
      case FiacrePackage.PROCESS__VARIABLE:
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
      case FiacrePackage.PROCESS__STATE:
        return getState();
      case FiacrePackage.PROCESS__TRANSITION:
        return getTransition();
      case FiacrePackage.PROCESS__VARIABLE:
        return getVariable();
      case FiacrePackage.PROCESS__ID:
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
      case FiacrePackage.PROCESS__STATE:
        getState().clear();
        getState().addAll((Collection<? extends State>)newValue);
        return;
      case FiacrePackage.PROCESS__TRANSITION:
        getTransition().clear();
        getTransition().addAll((Collection<? extends Transition>)newValue);
        return;
      case FiacrePackage.PROCESS__VARIABLE:
        getVariable().clear();
        getVariable().addAll((Collection<? extends Variable>)newValue);
        return;
      case FiacrePackage.PROCESS__ID:
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
      case FiacrePackage.PROCESS__STATE:
        getState().clear();
        return;
      case FiacrePackage.PROCESS__TRANSITION:
        getTransition().clear();
        return;
      case FiacrePackage.PROCESS__VARIABLE:
        getVariable().clear();
        return;
      case FiacrePackage.PROCESS__ID:
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
      case FiacrePackage.PROCESS__STATE:
        return state != null && !state.isEmpty();
      case FiacrePackage.PROCESS__TRANSITION:
        return transition != null && !transition.isEmpty();
      case FiacrePackage.PROCESS__VARIABLE:
        return variable != null && !variable.isEmpty();
      case FiacrePackage.PROCESS__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
    }
    return super.eIsSet(featureID);
  }

} //ProcessImpl
