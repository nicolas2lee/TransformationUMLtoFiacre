/**
 */
package com.sodius.mdw.metamodel.fiacre.impl;

import com.sodius.mdw.metamodel.fiacre.Component;
import com.sodius.mdw.metamodel.fiacre.DataType;
import com.sodius.mdw.metamodel.fiacre.FiacreFactory;
import com.sodius.mdw.metamodel.fiacre.FiacrePackage;
import com.sodius.mdw.metamodel.fiacre.Init;
import com.sodius.mdw.metamodel.fiacre.Program;
import com.sodius.mdw.metamodel.fiacre.State;
import com.sodius.mdw.metamodel.fiacre.Transition;
import com.sodius.mdw.metamodel.fiacre.Variable;

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
public class FiacreFactoryImpl extends EFactoryImpl implements FiacreFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FiacreFactory init()
  {
    try
    {
      FiacreFactory theFiacreFactory = (FiacreFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mdworkbench.com/fiacre"); 
      if (theFiacreFactory != null)
      {
        return theFiacreFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FiacreFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FiacreFactoryImpl()
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
      case FiacrePackage.STATE: return createState();
      case FiacrePackage.PROCESS: return createProcess();
      case FiacrePackage.TRANSITION: return createTransition();
      case FiacrePackage.DATA_TYPE: return createDataType();
      case FiacrePackage.VARIABLE: return createVariable();
      case FiacrePackage.INIT: return createInit();
      case FiacrePackage.COMPONENT: return createComponent();
      case FiacrePackage.PROGRAM: return createProgram();
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
  public com.sodius.mdw.metamodel.fiacre.Process createProcess()
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
  public Init createInit()
  {
    InitImpl init = new InitImpl();
    return init;
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
  public FiacrePackage getFiacrePackage()
  {
    return (FiacrePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FiacrePackage getPackage()
  {
    return FiacrePackage.eINSTANCE;
  }

} //FiacreFactoryImpl
