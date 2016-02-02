/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Pressed
//!	Generated Date	: Tue, 2, Feb 2016 
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


//## event Pressed(int,String) 
public class Pressed extends RiJEvent implements AnimatedEvent {
    
    public static final int Pressed_Ascenseur_id = 2616;		//## ignore 
    
    public int currentFloor;
    public String direction;
    
    // Constructors
    
    public  Pressed() {
        lId = Pressed_Ascenseur_id;
    }
    public  Pressed(int p_currentFloor, String p_direction) {
        lId = Pressed_Ascenseur_id;
        currentFloor = p_currentFloor;
        direction = p_direction;
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
          msg.add("currentFloor", currentFloor);
          msg.add("direction", direction);
    }
    public String toString() {
          String s="Pressed(";      
          s += "currentFloor=" + AnimInstance.animToString(currentFloor) + " ";
          s += "direction=" + AnimInstance.animToString(direction) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/Pressed.java
*********************************************************************/

