/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: readyToOpenDoor
//!	Generated Date	: Wed, 3, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/readyToOpenDoor.java
*********************************************************************/

package Ascenseur;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Ascenseur/readyToOpenDoor.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## event readyToOpenDoor() 
public class readyToOpenDoor extends RiJEvent implements AnimatedEvent {
    
    public static final int readyToOpenDoor_Ascenseur_id = 2641;		//## ignore 
    
    
    // Constructors
    
    public  readyToOpenDoor() {
        lId = readyToOpenDoor_Ascenseur_id;
    }
    
    public boolean isTypeOf(long id) {
        return (readyToOpenDoor_Ascenseur_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Ascenseur.readyToOpenDoor");
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
          String s="readyToOpenDoor(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/readyToOpenDoor.java
*********************************************************************/

