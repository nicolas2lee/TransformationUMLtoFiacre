/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: toMeasure
//!	Generated Date	: Thu, 25, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/toMeasure.java
*********************************************************************/

package Ascenseur;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Ascenseur/toMeasure.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## event toMeasure(int,int) 
public class toMeasure extends RiJEvent implements AnimatedEvent {
    
    public static final int toMeasure_Ascenseur_id = 2641;		//## ignore 
    
    public int currentFloor;
    public int sensorFloor;
    
    // Constructors
    
    public  toMeasure() {
        lId = toMeasure_Ascenseur_id;
    }
    public  toMeasure(int p_currentFloor, int p_sensorFloor) {
        lId = toMeasure_Ascenseur_id;
        currentFloor = p_currentFloor;
        sensorFloor = p_sensorFloor;
    }
    
    public boolean isTypeOf(long id) {
        return (toMeasure_Ascenseur_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Ascenseur.toMeasure");
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
          msg.add("currentFloor", currentFloor);
          msg.add("sensorFloor", sensorFloor);
    }
    public String toString() {
          String s="toMeasure(";      
          s += "currentFloor=" + AnimInstance.animToString(currentFloor) + " ";
          s += "sensorFloor=" + AnimInstance.animToString(sensorFloor) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/toMeasure.java
*********************************************************************/

