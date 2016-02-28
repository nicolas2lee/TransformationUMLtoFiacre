/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Button_ex
//!	Generated Date	: Sun, 28, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/Button_ex.java
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
// Ascenseur/Button_ex.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## class Button_ex 
public class Button_ex implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassButton_ex = new AnimClass("Ascenseur.Button_ex",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected Button_ex.p_btn_con_C p_btn_con;		//## ignore 
    
    protected ControllerSys itsControllerSys;		//## link itsControllerSys 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int On_Button_ex=1;
    public static final int Off_Button_ex=2;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int Button_ex_Timeout_On_Button_ex_id = 1;		//## ignore 
    
    
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
    public  Button_ex(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassButton_ex.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("Button_ex");
        reactive = new Reactive(m_thread);
        initRelations(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Button_ex.p_btn_con_C getP_btn_con() {
        return p_btn_con;
    }
    
    //## auto_generated 
    public Button_ex.p_btn_con_C get_p_btn_con() {
        return p_btn_con;
    }
    
    //## auto_generated 
    public Button_ex.p_btn_con_C newP_btn_con() {
        p_btn_con = new Button_ex.p_btn_con_C();
        return p_btn_con;
    }
    
    //## auto_generated 
    public void deleteP_btn_con() {
        p_btn_con=null;
    }
    
    /**
     * receiveFromButton_Ex ! 3;
     *         to On_Button_ex
    */
    //## operation genFiacre1() 
    public void genFiacre1() {
        try {
            animInstance().notifyMethodEntered("genFiacre1",
               new ArgData[] {
               });
        
        //#[ operation genFiacre1() 
        //test
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * to Off_Button_ex
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
     *   receiveFromButton_Ex : out int
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
                itsControllerSys.__setItsButton_ex(null);
            }
        __setItsControllerSys(p_ControllerSys);
    }
    
    //## auto_generated 
    public void setItsControllerSys(ControllerSys p_ControllerSys) {
        if(p_ControllerSys != null)
            {
                p_ControllerSys._setItsButton_ex(this);
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
        p_btn_con = newP_btn_con();
        if(getP_btn_con() != null)
           getP_btn_con().connectButton_ex(this);
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
                case Off_Button_ex:
                {
                    Off_Button_ex_add(animStates);
                }
                break;
                case On_Button_ex:
                {
                    On_Button_ex_add(animStates);
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
                case Off_Button_ex:
                {
                    res = Off_Button_ex_takeEvent(id);
                }
                break;
                case On_Button_ex:
                {
                    res = On_Button_ex_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void On_Button_ex_add(AnimStates animStates) {
            animStates.add("ROOT.On_Button_ex");
        }
        
        //## statechart_method 
        public void Off_Button_ex_add(AnimStates animStates) {
            animStates.add("ROOT.Off_Button_ex");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void On_Button_ex_entDef() {
            On_Button_ex_enter();
        }
        
        //## statechart_method 
        public void On_Button_ex_enter() {
            animInstance().notifyStateEntered("ROOT.On_Button_ex");
            rootState_subState = On_Button_ex;
            rootState_active = On_Button_ex;
            On_Button_exEnter();
        }
        
        //## statechart_method 
        public void On_Button_exEnter() {
            itsRiJThread.schedTimeout(5, Button_ex_Timeout_On_Button_ex_id, this, "ROOT.On_Button_ex");
        }
        
        //## statechart_method 
        public void Off_Button_ex_exit() {
            Off_Button_exExit();
            animInstance().notifyStateExited("ROOT.Off_Button_ex");
        }
        
        //## statechart_method 
        public void Off_Button_exExit() {
        }
        
        //## statechart_method 
        public void On_Button_ex_exit() {
            On_Button_exExit();
            animInstance().notifyStateExited("ROOT.On_Button_ex");
        }
        
        //## statechart_method 
        public int Off_Button_exTakePressed() {
            Pressed params = (Pressed) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Off_Button_ex_exit();
            //#[ transition 1 
            getP_btn_con().gen(new receiveFromButton_Ex(params.requestFloor));
            genFiacre1();
            //#]
            On_Button_ex_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int Off_Button_ex_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(Pressed.Pressed_Ascenseur_id))
                {
                    res = Off_Button_exTakePressed();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
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
        public void Off_Button_ex_enter() {
            animInstance().notifyStateEntered("ROOT.Off_Button_ex");
            rootState_subState = Off_Button_ex;
            rootState_active = Off_Button_ex;
            Off_Button_exEnter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Off_Button_ex_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void Off_Button_ex_entDef() {
            Off_Button_ex_enter();
        }
        
        //## statechart_method 
        public void On_Button_exExit() {
            itsRiJThread.unschedTimeout(Button_ex_Timeout_On_Button_ex_id, this);
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int On_Button_ex_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = On_Button_exTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Off_Button_exEnter() {
        }
        
        //## statechart_method 
        public int On_Button_exTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Button_ex_Timeout_On_Button_ex_id)
                {
                    animInstance().notifyTransitionStarted("2");
                    On_Button_ex_exit();
                    //#[ transition 2 
                    genFiacre2();
                    //#]
                    Off_Button_ex_entDef();
                    animInstance().notifyTransitionEnded("2");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
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
            return Button_ex.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_btn_con_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_btn_con_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectButton_ex(Button_ex) 
        public void connectButton_ex(Button_ex part) {
            //#[ operation connectButton_ex(Button_ex) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassButton_ex; 
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
            super(Button_ex.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Button_ex.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Button_ex.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/Button_ex.java
*********************************************************************/

