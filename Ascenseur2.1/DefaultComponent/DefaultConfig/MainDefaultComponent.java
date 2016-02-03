/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: guoxi
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DefaultConfig
//!	Generated Date	: Wed, 3, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/MainDefaultComponent.java
*********************************************************************/


//## auto_generated
import Ascenseur.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.*;

//----------------------------------------------------------------------------
// MainDefaultComponent.java                                                                  
//----------------------------------------------------------------------------


//## ignore 
public class MainDefaultComponent {
    
    //#[ ignore
    // link with events in order to register them in the animation browser
    static {
      // Setting Animation Default Port 
      AnimTcpIpConnection.setDefaultPort(6423);
      // Registering Events 
      try {
        
            Class.forName("Ascenseur.braked");
            Class.forName("Ascenseur.cabinArrived");
            Class.forName("Ascenseur.cabinGone");
            Class.forName("Ascenseur.CloseDoor");
            Class.forName("Ascenseur.continueToMove");
            Class.forName("Ascenseur.detected");
            Class.forName("Ascenseur.goDown");
            Class.forName("Ascenseur.GoSleep");
            Class.forName("Ascenseur.gotoOpenDoorDirectly");
            Class.forName("Ascenseur.goUp");
            Class.forName("Ascenseur.moveCabin");
            Class.forName("Ascenseur.moveCabinDown");
            Class.forName("Ascenseur.moveCabinUp");
            Class.forName("Ascenseur.OpenDoor");
            Class.forName("Ascenseur.Pressed");
            Class.forName("Ascenseur.readyToGo");
            Class.forName("Ascenseur.readyToOpenDoor");
            Class.forName("Ascenseur.receive");
            Class.forName("Ascenseur.receiveCabinMoved");
            Class.forName("Ascenseur.receiveFloorAndCloseDoor");
            Class.forName("Ascenseur.receiveFromButton_Ex");
            Class.forName("Ascenseur.sendFloorAndCloseDoor");
            Class.forName("Ascenseur.sendFloorAndUpOrDown");
            Class.forName("Ascenseur.sending");
            Class.forName("Ascenseur.sendMessage");
            Class.forName("Ascenseur.stop");
            Class.forName("Ascenseur.stopFromController");
            Class.forName("Ascenseur.TimeoutOrArrive");
            Class.forName("Ascenseur.toM");
            Class.forName("Ascenseur.toMeasure");
    
        // Registering Static Classes 
        
      }
      catch(Exception e) { 
         java.lang.System.err.println(e.toString());
         e.printStackTrace(java.lang.System.err);
      }
    }
    //#]
    
    private Ascenseur_pkgClass initializer_Ascenseur = new Ascenseur_pkgClass(RiJMainThread.instance());
    
    //## configuration DefaultComponent::DefaultConfig 
    public static void main(String[] args) {
        RiJOXF.Init(null, 0, 0, true, args);
        MainDefaultComponent initializer_DefaultComponent = new MainDefaultComponent();
        //#[ configuration DefaultComponent::DefaultConfig 
        //#]
        RiJOXF.Start();
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/MainDefaultComponent.java
*********************************************************************/

