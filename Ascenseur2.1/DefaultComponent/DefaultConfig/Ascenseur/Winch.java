/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Winch
//!	Generated Date	: Sun, 28, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/Winch.java
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
// Ascenseur/Winch.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## class Winch 
public class Winch implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassWinch = new AnimClass("Ascenseur.Winch",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected Winch.p_win_con_C p_win_con;		//## ignore 
    
    protected Winch.p_win_cab_C p_win_cab;		//## ignore 
    
    protected int frein = 0;		//## attribute frein 
    
    protected int motor = 0;		//## attribute motor 
    
    protected int selector = 0;		//## attribute selector 
    
    protected Cabin itsCabin;		//## link itsCabin 
    
    protected ControllerSys itsControllerSys;		//## link itsControllerSys 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int receiveCabinBrakedFromControllerSys_Winch=1;
    public static final int Not_Going_Winch=2;
    public static final int Going_Up_Winch=3;
    public static final int Going_Down_Winch=4;
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
    public  Winch(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassWinch.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("Winch");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Winch.p_win_con_C getP_win_con() {
        return p_win_con;
    }
    
    //## auto_generated 
    public Winch.p_win_con_C get_p_win_con() {
        return p_win_con;
    }
    
    //## auto_generated 
    public Winch.p_win_con_C newP_win_con() {
        p_win_con = new Winch.p_win_con_C();
        return p_win_con;
    }
    
    //## auto_generated 
    public void deleteP_win_con() {
        p_win_con=null;
    }
    
    //## auto_generated 
    public Winch.p_win_cab_C getP_win_cab() {
        return p_win_cab;
    }
    
    //## auto_generated 
    public Winch.p_win_cab_C get_p_win_cab() {
        return p_win_cab;
    }
    
    //## auto_generated 
    public Winch.p_win_cab_C newP_win_cab() {
        p_win_cab = new Winch.p_win_cab_C();
        return p_win_cab;
    }
    
    //## auto_generated 
    public void deleteP_win_cab() {
        p_win_cab=null;
    }
    
    /**
     * select
     *           goUp;
     *           moveCabinUp;
     *           to Going_Up
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
     * stop;
     *           readyToOpenDoor;
     *           to Not_Going_Winch
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
     * []
     *           goDown;
     *           moveCabinDown;
     *           to Goinf_Down
     *         end
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
     * stopFromController;
     *           braked;
     *           to receiveCabinBrakedFromControllerSys
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
     * stopFromController;
     *           braked;
     *           to receiveCabinBrakedFromControllerSys
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
    
    //## operation receiveStopFromController() 
    public void receiveStopFromController() {
        try {
            animInstance().notifyMethodEntered("receiveStopFromController",
               new ArgData[] {
               });
        
        //#[ operation receiveStopFromController() 
        System.out.println("receive stop info from controller system");  
        getP_win_con().gen (new readyToOpenDoor());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendBrakeToCabin() 
    public void sendBrakeToCabin() {
        try {
            animInstance().notifyMethodEntered("sendBrakeToCabin",
               new ArgData[] {
               });
        
        //#[ operation sendBrakeToCabin() 
        System.out.println("Tell cabin to brake");
        getP_win_cab().gen(new braked());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendBrakedToController() 
    public void sendBrakedToController() {
        try {
            animInstance().notifyMethodEntered("sendBrakedToController",
               new ArgData[] {
               });
        
        //#[ operation sendBrakedToController() 
        System.out.println("Tell system controller that the cabin is braked");
        getP_win_con().gen(new braked());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendGoDownToCabin() 
    public void sendGoDownToCabin() {
        try {
            animInstance().notifyMethodEntered("sendGoDownToCabin",
               new ArgData[] {
               });
        
        //#[ operation sendGoDownToCabin() 
        System.out.println("Tell winch control the cabin which is moved down");
        getP_win_cab().gen(new moveCabinDown());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendGoUpToCabin() 
    public void sendGoUpToCabin() {
        try {
            animInstance().notifyMethodEntered("sendGoUpToCabin",
               new ArgData[] {
               });
        
        //#[ operation sendGoUpToCabin() 
        System.out.println("Tell winch control the cabin which is moved up");
        getP_win_cab().gen(new moveCabinUp());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getFrein() {
        return frein;
    }
    
    //## auto_generated 
    public void setFrein(int p_frein) {
        frein = p_frein;
    }
    
    //## auto_generated 
    public int getMotor() {
        return motor;
    }
    
    //## auto_generated 
    public void setMotor(int p_motor) {
        motor = p_motor;
    }
    
    //## auto_generated 
    public int getSelector() {
        return selector;
    }
    
    //## auto_generated 
    public void setSelector(int p_selector) {
        selector = p_selector;
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
                itsCabin.__setItsWinch(null);
            }
        __setItsCabin(p_Cabin);
    }
    
    //## auto_generated 
    public void setItsCabin(Cabin p_Cabin) {
        if(p_Cabin != null)
            {
                p_Cabin._setItsWinch(this);
            }
        _setItsCabin(p_Cabin);
    }
    
    //## auto_generated 
    public void _clearItsCabin() {
        animInstance().notifyRelationCleared("itsCabin");
        itsCabin = null;
    }
    
    //## auto_generated 
    public ControllerSys getItsControllerSys() {
        return itsControllerSys;
    }
    
    //## auto_generated 
    public void __setItsControllerSys(ControllerSys p_ControllerSys) {
        itsControllerSys = p_ControllerSys;
        if(p_ControllerSys != null)
            {
                animInstance().notifyRelationAdded("itsControllerSys", p_ControllerSys);
            }
        else
            {
                animInstance().notifyRelationCleared("itsControllerSys");
            }
    }
    
    //## auto_generated 
    public void _setItsControllerSys(ControllerSys p_ControllerSys) {
        if(itsControllerSys != null)
            {
                itsControllerSys.__setItsWinch(null);
            }
        __setItsControllerSys(p_ControllerSys);
    }
    
    //## auto_generated 
    public void setItsControllerSys(ControllerSys p_ControllerSys) {
        if(p_ControllerSys != null)
            {
                p_ControllerSys._setItsWinch(this);
            }
        _setItsControllerSys(p_ControllerSys);
    }
    
    //## auto_generated 
    public void _clearItsControllerSys() {
        animInstance().notifyRelationCleared("itsControllerSys");
        itsControllerSys = null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_win_con = newP_win_con();
        p_win_cab = newP_win_cab();
        if(getP_win_con() != null)
           getP_win_con().connectWinch(this);
        if(getP_win_cab() != null)
           getP_win_cab().connectWinch(this);
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
                case Not_Going_Winch:
                {
                    Not_Going_Winch_add(animStates);
                }
                break;
                case Going_Up_Winch:
                {
                    Going_Up_Winch_add(animStates);
                }
                break;
                case Going_Down_Winch:
                {
                    Going_Down_Winch_add(animStates);
                }
                break;
                case receiveCabinBrakedFromControllerSys_Winch:
                {
                    receiveCabinBrakedFromControllerSys_Winch_add(animStates);
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
                case Not_Going_Winch:
                {
                    res = Not_Going_Winch_takeEvent(id);
                }
                break;
                case Going_Up_Winch:
                {
                    res = Going_Up_Winch_takeEvent(id);
                }
                break;
                case Going_Down_Winch:
                {
                    res = Going_Down_Winch_takeEvent(id);
                }
                break;
                case receiveCabinBrakedFromControllerSys_Winch:
                {
                    res = receiveCabinBrakedFromControllerSys_Winch_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void receiveCabinBrakedFromControllerSys_Winch_add(AnimStates animStates) {
            animStates.add("ROOT.receiveCabinBrakedFromControllerSys_Winch");
        }
        
        //## statechart_method 
        public void Not_Going_Winch_add(AnimStates animStates) {
            animStates.add("ROOT.Not_Going_Winch");
        }
        
        //## statechart_method 
        public void Going_Up_Winch_add(AnimStates animStates) {
            animStates.add("ROOT.Going_Up_Winch");
        }
        
        //## statechart_method 
        public void Going_Down_Winch_add(AnimStates animStates) {
            animStates.add("ROOT.Going_Down_Winch");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int Going_Down_Winch_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(stopFromController.stopFromController_Ascenseur_id))
                {
                    res = Going_Down_WinchTakestopFromController();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int Going_Up_WinchTakestopFromController() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Going_Up_Winch_exit();
            //#[ transition 4 
            sendBrakeToCabin();   
            genFiacre4();
            //#]
            receiveCabinBrakedFromControllerSys_Winch_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void receiveCabinBrakedFromControllerSys_Winch_enter() {
            animInstance().notifyStateEntered("ROOT.receiveCabinBrakedFromControllerSys_Winch");
            rootState_subState = receiveCabinBrakedFromControllerSys_Winch;
            rootState_active = receiveCabinBrakedFromControllerSys_Winch;
            receiveCabinBrakedFromControllerSys_WinchEnter();
        }
        
        //## statechart_method 
        public void Going_Up_WinchEnter() {
        }
        
        //## statechart_method 
        public void Going_Down_WinchExit() {
        }
        
        //## statechart_method 
        public void Going_Down_WinchEnter() {
        }
        
        //## statechart_method 
        public void Going_Up_Winch_entDef() {
            Going_Up_Winch_enter();
        }
        
        //## statechart_method 
        public void Going_Up_WinchExit() {
        }
        
        //## statechart_method 
        public void Not_Going_WinchEnter() {
        }
        
        //## statechart_method 
        public int receiveCabinBrakedFromControllerSys_Winch_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(stop.stop_Ascenseur_id))
                {
                    res = receiveCabinBrakedFromControllerSys_WinchTakestop();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Going_Down_Winch_entDef() {
            Going_Down_Winch_enter();
        }
        
        //## statechart_method 
        public void Going_Up_Winch_exit() {
            Going_Up_WinchExit();
            animInstance().notifyStateExited("ROOT.Going_Up_Winch");
        }
        
        //## statechart_method 
        public void Going_Down_Winch_exit() {
            Going_Down_WinchExit();
            animInstance().notifyStateExited("ROOT.Going_Down_Winch");
        }
        
        //## statechart_method 
        public void Going_Up_Winch_enter() {
            animInstance().notifyStateEntered("ROOT.Going_Up_Winch");
            rootState_subState = Going_Up_Winch;
            rootState_active = Going_Up_Winch;
            Going_Up_WinchEnter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int Going_Down_WinchTakestopFromController() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            Going_Down_Winch_exit();
            //#[ transition 5 
            sendBrakeToCabin();        
            genFiacre5();
            //#]
            receiveCabinBrakedFromControllerSys_Winch_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Not_Going_Winch_exit() {
            Not_Going_WinchExit();
            animInstance().notifyStateExited("ROOT.Not_Going_Winch");
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
        public void Not_Going_Winch_enter() {
            animInstance().notifyStateEntered("ROOT.Not_Going_Winch");
            rootState_subState = Not_Going_Winch;
            rootState_active = Not_Going_Winch;
            Not_Going_WinchEnter();
        }
        
        //## statechart_method 
        public void receiveCabinBrakedFromControllerSys_Winch_entDef() {
            receiveCabinBrakedFromControllerSys_Winch_enter();
        }
        
        //## statechart_method 
        public int Going_Up_Winch_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(stopFromController.stopFromController_Ascenseur_id))
                {
                    res = Going_Up_WinchTakestopFromController();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Not_Going_Winch_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int Not_Going_WinchTakegoUp() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Not_Going_Winch_exit();
            //#[ transition 1 
            sendGoUpToCabin();   
            genFiacre1();
            //#]
            Going_Up_Winch_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Not_Going_Winch_entDef() {
            Not_Going_Winch_enter();
        }
        
        //## statechart_method 
        public int Not_Going_WinchTakegoDown() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Not_Going_Winch_exit();
            //#[ transition 3 
            sendGoDownToCabin();  
            genFiacre3();
            //#]
            Going_Down_Winch_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void receiveCabinBrakedFromControllerSys_WinchEnter() {
        }
        
        //## statechart_method 
        public void Going_Down_Winch_enter() {
            animInstance().notifyStateEntered("ROOT.Going_Down_Winch");
            rootState_subState = Going_Down_Winch;
            rootState_active = Going_Down_Winch;
            Going_Down_WinchEnter();
        }
        
        //## statechart_method 
        public int Not_Going_Winch_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(goUp.goUp_Ascenseur_id))
                {
                    res = Not_Going_WinchTakegoUp();
                }
            else if(event.isTypeOf(goDown.goDown_Ascenseur_id))
                {
                    res = Not_Going_WinchTakegoDown();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Not_Going_WinchExit() {
        }
        
        //## statechart_method 
        public int receiveCabinBrakedFromControllerSys_WinchTakestop() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            receiveCabinBrakedFromControllerSys_Winch_exit();
            //#[ transition 2 
            receiveStopFromController();      
            genFiacre2();
            //#]
            Not_Going_Winch_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void receiveCabinBrakedFromControllerSys_Winch_exit() {
            receiveCabinBrakedFromControllerSys_WinchExit();
            animInstance().notifyStateExited("ROOT.receiveCabinBrakedFromControllerSys_Winch");
        }
        
        //## statechart_method 
        public void receiveCabinBrakedFromControllerSys_WinchExit() {
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
            return Winch.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_win_con_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_win_con_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectWinch(Winch) 
        public void connectWinch(Winch part) {
            //#[ operation connectWinch(Winch) 
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
    public class p_win_cab_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_win_cab_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectWinch(Winch) 
        public void connectWinch(Winch part) {
            //#[ operation connectWinch(Winch) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassWinch; 
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
        
        msg.add("motor", motor);
        msg.add("frein", frein);
        msg.add("selector", selector);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsControllerSys", false, true, itsControllerSys);
        msg.add("itsCabin", false, true, itsCabin);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Winch.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Winch.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Winch.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/Winch.java
*********************************************************************/

