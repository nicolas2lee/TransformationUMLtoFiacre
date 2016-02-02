/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: moveCabinDown
//!	Generated Date	: Mon, 30, Nov 2015 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/moveCabinDown.java
*********************************************************************/

package Ascenseur;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Ascenseur/moveCabinDown.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## event moveCabinDown() 
public class moveCabinDown extends RiJEvent implements AnimatedEvent {
    
    public static final int moveCabinDown_Ascenseur_id = 2638;		//## ignore 
    
    
    // Constructors
    
    public  moveCabinDown() {
        lId = moveCabinDown_Ascenseur_id;
    }
    
    public boolean isTypeOf(long id) {
        return (moveCabinDown_Ascenseur_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Ascenseur.moveCabinDown");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
    }
    public String toString() {
          String s="moveCabinDown(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/moveCabinDown.java
*********************************************************************/

