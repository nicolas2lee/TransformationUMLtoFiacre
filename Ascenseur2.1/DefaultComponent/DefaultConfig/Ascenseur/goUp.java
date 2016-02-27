/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: goUp
//!	Generated Date	: Thu, 25, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/goUp.java
*********************************************************************/

package Ascenseur;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Ascenseur/goUp.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## event goUp() 
public class goUp extends RiJEvent implements AnimatedEvent {
    
    public static final int goUp_Ascenseur_id = 2621;		//## ignore 
    
    
    // Constructors
    
    public  goUp() {
        lId = goUp_Ascenseur_id;
    }
    
    public boolean isTypeOf(long id) {
        return (goUp_Ascenseur_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Ascenseur.goUp");
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
          String s="goUp(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/goUp.java
*********************************************************************/

