/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ControllerSys
//!	Generated Date	: Sun, 28, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/ControllerSys.java
*********************************************************************/

package Ascenseur;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Ascenseur/ControllerSys.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## class ControllerSys 
public class ControllerSys implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassControllerSys = new AnimClass("Ascenseur.ControllerSys",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected ControllerSys.p_con_btn_C p_con_btn;		//## ignore 
    
    protected ControllerSys.p_con_sen_C p_con_sen;		//## ignore 
    
    protected ControllerSys.p_con_door_C p_con_door;		//## ignore 
    
    protected ControllerSys.p_con_win_C p_con_win;		//## ignore 
    
    protected ControllerSys.p_con_cab_C p_con_cab;		//## ignore 
    
    protected ControllerSys.p_con_sen_1_C p_con_sen_1;		//## ignore 
    
    protected ControllerSys.p_con_sen_2_C p_con_sen_2;		//## ignore 
    
    protected ControllerSys.p_con_sen_3_C p_con_sen_3;		//## ignore 
    
    protected ControllerSys.p_con_sen_4_C p_con_sen_4;		//## ignore 
    
    protected int currentFloor = 0;		//## attribute currentFloor 
    
    protected int destFloor = -1;		//## attribute destFloor 
    
    protected int exBtnFloor = -1;		//## attribute exBtnFloor 
    
    protected boolean isBusy = false;		//## attribute isBusy 
    
    protected boolean loadedPassager = false;		//## attribute loadedPassager 
    
    protected int targetFloor = -1;		//## attribute targetFloor 
    
    protected int upordown = 0;		//## attribute upordown 
    
    protected Button_ex itsButton_ex;		//## link itsButton_ex 
    
    protected Cabin itsCabin;		//## link itsCabin 
    
    protected Door itsDoor;		//## link itsDoor 
    
    protected Winch itsWinch;		//## link itsWinch 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int waitDoorClosed_ControllerSys=1;
    public static final int Wait_ControllerSys=2;
    public static final int recievedRequestFromCabin_ControllerSys=3;
    public static final int receiveRequestFromButtonEx_ControllerSys=4;
    public static final int doorOpened_ControllerSys=5;
    public static final int doorClosed_ControllerSys=6;
    public static final int cabinMoved_ControllerSys=7;
    public static final int cabinBraked_ControllerSys=8;
    public static final int cabinArrived_ControllerSys=9;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public boolean isIn(int state) {
        return reactive.isIn(state);
    }
    
    //## statechart_method 
    public boolean isPort(Object port) {
        return reactive.isPort(port);
    }
    
    //## statechart_method 
    public boolean isCompleted(int state) {
        return reactive.isCompleted(state);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public void cancelEvent(RiJEvent event) {
        m_thread.cancelEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    //## statechart_method 
    public void run() {
        m_thread.run();
    }
    
    //## statechart_method 
    public void start() {
        m_thread.start(this);
    }
    
    // Constructors
    
    //## auto_generated 
    public  ControllerSys(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassControllerSys.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("ControllerSys");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public ControllerSys.p_con_btn_C getP_con_btn() {
        return p_con_btn;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_btn_C get_p_con_btn() {
        return p_con_btn;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_btn_C newP_con_btn() {
        p_con_btn = new ControllerSys.p_con_btn_C();
        return p_con_btn;
    }
    
    //## auto_generated 
    public void deleteP_con_btn() {
        p_con_btn=null;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_sen_C getP_con_sen() {
        return p_con_sen;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_sen_C get_p_con_sen() {
        return p_con_sen;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_sen_C newP_con_sen() {
        p_con_sen = new ControllerSys.p_con_sen_C();
        return p_con_sen;
    }
    
    //## auto_generated 
    public void deleteP_con_sen() {
        p_con_sen=null;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_door_C getP_con_door() {
        return p_con_door;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_door_C get_p_con_door() {
        return p_con_door;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_door_C newP_con_door() {
        p_con_door = new ControllerSys.p_con_door_C();
        return p_con_door;
    }
    
    //## auto_generated 
    public void deleteP_con_door() {
        p_con_door=null;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_win_C getP_con_win() {
        return p_con_win;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_win_C get_p_con_win() {
        return p_con_win;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_win_C newP_con_win() {
        p_con_win = new ControllerSys.p_con_win_C();
        return p_con_win;
    }
    
    //## auto_generated 
    public void deleteP_con_win() {
        p_con_win=null;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_cab_C getP_con_cab() {
        return p_con_cab;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_cab_C get_p_con_cab() {
        return p_con_cab;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_cab_C newP_con_cab() {
        p_con_cab = new ControllerSys.p_con_cab_C();
        return p_con_cab;
    }
    
    //## auto_generated 
    public void deleteP_con_cab() {
        p_con_cab=null;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_sen_1_C getP_con_sen_1() {
        return p_con_sen_1;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_sen_1_C get_p_con_sen_1() {
        return p_con_sen_1;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_sen_1_C newP_con_sen_1() {
        p_con_sen_1 = new ControllerSys.p_con_sen_1_C();
        return p_con_sen_1;
    }
    
    //## auto_generated 
    public void deleteP_con_sen_1() {
        p_con_sen_1=null;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_sen_2_C getP_con_sen_2() {
        return p_con_sen_2;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_sen_2_C get_p_con_sen_2() {
        return p_con_sen_2;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_sen_2_C newP_con_sen_2() {
        p_con_sen_2 = new ControllerSys.p_con_sen_2_C();
        return p_con_sen_2;
    }
    
    //## auto_generated 
    public void deleteP_con_sen_2() {
        p_con_sen_2=null;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_sen_3_C getP_con_sen_3() {
        return p_con_sen_3;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_sen_3_C get_p_con_sen_3() {
        return p_con_sen_3;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_sen_3_C newP_con_sen_3() {
        p_con_sen_3 = new ControllerSys.p_con_sen_3_C();
        return p_con_sen_3;
    }
    
    //## auto_generated 
    public void deleteP_con_sen_3() {
        p_con_sen_3=null;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_sen_4_C getP_con_sen_4() {
        return p_con_sen_4;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_sen_4_C get_p_con_sen_4() {
        return p_con_sen_4;
    }
    
    //## auto_generated 
    public ControllerSys.p_con_sen_4_C newP_con_sen_4() {
        p_con_sen_4 = new ControllerSys.p_con_sen_4_C();
        return p_con_sen_4;
    }
    
    //## auto_generated 
    public void deleteP_con_sen_4() {
        p_con_sen_4=null;
    }
    
    //## operation closeDoor() 
    public void closeDoor() {
        try {
            animInstance().notifyMethodEntered("closeDoor",
               new ArgData[] {
               });
        
        //#[ operation closeDoor() 
        System.out.println("Tell door to close");
        getP_con_door().gen (new CloseDoor());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * select
     *               p_sen_con_detected;
     *               stopFromController;
     *               to cabinArrived_ControllerSys
     *           []
     *               p_sen_con_1_detected;
     *               stopFromController;
     *               to cabinArrived_ControllerSys
     *           []
     *               p_sen_con_2_detected;
     *               stopFromController;
     *               to cabinArrived_ControllerSys
     *           []
     *               p_sen_con_3_detected ;
     *               stopFromController;
     *               to cabinArrived_ControllerSys
     *           []
     *               p_sen_con_4_detected; 
     *               stopFromController;
     *               to cabinArrived_ControllerSys
     *          
     *          
     * 
    */
    //## operation genFiacre1() 
    public void genFiacre1() {
        try {
            animInstance().notifyMethodEntered("genFiacre1",
               new ArgData[] {
               });
        
        //#[ operation genFiacre1() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * receiveCabinMoved;
     *           currentFloor := currentFloor + upordown;
     *           loadedPassager := true;
     *           case (destFloor) of 
     *                0 ->  sendToMeasureSensor ! currentFloor, destFloor
     *             | 1 ->  sendToMeasureSensor_1 ! currentFloor,destFloor
     *             | 2 ->  sendToMeasureSensor_2 ! currentFloor, destFloor
     *             | 3 ->  sendToMeasureSensor_3 ! currentFloor,destFloor
     *             | 4 ->  sendToMeasureSensor_4 ! currentFloor, destFloor
     *          end;
     *          to cabinMoved_ControllerSys
     * 
    */
    //## operation genFiacre10() 
    public void genFiacre10() {
        try {
            animInstance().notifyMethodEntered("genFiacre10",
               new ArgData[] {
               });
        
        //#[ operation genFiacre10() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation genFiacre11() 
    public void genFiacre11() {
        try {
            animInstance().notifyMethodEntered("genFiacre11",
               new ArgData[] {
               });
        
        //#[ operation genFiacre11() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation genFiacre12() 
    public void genFiacre12() {
        try {
            animInstance().notifyMethodEntered("genFiacre12",
               new ArgData[] {
               });
        
        //#[ operation genFiacre12() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * if (loadedPassager) then
     *           CloseDoor;
     *           to waitDoorClosed
     *         end
    */
    //## operation genFiacre13() 
    public void genFiacre13() {
        try {
            animInstance().notifyMethodEntered("genFiacre13",
               new ArgData[] {
               });
        
        //#[ operation genFiacre13() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * readyToGo;
     *           loadedPassager := false;
     *           to Wait_ControllerSys
     * 
    */
    //## operation genFiacre14() 
    public void genFiacre14() {
        try {
            animInstance().notifyMethodEntered("genFiacre14",
               new ArgData[] {
               });
        
        //#[ operation genFiacre14() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * readyToOpenDoor;
     *           OpenDoor;
     *           to doorOpened_ControllerSys
     * 
    */
    //## operation genFiacre2() 
    public void genFiacre2() {
        try {
            animInstance().notifyMethodEntered("genFiacre2",
               new ArgData[] {
               });
        
        //#[ operation genFiacre2() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * targetFloor := 1;
     *           destFloor := targetFloor;
     *           closeDoor;
     *           to doorClosed_ControllerSys
    */
    //## operation genFiacre3() 
    public void genFiacre3() {
        try {
            animInstance().notifyMethodEntered("genFiacre3",
               new ArgData[] {
               });
        
        //#[ operation genFiacre3() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * readyToGo;
     *           if (currentFloor < targetFloor) then
     *               goUp;   
     *               upordown := 1; 
     *               case (targetFloor) of 
     *                  0 ->  sendToMeasureSensor ! currentFloor, targetFloor
     *               | 1 ->  sendToMeasureSensor_1 ! currentFloor, targetFloor
     *               | 2 ->  sendToMeasureSensor_2 ! currentFloor, targetFloor
     *               | 3 ->  sendToMeasureSensor_3 ! currentFloor, targetFloor
     *               | 4 ->  sendToMeasureSensor_4 ! currentFloor, targetFloor
     *                 end;
     *                 to recievedRequestFromCabin_ControllerSys
     *           else
     *                 if (currentFloor == targetFloor) then
     *                     openDoor;
     *                     to doorOpened_ControllerSys
     *                 else
     *                      goDown; 
     *                      upordown := -1;  
     *                      case (targetFloor) of 
     *                        0 ->  sendToMeasureSensor ! currentFloor, targetFloor
     *                     | 1 ->  sendToMeasureSensor_1 ! currentFloor, targetFloor
     *                     | 2 ->  sendToMeasureSensor_2 ! currentFloor, targetFloor
     *                     | 3 ->  sendToMeasureSensor_3 ! currentFloor, targetFloor
     *                     | 4 ->  sendToMeasureSensor_4 ! currentFloor, targetFloor
     *                      end;
     *                      to recievedRequestFromCabin_ControllerSys
     *                 end
     *           end 
     * 
    */
    //## operation genFiacre4() 
    public void genFiacre4() {
        try {
            animInstance().notifyMethodEntered("genFiacre4",
               new ArgData[] {
               });
        
        //#[ operation genFiacre4() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * receiveFromButton_Ex ?  exBtnFloor;
     *           destFloor := exBtnFloor;
     *           if (currentFloor < exBtnFloor) then
     *               goUp;   
     *               upordown :=1 ;  
     *           case (exBtnFloor) of 
     *                0 ->  sendToMeasureSensor ! currentFloor, exBtnFloor
     *             | 1 ->  sendToMeasureSensor_1 ! currentFloor, exBtnFloor
     *             | 2 ->  sendToMeasureSensor_2 ! currentFloor, exBtnFloor
     *             | 3 ->  sendToMeasureSensor_3 ! currentFloor, exBtnFloor
     *             | 4 ->  sendToMeasureSensor_4 ! currentFloor, exBtnFloor
     *            end;
     *                  to ReceiveRequestFromButtonEx_ControllerSys
     *             elseif (currentFloor > exBtnFloor) then 	
     *                  goDown; 
     *                  upordown := -1;  
     *                  case (exBtnFloor) of 
     *                    0 ->  sendToMeasureSensor !  currentFloor,  exBtnFloor
     *                 | 1 ->  sendToMeasureSensor_1 !  currentFloor, exBtnFloor
     *                 | 2 ->  sendToMeasureSensor_2 !  currentFloor, exBtnFloor
     *                 | 3 ->  sendToMeasureSensor_3 !  currentFloor, exBtnFloor
     *                 | 4 ->  sendToMeasureSensor_4 !  currentFloor, exBtnFloor
     *                 end;
     *                 to ReceiveRequestFromButtonEx
     *             else
     *                 to ReceiveRequestFromButtonEx
     *             end
     * 
     * 
    */
    //## operation genFiacre5() 
    public void genFiacre5() {
        try {
            animInstance().notifyMethodEntered("genFiacre5",
               new ArgData[] {
               });
        
        //#[ operation genFiacre5() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * receiveCabinMoved;
     *           currentFloor := currentFloor + upordown;
     *           case (exBtnFloor) of 
     *                0 ->  sendToMeasureSensor ! currentFloor, exBtnFloor
     *             | 1 ->  sendToMeasureSensor_1 !  currentFloor, exBtnFloor
     *             | 2 ->  sendToMeasureSensor_2 !  currentFloor, exBtnFloor
     *             | 3 ->  sendToMeasureSensor_3 !  currentFloor, exBtnFloor
     *             | 4 ->  sendToMeasureSensor_4 !  currentFloor, exBtnFloor
     *            end;
     *            to cabinMoved_ControllerSys
     * 
    */
    //## operation genFiacre6() 
    public void genFiacre6() {
        try {
            animInstance().notifyMethodEntered("genFiacre6",
               new ArgData[] {
               });
        
        //#[ operation genFiacre6() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * braked;
     *           stop;
     *           to cabinBraked
    */
    //## operation genFiacre7() 
    public void genFiacre7() {
        try {
            animInstance().notifyMethodEntered("genFiacre7",
               new ArgData[] {
               });
        
        //#[ operation genFiacre7() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * if (currentFloor = exBtnFloor) then   
     *                 p_con_door_OpenDoor;
     *                 to doorOpened
     *           end;
     * 
    */
    //## operation genFiacre8() 
    public void genFiacre8() {
        try {
            animInstance().notifyMethodEntered("genFiacre8",
               new ArgData[] {
               });
        
        //#[ operation genFiacre8() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * []
     *               p_sen_con_continueToMove;
     *               currentFloor = currentFloor +upordown; 
     *               toMeasureSensor ! currentFloor, destfloor;
     *               to cabinMoved_ControllerSys
     *           []
     *               p_sen_con_1_continueToMove; 
     *               currentFloor = currentFloor +upordown; 
     *               sendToMeasureSensor_1 ! currentFloor, destfloor;
     *              to cabinMoved_ControllerSys
     *           []
     *               p_sen_con_2_continueToMove;
     *               currentFloor = currentFloor +upordown; 
     *               sendToMeasureSensor_2 ! currentFloor, destfloor;
     *               to cabinMoved_ControllerSys
     *           []
     *               p_sen_con_3_continueToMove;
     *               currentFloor = currentFloor +upordown; 
     *               sendToMeasureSensor_3 ! currentFloor, destfloor;
     *               to cabinMoved_ControllerSys
     *           []
     *               p_sen_con_4_continueToMove;
     *               currentFloor = currentFloor +upordown; 
     *               sendToMeasureSensor_4 ! currentFloor, destfloor;
     *               to cabinMoved_ControllerSys
     *          end;
     * 
     * 
     * 
    */
    //## operation genFiacre9() 
    public void genFiacre9() {
        try {
            animInstance().notifyMethodEntered("genFiacre9",
               new ArgData[] {
               });
        
        //#[ operation genFiacre9() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation openDoor() 
    public void openDoor() {
        try {
            animInstance().notifyMethodEntered("openDoor",
               new ArgData[] {
               });
        
        //#[ operation openDoor() 
        System.out.println("Tell door to open");
        getP_con_door().gen (new OpenDoor());  
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendStopToWinch() 
    public void sendStopToWinch() {
        try {
            animInstance().notifyMethodEntered("sendStopToWinch",
               new ArgData[] {
               });
        
        //#[ operation sendStopToWinch() 
        System.out.println("Tell Winch cabin arrived");
        getP_con_win().gen(new stopFromController());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * @param floor
    */
    //## operation sendToMeasureSensor(int) 
    public void sendToMeasureSensor(int floor) {
        try {
            animInstance().notifyMethodEntered("sendToMeasureSensor",
               new ArgData[] {
                   new ArgData(int.class, "floor", AnimInstance.animToString(floor))
               });
        
        //#[ operation sendToMeasureSensor(int) 
        switch(floor){
        	case 0: getP_con_sen().gen(new toMeasure(currentFloor, floor));   
        			break; 
        	case 1: getP_con_sen_1().gen(new toMeasure(currentFloor, floor));   
        			break;   
        	case 2: getP_con_sen_2().gen(new toMeasure(currentFloor, floor));   
        			break; 
        	case 3: getP_con_sen_3().gen(new toMeasure(currentFloor, floor));   
        			break;  
        	case 4: getP_con_sen_4().gen(new toMeasure(currentFloor, floor));   
        			break;
        
        }
        //getP_con_sen().gen(new toMeasure());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendToWinchToStop() 
    public void sendToWinchToStop() {
        try {
            animInstance().notifyMethodEntered("sendToWinchToStop",
               new ArgData[] {
               });
        
        //#[ operation sendToWinchToStop() 
        System.out.println("Tell Winch to stop");
        getP_con_win().gen(new stop());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getCurrentFloor() {
        return currentFloor;
    }
    
    //## auto_generated 
    public void setCurrentFloor(int p_currentFloor) {
        currentFloor = p_currentFloor;
    }
    
    //## auto_generated 
    public int getDestFloor() {
        return destFloor;
    }
    
    //## auto_generated 
    public void setDestFloor(int p_destFloor) {
        destFloor = p_destFloor;
    }
    
    //## auto_generated 
    public int getExBtnFloor() {
        return exBtnFloor;
    }
    
    //## auto_generated 
    public void setExBtnFloor(int p_exBtnFloor) {
        exBtnFloor = p_exBtnFloor;
    }
    
    //## auto_generated 
    public boolean getIsBusy() {
        return isBusy;
    }
    
    //## auto_generated 
    public void setIsBusy(boolean p_isBusy) {
        isBusy = p_isBusy;
    }
    
    //## auto_generated 
    public boolean getLoadedPassager() {
        return loadedPassager;
    }
    
    //## auto_generated 
    public void setLoadedPassager(boolean p_loadedPassager) {
        loadedPassager = p_loadedPassager;
    }
    
    //## auto_generated 
    public int getTargetFloor() {
        return targetFloor;
    }
    
    //## auto_generated 
    public void setTargetFloor(int p_targetFloor) {
        targetFloor = p_targetFloor;
    }
    
    //## auto_generated 
    public int getUpordown() {
        return upordown;
    }
    
    //## auto_generated 
    public void setUpordown(int p_upordown) {
        upordown = p_upordown;
    }
    
    //## auto_generated 
    public Button_ex getItsButton_ex() {
        return itsButton_ex;
    }
    
    //## auto_generated 
    public void __setItsButton_ex(Button_ex p_Button_ex) {
        itsButton_ex = p_Button_ex;
        if(p_Button_ex != null)
            {
                animInstance().notifyRelationAdded("itsButton_ex", p_Button_ex);
            }
        else
            {
                animInstance().notifyRelationCleared("itsButton_ex");
            }
    }
    
    //## auto_generated 
    public void _setItsButton_ex(Button_ex p_Button_ex) {
        if(itsButton_ex != null)
            {
                itsButton_ex.__setItsControllerSys(null);
            }
        __setItsButton_ex(p_Button_ex);
    }
    
    //## auto_generated 
    public void setItsButton_ex(Button_ex p_Button_ex) {
        if(p_Button_ex != null)
            {
                p_Button_ex._setItsControllerSys(this);
            }
        _setItsButton_ex(p_Button_ex);
    }
    
    //## auto_generated 
    public void _clearItsButton_ex() {
        animInstance().notifyRelationCleared("itsButton_ex");
        itsButton_ex = null;
    }
    
    //## auto_generated 
    public Cabin getItsCabin() {
        return itsCabin;
    }
    
    //## auto_generated 
    public void __setItsCabin(Cabin p_Cabin) {
        itsCabin = p_Cabin;
        if(p_Cabin != null)
            {
                animInstance().notifyRelationAdded("itsCabin", p_Cabin);
            }
        else
            {
                animInstance().notifyRelationCleared("itsCabin");
            }
    }
    
    //## auto_generated 
    public void _setItsCabin(Cabin p_Cabin) {
        if(itsCabin != null)
            {
                itsCabin.__setItsControllerSys(null);
            }
        __setItsCabin(p_Cabin);
    }
    
    //## auto_generated 
    public void setItsCabin(Cabin p_Cabin) {
        if(p_Cabin != null)
            {
                p_Cabin._setItsControllerSys(this);
            }
        _setItsCabin(p_Cabin);
    }
    
    //## auto_generated 
    public void _clearItsCabin() {
        animInstance().notifyRelationCleared("itsCabin");
        itsCabin = null;
    }
    
    //## auto_generated 
    public Door getItsDoor() {
        return itsDoor;
    }
    
    //## auto_generated 
    public void __setItsDoor(Door p_Door) {
        itsDoor = p_Door;
        if(p_Door != null)
            {
                animInstance().notifyRelationAdded("itsDoor", p_Door);
            }
        else
            {
                animInstance().notifyRelationCleared("itsDoor");
            }
    }
    
    //## auto_generated 
    public void _setItsDoor(Door p_Door) {
        if(itsDoor != null)
            {
                itsDoor.__setItsControllerSys(null);
            }
        __setItsDoor(p_Door);
    }
    
    //## auto_generated 
    public void setItsDoor(Door p_Door) {
        if(p_Door != null)
            {
                p_Door._setItsControllerSys(this);
            }
        _setItsDoor(p_Door);
    }
    
    //## auto_generated 
    public void _clearItsDoor() {
        animInstance().notifyRelationCleared("itsDoor");
        itsDoor = null;
    }
    
    //## auto_generated 
    public Winch getItsWinch() {
        return itsWinch;
    }
    
    //## auto_generated 
    public void __setItsWinch(Winch p_Winch) {
        itsWinch = p_Winch;
        if(p_Winch != null)
            {
                animInstance().notifyRelationAdded("itsWinch", p_Winch);
            }
        else
            {
                animInstance().notifyRelationCleared("itsWinch");
            }
    }
    
    //## auto_generated 
    public void _setItsWinch(Winch p_Winch) {
        if(itsWinch != null)
            {
                itsWinch.__setItsControllerSys(null);
            }
        __setItsWinch(p_Winch);
    }
    
    //## auto_generated 
    public void setItsWinch(Winch p_Winch) {
        if(p_Winch != null)
            {
                p_Winch._setItsControllerSys(this);
            }
        _setItsWinch(p_Winch);
    }
    
    //## auto_generated 
    public void _clearItsWinch() {
        animInstance().notifyRelationCleared("itsWinch");
        itsWinch = null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_con_btn = newP_con_btn();
        p_con_sen = newP_con_sen();
        p_con_door = newP_con_door();
        p_con_win = newP_con_win();
        p_con_cab = newP_con_cab();
        p_con_sen_1 = newP_con_sen_1();
        p_con_sen_2 = newP_con_sen_2();
        p_con_sen_3 = newP_con_sen_3();
        p_con_sen_4 = newP_con_sen_4();
        if(getP_con_btn() != null)
           getP_con_btn().connectControllerSys(this);
        if(getP_con_sen() != null)
           getP_con_sen().connectControllerSys(this);
        if(getP_con_door() != null)
           getP_con_door().connectControllerSys(this);
        if(getP_con_win() != null)
           getP_con_win().connectControllerSys(this);
        if(getP_con_cab() != null)
           getP_con_cab().connectControllerSys(this);
        if(getP_con_sen_1() != null)
           getP_con_sen_1().connectControllerSys(this);
        if(getP_con_sen_2() != null)
           getP_con_sen_2().connectControllerSys(this);
        if(getP_con_sen_3() != null)
           getP_con_sen_3().connectControllerSys(this);
        if(getP_con_sen_4() != null)
           getP_con_sen_4().connectControllerSys(this);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
        if(done)
            {
                start();
            }
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive implements AnimatedReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
            initStatechart();
        }
        
        //## statechart_method 
        public boolean isIn(int state) {
            if(rootState_subState == state)
                {
                    return true;
                }
            return false;
        }
        
        //## statechart_method 
        public boolean isCompleted(int state) {
            return true;
        }
        
        //## statechart_method 
        public void rootState_add(AnimStates animStates) {
            animStates.add("ROOT");
            switch (rootState_subState) {
                case Wait_ControllerSys:
                {
                    Wait_ControllerSys_add(animStates);
                }
                break;
                case cabinMoved_ControllerSys:
                {
                    cabinMoved_ControllerSys_add(animStates);
                }
                break;
                case cabinArrived_ControllerSys:
                {
                    cabinArrived_ControllerSys_add(animStates);
                }
                break;
                case doorOpened_ControllerSys:
                {
                    doorOpened_ControllerSys_add(animStates);
                }
                break;
                case doorClosed_ControllerSys:
                {
                    doorClosed_ControllerSys_add(animStates);
                }
                break;
                case receiveRequestFromButtonEx_ControllerSys:
                {
                    receiveRequestFromButtonEx_ControllerSys_add(animStates);
                }
                break;
                case cabinBraked_ControllerSys:
                {
                    cabinBraked_ControllerSys_add(animStates);
                }
                break;
                case recievedRequestFromCabin_ControllerSys:
                {
                    recievedRequestFromCabin_ControllerSys_add(animStates);
                }
                break;
                case waitDoorClosed_ControllerSys:
                {
                    waitDoorClosed_ControllerSys_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void rootState_entDef() {
            {
                rootState_enter();
                rootStateEntDef();
            }
        }
        
        //## statechart_method 
        public int rootState_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (rootState_active) {
                case Wait_ControllerSys:
                {
                    res = Wait_ControllerSys_takeEvent(id);
                }
                break;
                case cabinMoved_ControllerSys:
                {
                    res = cabinMoved_ControllerSys_takeEvent(id);
                }
                break;
                case cabinArrived_ControllerSys:
                {
                    res = cabinArrived_ControllerSys_takeEvent(id);
                }
                break;
                case doorOpened_ControllerSys:
                {
                    res = doorOpened_ControllerSys_takeEvent(id);
                }
                break;
                case doorClosed_ControllerSys:
                {
                    res = doorClosed_ControllerSys_takeEvent(id);
                }
                break;
                case receiveRequestFromButtonEx_ControllerSys:
                {
                    res = receiveRequestFromButtonEx_ControllerSys_takeEvent(id);
                }
                break;
                case cabinBraked_ControllerSys:
                {
                    res = cabinBraked_ControllerSys_takeEvent(id);
                }
                break;
                case recievedRequestFromCabin_ControllerSys:
                {
                    res = recievedRequestFromCabin_ControllerSys_takeEvent(id);
                }
                break;
                case waitDoorClosed_ControllerSys:
                {
                    res = waitDoorClosed_ControllerSys_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void waitDoorClosed_ControllerSys_add(AnimStates animStates) {
            animStates.add("ROOT.waitDoorClosed_ControllerSys");
        }
        
        //## statechart_method 
        public void Wait_ControllerSys_add(AnimStates animStates) {
            animStates.add("ROOT.Wait_ControllerSys");
        }
        
        //## statechart_method 
        public void recievedRequestFromCabin_ControllerSys_add(AnimStates animStates) {
            animStates.add("ROOT.recievedRequestFromCabin_ControllerSys");
        }
        
        //## statechart_method 
        public void receiveRequestFromButtonEx_ControllerSys_add(AnimStates animStates) {
            animStates.add("ROOT.receiveRequestFromButtonEx_ControllerSys");
        }
        
        //## statechart_method 
        public void doorOpened_ControllerSys_add(AnimStates animStates) {
            animStates.add("ROOT.doorOpened_ControllerSys");
        }
        
        //## statechart_method 
        public void doorClosed_ControllerSys_add(AnimStates animStates) {
            animStates.add("ROOT.doorClosed_ControllerSys");
        }
        
        //## statechart_method 
        public void cabinMoved_ControllerSys_add(AnimStates animStates) {
            animStates.add("ROOT.cabinMoved_ControllerSys");
        }
        
        //## statechart_method 
        public void cabinBraked_ControllerSys_add(AnimStates animStates) {
            animStates.add("ROOT.cabinBraked_ControllerSys");
        }
        
        //## statechart_method 
        public void cabinArrived_ControllerSys_add(AnimStates animStates) {
            animStates.add("ROOT.cabinArrived_ControllerSys");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int cabinArrived_ControllerSys_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(braked.braked_Ascenseur_id))
                {
                    res = cabinArrived_ControllerSysTakebraked();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void cabinArrived_ControllerSys_exit() {
            cabinArrived_ControllerSysExit();
            animInstance().notifyStateExited("ROOT.cabinArrived_ControllerSys");
        }
        
        //## statechart_method 
        public int cabinMoved_ControllerSys_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(continueToMove.continueToMove_Ascenseur_id))
                {
                    res = cabinMoved_ControllerSysTakecontinueToMove();
                }
            else if(event.isTypeOf(detected.detected_Ascenseur_id))
                {
                    res = cabinMoved_ControllerSysTakedetected();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int cabinMoved_ControllerSysTakedetected() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            cabinMoved_ControllerSys_exit();
            //#[ transition 1 
            sendStopToWinch();   
            genFiacre1();
            //#]
            cabinArrived_ControllerSys_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void cabinMoved_ControllerSys_enter() {
            animInstance().notifyStateEntered("ROOT.cabinMoved_ControllerSys");
            rootState_subState = cabinMoved_ControllerSys;
            rootState_active = cabinMoved_ControllerSys;
            cabinMoved_ControllerSysEnter();
        }
        
        //## statechart_method 
        public void doorClosed_ControllerSys_enter() {
            animInstance().notifyStateEntered("ROOT.doorClosed_ControllerSys");
            rootState_subState = doorClosed_ControllerSys;
            rootState_active = doorClosed_ControllerSys;
            doorClosed_ControllerSysEnter();
        }
        
        //## statechart_method 
        public void recievedRequestFromCabin_ControllerSysExit() {
        }
        
        //## statechart_method 
        public void waitDoorClosed_ControllerSysEnter() {
        }
        
        //## statechart_method 
        public void doorClosed_ControllerSys_entDef() {
            doorClosed_ControllerSys_enter();
        }
        
        //## statechart_method 
        public void receiveRequestFromButtonEx_ControllerSys_enter() {
            animInstance().notifyStateEntered("ROOT.receiveRequestFromButtonEx_ControllerSys");
            rootState_subState = receiveRequestFromButtonEx_ControllerSys;
            rootState_active = receiveRequestFromButtonEx_ControllerSys;
            receiveRequestFromButtonEx_ControllerSysEnter();
        }
        
        //## statechart_method 
        public int recievedRequestFromCabin_ControllerSysTakegotoOpenDoorDirectly() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("11");
            recievedRequestFromCabin_ControllerSys_exit();
            //#[ transition 11 
            gen(new readyToOpenDoor());                 
            genFiacre11();
            //#]
            cabinBraked_ControllerSys_entDef();
            animInstance().notifyTransitionEnded("11");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int cabinBraked_ControllerSys_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(readyToOpenDoor.readyToOpenDoor_Ascenseur_id))
                {
                    res = cabinBraked_ControllerSysTakereadyToOpenDoor();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int receiveRequestFromButtonEx_ControllerSys_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(receiveCabinMoved.receiveCabinMoved_Ascenseur_id))
                {
                    res = receiveRequestFromButtonEx_ControllerSysTakereceiveCabinMoved();
                }
            else if(event.isTypeOf(gotoOpenDoorDirectly.gotoOpenDoorDirectly_Ascenseur_id))
                {
                    res = receiveRequestFromButtonEx_ControllerSysTakegotoOpenDoorDirectly();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int Wait_ControllerSys_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(receiveFromButton_Ex.receiveFromButton_Ex_Ascenseur_id))
                {
                    res = Wait_ControllerSysTakereceiveFromButton_Ex();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int waitDoorClosed_ControllerSys_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(readyToGo.readyToGo_Ascenseur_id))
                {
                    res = waitDoorClosed_ControllerSysTakereadyToGo();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void cabinMoved_ControllerSysExit() {
        }
        
        //## statechart_method 
        public int receiveRequestFromButtonEx_ControllerSysTakereceiveCabinMoved() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            receiveRequestFromButtonEx_ControllerSys_exit();
            //#[ transition 6 
            currentFloor+=upordown;   
            sendToMeasureSensor(destFloor);       
            genFiacre6();
            //#]
            cabinMoved_ControllerSys_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Wait_ControllerSys_entDef() {
            Wait_ControllerSys_enter();
        }
        
        //## statechart_method 
        public void waitDoorClosed_ControllerSys_exit() {
            waitDoorClosed_ControllerSysExit();
            animInstance().notifyStateExited("ROOT.waitDoorClosed_ControllerSys");
        }
        
        //## statechart_method 
        public void cabinMoved_ControllerSysEnter() {
        }
        
        //## statechart_method 
        public int doorClosed_ControllerSys_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(doneTask.doneTask_Ascenseur_id))
                {
                    res = doorClosed_ControllerSysTakedoneTask();
                }
            else if(event.isTypeOf(readyToGo.readyToGo_Ascenseur_id))
                {
                    res = doorClosed_ControllerSysTakereadyToGo();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Wait_ControllerSysExit() {
        }
        
        //## statechart_method 
        public void cabinArrived_ControllerSys_enter() {
            animInstance().notifyStateEntered("ROOT.cabinArrived_ControllerSys");
            rootState_subState = cabinArrived_ControllerSys;
            rootState_active = cabinArrived_ControllerSys;
            cabinArrived_ControllerSysEnter();
        }
        
        //## statechart_method 
        public void cabinBraked_ControllerSysEnter() {
        }
        
        //## statechart_method 
        public int doorOpened_ControllerSysTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 13 
            if(loadedPassager)
                {
                    animInstance().notifyTransitionStarted("13");
                    doorOpened_ControllerSys_exit();
                    //#[ transition 13 
                    closeDoor();     
                    genFiacre13();
                    //#]
                    waitDoorClosed_ControllerSys_entDef();
                    animInstance().notifyTransitionEnded("13");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Wait_ControllerSys_enter() {
            animInstance().notifyStateEntered("ROOT.Wait_ControllerSys");
            rootState_subState = Wait_ControllerSys;
            rootState_active = Wait_ControllerSys;
            Wait_ControllerSysEnter();
        }
        
        //## statechart_method 
        public int doorClosed_ControllerSysTakedoneTask() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("12");
            doorClosed_ControllerSys_exit();
            //#[ transition 12 
            loadedPassager=false;         
            genFiacre12();
            //#]
            Wait_ControllerSys_entDef();
            animInstance().notifyTransitionEnded("12");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void doorClosed_ControllerSysEnter() {
        }
        
        //## statechart_method 
        public void doorOpened_ControllerSysExit() {
        }
        
        //## statechart_method 
        public void receiveRequestFromButtonEx_ControllerSysExit() {
        }
        
        //## statechart_method 
        public void recievedRequestFromCabin_ControllerSysEnter() {
        }
        
        //## statechart_method 
        public int Wait_ControllerSysTakereceiveFromButton_Ex() {
            receiveFromButton_Ex params = (receiveFromButton_Ex) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            Wait_ControllerSys_exit();
            //#[ transition 5 
            exBtnFloor=params.requestFloor;       
            destFloor=exBtnFloor;
            if (currentFloor < exBtnFloor){
            	getP_con_win().gen(new goUp());   
            	upordown=1;  
            	sendToMeasureSensor(exBtnFloor);
            }else{
            	if (currentFloor == exBtnFloor) {
            		//open the door         
            		gen (new gotoOpenDoorDirectly());
            	}else{
            		getP_con_win().gen(new goDown()); 
            		upordown=-1;  
            		sendToMeasureSensor(exBtnFloor);
            	}
            }    
            genFiacre5();
            //#]
            receiveRequestFromButtonEx_ControllerSys_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void cabinMoved_ControllerSys_exit() {
            cabinMoved_ControllerSysExit();
            animInstance().notifyStateExited("ROOT.cabinMoved_ControllerSys");
        }
        
        //## statechart_method 
        public int doorOpened_ControllerSys_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(receiveFloorAndCloseDoor.receiveFloorAndCloseDoor_Ascenseur_id))
                {
                    res = doorOpened_ControllerSysTakereceiveFloorAndCloseDoor();
                }
            else if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = doorOpened_ControllerSysTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void doorOpened_ControllerSysEnter() {
        }
        
        //## statechart_method 
        public void cabinBraked_ControllerSys_exit() {
            cabinBraked_ControllerSysExit();
            animInstance().notifyStateExited("ROOT.cabinBraked_ControllerSys");
        }
        
        //## statechart_method 
        public void cabinMoved_ControllerSys_entDef() {
            cabinMoved_ControllerSys_enter();
        }
        
        //## statechart_method 
        public void doorOpened_ControllerSys_enter() {
            animInstance().notifyStateEntered("ROOT.doorOpened_ControllerSys");
            pushNullConfig();
            rootState_subState = doorOpened_ControllerSys;
            rootState_active = doorOpened_ControllerSys;
            doorOpened_ControllerSysEnter();
        }
        
        //## statechart_method 
        public void waitDoorClosed_ControllerSysExit() {
        }
        
        //## statechart_method 
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void cabinBraked_ControllerSys_entDef() {
            cabinBraked_ControllerSys_enter();
        }
        
        //## statechart_method 
        public void doorClosed_ControllerSys_exit() {
            doorClosed_ControllerSysExit();
            animInstance().notifyStateExited("ROOT.doorClosed_ControllerSys");
        }
        
        //## statechart_method 
        public void recievedRequestFromCabin_ControllerSys_exit() {
            recievedRequestFromCabin_ControllerSysExit();
            animInstance().notifyStateExited("ROOT.recievedRequestFromCabin_ControllerSys");
        }
        
        //## statechart_method 
        public int cabinMoved_ControllerSysTakecontinueToMove() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            cabinMoved_ControllerSys_exit();
            //#[ transition 9 
            currentFloor+=upordown;   
            sendToMeasureSensor(destFloor);     
            genFiacre9();
            //#]
            cabinMoved_ControllerSys_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int doorOpened_ControllerSysTakereceiveFloorAndCloseDoor() {
            receiveFloorAndCloseDoor params = (receiveFloorAndCloseDoor) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            doorOpened_ControllerSys_exit();
            //#[ transition 3 
            closeDoor();
            targetFloor=params.requestedTargetFloor;    
            destFloor=targetFloor;     
            genFiacre3();
            //#]
            doorClosed_ControllerSys_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void doorOpened_ControllerSys_exit() {
            popNullConfig();
            doorOpened_ControllerSysExit();
            animInstance().notifyStateExited("ROOT.doorOpened_ControllerSys");
        }
        
        //## statechart_method 
        public void receiveRequestFromButtonEx_ControllerSys_entDef() {
            receiveRequestFromButtonEx_ControllerSys_enter();
        }
        
        //## statechart_method 
        public int recievedRequestFromCabin_ControllerSys_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(receiveCabinMoved.receiveCabinMoved_Ascenseur_id))
                {
                    res = recievedRequestFromCabin_ControllerSysTakereceiveCabinMoved();
                }
            else if(event.isTypeOf(gotoOpenDoorDirectly.gotoOpenDoorDirectly_Ascenseur_id))
                {
                    res = recievedRequestFromCabin_ControllerSysTakegotoOpenDoorDirectly();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void waitDoorClosed_ControllerSys_entDef() {
            waitDoorClosed_ControllerSys_enter();
        }
        
        //## statechart_method 
        public void receiveRequestFromButtonEx_ControllerSysEnter() {
        }
        
        //## statechart_method 
        public void recievedRequestFromCabin_ControllerSys_entDef() {
            recievedRequestFromCabin_ControllerSys_enter();
        }
        
        //## statechart_method 
        public int waitDoorClosed_ControllerSysTakereadyToGo() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("14");
            waitDoorClosed_ControllerSys_exit();
            //#[ transition 14 
            gen(new doneTask());       
            genFiacre14();
            //#]
            doorClosed_ControllerSys_entDef();
            animInstance().notifyTransitionEnded("14");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Wait_ControllerSys_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void cabinBraked_ControllerSys_enter() {
            animInstance().notifyStateEntered("ROOT.cabinBraked_ControllerSys");
            rootState_subState = cabinBraked_ControllerSys;
            rootState_active = cabinBraked_ControllerSys;
            cabinBraked_ControllerSysEnter();
        }
        
        //## statechart_method 
        public int doorClosed_ControllerSysTakereadyToGo() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            doorClosed_ControllerSys_exit();
            //#[ transition 4 
            if (currentFloor < targetFloor){
            	getP_con_win().gen(new goUp());   
            	upordown=1; 
            	
            	sendToMeasureSensor(targetFloor);
            }else{
            	if (currentFloor == targetFloor) {
            		//open the door         
            		gen (new gotoOpenDoorDirectly());
            	}else{
            		getP_con_win().gen(new goDown()); 
            		upordown=-1;  
            		
            		sendToMeasureSensor(targetFloor);
            	}
            } 
            genFiacre4();
            //#]
            recievedRequestFromCabin_ControllerSys_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void recievedRequestFromCabin_ControllerSys_enter() {
            animInstance().notifyStateEntered("ROOT.recievedRequestFromCabin_ControllerSys");
            rootState_subState = recievedRequestFromCabin_ControllerSys;
            rootState_active = recievedRequestFromCabin_ControllerSys;
            recievedRequestFromCabin_ControllerSysEnter();
        }
        
        //## statechart_method 
        public void cabinArrived_ControllerSysExit() {
        }
        
        //## statechart_method 
        public void cabinArrived_ControllerSys_entDef() {
            cabinArrived_ControllerSys_enter();
        }
        
        //## statechart_method 
        public void doorOpened_ControllerSys_entDef() {
            doorOpened_ControllerSys_enter();
        }
        
        //## statechart_method 
        public void receiveRequestFromButtonEx_ControllerSys_exit() {
            receiveRequestFromButtonEx_ControllerSysExit();
            animInstance().notifyStateExited("ROOT.receiveRequestFromButtonEx_ControllerSys");
        }
        
        //## statechart_method 
        public void Wait_ControllerSysEnter() {
        }
        
        //## statechart_method 
        public void cabinArrived_ControllerSysEnter() {
        }
        
        //## statechart_method 
        public int recievedRequestFromCabin_ControllerSysTakereceiveCabinMoved() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("10");
            recievedRequestFromCabin_ControllerSys_exit();
            //#[ transition 10 
            currentFloor+=upordown;   
            loadedPassager=true;        
            sendToMeasureSensor(destFloor);      
            genFiacre10();
            //#]
            cabinMoved_ControllerSys_entDef();
            animInstance().notifyTransitionEnded("10");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int cabinBraked_ControllerSysTakereadyToOpenDoor() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            cabinBraked_ControllerSys_exit();
            //#[ transition 2 
             openDoor();
             genFiacre2();
            //#]
            doorOpened_ControllerSys_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void cabinBraked_ControllerSysExit() {
        }
        
        //## statechart_method 
        public int receiveRequestFromButtonEx_ControllerSysTakegotoOpenDoorDirectly() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            receiveRequestFromButtonEx_ControllerSys_exit();
            //#[ transition 8 
            gen (new readyToOpenDoor());    
            genFiacre8();
            //#]
            cabinBraked_ControllerSys_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void waitDoorClosed_ControllerSys_enter() {
            animInstance().notifyStateEntered("ROOT.waitDoorClosed_ControllerSys");
            rootState_subState = waitDoorClosed_ControllerSys;
            rootState_active = waitDoorClosed_ControllerSys;
            waitDoorClosed_ControllerSysEnter();
        }
        
        //## statechart_method 
        public int cabinArrived_ControllerSysTakebraked() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            cabinArrived_ControllerSys_exit();
            //#[ transition 7 
            sendToWinchToStop();     
            genFiacre7();
            //#]
            cabinBraked_ControllerSys_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void doorClosed_ControllerSysExit() {
        }
        
        //## statechart_method 
        public void Wait_ControllerSys_exit() {
            Wait_ControllerSysExit();
            animInstance().notifyStateExited("ROOT.Wait_ControllerSys");
        }
        
        /**  methods added just for design level debugging instrumentation */
        public boolean startBehavior() {
            try {
              animInstance().notifyBehavioralMethodEntered("startBehavior",
                  new ArgData[] {
                   });
              return super.startBehavior();
            }
            finally {
              animInstance().notifyMethodExit();
            }
        }
        public int takeEvent(RiJEvent event) { 
            try { 
              //animInstance().notifyTakeEvent(new AnimEvent(event));
              animInstance().notifyBehavioralMethodEntered("takeEvent",
                  new ArgData[] { new ArgData(RiJEvent.class, "event", event.toString())
                   });
              return super.takeEvent(event); 
            }
            finally { 
              animInstance().notifyMethodExit();
            }
        }
        /**  see com.ibm.rational.rhapsody.animation.AnimatedReactive interface */
        public AnimInstance animInstance() { 
            return ControllerSys.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_con_btn_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_con_btn_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectControllerSys(ControllerSys) 
        public void connectControllerSys(ControllerSys part) {
            //#[ operation connectControllerSys(ControllerSys) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_con_sen_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_con_sen_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectControllerSys(ControllerSys) 
        public void connectControllerSys(ControllerSys part) {
            //#[ operation connectControllerSys(ControllerSys) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_con_door_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_con_door_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectControllerSys(ControllerSys) 
        public void connectControllerSys(ControllerSys part) {
            //#[ operation connectControllerSys(ControllerSys) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_con_win_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_con_win_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectControllerSys(ControllerSys) 
        public void connectControllerSys(ControllerSys part) {
            //#[ operation connectControllerSys(ControllerSys) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_con_cab_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_con_cab_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectControllerSys(ControllerSys) 
        public void connectControllerSys(ControllerSys part) {
            //#[ operation connectControllerSys(ControllerSys) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_con_sen_1_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_con_sen_1_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectControllerSys(ControllerSys) 
        public void connectControllerSys(ControllerSys part) {
            //#[ operation connectControllerSys(ControllerSys) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_con_sen_2_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_con_sen_2_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectControllerSys(ControllerSys) 
        public void connectControllerSys(ControllerSys part) {
            //#[ operation connectControllerSys(ControllerSys) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_con_sen_3_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_con_sen_3_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectControllerSys(ControllerSys) 
        public void connectControllerSys(ControllerSys part) {
            //#[ operation connectControllerSys(ControllerSys) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_con_sen_4_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_con_sen_4_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectControllerSys(ControllerSys) 
        public void connectControllerSys(ControllerSys part) {
            //#[ operation connectControllerSys(ControllerSys) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassControllerSys; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
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
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
        msg.add("exBtnFloor", exBtnFloor);
        msg.add("currentFloor", currentFloor);
        msg.add("isBusy", isBusy);
        msg.add("upordown", upordown);
        msg.add("targetFloor", targetFloor);
        msg.add("destFloor", destFloor);
        msg.add("loadedPassager", loadedPassager);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsButton_ex", false, true, itsButton_ex);
        msg.add("itsWinch", false, true, itsWinch);
        msg.add("itsDoor", false, true, itsDoor);
        msg.add("itsCabin", false, true, itsCabin);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(ControllerSys.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            ControllerSys.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            ControllerSys.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/ControllerSys.java
*********************************************************************/

