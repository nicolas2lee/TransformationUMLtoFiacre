/**
 */
package com.sodius.mdw.metamodel.fiacre.impl;

import com.sodius.mdw.metamodel.fiacre.Component;
import com.sodius.mdw.metamodel.fiacre.FiacrePackage;
import com.sodius.mdw.metamodel.fiacre.Program;
import com.sodius.mdw.metamodel.fiacre.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import com.sodius.mdw.core.model.emf.MDWEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import com.sodius.mdw.corext.model.emf.DefaultMDWEObject;

import com.sodius.mdw.corext.model.emf.MDWEObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.impl.ProgramImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.impl.ProgramImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacre.impl.ProgramImpl#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends DefaultMDWEObject implements Program
{
  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected MDWEList<Component> component;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected MDWEList<Variable> variable;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
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
    return FiacrePackage.Literals.PROGRAM;
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
      component = new MDWEObjectContainmentEList<Component>(Component.class, this, FiacrePackage.PROGRAM__COMPONENT);
    }
    return component;
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
      variable = new MDWEObjectContainmentEList<Variable>(Variable.class, this, FiacrePackage.PROGRAM__VARIABLE);
    }
    return variable;
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
      process = new MDWEObjectContainmentEList<com.sodius.mdw.metamodel.fiacre.Process>(com.sodius.mdw.metamodel.fiacre.Process.class, this, FiacrePackage.PROGRAM__PROCESS);
    }
    return process;
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
      case FiacrePackage.PROGRAM__COMPONENT:
        return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
      case FiacrePackage.PROGRAM__VARIABLE:
        return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
      case FiacrePackage.PROGRAM__PROCESS:
        return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
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
      case FiacrePackage.PROGRAM__COMPONENT:
        return getComponent();
      case FiacrePackage.PROGRAM__VARIABLE:
        return getVariable();
      case FiacrePackage.PROGRAM__PROCESS:
        return getProcess();
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
      case FiacrePackage.PROGRAM__COMPONENT:
        getComponent().clear();
        getComponent().addAll((Collection<? extends Component>)newValue);
        return;
      case FiacrePackage.PROGRAM__VARIABLE:
        getVariable().clear();
        getVariable().addAll((Collection<? extends Variable>)newValue);
        return;
      case FiacrePackage.PROGRAM__PROCESS:
        getProcess().clear();
        getProcess().addAll((Collection<? extends com.sodius.mdw.metamodel.fiacre.Process>)newValue);
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
      case FiacrePackage.PROGRAM__COMPONENT:
        getComponent().clear();
        return;
      case FiacrePackage.PROGRAM__VARIABLE:
        getVariable().clear();
        return;
      case FiacrePackage.PROGRAM__PROCESS:
        getProcess().clear();
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
      case FiacrePackage.PROGRAM__COMPONENT:
        return component != null && !component.isEmpty();
      case FiacrePackage.PROGRAM__VARIABLE:
        return variable != null && !variable.isEmpty();
      case FiacrePackage.PROGRAM__PROCESS:
        return process != null && !process.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProgramImpl
