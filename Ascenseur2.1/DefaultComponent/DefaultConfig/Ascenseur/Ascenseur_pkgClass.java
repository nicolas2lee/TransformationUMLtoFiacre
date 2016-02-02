/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Ascenseur
//!	Generated Date	: Tue, 2, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/Ascenseur_pkgClass.java
*********************************************************************/

package Ascenseur;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxfinst.*;

//----------------------------------------------------------------------------
// Ascenseur/Ascenseur_pkgClass.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## ignore 
public class Ascenseur_pkgClass {
    
    public static Button_ex itsButton_ex;		//## classInstance itsButton_ex 
    
    public static Cabin itsCabin;		//## classInstance itsCabin 
    
    public static ControllerSys itsControllerSys;		//## classInstance itsControllerSys 
    
    public static Door itsDoor;		//## classInstance itsDoor 
    
    public static Sensor itsSensor;		//## classInstance itsSensor 
    
    public static Sensor itsSensor_1;		//## classInstance itsSensor_1 
    
    public static Winch itsWinch;		//## classInstance itsWinch 
    
    
    // Constructors
    
    //## auto_generated 
    public  Ascenseur_pkgClass(RiJThread p_thread) {
        initRelations(p_thread);
        startBehavior();
    }
    
    //## auto_generated 
    protected void finalize() throws Throwable {
        
        super.finalize();
    }
    
    private static void renameGlobalInstances() {
        if(itsButton_ex != null)
            {
                AnimServices.setInstanceName(itsButton_ex, "itsButton_ex");
            }
        if(itsControllerSys != null)
            {
                AnimServices.setInstanceName(itsControllerSys, "itsControllerSys");
            }
        if(itsWinch != null)
            {
                AnimServices.setInstanceName(itsWinch, "itsWinch");
            }
        if(itsCabin != null)
            {
                AnimServices.setInstanceName(itsCabin, "itsCabin");
            }
        if(itsDoor != null)
            {
                AnimServices.setInstanceName(itsDoor, "itsDoor");
            }
        if(itsSensor != null)
            {
                AnimServices.setInstanceName(itsSensor, "itsSensor");
            }
        if(itsSensor_1 != null)
            {
                AnimServices.setInstanceName(itsSensor_1, "itsSensor_1");
            }
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsButton_ex = new Button_ex(p_thread);
        itsCabin = new Cabin(p_thread);
        itsControllerSys = new ControllerSys(p_thread);
        itsDoor = new Door(p_thread);
        itsSensor = new Sensor(p_thread);
        itsSensor_1 = new Sensor(p_thread);
        itsWinch = new Winch(p_thread);
        {
            
            itsButton_ex.getP_btn_con().setItsDefaultRequiredInterface(itsControllerSys.getP_con_btn().getItsDefaultProvidedInterface());
            
        }{
            
            itsControllerSys.getP_con_btn().setItsDefaultRequiredInterface(itsButton_ex.getP_btn_con().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsControllerSys.getP_con_door().setItsDefaultRequiredInterface(itsDoor.getP_door_con().getItsDefaultProvidedInterface());
            
        }{
            
            itsDoor.getP_door_con().setItsDefaultRequiredInterface(itsControllerSys.getP_con_door().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsWinch.getP_win_con().setItsDefaultRequiredInterface(itsControllerSys.getP_con_win().getItsDefaultProvidedInterface());
            
        }{
            
            itsControllerSys.getP_con_win().setItsDefaultRequiredInterface(itsWinch.getP_win_con().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsCabin.getP_cab_con().setItsDefaultRequiredInterface(itsControllerSys.getP_con_cab().getItsDefaultProvidedInterface());
            
        }{
            
            itsControllerSys.getP_con_cab().setItsDefaultRequiredInterface(itsCabin.getP_cab_con().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsWinch.getP_win_cab().setItsDefaultRequiredInterface(itsCabin.getP_cab_win().getItsDefaultProvidedInterface());
            
        }{
            
            itsCabin.getP_cab_win().setItsDefaultRequiredInterface(itsWinch.getP_win_cab().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsSensor.getP_sen_con().setItsDefaultRequiredInterface(itsControllerSys.getP_con_sen().getItsDefaultProvidedInterface());
            
        }{
            
            itsControllerSys.getP_con_sen().setItsDefaultRequiredInterface(itsSensor.getP_sen_con().getItsDefaultProvidedInterface());
            
        }
        {
            
            itsSensor_1.getP_sen_con_1().setItsDefaultRequiredInterface(itsControllerSys.getP_con_sen().getItsDefaultProvidedInterface());
            
        }{
            
            itsControllerSys.getP_con_sen().setItsDefaultRequiredInterface(itsSensor_1.getP_sen_con_1().getItsDefaultProvidedInterface());
            
        }
        renameGlobalInstances();
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsButton_ex.startBehavior();
        done &= itsCabin.startBehavior();
        done &= itsControllerSys.startBehavior();
        done &= itsDoor.startBehavior();
        done &= itsSensor.startBehavior();
        done &= itsSensor_1.startBehavior();
        done &= itsWinch.startBehavior();
        return done;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/Ascenseur_pkgClass.java
*********************************************************************/

