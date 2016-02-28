/**
 */
package com.sodius.mdw.metamodel.fiacremm.impl;

import com.sodius.mdw.metamodel.fiacremm.Action;
import com.sodius.mdw.metamodel.fiacremm.Component;
import com.sodius.mdw.metamodel.fiacremm.DataType;
import com.sodius.mdw.metamodel.fiacremm.FiacreMMFactory;
import com.sodius.mdw.metamodel.fiacremm.FiacreMMPackage;
import com.sodius.mdw.metamodel.fiacremm.Guard;
import com.sodius.mdw.metamodel.fiacremm.Port;
import com.sodius.mdw.metamodel.fiacremm.Program;
import com.sodius.mdw.metamodel.fiacremm.State;
import com.sodius.mdw.metamodel.fiacremm.Transition;
import com.sodius.mdw.metamodel.fiacremm.Trigger;
import com.sodius.mdw.metamodel.fiacremm.Variable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FiacreMMFactoryImpl extends EFactoryImpl implements FiacreMMFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FiacreMMFactory init()
  {
    try
    {
      FiacreMMFactory theFiacreMMFactory = (FiacreMMFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mdworkbench.com/fiacreMM"); 
      if (theFiacreMMFactory != null)
      {
        return theFiacreMMFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FiacreMMFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FiacreMMFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FiacreMMPackage.STATE: return createState();
      case FiacreMMPackage.PROCESS: return createProcess();
      case FiacreMMPackage.TRANSITION: return createTransition();
      case FiacreMMPackage.DATA_TYPE: return createDataType();
      case FiacreMMPackage.VARIABLE: return createVariable();
      case FiacreMMPackage.COMPONENT: return createComponent();
      case FiacreMMPackage.PROGRAM: return createProgram();
      case FiacreMMPackage.GUARD: return createGuard();
      case FiacreMMPackage.TRIGGER: return createTrigger();
      case FiacreMMPackage.ACTION: return createAction();
      case FiacreMMPackage.PORT: return createPort();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.sodius.mdw.metamodel.fiacremm.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard createGuard()
  {
    GuardImpl guard = new GuardImpl();
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger createTrigger()
  {
    TriggerImpl trigger = new TriggerImpl();
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FiacreMMPackage getFiacreMMPackage()
  {
    return (FiacreMMPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FiacreMMPackage getPackage()
  {
    return FiacreMMPackage.eINSTANCE;
  }

} //FiacreMMFactoryImpl
