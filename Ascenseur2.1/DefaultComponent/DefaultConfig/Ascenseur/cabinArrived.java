/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: cabinArrived
//!	Generated Date	: Thu, 25, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/cabinArrived.java
*********************************************************************/

package Ascenseur;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Ascenseur/cabinArrived.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## event cabinArrived() 
public class cabinArrived extends RiJEvent implements AnimatedEvent {
    
    public static final int cabinArrived_Ascenseur_id = 2620;		//## ignore 
    
    
    // Constructors
    
    public  cabinArrived() {
        lId = cabinArrived_Ascenseur_id;
    }
    
    public boolean isTypeOf(long id) {
        return (cabinArrived_Ascenseur_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Ascenseur.cabinArrived");
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
          String s="cabinArrived(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/cabinArrived.java
*********************************************************************/

