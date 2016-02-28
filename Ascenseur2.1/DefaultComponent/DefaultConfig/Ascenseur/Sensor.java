/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: zhengta
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Sensor
//!	Generated Date	: Sun, 28, Feb 2016 
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/Sensor.java
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
// Ascenseur/Sensor.java                                                                  
//----------------------------------------------------------------------------

//## package Ascenseur 


//## class Sensor 
public class Sensor implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassSensor = new AnimClass("Ascenseur.Sensor",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected Sensor.p_sen_con_C p_sen_con;		//## ignore 
    
    protected Sensor.p_sen_con_1_C p_sen_con_1;		//## ignore 
    
    protected Sensor.p_sen_con_2_C p_sen_con_2;		//## ignore 
    
    protected Sensor.p_sen_con_3_C p_sen_con_3;		//## ignore 
    
    protected Sensor.p_sen_con_4_C p_sen_con_4;		//## ignore 
    
    protected int cabinFloor = -1;		//## attribute cabinFloor 
    
    protected int floor = -1;		//## attribute floor 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Idle_Sensor=1;
    public static final int Detecting_Sensor=2;
    public static final int Detected_Sensor=3;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int Sensor_Timeout_Detected_Sensor_id = 1;		//## ignore 
    
    
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
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## auto_generated 
    public  Sensor(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassSensor.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Sensor.p_sen_con_C getP_sen_con() {
        return p_sen_con;
    }
    
    //## auto_generated 
    public Sensor.p_sen_con_C get_p_sen_con() {
        return p_sen_con;
    }
    
    //## auto_generated 
    public Sensor.p_sen_con_C newP_sen_con() {
        p_sen_con = new Sensor.p_sen_con_C();
        return p_sen_con;
    }
    
    //## auto_generated 
    public void deleteP_sen_con() {
        p_sen_con=null;
    }
    
    //## auto_generated 
    public Sensor.p_sen_con_1_C getP_sen_con_1() {
        return p_sen_con_1;
    }
    
    //## auto_generated 
    public Sensor.p_sen_con_1_C get_p_sen_con_1() {
        return p_sen_con_1;
    }
    
    //## auto_generated 
    public Sensor.p_sen_con_1_C newP_sen_con_1() {
        p_sen_con_1 = new Sensor.p_sen_con_1_C();
        return p_sen_con_1;
    }
    
    //## auto_generated 
    public void deleteP_sen_con_1() {
        p_sen_con_1=null;
    }
    
    //## auto_generated 
    public Sensor.p_sen_con_2_C getP_sen_con_2() {
        return p_sen_con_2;
    }
    
    //## auto_generated 
    public Sensor.p_sen_con_2_C get_p_sen_con_2() {
        return p_sen_con_2;
    }
    
    //## auto_generated 
    public Sensor.p_sen_con_2_C newP_sen_con_2() {
        p_sen_con_2 = new Sensor.p_sen_con_2_C();
        return p_sen_con_2;
    }
    
    //## auto_generated 
    public void deleteP_sen_con_2() {
        p_sen_con_2=null;
    }
    
    //## auto_generated 
    public Sensor.p_sen_con_3_C getP_sen_con_3() {
        return p_sen_con_3;
    }
    
    //## auto_generated 
    public Sensor.p_sen_con_3_C get_p_sen_con_3() {
        return p_sen_con_3;
    }
    
    //## auto_generated 
    public Sensor.p_sen_con_3_C newP_sen_con_3() {
        p_sen_con_3 = new Sensor.p_sen_con_3_C();
        return p_sen_con_3;
    }
    
    //## auto_generated 
    public void deleteP_sen_con_3() {
        p_sen_con_3=null;
    }
    
    //## auto_generated 
    public Sensor.p_sen_con_4_C getP_sen_con_4() {
        return p_sen_con_4;
    }
    
    //## auto_generated 
    public Sensor.p_sen_con_4_C get_p_sen_con_4() {
        return p_sen_con_4;
    }
    
    //## auto_generated 
    public Sensor.p_sen_con_4_C newP_sen_con_4() {
        p_sen_con_4 = new Sensor.p_sen_con_4_C();
        return p_sen_con_4;
    }
    
    //## auto_generated 
    public void deleteP_sen_con_4() {
        p_sen_con_4=null;
    }
    
    //## operation checkArrived() 
    public void checkArrived() {
        try {
            animInstance().notifyMethodEntered("checkArrived",
               new ArgData[] {
               });
        
        //#[ operation checkArrived() 
        System.out.println("floor is "+floor+" cabinFloor is "+cabinFloor);
        if (floor == cabinFloor)  {
        	gen(new cabinArrived());
        }else{ 
        	try {
            	Thread.sleep(1000);                 //1000 milliseconds is one second.
        	} catch(InterruptedException ex) {
        	    Thread.currentThread().interrupt();
        	}
        	checkSensorFloor(floor);
        }
        
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * @param sensorFloor
    */
    //## operation checkSensorFloor(int) 
    public void checkSensorFloor(int sensorFloor) {
        try {
            animInstance().notifyMethodEntered("checkSensorFloor",
               new ArgData[] {
                   new ArgData(int.class, "sensorFloor", AnimInstance.animToString(sensorFloor))
               });
        
        //#[ operation checkSensorFloor(int) 
        
        switch(sensorFloor){
        case 0: getP_sen_con().gen(new continueToMove());   
        		break; 
        case 1: getP_sen_con_1().gen(new  continueToMove());   
        		break;   
        case 2: getP_sen_con_2().gen(new  continueToMove());   
        		break; 
        case 3: getP_sen_con_3().gen(new  continueToMove());   
        		break;  
        case 4: getP_sen_con_4().gen(new  continueToMove());   
        		break;
        
        }           
        /*
        switch(sensorFloor){
        case 0: return getP_sen_con();   
        		//break; 
        case 1: return getP_sen_con_1();   
        		//break;   
        case 2: return getP_sen_con_2();   
        		//break; 
        case 3: return getP_sen_con_3();   
        		//break;  
        case 4:return getP_sen_con_4();   
        		//break;             
        } */
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * toMeasure ?  floor, cabinFloor;
     *          to Detecting_Sensor
     * 
    */
    //## operation genFiacre0() 
    public void genFiacre0() {
        try {
            animInstance().notifyMethodEntered("genFiacre0",
               new ArgData[] {
               });
        
        //#[ operation genFiacre0() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
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
     * to Idle_Sensor
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
     * toMeasure ? cabinFloor;
     *           if (floor = cabinFloor) then 
     *             case (floor) of 
     *           0 -> p_sen_con_detected; to Detected_Sensor 
     *        | 1 -> P_sen_con_1_detected; to Detected_Sensor
     *        | 2 -> p_sen_con_2_detected; to Detected_Sensor   
     *        | 3 -> p_sen_con_3_detected; to Detected_Sensor 
     *        | 4 -> p_sen_con_4_detected; to Detected_Sensor
     *           end
     *           else
     *             case (floor) of 
     *                0 -> p_sen_con_continueToMove 
     *             | 1 -> P_sen_con_1_continueToMove
     *             | 2 -> p_sen_con_2_continueToMove
     *             | 3 -> p_sen_con_3_continueToMove 
     *             | 4 -> p_sen_con_4_continueToMove
     *            end;
     *            to Detected_Sensor
     *          end
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
     *   p_sen_con_continueToMove : out none,  
     *        p_sen_con_1_continueToMove : out none,   
     *        p_sen_con_2_continueToMove : out none,
     *        p_sen_con_3_continueToMove : out none,
     *        p_sen_con_4_continueToMove : out none       
     * 
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
    
    //## operation sendCabinArrived() 
    public void sendCabinArrived() {
        try {
            animInstance().notifyMethodEntered("sendCabinArrived",
               new ArgData[] {
               });
        
        //#[ operation sendCabinArrived() 
        //checkSensorFloor(floor).gen(new detected());    
        switch(floor){
        case 0: getP_sen_con().gen(new detected());   
        		break; 
        case 1: getP_sen_con_1().gen(new detected());   
        		break;   
        case 2: getP_sen_con_2().gen(new detected());   
        		break; 
        case 3: getP_sen_con_3().gen(new detected());   
        		break;  
        case 4: getP_sen_con_4().gen(new detected());   
        		break;
        
        }
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getCabinFloor() {
        return cabinFloor;
    }
    
    //## auto_generated 
    public void setCabinFloor(int p_cabinFloor) {
        cabinFloor = p_cabinFloor;
    }
    
    //## auto_generated 
    public int getFloor() {
        return floor;
    }
    
    //## auto_generated 
    public void setFloor(int p_floor) {
        floor = p_floor;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        p_sen_con = newP_sen_con();
        p_sen_con_1 = newP_sen_con_1();
        p_sen_con_2 = newP_sen_con_2();
        p_sen_con_3 = newP_sen_con_3();
        p_sen_con_4 = newP_sen_con_4();
        if(getP_sen_con() != null)
           getP_sen_con().connectSensor(this);
        if(getP_sen_con_1() != null)
           getP_sen_con_1().connectSensor(this);
        if(getP_sen_con_2() != null)
           getP_sen_con_2().connectSensor(this);
        if(getP_sen_con_3() != null)
           getP_sen_con_3().connectSensor(this);
        if(getP_sen_con_4() != null)
           getP_sen_con_4().connectSensor(this);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
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
                case Idle_Sensor:
                {
                    Idle_Sensor_add(animStates);
                }
                break;
                case Detecting_Sensor:
                {
                    Detecting_Sensor_add(animStates);
                }
                break;
                case Detected_Sensor:
                {
                    Detected_Sensor_add(animStates);
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
                case Idle_Sensor:
                {
                    res = Idle_Sensor_takeEvent(id);
                }
                break;
                case Detecting_Sensor:
                {
                    res = Detecting_Sensor_takeEvent(id);
                }
                break;
                case Detected_Sensor:
                {
                    res = Detected_Sensor_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Idle_Sensor_add(AnimStates animStates) {
            animStates.add("ROOT.Idle_Sensor");
        }
        
        //## statechart_method 
        public void Detecting_Sensor_add(AnimStates animStates) {
            animStates.add("ROOT.Detecting_Sensor");
        }
        
        //## statechart_method 
        public void Detected_Sensor_add(AnimStates animStates) {
            animStates.add("ROOT.Detected_Sensor");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int Detected_Sensor_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = Detected_SensorTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Detected_Sensor_exit() {
            Detected_SensorExit();
            animInstance().notifyStateExited("ROOT.Detected_Sensor");
        }
        
        //## statechart_method 
        public void Detecting_SensorExit() {
        }
        
        //## statechart_method 
        public void Detecting_Sensor_enter() {
            animInstance().notifyStateEntered("ROOT.Detecting_Sensor");
            rootState_subState = Detecting_Sensor;
            rootState_active = Detecting_Sensor;
            Detecting_SensorEnter();
        }
        
        //## statechart_method 
        public void Idle_SensorEnter() {
        }
        
        //## statechart_method 
        public int Detecting_SensorTakecabinArrived() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Detecting_Sensor_exit();
            //#[ transition 1 
            sendCabinArrived();     
            genFiacre1();
            //#]
            Detected_Sensor_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Idle_Sensor_enter() {
            animInstance().notifyStateEntered("ROOT.Idle_Sensor");
            rootState_subState = Idle_Sensor;
            rootState_active = Idle_Sensor;
            Idle_SensorEnter();
        }
        
        //## statechart_method 
        public void Idle_Sensor_exit() {
            Idle_SensorExit();
            animInstance().notifyStateExited("ROOT.Idle_Sensor");
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
        public void Idle_Sensor_entDef() {
            Idle_Sensor_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("3");
            Idle_Sensor_entDef();
            animInstance().notifyTransitionEnded("3");
        }
        
        //## statechart_method 
        public int Detected_SensorTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Sensor_Timeout_Detected_Sensor_id)
                {
                    animInstance().notifyTransitionStarted("2");
                    Detected_Sensor_exit();
                    //#[ transition 2 
                    genFiacre2();
                    //#]
                    Idle_Sensor_entDef();
                    animInstance().notifyTransitionEnded("2");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Detected_Sensor_enter() {
            animInstance().notifyStateEntered("ROOT.Detected_Sensor");
            rootState_subState = Detected_Sensor;
            rootState_active = Detected_Sensor;
            Detected_SensorEnter();
        }
        
        //## statechart_method 
        public void Detecting_SensorEnter() {
        }
        
        //## statechart_method 
        public int Idle_Sensor_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(toMeasure.toMeasure_Ascenseur_id))
                {
                    res = Idle_SensorTaketoMeasure();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Detected_SensorExit() {
            itsRiJThread.unschedTimeout(Sensor_Timeout_Detected_Sensor_id, this);
        }
        
        //## statechart_method 
        public int Detecting_SensorTaketoMeasure() {
            toMeasure params = (toMeasure) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Detecting_Sensor_exit();
            //#[ transition 4 
            cabinFloor=params.currentFloor; 
            checkArrived();   
            genFiacre4();
            //#]
            Detecting_Sensor_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void Detected_Sensor_entDef() {
            Detected_Sensor_enter();
        }
        
        //## statechart_method 
        public int Detecting_Sensor_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(toMeasure.toMeasure_Ascenseur_id))
                {
                    res = Detecting_SensorTaketoMeasure();
                }
            else if(event.isTypeOf(cabinArrived.cabinArrived_Ascenseur_id))
                {
                    res = Detecting_SensorTakecabinArrived();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Detecting_Sensor_exit() {
            Detecting_SensorExit();
            animInstance().notifyStateExited("ROOT.Detecting_Sensor");
        }
        
        //## statechart_method 
        public void Detecting_Sensor_entDef() {
            Detecting_Sensor_enter();
        }
        
        //## statechart_method 
        public void Detected_SensorEnter() {
            itsRiJThread.schedTimeout(1, Sensor_Timeout_Detected_Sensor_id, this, "ROOT.Detected_Sensor");
        }
        
        //## statechart_method 
        public int Idle_SensorTaketoMeasure() {
            toMeasure params = (toMeasure) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("0");
            Idle_Sensor_exit();
            //#[ transition 0 
            floor=params.sensorFloor;
            cabinFloor=params.currentFloor;      
            genFiacre0();
            //#]
            Detecting_Sensor_entDef();
            animInstance().notifyTransitionEnded("0");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Idle_SensorExit() {
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
            return Sensor.this.animInstance(); 
        }
        
    }
    /**
    [[ * @see $See]]
    [[ * @since $Since]]
    */
    //## ignore 
    public class p_sen_con_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_sen_con_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectSensor(Sensor) 
        public void connectSensor(Sensor part) {
            //#[ operation connectSensor(Sensor) 
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
    public class p_sen_con_1_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_sen_con_1_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectSensor(Sensor) 
        public void connectSensor(Sensor part) {
            //#[ operation connectSensor(Sensor) 
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
    public class p_sen_con_2_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_sen_con_2_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectSensor(Sensor) 
        public void connectSensor(Sensor part) {
            //#[ operation connectSensor(Sensor) 
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
    public class p_sen_con_3_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_sen_con_3_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectSensor(Sensor) 
        public void connectSensor(Sensor part) {
            //#[ operation connectSensor(Sensor) 
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
    public class p_sen_con_4_C extends RiJDefaultReactivePort {
        
        
        // Constructors
        
        //## auto_generated 
        public  p_sen_con_4_C() {
        }
        
        /**
         * @param part
        */
        //## operation connectSensor(Sensor) 
        public void connectSensor(Sensor part) {
            //#[ operation connectSensor(Sensor) 
            InBound.setItsDefaultProvidedInterface(part);
            InBound.setPort(this); // for IS_PORT macro support
            
            //#]
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassSensor; 
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
        
        msg.add("floor", floor);
        msg.add("cabinFloor", cabinFloor);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Sensor.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Sensor.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Sensor.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Ascenseur/Sensor.java
*********************************************************************/

