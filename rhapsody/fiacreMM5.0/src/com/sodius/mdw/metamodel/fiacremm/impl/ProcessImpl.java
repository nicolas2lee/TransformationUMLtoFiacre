/**
 */
package com.sodius.mdw.metamodel.fiacremm.impl;

import com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage;
import com.sodius.mdw.metamodel.fiacremm.Port;
import com.sodius.mdw.metamodel.fiacremm.State;
import com.sodius.mdw.metamodel.fiacremm.Transition;
import com.sodius.mdw.metamodel.fiacremm.Trigger;
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
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ProcessImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ProcessImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ProcessImpl#getStates <em>States</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ProcessImpl#getInitState <em>Init State</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ProcessImpl#getStateSize <em>State Size</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ProcessImpl#getVarSize <em>Var Size</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ProcessImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ProcessImpl#getAlluniqueTriggers <em>Allunique Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends DefaultMDWEObject implements com.sodius.mdw.metamodel.fiacremm.Process
{
  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected MDWEList<Transition> transitions;

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
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected MDWEList<State> states;

  /**
   * The cached value of the '{@link #getInitState() <em>Init State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitState()
   * @generated
   * @ordered
   */
  protected State initState;

  /**
   * The default value of the '{@link #getStateSize() <em>State Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateSize()
   * @generated
   * @ordered
   */
  protected static final int STATE_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getStateSize() <em>State Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateSize()
   * @generated
   * @ordered
   */
  protected int stateSize = STATE_SIZE_EDEFAULT;

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
   * The cached value of the '{@link #getAlluniqueTriggers() <em>Allunique Triggers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlluniqueTriggers()
   * @generated
   * @ordered
   */
  protected MDWEList<Trigger> alluniqueTriggers;

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
    return FiacreMMPackage.Literals.PROCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDWEList<Transition> getTransitions()
  {
    if (transitions == null)
    {
      transitions = new MDWEObjectContainmentEList<Transition>(Transition.class, this, FiacreMMPackage.PROCESS__TRANSITIONS);
    }
    return transitions;
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
      variables = new MDWEObjectWithInverseResolvingEList.ManyInverse<Variable>(Variable.class, this, FiacreMMPackage.PROCESS__VARIABLES, FiacreMMPackage.VARIABLE__PROCESSES);
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
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.PROCESS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDWEList<State> getStates()
  {
    if (states == null)
    {
      states = new MDWEObjectContainmentEList<State>(State.class, this, FiacreMMPackage.PROCESS__STATES);
    }
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getInitState()
  {
    if (initState != null && initState.eIsProxy())
    {
      InternalEObject oldInitState = (InternalEObject)initState;
      initState = (State)eResolveProxy(oldInitState);
      if (initState != oldInitState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiacreMMPackage.PROCESS__INIT_STATE, oldInitState, initState));
      }
    }
    return initState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetInitState()
  {
    return initState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitState(State newInitState, NotificationChain msgs)
  {
    State oldInitState = initState;
    initState = newInitState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FiacreMMPackage.PROCESS__INIT_STATE, oldInitState, newInitState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitState(State newInitState)
  {
    if (newInitState != initState)
    {
      NotificationChain msgs = null;
      if (initState != null)
        msgs = ((InternalEObject)initState).eInverseRemove(this, FiacreMMPackage.STATE__PROCESS, State.class, msgs);
      if (newInitState != null)
        msgs = ((InternalEObject)newInitState).eInverseAdd(this, FiacreMMPackage.STATE__PROCESS, State.class, msgs);
      msgs = basicSetInitState(newInitState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.PROCESS__INIT_STATE, newInitState, newInitState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getStateSize()
  {
    return stateSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateSize(int newStateSize)
  {
    int oldStateSize = stateSize;
    stateSize = newStateSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.PROCESS__STATE_SIZE, oldStateSize, stateSize));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.PROCESS__VAR_SIZE, oldVarSize, varSize));
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
      ports = new MDWEObjectContainmentEList<Port>(Port.class, this, FiacreMMPackage.PROCESS__PORTS);
    }
    return ports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDWEList<Trigger> getAlluniqueTriggers()
  {
    if (alluniqueTriggers == null)
    {
      alluniqueTriggers = new MDWEObjectContainmentEList<Trigger>(Trigger.class, this, FiacreMMPackage.PROCESS__ALLUNIQUE_TRIGGERS);
    }
    return alluniqueTriggers;
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
      case FiacreMMPackage.PROCESS__VARIABLES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariables()).basicAdd(otherEnd, msgs);
      case FiacreMMPackage.PROCESS__INIT_STATE:
        if (initState != null)
          msgs = ((InternalEObject)initState).eInverseRemove(this, FiacreMMPackage.STATE__PROCESS, State.class, msgs);
        return basicSetInitState((State)otherEnd, msgs);
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
      case FiacreMMPackage.PROCESS__TRANSITIONS:
        return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
      case FiacreMMPackage.PROCESS__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case FiacreMMPackage.PROCESS__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
      case FiacreMMPackage.PROCESS__INIT_STATE:
        return basicSetInitState(null, msgs);
      case FiacreMMPackage.PROCESS__PORTS:
        return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
      case FiacreMMPackage.PROCESS__ALLUNIQUE_TRIGGERS:
        return ((InternalEList<?>)getAlluniqueTriggers()).basicRemove(otherEnd, msgs);
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
      case FiacreMMPackage.PROCESS__TRANSITIONS:
        return getTransitions();
      case FiacreMMPackage.PROCESS__VARIABLES:
        return getVariables();
      case FiacreMMPackage.PROCESS__NAME:
        return getName();
      case FiacreMMPackage.PROCESS__STATES:
        return getStates();
      case FiacreMMPackage.PROCESS__INIT_STATE:
        if (resolve) return getInitState();
        return basicGetInitState();
      case FiacreMMPackage.PROCESS__STATE_SIZE:
        return getStateSize();
      case FiacreMMPackage.PROCESS__VAR_SIZE:
        return getVarSize();
      case FiacreMMPackage.PROCESS__PORTS:
        return getPorts();
      case FiacreMMPackage.PROCESS__ALLUNIQUE_TRIGGERS:
        return getAlluniqueTriggers();
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
      case FiacreMMPackage.PROCESS__TRANSITIONS:
        getTransitions().clear();
        getTransitions().addAll((Collection<? extends Transition>)newValue);
        return;
      case FiacreMMPackage.PROCESS__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Variable>)newValue);
        return;
      case FiacreMMPackage.PROCESS__NAME:
        setName((String)newValue);
        return;
      case FiacreMMPackage.PROCESS__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends State>)newValue);
        return;
      case FiacreMMPackage.PROCESS__INIT_STATE:
        setInitState((State)newValue);
        return;
      case FiacreMMPackage.PROCESS__STATE_SIZE:
        setStateSize((Integer)newValue);
        return;
      case FiacreMMPackage.PROCESS__VAR_SIZE:
        setVarSize((Integer)newValue);
        return;
      case FiacreMMPackage.PROCESS__PORTS:
        getPorts().clear();
        getPorts().addAll((Collection<? extends Port>)newValue);
        return;
      case FiacreMMPackage.PROCESS__ALLUNIQUE_TRIGGERS:
        getAlluniqueTriggers().clear();
        getAlluniqueTriggers().addAll((Collection<? extends Trigger>)newValue);
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
      case FiacreMMPackage.PROCESS__TRANSITIONS:
        getTransitions().clear();
        return;
      case FiacreMMPackage.PROCESS__VARIABLES:
        getVariables().clear();
        return;
      case FiacreMMPackage.PROCESS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FiacreMMPackage.PROCESS__STATES:
        getStates().clear();
        return;
      case FiacreMMPackage.PROCESS__INIT_STATE:
        setInitState((State)null);
        return;
      case FiacreMMPackage.PROCESS__STATE_SIZE:
        setStateSize(STATE_SIZE_EDEFAULT);
        return;
      case FiacreMMPackage.PROCESS__VAR_SIZE:
        setVarSize(VAR_SIZE_EDEFAULT);
        return;
      case FiacreMMPackage.PROCESS__PORTS:
        getPorts().clear();
        return;
      case FiacreMMPackage.PROCESS__ALLUNIQUE_TRIGGERS:
        getAlluniqueTriggers().clear();
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
      case FiacreMMPackage.PROCESS__TRANSITIONS:
        return transitions != null && !transitions.isEmpty();
      case FiacreMMPackage.PROCESS__VARIABLES:
        return variables != null && !variables.isEmpty();
      case FiacreMMPackage.PROCESS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FiacreMMPackage.PROCESS__STATES:
        return states != null && !states.isEmpty();
      case FiacreMMPackage.PROCESS__INIT_STATE:
        return initState != null;
      case FiacreMMPackage.PROCESS__STATE_SIZE:
        return stateSize != STATE_SIZE_EDEFAULT;
      case FiacreMMPackage.PROCESS__VAR_SIZE:
        return varSize != VAR_SIZE_EDEFAULT;
      case FiacreMMPackage.PROCESS__PORTS:
        return ports != null && !ports.isEmpty();
      case FiacreMMPackage.PROCESS__ALLUNIQUE_TRIGGERS:
        return alluniqueTriggers != null && !alluniqueTriggers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProcessImpl
