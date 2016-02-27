/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: goDown
//!	Generated Date	: Thu, 25, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/goDown.java
*********************************************************************/

package Ascenseur;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Ascenseur/goDown.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## event goDown() 
public class goDown extends RiJEvent implements AnimatedEvent {
    
    public static final int goDown_Ascenseur_id = 2622;		//## ignore 
    
    
    // Constructors
    
    public  goDown() {
        lId = goDown_Ascenseur_id;
    }
    
    public boolean isTypeOf(long id) {
        return (goDown_Ascenseur_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Ascenseur.goDown");
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
          String s="goDown(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/goDown.java
*********************************************************************/

