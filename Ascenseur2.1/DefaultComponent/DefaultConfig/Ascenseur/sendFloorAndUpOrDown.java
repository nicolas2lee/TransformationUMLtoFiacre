/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: sendFloorAndUpOrDown
//!	Generated Date	: Tue, 2, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/sendFloorAndUpOrDown.java
*********************************************************************/

package Ascenseur;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Ascenseur/sendFloorAndUpOrDown.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## event sendFloorAndUpOrDown() 
public class sendFloorAndUpOrDown extends RiJEvent implements AnimatedEvent {
    
    public static final int sendFloorAndUpOrDown_Ascenseur_id = 2632;		//## ignore 
    
    
    // Constructors
    
    public  sendFloorAndUpOrDown() {
        lId = sendFloorAndUpOrDown_Ascenseur_id;
    }
    
    public boolean isTypeOf(long id) {
        return (sendFloorAndUpOrDown_Ascenseur_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Ascenseur.sendFloorAndUpOrDown");
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
          String s="sendFloorAndUpOrDown(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/sendFloorAndUpOrDown.java
*********************************************************************/

