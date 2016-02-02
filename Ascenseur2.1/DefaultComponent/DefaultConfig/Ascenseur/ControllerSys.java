/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ControllerSys
//!	Generated Date	: Mon, 30, Nov 2015 
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
    
    protected Button_ex itsButton_ex;		//## link itsButton_ex 
    
    protected Cabin itsCabin;		//## link itsCabin 
    
    protected Door itsDoor;		//## link itsDoor 
    
    protected Sensor itsSensor;		//## link itsSensor 
    
    protected Winch itsWinch;		//## link itsWinch 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Wait=1;
    public static final int receiveRequest=2;
    public static final int doorOpened=3;
    public static final int doorClosed=4;
    public static final int cabinMoved=5;
    public static final int cabinBraked=6;
    public static final int cabinArrived=7;
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
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation closeDoor() 
    public void closeDoor() {
        try {
            animInstance().notifyMethodEntered("closeDoor",
               new ArgData[] {
               });
        
        //#[ operation closeDoor() 
        System.out.println("Tell door to close");
        itsDoor.gen (new CloseDoor());
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
        itsDoor.gen (new OpenDoor());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation runWinch() 
    public void runWinch() {
        try {
            animInstance().notifyMethodEntered("runWinch",
               new ArgData[] {
               });
        
        //#[ operation runWinch() 
        System.out.println("Controller system going to launch winch"); 
        itsWinch.gen(new goUp());     
        
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
        itsWinch.gen(new stopFromController());
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
        itsWinch.gen(new stop());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
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
    public Sensor getItsSensor() {
        return itsSensor;
    }
    
    //## auto_generated 
    public void __setItsSensor(Sensor p_Sensor) {
        itsSensor = p_Sensor;
        if(p_Sensor != null)
            {
                animInstance().notifyRelationAdded("itsSensor", p_Sensor);
            }
        else
            {
                animInstance().notifyRelationCleared("itsSensor");
            }
    }
    
    //## auto_generated 
    public void _setItsSensor(Sensor p_Sensor) {
        if(itsSensor != null)
            {
                itsSensor.__setItsControllerSys(null);
            }
        __setItsSensor(p_Sensor);
    }
    
    //## auto_generated 
    public void setItsSensor(Sensor p_Sensor) {
        if(p_Sensor != null)
            {
                p_Sensor._setItsControllerSys(this);
            }
        _setItsSensor(p_Sensor);
    }
    
    //## auto_generated 
    public void _clearItsSensor() {
        animInstance().notifyRelationCleared("itsSensor");
        itsSensor = null;
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
                case receiveRequest:
                {
                    receiveRequest_add(animStates);
                }
                break;
                case cabinBraked:
                {
                    cabinBraked_add(animStates);
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
                case receiveRequest:
                {
                    res = receiveRequest_takeEvent(id);
                }
                break;
                case cabinBraked:
                {
                    res = cabinBraked_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Wait_add(AnimStates animStates) {
            animStates.add("ROOT.Wait");
        }
        
        //## statechart_method 
        public void receiveRequest_add(AnimStates animStates) {
            animStates.add("ROOT.receiveRequest");
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
            runWinch();
            //#]
            receiveRequest_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void doorOpenedEnter() {
        }
        
        //## statechart_method 
        public void cabinMoved_entDef() {
            cabinMoved_enter();
        }
        
        //## statechart_method 
        public void cabinArrived_exit() {
            cabinArrivedExit();
            animInstance().notifyStateExited("ROOT.cabinArrived");
        }
        
        //## statechart_method 
        public int doorClosed_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(readyToGo.readyToGo_Ascenseur_id))
                {
                    res = doorClosedTakereadyToGo();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void doorOpened_exit() {
            doorOpenedExit();
            animInstance().notifyStateExited("ROOT.doorOpened");
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
        public void receiveRequest_enter() {
            animInstance().notifyStateEntered("ROOT.receiveRequest");
            rootState_subState = receiveRequest;
            rootState_active = receiveRequest;
            receiveRequestEnter();
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
        public void receiveRequestEnter() {
        }
        
        //## statechart_method 
        public int cabinArrivedTakebraked() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            cabinArrived_exit();
            //#[ transition 7 
            sendToWinchToStop();
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
        public void receiveRequest_entDef() {
            receiveRequest_enter();
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
            if(event.isTypeOf(detected.detected_Ascenseur_id))
                {
                    res = cabinMovedTakedetected();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int WaitTakereceiveFromButton_Ex() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            Wait_exit();
            //#[ transition 5 
             runWinch();
            //#]
            receiveRequest_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void cabinMovedEnter() {
        }
        
        //## statechart_method 
        public void doorClosedEnter() {
        }
        
        //## statechart_method 
        public void receiveRequest_exit() {
            receiveRequestExit();
            animInstance().notifyStateExited("ROOT.receiveRequest");
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
        public int receiveRequestTakereceiveCabinMoved() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            receiveRequest_exit();
            cabinMoved_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Wait_enter() {
            animInstance().notifyStateEntered("ROOT.Wait");
            rootState_subState = Wait;
            rootState_active = Wait;
            WaitEnter();
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
        public void doorClosed_exit() {
            doorClosedExit();
            animInstance().notifyStateExited("ROOT.doorClosed");
        }
        
        //## statechart_method 
        public void doorOpenedExit() {
        }
        
        //## statechart_method 
        public void receiveRequestExit() {
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
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            doorOpened_exit();
            //#[ transition 3 
            closeDoor();
            //#]
            doorClosed_entDef();
            animInstance().notifyTransitionEnded("3");
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
            
            return res;
        }
        
        //## statechart_method 
        public int receiveRequest_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(receiveCabinMoved.receiveCabinMoved_Ascenseur_id))
                {
                    res = receiveRequestTakereceiveCabinMoved();
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
            rootState_subState = doorOpened;
            rootState_active = doorOpened;
            doorOpenedEnter();
        }
        
        //## statechart_method 
        public void Wait_entDef() {
            Wait_enter();
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
        
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsButton_ex", false, true, itsButton_ex);
        msg.add("itsWinch", false, true, itsWinch);
        msg.add("itsSensor", false, true, itsSensor);
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

