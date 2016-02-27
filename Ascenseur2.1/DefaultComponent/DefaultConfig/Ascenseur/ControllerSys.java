/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ControllerSys
//!	Generated Date	: Sat, 27, Feb 2016 
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
    public static final int waitDoorClosed=1;
    public static final int Wait=2;
    public static final int recievedRequestFromCabin=3;
    public static final int receiveRequestFromButtonEx=4;
    public static final int doorOpened=5;
    public static final int doorClosed=6;
    public static final int cabinMoved=7;
    public static final int cabinBraked=8;
    public static final int cabinArrived=9;
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
     * detected 
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
     * receiveCabinMoved    (s: recievedRequestFromCabin, t: cabinMoved)
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
    
    /**
     * gotoOpenDoorDirectly    (s: recievedRequestFromCabin, t: cabinBraked )
    */
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
    
    /**
     * doneTask
    */
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
     * [loadedPassager]
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
     * readyToGo      (s: waitDoorClosed, t:  doorClosed)
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
     * readyToOpenDoor
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
     *  receiveFloorAndCloseDoor
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
     * readyToGo    (s : doorClosed, t : recievedRequestFromCabin) 
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
     * receiveFromButton_Ex !  requestFloor;
     * exBtnFloor := requestFloor;
     * destFloor := exBtnFloor;
     * if (currentFloor < exBtnFloor) then
     * 	p_con_win_ goUp;   
     * 	upordown :=1 ;  
     * 	sendToMeasureSensor ! exBtnFloor;
     * else
     * 	
     * 	getP_con_win().gen(new goDown()); 
     * 	upordown :=-1;  
     *                sendToMeasureSensor ! exBtnFloor;
     * end;
     * to ReceiveRequestFromButtonEx
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
     * receiveCabinMoved     (s: receiveRequestFromButtonEx, t: cabinMoved )
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
     * braked
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
     * //getP_con_door().gen (new OpenDoor());
     *                 p_con_door_OpenDoor;
     * 	to doorOpened
     * end;
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
     * continueToMove
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
                case Wait:
                {
                    Wait_add(animStates);
                }
                break;
                case cabinMoved:
                {
                    cabinMoved_add(animStates);
                }
                break;
                case cabinArrived:
                {
                    cabinArrived_add(animStates);
                }
                break;
                case doorOpened:
                {
                    doorOpened_add(animStates);
                }
                break;
                case doorClosed:
                {
                    doorClosed_add(animStates);
                }
                break;
                case receiveRequestFromButtonEx:
                {
                    receiveRequestFromButtonEx_add(animStates);
                }
                break;
                case cabinBraked:
                {
                    cabinBraked_add(animStates);
                }
                break;
                case recievedRequestFromCabin:
                {
                    recievedRequestFromCabin_add(animStates);
                }
                break;
                case waitDoorClosed:
                {
                    waitDoorClosed_add(animStates);
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
                case Wait:
                {
                    res = Wait_takeEvent(id);
                }
                break;
                case cabinMoved:
                {
                    res = cabinMoved_takeEvent(id);
                }
                break;
                case cabinArrived:
                {
                    res = cabinArrived_takeEvent(id);
                }
                break;
                case doorOpened:
                {
                    res = doorOpened_takeEvent(id);
                }
                break;
                case doorClosed:
                {
                    res = doorClosed_takeEvent(id);
                }
                break;
                case receiveRequestFromButtonEx:
                {
                    res = receiveRequestFromButtonEx_takeEvent(id);
                }
                break;
                case cabinBraked:
                {
                    res = cabinBraked_takeEvent(id);
                }
                break;
                case recievedRequestFromCabin:
                {
                    res = recievedRequestFromCabin_takeEvent(id);
                }
                break;
                case waitDoorClosed:
                {
                    res = waitDoorClosed_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void waitDoorClosed_add(AnimStates animStates) {
            animStates.add("ROOT.waitDoorClosed");
        }
        
        //## statechart_method 
        public void Wait_add(AnimStates animStates) {
            animStates.add("ROOT.Wait");
        }
        
        //## statechart_method 
        public void recievedRequestFromCabin_add(AnimStates animStates) {
            animStates.add("ROOT.recievedRequestFromCabin");
        }
        
        //## statechart_method 
        public void receiveRequestFromButtonEx_add(AnimStates animStates) {
            animStates.add("ROOT.receiveRequestFromButtonEx");
        }
        
        //## statechart_method 
        public void doorOpened_add(AnimStates animStates) {
            animStates.add("ROOT.doorOpened");
        }
        
        //## statechart_method 
        public void doorClosed_add(AnimStates animStates) {
            animStates.add("ROOT.doorClosed");
        }
        
        //## statechart_method 
        public void cabinMoved_add(AnimStates animStates) {
            animStates.add("ROOT.cabinMoved");
        }
        
        //## statechart_method 
        public void cabinBraked_add(AnimStates animStates) {
            animStates.add("ROOT.cabinBraked");
        }
        
        //## statechart_method 
        public void cabinArrived_add(AnimStates animStates) {
            animStates.add("ROOT.cabinArrived");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int doorClosedTakereadyToGo() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            doorClosed_exit();
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
            recievedRequestFromCabin_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void doorOpenedEnter() {
        }
        
        //## statechart_method 
        public void recievedRequestFromCabin_entDef() {
            recievedRequestFromCabin_enter();
        }
        
        //## statechart_method 
        public int waitDoorClosed_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(readyToGo.readyToGo_Ascenseur_id))
                {
                    res = waitDoorClosedTakereadyToGo();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void cabinMoved_entDef() {
            cabinMoved_enter();
        }
        
        //## statechart_method 
        public int receiveRequestFromButtonExTakegotoOpenDoorDirectly() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            receiveRequestFromButtonEx_exit();
            //#[ transition 8 
            System.out.println("ready to open"); 
            gen (new readyToOpenDoor());    
            genFiacre8();
            //#]
            cabinBraked_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void receiveRequestFromButtonExEnter() {
        }
        
        //## statechart_method 
        public void receiveRequestFromButtonEx_entDef() {
            receiveRequestFromButtonEx_enter();
        }
        
        //## statechart_method 
        public void recievedRequestFromCabin_exit() {
            recievedRequestFromCabinExit();
            animInstance().notifyStateExited("ROOT.recievedRequestFromCabin");
        }
        
        //## statechart_method 
        public void recievedRequestFromCabin_enter() {
            animInstance().notifyStateEntered("ROOT.recievedRequestFromCabin");
            rootState_subState = recievedRequestFromCabin;
            rootState_active = recievedRequestFromCabin;
            recievedRequestFromCabinEnter();
        }
        
        //## statechart_method 
        public void cabinArrived_exit() {
            cabinArrivedExit();
            animInstance().notifyStateExited("ROOT.cabinArrived");
        }
        
        //## statechart_method 
        public int receiveRequestFromButtonEx_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(receiveCabinMoved.receiveCabinMoved_Ascenseur_id))
                {
                    res = receiveRequestFromButtonExTakereceiveCabinMoved();
                }
            else if(event.isTypeOf(gotoOpenDoorDirectly.gotoOpenDoorDirectly_Ascenseur_id))
                {
                    res = receiveRequestFromButtonExTakegotoOpenDoorDirectly();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void waitDoorClosed_exit() {
            waitDoorClosedExit();
            animInstance().notifyStateExited("ROOT.waitDoorClosed");
        }
        
        //## statechart_method 
        public int doorClosed_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(doneTask.doneTask_Ascenseur_id))
                {
                    res = doorClosedTakedoneTask();
                }
            else if(event.isTypeOf(readyToGo.readyToGo_Ascenseur_id))
                {
                    res = doorClosedTakereadyToGo();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void doorOpened_exit() {
            popNullConfig();
            doorOpenedExit();
            animInstance().notifyStateExited("ROOT.doorOpened");
        }
        
        //## statechart_method 
        public void waitDoorClosed_entDef() {
            waitDoorClosed_enter();
        }
        
        //## statechart_method 
        public int cabinBraked_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(readyToOpenDoor.readyToOpenDoor_Ascenseur_id))
                {
                    res = cabinBrakedTakereadyToOpenDoor();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void cabinMovedExit() {
        }
        
        //## statechart_method 
        public void doorOpened_entDef() {
            doorOpened_enter();
        }
        
        //## statechart_method 
        public void receiveRequestFromButtonEx_exit() {
            receiveRequestFromButtonExExit();
            animInstance().notifyStateExited("ROOT.receiveRequestFromButtonEx");
        }
        
        //## statechart_method 
        public void recievedRequestFromCabinExit() {
        }
        
        //## statechart_method 
        public int Wait_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(receiveFromButton_Ex.receiveFromButton_Ex_Ascenseur_id))
                {
                    res = WaitTakereceiveFromButton_Ex();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int cabinBrakedTakereadyToOpenDoor() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            cabinBraked_exit();
            //#[ transition 2 
             openDoor();
             genFiacre2();
            //#]
            doorOpened_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void doorClosed_entDef() {
            doorClosed_enter();
        }
        
        //## statechart_method 
        public int receiveRequestFromButtonExTakereceiveCabinMoved() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            receiveRequestFromButtonEx_exit();
            //#[ transition 6 
            currentFloor+=upordown;   
            sendToMeasureSensor(destFloor);       
            genFiacre6();
            //#]
            cabinMoved_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int cabinArrivedTakebraked() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            cabinArrived_exit();
            //#[ transition 7 
            sendToWinchToStop();     
            genFiacre7();
            //#]
            cabinBraked_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void cabinBrakedEnter() {
        }
        
        //## statechart_method 
        public void receiveRequestFromButtonEx_enter() {
            animInstance().notifyStateEntered("ROOT.receiveRequestFromButtonEx");
            rootState_subState = receiveRequestFromButtonEx;
            rootState_active = receiveRequestFromButtonEx;
            receiveRequestFromButtonExEnter();
        }
        
        //## statechart_method 
        public int recievedRequestFromCabinTakereceiveCabinMoved() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("10");
            recievedRequestFromCabin_exit();
            //#[ transition 10 
            currentFloor+=upordown;   
            loadedPassager=true;        
            sendToMeasureSensor(destFloor);      
            genFiacre10();
            //#]
            cabinMoved_entDef();
            animInstance().notifyTransitionEnded("10");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void WaitExit() {
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int cabinArrived_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(braked.braked_Ascenseur_id))
                {
                    res = cabinArrivedTakebraked();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int cabinMoved_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(continueToMove.continueToMove_Ascenseur_id))
                {
                    res = cabinMovedTakecontinueToMove();
                }
            else if(event.isTypeOf(detected.detected_Ascenseur_id))
                {
                    res = cabinMovedTakedetected();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int WaitTakereceiveFromButton_Ex() {
            receiveFromButton_Ex params = (receiveFromButton_Ex) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            Wait_exit();
            //#[ transition 5 
            exBtnFloor=params.requestedFloor;       
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
            receiveRequestFromButtonEx_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void waitDoorClosedExit() {
        }
        
        //## statechart_method 
        public void cabinMovedEnter() {
        }
        
        //## statechart_method 
        public void doorClosedEnter() {
        }
        
        //## statechart_method 
        public int recievedRequestFromCabinTakegotoOpenDoorDirectly() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("11");
            recievedRequestFromCabin_exit();
            //#[ transition 11 
            gen(new readyToOpenDoor());                 
            genFiacre11();
            //#]
            cabinBraked_entDef();
            animInstance().notifyTransitionEnded("11");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
        public void cabinArrivedExit() {
        }
        
        //## statechart_method 
        public void cabinBraked_exit() {
            cabinBrakedExit();
            animInstance().notifyStateExited("ROOT.cabinBraked");
        }
        
        //## statechart_method 
        public void cabinBraked_entDef() {
            cabinBraked_enter();
        }
        
        //## statechart_method 
        public void Wait_enter() {
            animInstance().notifyStateEntered("ROOT.Wait");
            rootState_subState = Wait;
            rootState_active = Wait;
            WaitEnter();
        }
        
        //## statechart_method 
        public int waitDoorClosedTakereadyToGo() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("14");
            waitDoorClosed_exit();
            //#[ transition 14 
            gen(new doneTask());       
            genFiacre14();
            //#]
            doorClosed_entDef();
            animInstance().notifyTransitionEnded("14");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void cabinArrived_entDef() {
            cabinArrived_enter();
        }
        
        //## statechart_method 
        public int cabinMovedTakedetected() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            cabinMoved_exit();
            //#[ transition 1 
            sendStopToWinch();   
            genFiacre1();
            //#]
            cabinArrived_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void cabinMoved_exit() {
            cabinMovedExit();
            animInstance().notifyStateExited("ROOT.cabinMoved");
        }
        
        //## statechart_method 
        public void cabinMoved_enter() {
            animInstance().notifyStateEntered("ROOT.cabinMoved");
            rootState_subState = cabinMoved;
            rootState_active = cabinMoved;
            cabinMovedEnter();
        }
        
        //## statechart_method 
        public int doorClosedTakedoneTask() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("12");
            doorClosed_exit();
            //#[ transition 12 
            loadedPassager=false;         
            genFiacre12();
            //#]
            Wait_entDef();
            animInstance().notifyTransitionEnded("12");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void doorClosed_exit() {
            doorClosedExit();
            animInstance().notifyStateExited("ROOT.doorClosed");
        }
        
        //## statechart_method 
        public int doorOpenedTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 13 
            if(loadedPassager)
                {
                    animInstance().notifyTransitionStarted("13");
                    doorOpened_exit();
                    //#[ transition 13 
                    closeDoor();     
                    genFiacre13();
                    //#]
                    waitDoorClosed_entDef();
                    animInstance().notifyTransitionEnded("13");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void doorOpenedExit() {
        }
        
        //## statechart_method 
        public void WaitEnter() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Wait_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void cabinBrakedExit() {
        }
        
        //## statechart_method 
        public void doorClosedExit() {
        }
        
        //## statechart_method 
        public int doorOpenedTakereceiveFloorAndCloseDoor() {
            receiveFloorAndCloseDoor params = (receiveFloorAndCloseDoor) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            doorOpened_exit();
            //#[ transition 3 
            closeDoor();
            targetFloor=params.requestedTargetFloor;    
            destFloor=targetFloor;     
            genFiacre3();
            //#]
            doorClosed_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void waitDoorClosed_enter() {
            animInstance().notifyStateEntered("ROOT.waitDoorClosed");
            rootState_subState = waitDoorClosed;
            rootState_active = waitDoorClosed;
            waitDoorClosedEnter();
        }
        
        //## statechart_method 
        public int cabinMovedTakecontinueToMove() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            cabinMoved_exit();
            //#[ transition 9 
            currentFloor+=upordown;   
            sendToMeasureSensor(destFloor);     
            genFiacre9();
            //#]
            cabinMoved_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void doorClosed_enter() {
            animInstance().notifyStateEntered("ROOT.doorClosed");
            rootState_subState = doorClosed;
            rootState_active = doorClosed;
            doorClosedEnter();
        }
        
        //## statechart_method 
        public int doorOpened_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(receiveFloorAndCloseDoor.receiveFloorAndCloseDoor_Ascenseur_id))
                {
                    res = doorOpenedTakereceiveFloorAndCloseDoor();
                }
            else if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = doorOpenedTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int recievedRequestFromCabin_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(receiveCabinMoved.receiveCabinMoved_Ascenseur_id))
                {
                    res = recievedRequestFromCabinTakereceiveCabinMoved();
                }
            else if(event.isTypeOf(gotoOpenDoorDirectly.gotoOpenDoorDirectly_Ascenseur_id))
                {
                    res = recievedRequestFromCabinTakegotoOpenDoorDirectly();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Wait_exit() {
            WaitExit();
            animInstance().notifyStateExited("ROOT.Wait");
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void cabinBraked_enter() {
            animInstance().notifyStateEntered("ROOT.cabinBraked");
            rootState_subState = cabinBraked;
            rootState_active = cabinBraked;
            cabinBrakedEnter();
        }
        
        //## statechart_method 
        public void receiveRequestFromButtonExExit() {
        }
        
        //## statechart_method 
        public void recievedRequestFromCabinEnter() {
        }
        
        //## statechart_method 
        public void cabinArrived_enter() {
            animInstance().notifyStateEntered("ROOT.cabinArrived");
            rootState_subState = cabinArrived;
            rootState_active = cabinArrived;
            cabinArrivedEnter();
        }
        
        //## statechart_method 
        public void cabinArrivedEnter() {
        }
        
        //## statechart_method 
        public void doorOpened_enter() {
            animInstance().notifyStateEntered("ROOT.doorOpened");
            pushNullConfig();
            rootState_subState = doorOpened;
            rootState_active = doorOpened;
            doorOpenedEnter();
        }
        
        //## statechart_method 
        public void Wait_entDef() {
            Wait_enter();
        }
        
        //## statechart_method 
        public void waitDoorClosedEnter() {
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

