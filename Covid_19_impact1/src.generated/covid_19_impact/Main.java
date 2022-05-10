package covid_19_impact;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.*;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.routing.*;
import com.anylogic.engine.presentation.*;
import com.anylogic.engine.gui.*;

import com.anylogic.libraries.modules.markup_descriptors.*;

import java.awt.geom.Arc2D;

 

public class Main extends Agent
{
  // Parameters
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Main.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 10.0 );

  @Override
  public Scale getScale() {
    return scale;
  }


  // Events
	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _Vaccination_Status_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _Employment_graph_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _Vaccination_Zero_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _Employment_graph1_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _Vaccination_Status2_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _Employment_graph2_autoUpdateEvent_xjal = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == _Vaccination_Status_autoUpdateEvent_xjal ) return "Vaccination_Status auto update event";
     if( _e == _Employment_graph_autoUpdateEvent_xjal ) return "Employment_graph auto update event";
     if( _e == _Vaccination_Zero_autoUpdateEvent_xjal ) return "Vaccination_Zero auto update event";
     if( _e == _Employment_graph1_autoUpdateEvent_xjal ) return "Employment_graph1 auto update event";
     if( _e == _Vaccination_Status2_autoUpdateEvent_xjal ) return "Vaccination_Status2 auto update event";
     if( _e == _Employment_graph2_autoUpdateEvent_xjal ) return "Employment_graph2 auto update event";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == _Vaccination_Status_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _Employment_graph_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _Vaccination_Zero_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _Employment_graph1_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _Vaccination_Status2_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _Employment_graph2_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    return super.getModeOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime( EventTimeout _e ) {
    double _t;
    if ( _e == _Vaccination_Status_autoUpdateEvent_xjal ) { return getEngine().dateToTime( toDate( 2020, AUGUST, 1, 8, 0, 0 ) ); }
    if ( _e == _Employment_graph_autoUpdateEvent_xjal ) { return getEngine().dateToTime( toDate( 2020, AUGUST, 1, 0, 0, 0 ) ); }
    if ( _e == _Vaccination_Zero_autoUpdateEvent_xjal ) { return getEngine().dateToTime( toDate( 2020, AUGUST, 1, 0, 0, 0 ) ); }
    if ( _e == _Employment_graph1_autoUpdateEvent_xjal ) { return getEngine().dateToTime( toDate( 2020, AUGUST, 1, 0, 0, 0 ) ); }
    if ( _e == _Vaccination_Status2_autoUpdateEvent_xjal ) { return getEngine().dateToTime( toDate( 2020, AUGUST, 1, 0, 0, 0 ) ); }
    if ( _e == _Employment_graph2_autoUpdateEvent_xjal ) { return getEngine().dateToTime( toDate( 2020, AUGUST, 1, 0, 0, 0 ) ); }
    return super.getFirstOccurrenceTime( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( EventTimeout _e ) {
    double _t;
    if( _e == _Vaccination_Status_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toTimeoutInCalendar( DAY, _t );
      return _t;
    }
    if( _e == _Employment_graph_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toTimeoutInCalendar( DAY, _t );
      return _t;
    }
    if( _e == _Vaccination_Zero_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toTimeoutInCalendar( DAY, _t );
      return _t;
    }
    if( _e == _Employment_graph1_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toTimeoutInCalendar( DAY, _t );
      return _t;
    }
    if( _e == _Vaccination_Status2_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toTimeoutInCalendar( DAY, _t );
      return _t;
    }
    if( _e == _Employment_graph2_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toTimeoutInCalendar( DAY, _t );
      return _t;
    }
    return super.evaluateTimeoutOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventTimeout _e ) {
    if ( _e == _Vaccination_Status_autoUpdateEvent_xjal ) {
      Vaccination_Status.updateData();
      return;
    }
    if ( _e == _Employment_graph_autoUpdateEvent_xjal ) {
      Employment_graph.updateData();
      return;
    }
    if ( _e == _Vaccination_Zero_autoUpdateEvent_xjal ) {
      Vaccination_Zero.updateData();
      return;
    }
    if ( _e == _Employment_graph1_autoUpdateEvent_xjal ) {
      Employment_graph1.updateData();
      return;
    }
    if ( _e == _Vaccination_Status2_autoUpdateEvent_xjal ) {
      Vaccination_Status2.updateData();
      return;
    }
    if ( _e == _Employment_graph2_autoUpdateEvent_xjal ) {
      Employment_graph2.updateData();
      return;
    }
    super.executeActionOf( _e );
  }

	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 0;


  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForCodeCompletion_xjal(){
    {double _t = 
30 
;}
    {double _t = 
1 
;}
    class _Stub_Implements_xjal implements 
  {}
    class _Stub_Extends_xjal extends 
  {}
  }

  // Embedded Objects


  public String getNameOf( Agent ao ) {
    return super.getNameOf( ao );
  }

  public AgentAnimationSettings getAnimationSettingsOf( Agent ao ) {
    return super.getAnimationSettingsOf( ao );
  }

  public class _people_Population extends AgentArrayList<Person> {
    _people_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public Person instantiateAgent( int index ) {
    	return instantiate_people_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( Person agent, int index, TableInput tableInput ) {
      setupParameters_people_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( Person agent, int index, TableInput tableInput ) {
      doBeforeCreate_people_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return false;
    }


    public int NVaccinated() {
      return _people_NVaccinated_xjal();
    }

    public int NUnvaccinated() {
      return _people_NUnvaccinated_xjal();
    }

    public int NEmployed() {
      return _people_NEmployed_xjal();
    }

    public int NUnEmployed() {
      return _people_NUnEmployed_xjal();
    }

    public int NVaccinated1() {
      return _people_NVaccinated1_xjal();
    }

    public int NUnvaccinated1() {
      return _people_NUnvaccinated1_xjal();
    }

    public int NEmployed1() {
      return _people_NEmployed1_xjal();
    }

    public int NUnEmployed1() {
      return _people_NUnEmployed1_xjal();
    }

    public int NVaccinated2() {
      return _people_NVaccinated2_xjal();
    }

    public int NEmployed2() {
      return _people_NEmployed2_xjal();
    }

    public int NUnvaccinated2() {
      return _people_NUnvaccinated2_xjal();
    }

    public int NUnEmployed2() {
      return _people_NUnEmployed2_xjal();
    }    
    /**
     * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
     */ 
    @AnyLogicInternalCodegenAPI
    private static final long serialVersionUID = -6151343193167359487L;
  }
  
 
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "Person")
  public _people_Population people = new _people_Population( this );

  public String getNameOf( AgentList<?> aolist ) {
    if( aolist == people ) return "people";
    return super.getNameOf( aolist );
  }
  
  public AgentAnimationSettings getAnimationSettingsOf( AgentList<?> aolist ) {
    return super.getAnimationSettingsOf( aolist );
  }

  /**
   * Returns the agent element at the specified position in people
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public Person people(int index) {
    return people.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection people<br>
   * @return newly created embedded object
   */
  public Person add_people() {
    int index = people.size();
    Person _result_xjal = instantiate_people_xjal( index );
    people.callSetupParameters( _result_xjal, index );
    people.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection people<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>people.size()</code> method <strong>before</strong> this method is called
   * @param Vaccination_Rate
   * @param Employment_Rate
   * @param Vaccination_Rate_Zero
   * @param Employment_Rate_ZeroVaccination
   * @param Vaccination_Rate_HundredPercent
   * @param Employment_Rate_HundredVaccination
   * @param UnEmployment_Rate
   * @param UnEmployment_Rate1
   * @param UnEmployment_Rate2
   * @return newly created embedded object
   */
  public Person add_people( double Vaccination_Rate, double Employment_Rate, double Vaccination_Rate_Zero, double Employment_Rate_ZeroVaccination, double Vaccination_Rate_HundredPercent, double Employment_Rate_HundredVaccination, double UnEmployment_Rate, double UnEmployment_Rate1, double UnEmployment_Rate2 ) {
    int index = people.size();
    Person _result_xjal = instantiate_people_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.Vaccination_Rate = Vaccination_Rate;
    _result_xjal.Employment_Rate = Employment_Rate;
    _result_xjal.Vaccination_Rate_Zero = Vaccination_Rate_Zero;
    _result_xjal.Employment_Rate_ZeroVaccination = Employment_Rate_ZeroVaccination;
    _result_xjal.Vaccination_Rate_HundredPercent = Vaccination_Rate_HundredPercent;
    _result_xjal.Employment_Rate_HundredVaccination = Employment_Rate_HundredVaccination;
    _result_xjal.UnEmployment_Rate = UnEmployment_Rate;
    _result_xjal.UnEmployment_Rate1 = UnEmployment_Rate1;
    _result_xjal.UnEmployment_Rate2 = UnEmployment_Rate2;
    // Finish embedded object creation
    people.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection people<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object people - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to people
   */
  public boolean remove_people( Person object ) {
    if( ! people._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }

  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected Person instantiate_people_xjal( final int index ) {
    Person _result_xjal = new Person( getEngine(), this, people ) {
      // Additional class code

 
      // End of additional class code      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343193167359487L;
	};
    
    people._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_people_xjal( final Person self, final int index, TableInput _t ) {
    self.Vaccination_Rate = 
0.81 
;
    self.Employment_Rate = 
0.618 
;
    self.Vaccination_Rate_Zero = 
0.00 
;
    self.Employment_Rate_ZeroVaccination = 
0.30 
;
    self.Vaccination_Rate_HundredPercent = 
1.00 
;
    self.Employment_Rate_HundredVaccination = 
0.89 
;
    self.UnEmployment_Rate = 
0.05 
;
    self.UnEmployment_Rate1 = 
0.50 
;
    self.UnEmployment_Rate2 = 
0.02 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_people_xjal( Person self, final int index, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
    self.setEnvironment( this );
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );

    // Port connections
  }

  /**
   * <i>This method should not be called by user</i>
   */
  private int _people_NVaccinated_xjal() {
    int _value = 0;
    for ( Person item : people ) {
      boolean _t = 
item.inState(Person.Vaccinated)  
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _people_NUnvaccinated_xjal() {
    int _value = 0;
    for ( Person item : people ) {
      boolean _t = 
item.inState(Person.Unvaccinated) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _people_NEmployed_xjal() {
    int _value = 0;
    for ( Person item : people ) {
      boolean _t = 
item.inState(Person.Employed) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _people_NUnEmployed_xjal() {
    int _value = 0;
    for ( Person item : people ) {
      boolean _t = 
item.inState(Person.UnEmployed) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _people_NVaccinated1_xjal() {
    int _value = 0;
    for ( Person item : people ) {
      boolean _t = 
item.inState(Person.Vaccinated1)  
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _people_NUnvaccinated1_xjal() {
    int _value = 0;
    for ( Person item : people ) {
      boolean _t = 
item.inState(Person.Unvaccinated2) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _people_NEmployed1_xjal() {
    int _value = 0;
    for ( Person item : people ) {
      boolean _t = 
item.inState(Person.Employed1) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _people_NUnEmployed1_xjal() {
    int _value = 0;
    for ( Person item : people ) {
      boolean _t = 
item.inState(Person.UnEmployed1) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _people_NVaccinated2_xjal() {
    int _value = 0;
    for ( Person item : people ) {
      boolean _t = 
item.inState(Person.Vaccinated2)  
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _people_NEmployed2_xjal() {
    int _value = 0;
    for ( Person item : people ) {
      boolean _t = 
item.inState(Person.Employed2) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _people_NUnvaccinated2_xjal() {
    int _value = 0;
    for ( Person item : people ) {
      boolean _t = 
item.inState(Person.Unvaccinated1) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _people_NUnEmployed2_xjal() {
    int _value = 0;
    for ( Person item : people ) {
      boolean _t = 
item.inState(Person.UnEmployed2) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  @AnyLogicInternalCodegenAPI
  public DataSet _Vaccination_Status_expression0_dataSet_xjal = new DataSet( 30, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __Vaccination_Status_expression0_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }    
    /**
     * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
     */ 
    @AnyLogicInternalCodegenAPI
    private static final long serialVersionUID = -6151343193164212732L;
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __Vaccination_Status_expression0_dataSet_xjal_YValue() {
    return 
people.NVaccinated()+people.NVaccinated() 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _Vaccination_Status_expression1_dataSet_xjal = new DataSet( 30, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __Vaccination_Status_expression1_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }    
    /**
     * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
     */ 
    @AnyLogicInternalCodegenAPI
    private static final long serialVersionUID = -6151343193164212732L;
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __Vaccination_Status_expression1_dataSet_xjal_YValue() {
    return 
people.NUnvaccinated() 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _Employment_graph_expression0_dataSet_xjal = new DataSet( 30, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __Employment_graph_expression0_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }    
    /**
     * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
     */ 
    @AnyLogicInternalCodegenAPI
    private static final long serialVersionUID = -6151343193164212732L;
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __Employment_graph_expression0_dataSet_xjal_YValue() {
    return 
people.NEmployed()+people.NEmployed1() 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _Employment_graph_expression1_dataSet_xjal = new DataSet( 30, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __Employment_graph_expression1_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }    
    /**
     * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
     */ 
    @AnyLogicInternalCodegenAPI
    private static final long serialVersionUID = -6151343193164212732L;
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __Employment_graph_expression1_dataSet_xjal_YValue() {
    return 
people.NUnEmployed() 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _Vaccination_Zero_expression0_dataSet_xjal = new DataSet( 30, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __Vaccination_Zero_expression0_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }    
    /**
     * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
     */ 
    @AnyLogicInternalCodegenAPI
    private static final long serialVersionUID = -6151343194589408448L;
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __Vaccination_Zero_expression0_dataSet_xjal_YValue() {
    return 
people.NVaccinated1() 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _Vaccination_Zero_expression1_dataSet_xjal = new DataSet( 30, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __Vaccination_Zero_expression1_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }    
    /**
     * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
     */ 
    @AnyLogicInternalCodegenAPI
    private static final long serialVersionUID = -6151343194589408447L;
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __Vaccination_Zero_expression1_dataSet_xjal_YValue() {
    return 
people.NUnvaccinated1() 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _Employment_graph1_expression0_dataSet_xjal = new DataSet( 30, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __Employment_graph1_expression0_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }    
    /**
     * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
     */ 
    @AnyLogicInternalCodegenAPI
    private static final long serialVersionUID = -6151343194589231360L;
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __Employment_graph1_expression0_dataSet_xjal_YValue() {
    return 
people.NEmployed1() 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _Employment_graph1_expression1_dataSet_xjal = new DataSet( 30, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __Employment_graph1_expression1_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }    
    /**
     * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
     */ 
    @AnyLogicInternalCodegenAPI
    private static final long serialVersionUID = -6151343193164212732L;
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __Employment_graph1_expression1_dataSet_xjal_YValue() {
    return 
people.NUnEmployed1() 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _Vaccination_Status2_expression0_dataSet_xjal = new DataSet( 30, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __Vaccination_Status2_expression0_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }    
    /**
     * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
     */ 
    @AnyLogicInternalCodegenAPI
    private static final long serialVersionUID = -6151343194577943035L;
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __Vaccination_Status2_expression0_dataSet_xjal_YValue() {
    return 
people.NVaccinated2()+people.NVaccinated()+people.NVaccinated() 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _Vaccination_Status2_expression1_dataSet_xjal = new DataSet( 30, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __Vaccination_Status2_expression1_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }    
    /**
     * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
     */ 
    @AnyLogicInternalCodegenAPI
    private static final long serialVersionUID = -6151343194577943024L;
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __Vaccination_Status2_expression1_dataSet_xjal_YValue() {
    return 
people.NUnvaccinated2() 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _Employment_graph2_expression0_dataSet_xjal = new DataSet( 30, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __Employment_graph2_expression0_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }    
    /**
     * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
     */ 
    @AnyLogicInternalCodegenAPI
    private static final long serialVersionUID = -6151343194577878448L;
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __Employment_graph2_expression0_dataSet_xjal_YValue() {
    return 
people.NEmployed2()+people.NEmployed() 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _Employment_graph2_expression1_dataSet_xjal = new DataSet( 30, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __Employment_graph2_expression1_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }    
    /**
     * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
     */ 
    @AnyLogicInternalCodegenAPI
    private static final long serialVersionUID = -6151343193164212732L;
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __Employment_graph2_expression1_dataSet_xjal_YValue() {
    return 
people.NUnEmployed2() 
;
  }

  // View areas
  public ViewArea _origin_VA = new ViewArea( this, "[Origin]", 0, 0, 1000.0, 600.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 1 + super.getViewAreas( _output );
  }
  @AnyLogicInternalCodegenAPI
  protected static final Font _text7_Font = new Font("SansSerif", 0, 11 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text9_Font = new Font("SansSerif", 1, 12 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text10_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text8_Font = _text7_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text11_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text12_Font = _text7_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text13_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text15_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text16_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text14_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text17_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text18_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final int _Vaccination_Status = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _Employment_graph = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _Vaccination_Zero = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _Employment_graph1 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int _Vaccination_Status2 = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int _Employment_graph2 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int _text7 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _text9 = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int _text10 = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int _text8 = 10;
  @AnyLogicInternalCodegenAPI
  protected static final int _text11 = 11;
  @AnyLogicInternalCodegenAPI
  protected static final int _text12 = 12;
  @AnyLogicInternalCodegenAPI
  protected static final int _text13 = 13;
  @AnyLogicInternalCodegenAPI
  protected static final int _text15 = 14;
  @AnyLogicInternalCodegenAPI
  protected static final int _text16 = 15;
  @AnyLogicInternalCodegenAPI
  protected static final int _text14 = 16;
  @AnyLogicInternalCodegenAPI
  protected static final int _text17 = 17;
  @AnyLogicInternalCodegenAPI
  protected static final int _text18 = 18;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 19;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(Vaccination_Status, Employment_graph, Vaccination_Zero, Employment_graph1, Vaccination_Status2, Employment_graph2, text7, text9, text10, text8, text11, text12, text13, text15, text16, text14, text17, text18);
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _text7:
        if (true) {
          ShapeText self = this.text7;
          
 
        }
        break;
      case _text9:
        if (true) {
          ShapeText self = this.text9;
          
 
        }
        break;
      case _text10:
        if (true) {
          ShapeText self = this.text10;
          
 
        }
        break;
      case _text8:
        if (true) {
          ShapeText self = this.text8;
          
 
        }
        break;
      case _text11:
        if (true) {
          ShapeText self = this.text11;
          
 
        }
        break;
      case _text12:
        if (true) {
          ShapeText self = this.text12;
          
 
        }
        break;
      case _text13:
        if (true) {
          ShapeText self = this.text13;
          
 
        }
        break;
      case _text15:
        if (true) {
          ShapeText self = this.text15;
          
 
        }
        break;
      case _text16:
        if (true) {
          ShapeText self = this.text16;
          
 
        }
        break;
      case _text14:
        if (true) {
          ShapeText self = this.text14;
          
 
        }
        break;
      case _text17:
        if (true) {
          ShapeText self = this.text17;
          
 
        }
        break;
      case _text18:
        if (true) {
          ShapeText self = this.text18;
          
 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
   
  @Override
  @AnyLogicInternalCodegenAPI
  public void onSelectionChanged_xjal( int _shape, int index, int[] selectedIndices, boolean programmatically ) {
    switch( _shape ) {
      case _Vaccination_Status: {
        TimeStackChart self = this.Vaccination_Status;
        
 
;}
        break;
      case _Employment_graph: {
        TimeStackChart self = this.Employment_graph;
        
 
;}
        break;
      case _Vaccination_Zero: {
        TimeStackChart self = this.Vaccination_Zero;
        
 
;}
        break;
      case _Employment_graph1: {
        TimeStackChart self = this.Employment_graph1;
        
 
;}
        break;
      case _Vaccination_Status2: {
        TimeStackChart self = this.Vaccination_Status2;
        
 
;}
        break;
      case _Employment_graph2: {
        TimeStackChart self = this.Employment_graph2;
        
 
;}
        break;
      default:
        super.onSelectionChanged_xjal( _shape, index, selectedIndices, programmatically );
        break;
    }
  }


  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForReplication_xjal() {
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
  }

  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _Vaccination_Status_SetDynamicParams_xjal( TimeStackChart shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setWidth(
 
);
    shape.setHeight(
 
);
 	}
  }
  
  protected TimeStackChart Vaccination_Status;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _Employment_graph_SetDynamicParams_xjal( TimeStackChart shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setWidth(
 
);
    shape.setHeight(
 
);
 	}
  }
  
  protected TimeStackChart Employment_graph;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _Vaccination_Zero_SetDynamicParams_xjal( TimeStackChart shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setWidth(
 
);
    shape.setHeight(
 
);
 	}
  }
  
  protected TimeStackChart Vaccination_Zero;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _Employment_graph1_SetDynamicParams_xjal( TimeStackChart shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setWidth(
 
);
    shape.setHeight(
 
);
 	}
  }
  
  protected TimeStackChart Employment_graph1;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _Vaccination_Status2_SetDynamicParams_xjal( TimeStackChart shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setWidth(
 
);
    shape.setHeight(
 
);
 	}
  }
  
  protected TimeStackChart Vaccination_Status2;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _Employment_graph2_SetDynamicParams_xjal( TimeStackChart shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setWidth(
 
);
    shape.setHeight(
 
);
 	}
  }
  
  protected TimeStackChart Employment_graph2;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text7_SetDynamicParams_xjal( ShapeText shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setRotation(
 
);
    shape.setColor(
 
);
    shape.setText(
 
);
    shape.setFont(
 
);
    shape.setAlignment(
 
);
 	}
  }
  
  protected ShapeText text7;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text9_SetDynamicParams_xjal( ShapeText shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setRotation(
 
);
    shape.setColor(
 
);
    shape.setText(
 
);
    shape.setFont(
 
);
    shape.setAlignment(
 
);
 	}
  }
  
  protected ShapeText text9;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text10_SetDynamicParams_xjal( ShapeText shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setRotation(
 
);
    shape.setColor(
 
);
    shape.setText(
 
);
    shape.setFont(
 
);
    shape.setAlignment(
 
);
 	}
  }
  
  protected ShapeText text10;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text8_SetDynamicParams_xjal( ShapeText shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setRotation(
 
);
    shape.setColor(
 
);
    shape.setText(
 
);
    shape.setFont(
 
);
    shape.setAlignment(
 
);
 	}
  }
  
  protected ShapeText text8;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text11_SetDynamicParams_xjal( ShapeText shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setRotation(
 
);
    shape.setColor(
 
);
    shape.setText(
 
);
    shape.setFont(
 
);
    shape.setAlignment(
 
);
 	}
  }
  
  protected ShapeText text11;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text12_SetDynamicParams_xjal( ShapeText shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setRotation(
 
);
    shape.setColor(
 
);
    shape.setText(
 
);
    shape.setFont(
 
);
    shape.setAlignment(
 
);
 	}
  }
  
  protected ShapeText text12;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text13_SetDynamicParams_xjal( ShapeText shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setRotation(
 
);
    shape.setColor(
 
);
    shape.setText(
 
);
    shape.setFont(
 
);
    shape.setAlignment(
 
);
 	}
  }
  
  protected ShapeText text13;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text15_SetDynamicParams_xjal( ShapeText shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setRotation(
 
);
    shape.setColor(
 
);
    shape.setText(
 
);
    shape.setFont(
 
);
    shape.setAlignment(
 
);
 	}
  }
  
  protected ShapeText text15;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text16_SetDynamicParams_xjal( ShapeText shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setRotation(
 
);
    shape.setColor(
 
);
    shape.setText(
 
);
    shape.setFont(
 
);
    shape.setAlignment(
 
);
 	}
  }
  
  protected ShapeText text16;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text14_SetDynamicParams_xjal( ShapeText shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setRotation(
 
);
    shape.setColor(
 
);
    shape.setText(
 
);
    shape.setFont(
 
);
    shape.setAlignment(
 
);
 	}
  }
  
  protected ShapeText text14;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text17_SetDynamicParams_xjal( ShapeText shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setRotation(
 
);
    shape.setColor(
 
);
    shape.setText(
 
);
    shape.setFont(
 
);
    shape.setAlignment(
 
);
 	}
  }
  
  protected ShapeText text17;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text18_SetDynamicParams_xjal( ShapeText shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setRotation(
 
);
    shape.setColor(
 
);
    shape.setText(
 
);
    shape.setFont(
 
);
    shape.setAlignment(
 
);
 	}
  }
  
  protected ShapeText text18;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    text7 = new ShapeText(
        SHAPE_DRAW_2D, true,20.0, 90.0, 0.0, 0.0, 
        black,"Vaccination Rate.......................................... 0\r\nEmployment Rate........................................ 0.30\r\nUnEmployment Rate................................... 0.50",
        _text7_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text7_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194236909807L;
    };

    text9 = new ShapeText(
        SHAPE_DRAW_2D, true,20.0, 70.0, 0.0, 0.0, 
        black,"0 % Vaccination  model parameters",
        _text9_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text9_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194236825083L;
    };

    text10 = new ShapeText(
        SHAPE_DRAW_2D, true,340.0, 70.0, 0.0, 0.0, 
        black,"72 % Vaccination(current)  model parameters",
        _text10_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text10_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194242332847L;
    };

    text8 = new ShapeText(
        SHAPE_DRAW_2D, true,340.0, 90.0, 0.0, 0.0, 
        black,"Vaccination Rate.......................................... 0.72\r\nEmployment Rate........................................ 0.68\r\nUnEmployment Rate................................... 0.30",
        _text8_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text8_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194242332844L;
    };

    text11 = new ShapeText(
        SHAPE_DRAW_2D, true,690.0, 70.0, 0.0, 0.0, 
        black,"100 % Vaccination(current)  model parameters",
        _text11_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text11_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194238156271L;
    };

    text12 = new ShapeText(
        SHAPE_DRAW_2D, true,690.0, 90.0, 0.0, 0.0, 
        black,"Vaccination Rate.......................................... 1.00\r\nEmployment Rate........................................ 0.89\r\nUnEmployment Rate................................... 0.19",
        _text12_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text12_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194238156267L;
    };

    text13 = new ShapeText(
        SHAPE_DRAW_2D, true,20.0, 230.0, 0.0, 0.0, 
        black,"Vaccination Chart  of Ontario for 0% vaccination rate",
        _text13_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text13_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194238220523L;
    };

    text15 = new ShapeText(
        SHAPE_DRAW_2D, true,340.0, 230.0, 0.0, 0.0, 
        black,"Vaccination Chart  of Ontario for current vaccination rate",
        _text15_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text15_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194237873323L;
    };

    text16 = new ShapeText(
        SHAPE_DRAW_2D, true,680.0, 230.0, 0.0, 0.0, 
        black,"Vaccination Chart  of Ontario for 100% vaccination rate",
        _text16_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text16_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194237893051L;
    };

    text14 = new ShapeText(
        SHAPE_DRAW_2D, true,20.0, 420.0, 0.0, 0.0, 
        black,"Employment Chart  of Ontario for 0% vaccination rate",
        _text14_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text14_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194236906992L;
    };

    text17 = new ShapeText(
        SHAPE_DRAW_2D, true,340.0, 420.0, 0.0, 0.0, 
        black,"Employment Chart  of Ontario for current vaccination rate",
        _text17_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text17_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194236845564L;
    };

    text18 = new ShapeText(
        SHAPE_DRAW_2D, true,680.0, 420.0, 0.0, 0.0, 
        black,"Employment Chart  of Ontario for 100% vaccination rate",
        _text18_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text18_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194236910843L;
    };

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {
    DataSet _item;
    List<DataSet> _items = new ArrayList<DataSet>( 2 );
    _items.add( _Vaccination_Status_expression0_dataSet_xjal ); 
    _items.add( _Vaccination_Status_expression1_dataSet_xjal ); 
    List<String> _titles = new ArrayList<String>( 2 );
    _titles.add( "Vaccinated" );
    _titles.add( "Unvaccinated" );
    List<Color> _colors = new ArrayList<Color>( 2 );
    _colors.add( limeGreen );
    _colors.add( red );
    Vaccination_Status = new TimeStackChart(
		    Main.this, true, 330.0, 240.0, 
			340.0, 180.0,
            null, null,
            50.0, 30.0,
			260.0, 90.0, white, black, black,
            30.0, Chart.SOUTH,
            
1 
             * month(), Chart.WINDOW_MOVES_WITH_TIME, Chart.DEFAULT_DATE_PATTERN, Chart.SCALE_FIXED
            , 
100000 
            , Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _colors ) {
      @Override
      public void updateDynamicProperties() {
        _Vaccination_Status_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194573760699L;
    };

    }
    {
    DataSet _item;
    List<DataSet> _items = new ArrayList<DataSet>( 2 );
    _items.add( _Employment_graph_expression0_dataSet_xjal ); 
    _items.add( _Employment_graph_expression1_dataSet_xjal ); 
    List<String> _titles = new ArrayList<String>( 2 );
    _titles.add( "Employed" );
    _titles.add( "UnEmployed" );
    List<Color> _colors = new ArrayList<Color>( 2 );
    _colors.add( dodgerBlue );
    _colors.add( darkOrange );
    Employment_graph = new TimeStackChart(
		    Main.this, true, 350.0, 430.0, 
			330.0, 180.0,
            null, null,
            50.0, 30.0,
			250.0, 90.0, white, black, black,
            30.0, Chart.SOUTH,
            
1 
             * month(), Chart.WINDOW_MOVES_WITH_TIME, Chart.DEFAULT_DATE_PATTERN, Chart.SCALE_FIXED
            , 
100000 
            , Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _colors ) {
      @Override
      public void updateDynamicProperties() {
        _Employment_graph_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194506312192L;
    };

    }
    {
    DataSet _item;
    List<DataSet> _items = new ArrayList<DataSet>( 2 );
    _items.add( _Vaccination_Zero_expression0_dataSet_xjal ); 
    _items.add( _Vaccination_Zero_expression1_dataSet_xjal ); 
    List<String> _titles = new ArrayList<String>( 2 );
    _titles.add( "Vaccinated" );
    _titles.add( "Unvaccinated" );
    List<Color> _colors = new ArrayList<Color>( 2 );
    _colors.add( limeGreen );
    _colors.add( red );
    Vaccination_Zero = new TimeStackChart(
		    Main.this, true, -10.0, 230.0, 
			330.0, 200.0,
            null, null,
            50.0, 30.0,
			250.0, 110.0, white, black, black,
            30.0, Chart.SOUTH,
            
1 
             * month(), Chart.WINDOW_MOVES_WITH_TIME, Chart.DEFAULT_DATE_PATTERN, Chart.SCALE_FIXED
            , 
100000 
            , Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _colors ) {
      @Override
      public void updateDynamicProperties() {
        _Vaccination_Zero_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194589408444L;
    };

    }
    {
    DataSet _item;
    List<DataSet> _items = new ArrayList<DataSet>( 2 );
    _items.add( _Employment_graph1_expression0_dataSet_xjal ); 
    _items.add( _Employment_graph1_expression1_dataSet_xjal ); 
    List<String> _titles = new ArrayList<String>( 2 );
    _titles.add( "Employed" );
    _titles.add( "UnEmployed" );
    List<Color> _colors = new ArrayList<Color>( 2 );
    _colors.add( dodgerBlue );
    _colors.add( darkOrange );
    Employment_graph1 = new TimeStackChart(
		    Main.this, true, 10.0, 430.0, 
			320.0, 180.0,
            null, null,
            50.0, 30.0,
			240.0, 90.0, white, black, black,
            30.0, Chart.SOUTH,
            
1 
             * month(), Chart.WINDOW_MOVES_WITH_TIME, Chart.DEFAULT_DATE_PATTERN, Chart.SCALE_FIXED
            , 
100000 
            , Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _colors ) {
      @Override
      public void updateDynamicProperties() {
        _Employment_graph1_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194589231359L;
    };

    }
    {
    DataSet _item;
    List<DataSet> _items = new ArrayList<DataSet>( 2 );
    _items.add( _Vaccination_Status2_expression0_dataSet_xjal ); 
    _items.add( _Vaccination_Status2_expression1_dataSet_xjal ); 
    List<String> _titles = new ArrayList<String>( 2 );
    _titles.add( "Vaccinated" );
    _titles.add( "Unvaccinated" );
    List<Color> _colors = new ArrayList<Color>( 2 );
    _colors.add( limeGreen );
    _colors.add( red );
    Vaccination_Status2 = new TimeStackChart(
		    Main.this, true, 660.0, 240.0, 
			330.0, 180.0,
            null, null,
            50.0, 30.0,
			250.0, 90.0, white, black, black,
            30.0, Chart.SOUTH,
            
1 
             * month(), Chart.WINDOW_MOVES_WITH_TIME, Chart.DEFAULT_DATE_PATTERN, Chart.SCALE_FIXED
            , 
100000 
            , Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _colors ) {
      @Override
      public void updateDynamicProperties() {
        _Vaccination_Status2_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194577943023L;
    };

    }
    {
    DataSet _item;
    List<DataSet> _items = new ArrayList<DataSet>( 2 );
    _items.add( _Employment_graph2_expression0_dataSet_xjal ); 
    _items.add( _Employment_graph2_expression1_dataSet_xjal ); 
    List<String> _titles = new ArrayList<String>( 2 );
    _titles.add( "Employed" );
    _titles.add( "UnEmployed" );
    List<Color> _colors = new ArrayList<Color>( 2 );
    _colors.add( dodgerBlue );
    _colors.add( darkOrange );
    Employment_graph2 = new TimeStackChart(
		    Main.this, true, 680.0, 430.0, 
			320.0, 180.0,
            null, null,
            50.0, 30.0,
			240.0, 90.0, white, black, black,
            30.0, Chart.SOUTH,
            
1 
             * month(), Chart.WINDOW_MOVES_WITH_TIME, Chart.DEFAULT_DATE_PATTERN, Chart.SCALE_FIXED
            , 
100000 
            , Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _colors ) {
      @Override
      public void updateDynamicProperties() {
        _Employment_graph2_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -6151343194577878443L;
    };

    }
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  // Static initialization of persistent elements
  private void instantiatePersistentElements_xjal() {
    level = new com.anylogic.engine.markup.Level(this, "level", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getLevels_xjal = new com.anylogic.engine.markup.Level[] { 
      level };
    _createPersistentElementsBP0_xjal();
  }
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeTopLevelPresentationGroup getPresentationShape() {
    return presentation;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeModelElementsGroup getModelElementsShape() {
    return icon;
  }

	


  @Override
  @AnyLogicInternalCodegenAPI
  public void onArrival() {
    super.onArrival();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onStep() {
    super.onStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onBeforeStep() {
    super.onBeforeStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onEnterFlowchartBlock(Agent oldBlock, Agent block) {
    super.onEnterFlowchartBlock( oldBlock, block );
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onExitFlowchartBlock(Agent block) {
    super.onExitFlowchartBlock(block);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onSeizeResource(Agent unit) {
    super.onSeizeResource(unit);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onReleaseResource(Agent unit) {
    super.onReleaseResource(unit);
    
 
  }

  /**
   * Constructor
   */
  public Main( Engine engine, Agent owner, AgentList<? extends Main> ownerPopulation ) {
    super( engine, owner, ownerPopulation );
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
	instantiatePersistentElements_xjal();
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main() {
  }
  
  /**
   * Creating embedded object instances
   */
  @AnyLogicInternalCodegenAPI
  private void instantiatePopulations_xjal() {
    {
      int _cnt = 
100000 
;
      for ( int i = people.size(); i < _cnt; i++ ) {
        instantiate_people_xjal( i );
      }
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Creating embedded object instances
    instantiatePopulations_xjal();
    // Assigning initial values for plain variables
    setupPlainVariables_Main_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0 , level );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( Main.this, getElementProperty( "covid_19_impact.Main.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
    // Environments setup
    {
      double _x_xjal = 
500 
;
      double _y_xjal = 
500 
;
      double _z_xjal = 
0 
;
      setupSpace( _x_xjal, _y_xjal, _z_xjal );
    }
    disableSteps();
    setNetworkUserDefined();
    setLayoutType( LAYOUT_RANDOM );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    people.setEnvironment( this );
    for ( int i = 0; i < people.size(); i++ ) {
      Person _a = people.get(i); 
      setupParameters_people_xjal( _a, i, null );
      doBeforeCreate_people_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    setupInitialConditions_xjal( Main.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(AgentExtension _ext) {
    // Agent properties setup
    if ( _ext instanceof ExtAgentWithSpatialMetrics && _ext instanceof ExtWithSpaceType && !(tryExt(ExtAgentWithSpatialMetrics.class) instanceof ExtWithSpaceType) ) {
      double _speed;
      _speed = 
40 
;
      ((ExtAgentWithSpatialMetrics) _ext).setSpeed( _speed, MPS );
    }
    if ( _ext instanceof ExtEntity && tryExt(ExtEntity.class) == null ) {
      ExtEntity _e = (ExtEntity) _ext;
      double _length;
      _length = 
1 
;
	  _e.setLength( _length, METER );
	  double _width;
      _width = 
1 
;
	  _e.setWidth( _width, METER );
	  double _height;
      _height = 
1 
;
	  _e.setHeight( _height, METER );
    }
    if ( _ext instanceof ExtAgentWithSpatialMetrics && tryExt(ExtAgentWithSpatialMetrics.class) == null ) {
      ExtAgentWithSpatialMetrics _e = (ExtAgentWithSpatialMetrics) _ext;
      _e.setAutomaticHorizontalRotation( true );
    }
    if ( _ext instanceof ExtAgentContinuous && tryExt(ExtAgentContinuous.class) == null ) {
      ExtAgentContinuous _e = (ExtAgentContinuous) _ext;
      _e.setAutomaticVerticalRotation( false );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    _Vaccination_Status_autoUpdateEvent_xjal.start();
    _Employment_graph_autoUpdateEvent_xjal.start();
    _Vaccination_Zero_autoUpdateEvent_xjal.start();
    _Employment_graph1_autoUpdateEvent_xjal.start();
    _Vaccination_Status2_autoUpdateEvent_xjal.start();
    _Employment_graph2_autoUpdateEvent_xjal.start();
    applyLayout();
    for (Agent embeddedObject : people) {
      embeddedObject.startAsEmbedded();
    }
  }
 
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
 
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Main_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Main_xjal() {
  }

  // User API -----------------------------------------------------
  @AnyLogicInternalCodegenAPI
  public static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public void onReceive( Object _msg_xjal, Agent _sender_xjal ) {
    super.onReceive( _msg_xjal, _sender_xjal );
    
Object  msg = (Object) _msg_xjal;
    Agent sender = _sender_xjal;
    
 
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public List<Object> getEmbeddedObjects() {
    List<Object> list = super.getEmbeddedObjects();
    if (list == null) {
      list = new LinkedList<Object>();
    }
    list.add( people );
    return list;
  }

  public AgentList<? extends Main> getPopulation() {
    return (AgentList<? extends Main>) super.getPopulation();
  }

  public List<? extends Main> agentsInRange( double distance ) {
    return (List<? extends Main>) super.agentsInRange( distance );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean isLoggingToDB(EventOriginator _e) {
    if ( _e == _Vaccination_Status_autoUpdateEvent_xjal ) return false;
    if ( _e == _Employment_graph_autoUpdateEvent_xjal ) return false;
    if ( _e == _Vaccination_Zero_autoUpdateEvent_xjal ) return false;
    if ( _e == _Employment_graph1_autoUpdateEvent_xjal ) return false;
    if ( _e == _Vaccination_Status2_autoUpdateEvent_xjal ) return false;
    if ( _e == _Employment_graph2_autoUpdateEvent_xjal ) return false;
    return super.isLoggingToDB( _e );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    _Vaccination_Status_autoUpdateEvent_xjal.onDestroy();
    _Employment_graph_autoUpdateEvent_xjal.onDestroy();
    _Vaccination_Zero_autoUpdateEvent_xjal.onDestroy();
    _Employment_graph1_autoUpdateEvent_xjal.onDestroy();
    _Vaccination_Status2_autoUpdateEvent_xjal.onDestroy();
    _Employment_graph2_autoUpdateEvent_xjal.onDestroy();
    for (Agent _item : people) {
      _item.onDestroy();
    }
    // On destroy code
    
 
    _Vaccination_Status_expression0_dataSet_xjal.destroyUpdater_xjal();
    _Vaccination_Status_expression1_dataSet_xjal.destroyUpdater_xjal();
    _Employment_graph_expression0_dataSet_xjal.destroyUpdater_xjal();
    _Employment_graph_expression1_dataSet_xjal.destroyUpdater_xjal();
    _Vaccination_Zero_expression0_dataSet_xjal.destroyUpdater_xjal();
    _Vaccination_Zero_expression1_dataSet_xjal.destroyUpdater_xjal();
    _Employment_graph1_expression0_dataSet_xjal.destroyUpdater_xjal();
    _Employment_graph1_expression1_dataSet_xjal.destroyUpdater_xjal();
    _Vaccination_Status2_expression0_dataSet_xjal.destroyUpdater_xjal();
    _Vaccination_Status2_expression1_dataSet_xjal.destroyUpdater_xjal();
    _Employment_graph2_expression0_dataSet_xjal.destroyUpdater_xjal();
    _Employment_graph2_expression1_dataSet_xjal.destroyUpdater_xjal();
    logToDB( _Vaccination_Status_expression0_dataSet_xjal, "Vaccination_Status : Vaccinated" );
    logToDB( _Vaccination_Status_expression1_dataSet_xjal, "Vaccination_Status : Unvaccinated" );
    logToDB( _Employment_graph_expression0_dataSet_xjal, "Employment_graph : Employed" );
    logToDB( _Employment_graph_expression1_dataSet_xjal, "Employment_graph : UnEmployed" );
    logToDB( _Vaccination_Zero_expression0_dataSet_xjal, "Vaccination_Zero : Vaccinated" );
    logToDB( _Vaccination_Zero_expression1_dataSet_xjal, "Vaccination_Zero : Unvaccinated" );
    logToDB( _Employment_graph1_expression0_dataSet_xjal, "Employment_graph1 : Employed" );
    logToDB( _Employment_graph1_expression1_dataSet_xjal, "Employment_graph1 : UnEmployed" );
    logToDB( _Vaccination_Status2_expression0_dataSet_xjal, "Vaccination_Status2 : Vaccinated" );
    logToDB( _Vaccination_Status2_expression1_dataSet_xjal, "Vaccination_Status2 : Unvaccinated" );
    logToDB( _Employment_graph2_expression0_dataSet_xjal, "Employment_graph2 : Employed" );
    logToDB( _Employment_graph2_expression1_dataSet_xjal, "Employment_graph2 : UnEmployed" );
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    for (Agent _item : people) {
      _item.doFinish();
    }
  }

  // Additional class code

 
  // End of additional class code  
  /**
   * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
   */ 
  @AnyLogicInternalCodegenAPI
  private static final long serialVersionUID = -6151343193167560112L;


}
