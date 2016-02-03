/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: gotoOpenDoorDirectly
//!	Generated Date	: Wed, 3, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/gotoOpenDoorDirectly.java
*********************************************************************/

package Ascenseur;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Ascenseur/gotoOpenDoorDirectly.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## event gotoOpenDoorDirectly() 
public class gotoOpenDoorDirectly extends RiJEvent implements AnimatedEvent {
    
    public static final int gotoOpenDoorDirectly_Ascenseur_id = 2640;		//## ignore 
    
    
    // Constructors
    
    public  gotoOpenDoorDirectly() {
        lId = gotoOpenDoorDirectly_Ascenseur_id;
    }
    
    public boolean isTypeOf(long id) {
        return (gotoOpenDoorDirectly_Ascenseur_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Ascenseur.gotoOpenDoorDirectly");
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
          String s="gotoOpenDoorDirectly(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/gotoOpenDoorDirectly.java
*********************************************************************/

