/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Cabin
//!	Generated Date	: Sun, 28, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/Cabin.java
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
// Ascenseur/Cabin.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## class Cabin 
public class Cabin implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassCabin = new AnimClass("Ascenseur.Cabin",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected Cabin.p_cab_con_C p_cab_con;		//## ignore 
    
    protected Cabin.p_cab_win_C p_cab_win;		//## ignore 
    
    protected int currentFloor = 0;		//## attribute currentFloor 
    
    protected ControllerSys itsControllerSys;		//## link itsControllerSys 
    
    protected Winch itsWinch;		//## link itsWinch 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Up_Cabin=1;
    public static final int Stop_Cabin=2;
    public static final int sentInfo_Cabin=3;
    public static final int Down_Cabin=4;
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
    public  Cabin(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassCabin.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("Cabin");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Cabin.p_cab_con_C getP_cab_con() {
        return p_cab_con;
    }
    
    //## auto_generated 
    public Cabin.p_cab_con_C get_p_cab_con() {
        return p_cab_con;
    }
    
    //## auto_generated 
    public Cabin.p_cab_con_C newP_cab_con() {
        p_cab_con = new Cabin.p_cab_con_C();
        return p_cab_con;
    }
    
    //## auto_generated 
    public void deleteP_cab_con() {
        p_cab_con=null;
    }
    
    //## auto_generated 
    public Cabin.p_cab_win_C getP_cab_win() {
        return p_cab_win;
    }
    
    //## auto_generated 
    public Cabin.p_cab_win_C get_p_cab_win() {
        return p_cab_win;
    }
    
    //## auto_generated 
    public Cabin.p_cab_win_C newP_cab_win() {
        p_cab_win = new Cabin.p_cab_win_C();
        return p_cab_win;
    }
    
    //## auto_generated 
    public void deleteP_cab_win() {
        p_cab_win=null;
    }
    
    /**
     * braked;
     *         braked;
     *          to Stop_Cabin
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
     * select
     *           sendFloorAndCloseDoor  ?  targetFloor;
     *           receiveFloorAndCloseDoor !  targetFloor;
     *           to sentInfo_Cabin
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
     * select
     *           moveCabinDown ;
     *           receiveCabinMoved;
     *           to Down_Cabin
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
     * [] 
     *           moveCabinDown;
     *           receiveCabinMoved;
     *           to Down_Cabin
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
     * []
     *           moveCabinUp;
     *           receiveCabinMoved;
     *           to Up_Cabin
     *         end
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
     * braked;
     *          braked;
     *          to Stop_Cabin
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
     * []
     *           moveCabinUp;
     *           receiveCabinMoved;
     *           to Up_Cabin
     *         end
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
     *   receiveFloorAndCloseDoor : out int,
     *       braked : out none,
     *       receiveCabinMoved : out none
    */
    //## operation genOutPort() 
    public void genOutPort() {
        try {
            animInstance().notifyMethodEntered("genOutPort",
               new ArgData[] {
               });
        
        //#[ operation genOutPort() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendCabinBrakedToController() 
    public void sendCabinBrakedToController() {
        try {
            animInstance().notifyMethodEntered("sendCabinBrakedToController",
               new ArgData[] {
               });
        
        //#[ operation sendCabinBrakedToController() 
        System.out.println("send cabin braked to controller system");  
        getP_cab_con().gen (new braked());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendMovedDownToController() 
    public void sendMovedDownToController() {
        try {
            animInstance().notifyMethodEntered("sendMovedDownToController",
               new ArgData[] {
               });
        
        //#[ operation sendMovedDownToController() 
        System.out.println("Send cabin moved down to controller system");  
        getP_cab_con().gen (new receiveCabinMoved());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation sendMovedUpToController() 
    public void sendMovedUpToController() {
        try {
            animInstance().notifyMethodEntered("sendMovedUpToController",
               new ArgData[] {
               });
        
        //#[ operation sendMovedUpToController() 
        System.out.println("Send cabin moved up to controller system");  
        getP_cab_con().gen (new receiveCabinMoved());
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
                itsControllerSys.__setItsCabin(null);
            }
        __setItsControllerSys(p_ControllerSys);
    }
    
    //## auto_generated 
    public void setItsControllerSys(ControllerSys p_ControllerSys) {
        if(p_ControllerSys != null)
            {
                p_ControllerSys._setItsCabin(this);
            }
        _setItsControllerSys(p_ControllerSys);
    }
    
    //## auto_generated 
    public void _clearItsControllerSys() {
        animInstance().notifyRelationCleared("itsControllerSys");
        itsControllerSys = null;
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
                itsWinch.__setItsCabin(null);
            }
        __setItsWinch(p_Winch);
    }
    
    //## auto_generated 
    public void setItsWinch(Winch p_Winch) {
        if(p_Winch != null)
            {
                p_Winch._setItsCabin(this);
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
        p_cab_con = newP_cab_con();
        p_cab_win = newP_cab_win();
        if(getP_cab_con() != null)
           getP_cab_con().connectCabin(this);
        if(getP_cab_win() != null)
           getP_cab_win().connectCabin(this);
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
                case Stop_Cabin:
                {
                    Stop_Cabin_add(animStates);
                }
                break;
                case Down_Cabin:
                {
                    Down_Cabin_add(animStates);
                }
                break;
                case sentInfo_Cabin:
                {
                    sentInfo_Cabin_add(animStates);
                }
                break;
                case Up_Cabin:
                {
                    Up_Cabin_add(animStates);
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
                case Stop_Cabin:
                {
                    res = Stop_Cabin_takeEvent(id);
                }
                break;
                case Down_Cabin:
                {
                    res = Down_Cabin_takeEvent(id);
                }
                break;
                case sentInfo_Cabin:
                {
                    res = sentInfo_Cabin_takeEvent(id);
                }
                break;
                case Up_Cabin:
                {
                    res = Up_Cabin_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Up_Cabin_add(AnimStates animStates) {
            animStates.add("ROOT.Up_Cabin");
        }
        
        //## statechart_method 
        public void Stop_Cabin_add(AnimStates animStates) {
            animStates.add("ROOT.Stop_Cabin");
        }
        
        //## statechart_method 
        public void sentInfo_Cabin_add(AnimStates animStates) {
            animStates.add("ROOT.sentInfo_Cabin");
        }
        
        //## statechart_method 
        public void Down_Cabin_add(AnimStates animStates) {
            animStates.add("ROOT.Down_Cabin");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void Down_CabinExit() {
        }
        
        //## statechart_method 
        public void sentInfo_CabinEnter() {
        }
        
        //## statechart_method 
        public void Stop_Cabin_enter() {
            animInstance().notifyStateEntered("ROOT.Stop_Cabin");
            rootState_subState = Stop_Cabin;
            rootState_active = Stop_Cabin;
            Stop_CabinEnter();
        }
        
        //## statechart_method 
        public void Stop_CabinEnter() {
        }
        
        //## statechart_method 
        public void Stop_Cabin_entDef() {
            Stop_Cabin_enter();
        }
        
        //## statechart_method 
        public void sentInfo_CabinExit() {
        }
        
        //## statechart_method 
        public void sentInfo_Cabin_exit() {
            sentInfo_CabinExit();
            animInstance().notifyStateExited("ROOT.sentInfo_Cabin");
        }
        
        //## statechart_method 
        public int Stop_CabinTakemoveCabinDown() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Stop_Cabin_exit();
            //#[ transition 4 
            sendMovedDownToController();       
            genFiacre4();
            //#]
            Down_Cabin_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Stop_Cabin_exit() {
            Stop_CabinExit();
            animInstance().notifyStateExited("ROOT.Stop_Cabin");
        }
        
        //## statechart_method 
        public void Up_CabinEnter() {
        }
        
        //## statechart_method 
        public int sentInfo_CabinTakemoveCabinDown() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            sentInfo_Cabin_exit();
            //#[ transition 3 
            sendMovedDownToController();      
            genFiacre3();
            //#]
            Down_Cabin_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void sentInfo_Cabin_entDef() {
            sentInfo_Cabin_enter();
        }
        
        //## statechart_method 
        public int Stop_Cabin_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(sendFloorAndCloseDoor.sendFloorAndCloseDoor_Ascenseur_id))
                {
                    res = Stop_CabinTakesendFloorAndCloseDoor();
                }
            else if(event.isTypeOf(moveCabinDown.moveCabinDown_Ascenseur_id))
                {
                    res = Stop_CabinTakemoveCabinDown();
                }
            else if(event.isTypeOf(moveCabinUp.moveCabinUp_Ascenseur_id))
                {
                    res = Stop_CabinTakemoveCabinUp();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int Stop_CabinTakemoveCabinUp() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            Stop_Cabin_exit();
            //#[ transition 5 
            sendMovedUpToController();   
            genFiacre5();
            //#]
            Up_Cabin_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Up_Cabin_exit() {
            Up_CabinExit();
            animInstance().notifyStateExited("ROOT.Up_Cabin");
        }
        
        //## statechart_method 
        public void sentInfo_Cabin_enter() {
            animInstance().notifyStateEntered("ROOT.sentInfo_Cabin");
            rootState_subState = sentInfo_Cabin;
            rootState_active = sentInfo_Cabin;
            sentInfo_CabinEnter();
        }
        
        //## statechart_method 
        public void Stop_CabinExit() {
        }
        
        //## statechart_method 
        public void Up_Cabin_enter() {
            animInstance().notifyStateEntered("ROOT.Up_Cabin");
            rootState_subState = Up_Cabin;
            rootState_active = Up_Cabin;
            Up_CabinEnter();
        }
        
        //## statechart_method 
        public void Up_Cabin_entDef() {
            Up_Cabin_enter();
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
        public void Down_CabinEnter() {
        }
        
        //## statechart_method 
        public void Up_CabinExit() {
        }
        
        //## statechart_method 
        public int Up_CabinTakebraked() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            Up_Cabin_exit();
            //#[ transition 6 
            sendCabinBrakedToController();  
            genFiacre6();
            //#]
            Stop_Cabin_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Down_Cabin_entDef() {
            Down_Cabin_enter();
        }
        
        //## statechart_method 
        public int Up_Cabin_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(braked.braked_Ascenseur_id))
                {
                    res = Up_CabinTakebraked();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Stop_Cabin_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int Down_Cabin_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(braked.braked_Ascenseur_id))
                {
                    res = Down_CabinTakebraked();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int Down_CabinTakebraked() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Down_Cabin_exit();
            //#[ transition 1 
            sendCabinBrakedToController();                 
            genFiacre1();
            //#]
            Stop_Cabin_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Down_Cabin_exit() {
            Down_CabinExit();
            animInstance().notifyStateExited("ROOT.Down_Cabin");
        }
        
        //## statechart_method 
        public int sentInfo_CabinTakemoveCabinUp() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            sentInfo_Cabin_exit();
            //#[ transition 7 
            sendMovedUpToController();         
            genFiacre7();
            //#]
            Up_Cabin_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int Stop_CabinTakesendFloorAndCloseDoor() {
            sendFloorAndCloseDoor params = (sendFloorAndCloseDoor) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            Stop_Cabin_exit();
            //#[ transition 2 
            getP_cab_con().gen (new receiveFloorAndCloseDoor(params.targetFloor));    
            genFiacre2();
            //#]
            sentInfo_Cabin_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Down_Cabin_enter() {
            animInstance().notifyStateEntered("ROOT.Down_Cabin");
            rootState_subState = Down_Cabin;
            rootState_active = Down_Cabin;
            Down_CabinEnter();
        }
        
        //## statechart_method 
        public int sentInfo_Cabin_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(moveCabinDown.moveCabinDown_Ascenseur_id))
                {
                    res = sentInfo_CabinTakemoveCabinDown();
                }
            else if(event.isTypeOf(moveCabinUp.moveCabinUp_Ascenseur_id))
                {
                    res = sentInfo_CabinTakemoveCabinUp();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void rootStateExit() {
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
            return Cabin.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_cab_con_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_cab_con_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCabin(Cabin) 
        public void connectCabin(Cabin part) {
            //#[ operation connectCabin(Cabin) 
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
    public class p_cab_win_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_cab_win_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectCabin(Cabin) 
        public void connectCabin(Cabin part) {
            //#[ operation connectCabin(Cabin) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassCabin; 
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
        
        msg.add("currentFloor", currentFloor);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsWinch", false, true, itsWinch);
        msg.add("itsControllerSys", false, true, itsControllerSys);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Cabin.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Cabin.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Cabin.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/Cabin.java
*********************************************************************/

