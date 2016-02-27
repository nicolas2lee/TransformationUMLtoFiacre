/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: receiveFromButton_Ex
//!	Generated Date	: Thu, 25, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/receiveFromButton_Ex.java
*********************************************************************/

package Ascenseur;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Ascenseur/receiveFromButton_Ex.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## event receiveFromButton_Ex(int) 
public class receiveFromButton_Ex extends RiJEvent implements AnimatedEvent {
    
    public static final int receiveFromButton_Ex_Ascenseur_id = 2633;		//## ignore 
    
    public int requestedFloor;
    
    // Constructors
    
    public  receiveFromButton_Ex() {
        lId = receiveFromButton_Ex_Ascenseur_id;
    }
    public  receiveFromButton_Ex(int p_requestedFloor) {
        lId = receiveFromButton_Ex_Ascenseur_id;
        requestedFloor = p_requestedFloor;
    }
    
    public boolean isTypeOf(long id) {
        return (receiveFromButton_Ex_Ascenseur_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Ascenseur.receiveFromButton_Ex");
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
          msg.add("requestedFloor", requestedFloor);
    }
    public String toString() {
          String s="receiveFromButton_Ex(";      
          s += "requestedFloor=" + AnimInstance.animToString(requestedFloor) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/receiveFromButton_Ex.java
*********************************************************************/

