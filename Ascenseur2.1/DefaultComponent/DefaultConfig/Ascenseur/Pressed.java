/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Pressed
//!	Generated Date	: Wed, 3, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/Pressed.java
*********************************************************************/

package Ascenseur;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Ascenseur/Pressed.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## event Pressed(int) 
public class Pressed extends RiJEvent implements AnimatedEvent {
    
    public static final int Pressed_Ascenseur_id = 2616;		//## ignore 
    
    public int requestFloor;
    
    // Constructors
    
    public  Pressed() {
        lId = Pressed_Ascenseur_id;
    }
    public  Pressed(int p_requestFloor) {
        lId = Pressed_Ascenseur_id;
        requestFloor = p_requestFloor;
    }
    
    public boolean isTypeOf(long id) {
        return (Pressed_Ascenseur_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Ascenseur.Pressed");
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
          msg.add("requestFloor", requestFloor);
    }
    public String toString() {
          String s="Pressed(";      
          s += "requestFloor=" + AnimInstance.animToString(requestFloor) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/Pressed.java
*********************************************************************/

