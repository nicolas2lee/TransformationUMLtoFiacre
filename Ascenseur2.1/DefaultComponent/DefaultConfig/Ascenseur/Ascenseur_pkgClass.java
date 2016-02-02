/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Ascenseur
//!	Generated Date	: Tue, 5, Jan 2016 
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
    
    public static Door itsDoor_1;		//## classInstance itsDoor_1 
    
    public static Sensor itsSensor;		//## classInstance itsSensor 
    
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
        if(itsDoor_1 != null)
            {
                AnimServices.setInstanceName(itsDoor_1, "itsDoor_1");
            }
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsButton_ex = new Button_ex(p_thread);
        itsCabin = new Cabin(p_thread);
        itsControllerSys = new ControllerSys(p_thread);
        itsDoor = new Door(p_thread);
        itsDoor_1 = new Door(p_thread);
        itsSensor = new Sensor(p_thread);
        itsWinch = new Winch(p_thread);
        itsWinch.setItsCabin(itsCabin);
        itsControllerSys.setItsCabin(itsCabin);
        itsControllerSys.setItsDoor(itsDoor);
        itsControllerSys.setItsSensor(itsSensor);
        itsControllerSys.setItsButton_ex(itsButton_ex);
        itsControllerSys.setItsWinch(itsWinch);
        renameGlobalInstances();
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsButton_ex.startBehavior();
        done &= itsCabin.startBehavior();
        done &= itsControllerSys.startBehavior();
        done &= itsDoor.startBehavior();
        done &= itsDoor_1.startBehavior();
        done &= itsSensor.startBehavior();
        done &= itsWinch.startBehavior();
        return done;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/Ascenseur_pkgClass.java
*********************************************************************/

