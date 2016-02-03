/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: toM
//!	Generated Date	: Wed, 3, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/toM.java
*********************************************************************/

package Ascenseur;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Ascenseur/toM.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## event toM() 
public class toM extends RiJEvent implements AnimatedEvent {
    
    public static final int toM_Ascenseur_id = 2644;		//## ignore 
    
    
    // Constructors
    
    public  toM() {
        lId = toM_Ascenseur_id;
    }
    
    public boolean isTypeOf(long id) {
        return (toM_Ascenseur_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Ascenseur.toM");
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
          String s="toM(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/toM.java
*********************************************************************/

