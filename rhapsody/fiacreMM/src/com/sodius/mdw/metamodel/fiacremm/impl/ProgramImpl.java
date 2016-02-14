/**
 */
package com.sodius.mdw.metamodel.fiacremm.impl;

import com.sodius.mdw.metamodel.fiacremm.Component;
import com.sodius.mdw.metamodel.fiacremm.DataType;
import com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage;
import com.sodius.mdw.metamodel.fiacremm.Program;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ProgramImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ProgramImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ProgramImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ProgramImpl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link com.sodius.mdw.metamodel.fiacremm.impl.ProgramImpl#getComponentSize <em>Component Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends DefaultMDWEObject implements Program
{
  /**
   * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected MDWEList<Component> components;

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
   * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
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
   * The cached value of the '{@link #getDatatypes() <em>Datatypes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatypes()
   * @generated
   * @ordered
   */
  protected MDWEList<DataType> datatypes;

  /**
   * The default value of the '{@link #getComponentSize() <em>Component Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentSize()
   * @generated
   * @ordered
   */
  protected static final int COMPONENT_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getComponentSize() <em>Component Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentSize()
   * @generated
   * @ordered
   */
  protected int componentSize = COMPONENT_SIZE_EDEFAULT;

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
    return FiacreMMPackage.Literals.PROGRAM;
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
      components = new MDWEObjectContainmentEList<Component>(Component.class, this, FiacreMMPackage.PROGRAM__COMPONENTS);
    }
    return components;
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
      variable = new MDWEObjectContainmentEList<Variable>(Variable.class, this, FiacreMMPackage.PROGRAM__VARIABLE);
    }
    return variable;
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
      processes = new MDWEObjectContainmentEList<com.sodius.mdw.metamodel.fiacremm.Process>(com.sodius.mdw.metamodel.fiacremm.Process.class, this, FiacreMMPackage.PROGRAM__PROCESSES);
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
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.PROGRAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDWEList<DataType> getDatatypes()
  {
    if (datatypes == null)
    {
      datatypes = new MDWEObjectContainmentEList<DataType>(DataType.class, this, FiacreMMPackage.PROGRAM__DATATYPES);
    }
    return datatypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getComponentSize()
  {
    return componentSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentSize(int newComponentSize)
  {
    int oldComponentSize = componentSize;
    componentSize = newComponentSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FiacreMMPackage.PROGRAM__COMPONENT_SIZE, oldComponentSize, componentSize));
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
      case FiacreMMPackage.PROGRAM__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case FiacreMMPackage.PROGRAM__VARIABLE:
        return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
      case FiacreMMPackage.PROGRAM__PROCESSES:
        return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
      case FiacreMMPackage.PROGRAM__DATATYPES:
        return ((InternalEList<?>)getDatatypes()).basicRemove(otherEnd, msgs);
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
      case FiacreMMPackage.PROGRAM__COMPONENTS:
        return getComponents();
      case FiacreMMPackage.PROGRAM__VARIABLE:
        return getVariable();
      case FiacreMMPackage.PROGRAM__PROCESSES:
        return getProcesses();
      case FiacreMMPackage.PROGRAM__NAME:
        return getName();
      case FiacreMMPackage.PROGRAM__DATATYPES:
        return getDatatypes();
      case FiacreMMPackage.PROGRAM__COMPONENT_SIZE:
        return getComponentSize();
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
      case FiacreMMPackage.PROGRAM__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends Component>)newValue);
        return;
      case FiacreMMPackage.PROGRAM__VARIABLE:
        getVariable().clear();
        getVariable().addAll((Collection<? extends Variable>)newValue);
        return;
      case FiacreMMPackage.PROGRAM__PROCESSES:
        getProcesses().clear();
        getProcesses().addAll((Collection<? extends com.sodius.mdw.metamodel.fiacremm.Process>)newValue);
        return;
      case FiacreMMPackage.PROGRAM__NAME:
        setName((String)newValue);
        return;
      case FiacreMMPackage.PROGRAM__DATATYPES:
        getDatatypes().clear();
        getDatatypes().addAll((Collection<? extends DataType>)newValue);
        return;
      case FiacreMMPackage.PROGRAM__COMPONENT_SIZE:
        setComponentSize((Integer)newValue);
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
      case FiacreMMPackage.PROGRAM__COMPONENTS:
        getComponents().clear();
        return;
      case FiacreMMPackage.PROGRAM__VARIABLE:
        getVariable().clear();
        return;
      case FiacreMMPackage.PROGRAM__PROCESSES:
        getProcesses().clear();
        return;
      case FiacreMMPackage.PROGRAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FiacreMMPackage.PROGRAM__DATATYPES:
        getDatatypes().clear();
        return;
      case FiacreMMPackage.PROGRAM__COMPONENT_SIZE:
        setComponentSize(COMPONENT_SIZE_EDEFAULT);
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
      case FiacreMMPackage.PROGRAM__COMPONENTS:
        return components != null && !components.isEmpty();
      case FiacreMMPackage.PROGRAM__VARIABLE:
        return variable != null && !variable.isEmpty();
      case FiacreMMPackage.PROGRAM__PROCESSES:
        return processes != null && !processes.isEmpty();
      case FiacreMMPackage.PROGRAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FiacreMMPackage.PROGRAM__DATATYPES:
        return datatypes != null && !datatypes.isEmpty();
      case FiacreMMPackage.PROGRAM__COMPONENT_SIZE:
        return componentSize != COMPONENT_SIZE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

} //ProgramImpl
