/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: sendFloorAndCloseDoor
//!	Generated Date	: Wed, 3, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/sendFloorAndCloseDoor.java
*********************************************************************/

package Ascenseur;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Ascenseur/sendFloorAndCloseDoor.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## event sendFloorAndCloseDoor(int) 
public class sendFloorAndCloseDoor extends RiJEvent implements AnimatedEvent {
    
    public static final int sendFloorAndCloseDoor_Ascenseur_id = 2631;		//## ignore 
    
    public int targetFloor;
    
    // Constructors
    
    public  sendFloorAndCloseDoor() {
        lId = sendFloorAndCloseDoor_Ascenseur_id;
    }
    public  sendFloorAndCloseDoor(int p_targetFloor) {
        lId = sendFloorAndCloseDoor_Ascenseur_id;
        targetFloor = p_targetFloor;
    }
    
    public boolean isTypeOf(long id) {
        return (sendFloorAndCloseDoor_Ascenseur_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Ascenseur.sendFloorAndCloseDoor");
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
          msg.add("targetFloor", targetFloor);
    }
    public String toString() {
          String s="sendFloorAndCloseDoor(";      
          s += "targetFloor=" + AnimInstance.animToString(targetFloor) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/sendFloorAndCloseDoor.java
*********************************************************************/

