/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Door
//!	Generated Date	: Sun, 28, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/Door.java
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
// Ascenseur/Door.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## class Door 
public class Door implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassDoor = new AnimClass("Ascenseur.Door",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected Door.p_door_con_C p_door_con;		//## ignore 
    
    protected ControllerSys itsControllerSys;		//## link itsControllerSys 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Sleep_Door=1;
    public static final int Open_Door=2;
    public static final int Closed_Door=3;
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
    public  Door(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassDoor.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("Door");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Door.p_door_con_C getP_door_con() {
        return p_door_con;
    }
    
    //## auto_generated 
    public Door.p_door_con_C get_p_door_con() {
        return p_door_con;
    }
    
    //## auto_generated 
    public Door.p_door_con_C newP_door_con() {
        p_door_con = new Door.p_door_con_C();
        return p_door_con;
    }
    
    //## auto_generated 
    public void deleteP_door_con() {
        p_door_con=null;
    }
    
    /**
     * OpenDoor;
     *            to Open_Door
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
     * CloseDoor;
     *           to Closed_Door
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
     * readyToGo;
     *           to Sleep_Door
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
    
    //## operation goSleep() 
    public void goSleep() {
        try {
            animInstance().notifyMethodEntered("goSleep",
               new ArgData[] {
               });
        
        //#[ operation goSleep() 
        getP_door_con().gen (new readyToGo());
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
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
                itsControllerSys.__setItsDoor(null);
            }
        __setItsControllerSys(p_ControllerSys);
    }
    
    //## auto_generated 
    public void setItsControllerSys(ControllerSys p_ControllerSys) {
        if(p_ControllerSys != null)
            {
                p_ControllerSys._setItsDoor(this);
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
        p_door_con = newP_door_con();
        if(getP_door_con() != null)
           getP_door_con().connectDoor(this);
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
                case Open_Door:
                {
                    Open_Door_add(animStates);
                }
                break;
                case Closed_Door:
                {
                    Closed_Door_add(animStates);
                }
                break;
                case Sleep_Door:
                {
                    Sleep_Door_add(animStates);
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
                case Open_Door:
                {
                    res = Open_Door_takeEvent(id);
                }
                break;
                case Closed_Door:
                {
                    res = Closed_Door_takeEvent(id);
                }
                break;
                case Sleep_Door:
                {
                    res = Sleep_Door_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Sleep_Door_add(AnimStates animStates) {
            animStates.add("ROOT.Sleep_Door");
        }
        
        //## statechart_method 
        public void Open_Door_add(AnimStates animStates) {
            animStates.add("ROOT.Open_Door");
        }
        
        //## statechart_method 
        public void Closed_Door_add(AnimStates animStates) {
            animStates.add("ROOT.Closed_Door");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void Closed_DoorEnter() {
        }
        
        //## statechart_method 
        public void Open_Door_entDef() {
            Open_Door_enter();
        }
        
        //## statechart_method 
        public void Closed_Door_exit() {
            popNullConfig();
            Closed_DoorExit();
            animInstance().notifyStateExited("ROOT.Closed_Door");
        }
        
        //## statechart_method 
        public void Open_Door_enter() {
            animInstance().notifyStateEntered("ROOT.Open_Door");
            rootState_subState = Open_Door;
            rootState_active = Open_Door;
            Open_DoorEnter();
        }
        
        //## statechart_method 
        public void Closed_Door_entDef() {
            Closed_Door_enter();
        }
        
        //## statechart_method 
        public void Closed_Door_enter() {
            animInstance().notifyStateEntered("ROOT.Closed_Door");
            pushNullConfig();
            rootState_subState = Closed_Door;
            rootState_active = Closed_Door;
            Closed_DoorEnter();
        }
        
        //## statechart_method 
        public int Sleep_DoorTakeOpenDoor() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Sleep_Door_exit();
            //#[ transition 1 
            genFiacre1();
            //#]
            Open_Door_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void Closed_DoorExit() {
        }
        
        //## statechart_method 
        public void Sleep_DoorEnter() {
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
        public int Closed_DoorTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Closed_Door_exit();
            //#[ transition 3 
            goSleep();
            genFiacre3();
            //#]
            Sleep_Door_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int Open_Door_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(CloseDoor.CloseDoor_Ascenseur_id))
                {
                    res = Open_DoorTakeCloseDoor();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int Sleep_Door_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(OpenDoor.OpenDoor_Ascenseur_id))
                {
                    res = Sleep_DoorTakeOpenDoor();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Sleep_Door_exit() {
            Sleep_DoorExit();
            animInstance().notifyStateExited("ROOT.Sleep_Door");
        }
        
        //## statechart_method 
        public void Open_DoorEnter() {
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Sleep_Door_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int Closed_Door_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = Closed_DoorTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Open_Door_exit() {
            Open_DoorExit();
            animInstance().notifyStateExited("ROOT.Open_Door");
        }
        
        //## statechart_method 
        public void Sleep_Door_enter() {
            animInstance().notifyStateEntered("ROOT.Sleep_Door");
            rootState_subState = Sleep_Door;
            rootState_active = Sleep_Door;
            Sleep_DoorEnter();
        }
        
        //## statechart_method 
        public void Sleep_Door_entDef() {
            Sleep_Door_enter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void Sleep_DoorExit() {
        }
        
        //## statechart_method 
        public int Open_DoorTakeCloseDoor() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            Open_Door_exit();
            //#[ transition 2 
            genFiacre2();
            //#]
            Closed_Door_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Open_DoorExit() {
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
            return Door.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_door_con_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_door_con_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectDoor(Door) 
        public void connectDoor(Door part) {
            //#[ operation connectDoor(Door) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassDoor; 
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
        
        msg.add("itsControllerSys", false, true, itsControllerSys);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Door.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Door.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Door.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/Door.java
*********************************************************************/

