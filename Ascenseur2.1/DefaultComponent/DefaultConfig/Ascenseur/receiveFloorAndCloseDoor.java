/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: receiveFloorAndCloseDoor
//!	Generated Date	: Wed, 3, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/receiveFloorAndCloseDoor.java
*********************************************************************/

package Ascenseur;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Ascenseur/receiveFloorAndCloseDoor.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## event receiveFloorAndCloseDoor(int) 
public class receiveFloorAndCloseDoor extends RiJEvent implements AnimatedEvent {
    
    public static final int receiveFloorAndCloseDoor_Ascenseur_id = 2634;		//## ignore 
    
    public int requestedTargetFloor;
    
    // Constructors
    
    public  receiveFloorAndCloseDoor() {
        lId = receiveFloorAndCloseDoor_Ascenseur_id;
    }
    public  receiveFloorAndCloseDoor(int p_requestedTargetFloor) {
        lId = receiveFloorAndCloseDoor_Ascenseur_id;
        requestedTargetFloor = p_requestedTargetFloor;
    }
    
    public boolean isTypeOf(long id) {
        return (receiveFloorAndCloseDoor_Ascenseur_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Ascenseur.receiveFloorAndCloseDoor");
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
          msg.add("requestedTargetFloor", requestedTargetFloor);
    }
    public String toString() {
          String s="receiveFloorAndCloseDoor(";      
          s += "requestedTargetFloor=" + AnimInstance.animToString(requestedTargetFloor) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/receiveFloorAndCloseDoor.java
*********************************************************************/

