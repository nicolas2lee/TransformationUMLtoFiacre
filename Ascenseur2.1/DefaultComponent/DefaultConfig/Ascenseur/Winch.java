/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Winch
//!	Generated Date	: Mon, 30, Nov 2015 
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
    
    protected int frein;		//## attribute frein 
    
    protected int motor;		//## attribute motor 
    
    protected int selector;		//## attribute selector 
    
    protected Cabin itsCabin;		//## link itsCabin 
    
    protected ControllerSys itsControllerSys;		//## link itsControllerSys 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int receiveCabinBrakedFromControllerSys=1;
    public static final int Not_Going=2;
    public static final int Going_Up=3;
    public static final int Going_Down=4;
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
    public  Winch(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassWinch.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("Winch");
        reactive = new Reactive(m_thread);
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
        itsControllerSys.gen (new readyToOpenDoor());
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
        itsCabin.gen(new braked());
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
        itsControllerSys.gen(new braked());
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
        itsCabin.gen(new moveCabinDown());
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
        itsCabin.gen(new moveCabinUp());
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
                case Not_Going:
                {
                    Not_Going_add(animStates);
                }
                break;
                case Going_Up:
                {
                    Going_Up_add(animStates);
                }
                break;
                case Going_Down:
                {
                    Going_Down_add(animStates);
                }
                break;
                case receiveCabinBrakedFromControllerSys:
                {
                    receiveCabinBrakedFromControllerSys_add(animStates);
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
                case Not_Going:
                {
                    res = Not_Going_takeEvent(id);
                }
                break;
                case Going_Up:
                {
                    res = Going_Up_takeEvent(id);
                }
                break;
                case Going_Down:
                {
                    res = Going_Down_takeEvent(id);
                }
                break;
                case receiveCabinBrakedFromControllerSys:
                {
                    res = receiveCabinBrakedFromControllerSys_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void receiveCabinBrakedFromControllerSys_add(AnimStates animStates) {
            animStates.add("ROOT.receiveCabinBrakedFromControllerSys");
        }
        
        //## statechart_method 
        public void Not_Going_add(AnimStates animStates) {
            animStates.add("ROOT.Not_Going");
        }
        
        //## statechart_method 
        public void Going_Up_add(AnimStates animStates) {
            animStates.add("ROOT.Going_Up");
        }
        
        //## statechart_method 
        public void Going_Down_add(AnimStates animStates) {
            animStates.add("ROOT.Going_Down");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void Going_Up_entDef() {
            Going_Up_enter();
        }
        
        //## statechart_method 
        public void Going_DownEnter() {
        }
        
        //## statechart_method 
        public void Not_GoingEnter() {
        }
        
        //## statechart_method 
        public void Going_DownExit() {
        }
        
        //## statechart_method 
        public int Going_DownTakestopFromController() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            Going_Down_exit();
            //#[ transition 5 
            sendBrakeToCabin();
            //#]
            receiveCabinBrakedFromControllerSys_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Going_Down_exit() {
            Going_DownExit();
            animInstance().notifyStateExited("ROOT.Going_Down");
        }
        
        //## statechart_method 
        public void Not_Going_exit() {
            Not_GoingExit();
            animInstance().notifyStateExited("ROOT.Not_Going");
        }
        
        //## statechart_method 
        public void Not_Going_enter() {
            animInstance().notifyStateEntered("ROOT.Not_Going");
            rootState_subState = Not_Going;
            rootState_active = Not_Going;
            Not_GoingEnter();
        }
        
        //## statechart_method 
        public void receiveCabinBrakedFromControllerSysEnter() {
        }
        
        //## statechart_method 
        public void receiveCabinBrakedFromControllerSysExit() {
        }
        
        //## statechart_method 
        public void receiveCabinBrakedFromControllerSys_entDef() {
            receiveCabinBrakedFromControllerSys_enter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void Going_UpExit() {
        }
        
        //## statechart_method 
        public void Going_UpEnter() {
        }
        
        //## statechart_method 
        public int Not_Going_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(goUp.goUp_Ascenseur_id))
                {
                    res = Not_GoingTakegoUp();
                }
            else if(event.isTypeOf(goDown.goDown_Ascenseur_id))
                {
                    res = Not_GoingTakegoDown();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int Not_GoingTakegoDown() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Not_Going_exit();
            //#[ transition 3 
            sendGoDownToCabin();
            //#]
            Going_Down_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Not_GoingExit() {
        }
        
        //## statechart_method 
        public int receiveCabinBrakedFromControllerSysTakestop() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            receiveCabinBrakedFromControllerSys_exit();
            //#[ transition 2 
            receiveStopFromController();
            //#]
            Not_Going_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void receiveCabinBrakedFromControllerSys_exit() {
            receiveCabinBrakedFromControllerSysExit();
            animInstance().notifyStateExited("ROOT.receiveCabinBrakedFromControllerSys");
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
        public void Going_Up_exit() {
            Going_UpExit();
            animInstance().notifyStateExited("ROOT.Going_Up");
        }
        
        //## statechart_method 
        public int Going_UpTakestopFromController() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Going_Up_exit();
            //#[ transition 4 
            sendBrakeToCabin();
            //#]
            receiveCabinBrakedFromControllerSys_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Going_Up_enter() {
            animInstance().notifyStateEntered("ROOT.Going_Up");
            rootState_subState = Going_Up;
            rootState_active = Going_Up;
            Going_UpEnter();
        }
        
        //## statechart_method 
        public int Not_GoingTakegoUp() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Not_Going_exit();
            //#[ transition 1 
            sendGoUpToCabin();
            //#]
            Going_Up_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int receiveCabinBrakedFromControllerSys_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(stop.stop_Ascenseur_id))
                {
                    res = receiveCabinBrakedFromControllerSysTakestop();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Not_Going_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void Not_Going_entDef() {
            Not_Going_enter();
        }
        
        //## statechart_method 
        public void receiveCabinBrakedFromControllerSys_enter() {
            animInstance().notifyStateEntered("ROOT.receiveCabinBrakedFromControllerSys");
            rootState_subState = receiveCabinBrakedFromControllerSys;
            rootState_active = receiveCabinBrakedFromControllerSys;
            receiveCabinBrakedFromControllerSysEnter();
        }
        
        //## statechart_method 
        public void Going_Down_entDef() {
            Going_Down_enter();
        }
        
        //## statechart_method 
        public int Going_Down_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(stopFromController.stopFromController_Ascenseur_id))
                {
                    res = Going_DownTakestopFromController();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Going_Down_enter() {
            animInstance().notifyStateEntered("ROOT.Going_Down");
            rootState_subState = Going_Down;
            rootState_active = Going_Down;
            Going_DownEnter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int Going_Up_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(stopFromController.stopFromController_Ascenseur_id))
                {
                    res = Going_UpTakestopFromController();
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
            return Winch.this.animInstance(); 
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

