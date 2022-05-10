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

import org.eclipse.jdt.internal.compiler.ast.IfStatement;
import org.eclipse.jetty.server.Authentication.SendSuccess; 

public class Person extends Agent
{
  // Parameters

 
  public 
double  Vaccination_Rate;

  /**
   * Returns default value for parameter <code>Vaccination_Rate</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _Vaccination_Rate_DefaultValue_xjal() {
    final Person self = this;
    return 
0.81 
;
  }

  public void set_Vaccination_Rate( double value ) {
    if (value == this.Vaccination_Rate) {
      return;
    }
    double _oldValue_xjal = this.Vaccination_Rate;
    this.Vaccination_Rate = value;
    onChange_Vaccination_Rate_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Vaccination_Rate.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Vaccination_Rate()</code> method instead.
   */
  protected void onChange_Vaccination_Rate() {
    onChange_Vaccination_Rate_xjal( Vaccination_Rate );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Vaccination_Rate_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  Employment_Rate;

  /**
   * Returns default value for parameter <code>Employment_Rate</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _Employment_Rate_DefaultValue_xjal() {
    final Person self = this;
    return 
0.618 
;
  }

  public void set_Employment_Rate( double value ) {
    if (value == this.Employment_Rate) {
      return;
    }
    double _oldValue_xjal = this.Employment_Rate;
    this.Employment_Rate = value;
    onChange_Employment_Rate_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Employment_Rate.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Employment_Rate()</code> method instead.
   */
  protected void onChange_Employment_Rate() {
    onChange_Employment_Rate_xjal( Employment_Rate );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Employment_Rate_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  Vaccination_Rate_Zero;

  /**
   * Returns default value for parameter <code>Vaccination_Rate_Zero</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _Vaccination_Rate_Zero_DefaultValue_xjal() {
    final Person self = this;
    return 
0.00 
;
  }

  public void set_Vaccination_Rate_Zero( double value ) {
    if (value == this.Vaccination_Rate_Zero) {
      return;
    }
    double _oldValue_xjal = this.Vaccination_Rate_Zero;
    this.Vaccination_Rate_Zero = value;
    onChange_Vaccination_Rate_Zero_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Vaccination_Rate_Zero.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Vaccination_Rate_Zero()</code> method instead.
   */
  protected void onChange_Vaccination_Rate_Zero() {
    onChange_Vaccination_Rate_Zero_xjal( Vaccination_Rate_Zero );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Vaccination_Rate_Zero_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  Employment_Rate_ZeroVaccination;

  /**
   * Returns default value for parameter <code>Employment_Rate_ZeroVaccination</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _Employment_Rate_ZeroVaccination_DefaultValue_xjal() {
    final Person self = this;
    return 
0.30 
;
  }

  public void set_Employment_Rate_ZeroVaccination( double value ) {
    if (value == this.Employment_Rate_ZeroVaccination) {
      return;
    }
    double _oldValue_xjal = this.Employment_Rate_ZeroVaccination;
    this.Employment_Rate_ZeroVaccination = value;
    onChange_Employment_Rate_ZeroVaccination_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Employment_Rate_ZeroVaccination.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Employment_Rate_ZeroVaccination()</code> method instead.
   */
  protected void onChange_Employment_Rate_ZeroVaccination() {
    onChange_Employment_Rate_ZeroVaccination_xjal( Employment_Rate_ZeroVaccination );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Employment_Rate_ZeroVaccination_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  Vaccination_Rate_HundredPercent;

  /**
   * Returns default value for parameter <code>Vaccination_Rate_HundredPercent</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _Vaccination_Rate_HundredPercent_DefaultValue_xjal() {
    final Person self = this;
    return 
1.00 
;
  }

  public void set_Vaccination_Rate_HundredPercent( double value ) {
    if (value == this.Vaccination_Rate_HundredPercent) {
      return;
    }
    double _oldValue_xjal = this.Vaccination_Rate_HundredPercent;
    this.Vaccination_Rate_HundredPercent = value;
    onChange_Vaccination_Rate_HundredPercent_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Vaccination_Rate_HundredPercent.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Vaccination_Rate_HundredPercent()</code> method instead.
   */
  protected void onChange_Vaccination_Rate_HundredPercent() {
    onChange_Vaccination_Rate_HundredPercent_xjal( Vaccination_Rate_HundredPercent );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Vaccination_Rate_HundredPercent_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  Employment_Rate_HundredVaccination;

  /**
   * Returns default value for parameter <code>Employment_Rate_HundredVaccination</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _Employment_Rate_HundredVaccination_DefaultValue_xjal() {
    final Person self = this;
    return 
0.89 
;
  }

  public void set_Employment_Rate_HundredVaccination( double value ) {
    if (value == this.Employment_Rate_HundredVaccination) {
      return;
    }
    double _oldValue_xjal = this.Employment_Rate_HundredVaccination;
    this.Employment_Rate_HundredVaccination = value;
    onChange_Employment_Rate_HundredVaccination_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Employment_Rate_HundredVaccination.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Employment_Rate_HundredVaccination()</code> method instead.
   */
  protected void onChange_Employment_Rate_HundredVaccination() {
    onChange_Employment_Rate_HundredVaccination_xjal( Employment_Rate_HundredVaccination );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Employment_Rate_HundredVaccination_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  UnEmployment_Rate;

  /**
   * Returns default value for parameter <code>UnEmployment_Rate</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _UnEmployment_Rate_DefaultValue_xjal() {
    final Person self = this;
    return 
0.05 
;
  }

  public void set_UnEmployment_Rate( double value ) {
    if (value == this.UnEmployment_Rate) {
      return;
    }
    double _oldValue_xjal = this.UnEmployment_Rate;
    this.UnEmployment_Rate = value;
    onChange_UnEmployment_Rate_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter UnEmployment_Rate.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_UnEmployment_Rate()</code> method instead.
   */
  protected void onChange_UnEmployment_Rate() {
    onChange_UnEmployment_Rate_xjal( UnEmployment_Rate );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_UnEmployment_Rate_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  UnEmployment_Rate1;

  /**
   * Returns default value for parameter <code>UnEmployment_Rate1</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _UnEmployment_Rate1_DefaultValue_xjal() {
    final Person self = this;
    return 
0.50 
;
  }

  public void set_UnEmployment_Rate1( double value ) {
    if (value == this.UnEmployment_Rate1) {
      return;
    }
    double _oldValue_xjal = this.UnEmployment_Rate1;
    this.UnEmployment_Rate1 = value;
    onChange_UnEmployment_Rate1_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter UnEmployment_Rate1.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_UnEmployment_Rate1()</code> method instead.
   */
  protected void onChange_UnEmployment_Rate1() {
    onChange_UnEmployment_Rate1_xjal( UnEmployment_Rate1 );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_UnEmployment_Rate1_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  UnEmployment_Rate2;

  /**
   * Returns default value for parameter <code>UnEmployment_Rate2</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _UnEmployment_Rate2_DefaultValue_xjal() {
    final Person self = this;
    return 
0.02 
;
  }

  public void set_UnEmployment_Rate2( double value ) {
    if (value == this.UnEmployment_Rate2) {
      return;
    }
    double _oldValue_xjal = this.UnEmployment_Rate2;
    this.UnEmployment_Rate2 = value;
    onChange_UnEmployment_Rate2_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter UnEmployment_Rate2.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_UnEmployment_Rate2()</code> method instead.
   */
  protected void onChange_UnEmployment_Rate2() {
    onChange_UnEmployment_Rate2_xjal( UnEmployment_Rate2 );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_UnEmployment_Rate2_xjal( double oldValue ) {

 
;  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    Vaccination_Rate = _Vaccination_Rate_DefaultValue_xjal();
    Employment_Rate = _Employment_Rate_DefaultValue_xjal();
    Vaccination_Rate_Zero = _Vaccination_Rate_Zero_DefaultValue_xjal();
    Employment_Rate_ZeroVaccination = _Employment_Rate_ZeroVaccination_DefaultValue_xjal();
    Vaccination_Rate_HundredPercent = _Vaccination_Rate_HundredPercent_DefaultValue_xjal();
    Employment_Rate_HundredVaccination = _Employment_Rate_HundredVaccination_DefaultValue_xjal();
    UnEmployment_Rate = _UnEmployment_Rate_DefaultValue_xjal();
    UnEmployment_Rate1 = _UnEmployment_Rate1_DefaultValue_xjal();
    UnEmployment_Rate2 = _UnEmployment_Rate2_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "Vaccination_Rate":
      if ( _callOnChange_xjal ) {
        set_Vaccination_Rate( ((Number) _value_xjal).doubleValue() );
      } else {
        Vaccination_Rate = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "Employment_Rate":
      if ( _callOnChange_xjal ) {
        set_Employment_Rate( ((Number) _value_xjal).doubleValue() );
      } else {
        Employment_Rate = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "Vaccination_Rate_Zero":
      if ( _callOnChange_xjal ) {
        set_Vaccination_Rate_Zero( ((Number) _value_xjal).doubleValue() );
      } else {
        Vaccination_Rate_Zero = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "Employment_Rate_ZeroVaccination":
      if ( _callOnChange_xjal ) {
        set_Employment_Rate_ZeroVaccination( ((Number) _value_xjal).doubleValue() );
      } else {
        Employment_Rate_ZeroVaccination = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "Vaccination_Rate_HundredPercent":
      if ( _callOnChange_xjal ) {
        set_Vaccination_Rate_HundredPercent( ((Number) _value_xjal).doubleValue() );
      } else {
        Vaccination_Rate_HundredPercent = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "Employment_Rate_HundredVaccination":
      if ( _callOnChange_xjal ) {
        set_Employment_Rate_HundredVaccination( ((Number) _value_xjal).doubleValue() );
      } else {
        Employment_Rate_HundredVaccination = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "UnEmployment_Rate":
      if ( _callOnChange_xjal ) {
        set_UnEmployment_Rate( ((Number) _value_xjal).doubleValue() );
      } else {
        UnEmployment_Rate = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "UnEmployment_Rate1":
      if ( _callOnChange_xjal ) {
        set_UnEmployment_Rate1( ((Number) _value_xjal).doubleValue() );
      } else {
        UnEmployment_Rate1 = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "UnEmployment_Rate2":
      if ( _callOnChange_xjal ) {
        set_UnEmployment_Rate2( ((Number) _value_xjal).doubleValue() );
      } else {
        UnEmployment_Rate2 = ((Number) _value_xjal).doubleValue();
      }
      return true;
    default:
      return super.setParameter( _name_xjal, _value_xjal, _callOnChange_xjal );
    }
  }

  @Override
  public <T> T getParameter(String _name_xjal) {
    Object _result_xjal;
    switch ( _name_xjal ) {
    case "Vaccination_Rate": _result_xjal = Vaccination_Rate; break;
    case "Employment_Rate": _result_xjal = Employment_Rate; break;
    case "Vaccination_Rate_Zero": _result_xjal = Vaccination_Rate_Zero; break;
    case "Employment_Rate_ZeroVaccination": _result_xjal = Employment_Rate_ZeroVaccination; break;
    case "Vaccination_Rate_HundredPercent": _result_xjal = Vaccination_Rate_HundredPercent; break;
    case "Employment_Rate_HundredVaccination": _result_xjal = Employment_Rate_HundredVaccination; break;
    case "UnEmployment_Rate": _result_xjal = UnEmployment_Rate; break;
    case "UnEmployment_Rate1": _result_xjal = UnEmployment_Rate1; break;
    case "UnEmployment_Rate2": _result_xjal = UnEmployment_Rate2; break;
    default: _result_xjal = super.getParameter( _name_xjal ); break;
    }
    return (T) _result_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private static String[] _parameterNames_xjal;

  @Override
  public String[] getParameterNames() {
    String[] result = _parameterNames_xjal;
    if (result == null) {
      List<String> list = new ArrayList<>( Arrays.asList( super.getParameterNames() ) );
      list.add( "Vaccination_Rate" );
      list.add( "Employment_Rate" );
      list.add( "Vaccination_Rate_Zero" );
      list.add( "Employment_Rate_ZeroVaccination" );
      list.add( "Vaccination_Rate_HundredPercent" );
      list.add( "Employment_Rate_HundredVaccination" );
      list.add( "UnEmployment_Rate" );
      list.add( "UnEmployment_Rate1" );
      list.add( "UnEmployment_Rate2" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Person.class );
  
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



	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 3;


  // Statecharts
  public Statechart<statechart_state> statechart = new Statechart<>( this, (short)5 );
  public Statechart<statechart1_state> statechart1 = new Statechart<>( this, (short)5 );
  public Statechart<statechart2_state> statechart2 = new Statechart<>( this, (short)5 );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( Statechart _s ) {
    if(_s == this.statechart) return "statechart";
    if(_s == this.statechart1) return "statechart1";
    if(_s == this.statechart2) return "statechart2";
    return super.getNameOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public int getIdOf( Statechart _s ) {
    if(_s == this.statechart) return 0;
    if(_s == this.statechart1) return 1;
    if(_s == this.statechart2) return 2;
    return super.getIdOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( Statechart _s ) {
    if( _s == this.statechart ) {
       Statechart<statechart_state> self = this.statechart;
       
 
;
      enterState( Unvaccinated, true );
      return;
    }
    if( _s == this.statechart1 ) {
       Statechart<statechart1_state> self = this.statechart1;
       
 
;
      enterState( Unvaccinated1, true );
      return;
    }
    if( _s == this.statechart2 ) {
       Statechart<statechart2_state> self = this.statechart2;
       
 
;
      enterState( Unvaccinated2, true );
      return;
    }
    super.executeActionOf( _s );
  }

   // States of all statecharts
   
  public enum statechart_state implements IStatechartState<Person, statechart_state> {
    Unvaccinated,
    Vaccinated,
    Employed,
    UnEmployed;

    @AnyLogicInternalCodegenAPI
    private Collection<statechart_state> _simpleStatesDeep_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<statechart_state> _fullState_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<statechart_state> _statesInside_xjal;

    @Override
    @AnyLogicInternalCodegenAPI
    public Collection<statechart_state> getSimpleStatesDeep() {
      Collection<statechart_state> result = _simpleStatesDeep_xjal;
      if (result == null) {
        _simpleStatesDeep_xjal = result = calculateAllSimpleStatesDeep();
      }
      return result;
    }
    
    @Override
    public Set<statechart_state> getFullState() {
      Set<statechart_state> result = _fullState_xjal;
      if (result == null) {
        _fullState_xjal = result = calculateFullState();
      }
      return result;
    }
    
    @Override
    @AnyLogicInternalCodegenAPI
    public Set<statechart_state> getStatesInside() {
      Set<statechart_state> result = _statesInside_xjal;
      if (result == null) {
        _statesInside_xjal = result = calculateStatesInside();
      }
      return result;
    }

    @Override
    @AnyLogicInternalCodegenAPI
    public Statechart<statechart_state> getStatechart( Person _a ) {
      return _a.statechart;
    }
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state Unvaccinated = statechart_state.Unvaccinated;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state Vaccinated = statechart_state.Vaccinated;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state Employed = statechart_state.Employed;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state UnEmployed = statechart_state.UnEmployed;

  public enum statechart1_state implements IStatechartState<Person, statechart1_state> {
    Unvaccinated1,
    Vaccinated1,
    Employed1,
    UnEmployed1;

    @AnyLogicInternalCodegenAPI
    private Collection<statechart1_state> _simpleStatesDeep_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<statechart1_state> _fullState_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<statechart1_state> _statesInside_xjal;

    @Override
    @AnyLogicInternalCodegenAPI
    public Collection<statechart1_state> getSimpleStatesDeep() {
      Collection<statechart1_state> result = _simpleStatesDeep_xjal;
      if (result == null) {
        _simpleStatesDeep_xjal = result = calculateAllSimpleStatesDeep();
      }
      return result;
    }
    
    @Override
    public Set<statechart1_state> getFullState() {
      Set<statechart1_state> result = _fullState_xjal;
      if (result == null) {
        _fullState_xjal = result = calculateFullState();
      }
      return result;
    }
    
    @Override
    @AnyLogicInternalCodegenAPI
    public Set<statechart1_state> getStatesInside() {
      Set<statechart1_state> result = _statesInside_xjal;
      if (result == null) {
        _statesInside_xjal = result = calculateStatesInside();
      }
      return result;
    }

    @Override
    @AnyLogicInternalCodegenAPI
    public Statechart<statechart1_state> getStatechart( Person _a ) {
      return _a.statechart1;
    }
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart1_state Unvaccinated1 = statechart1_state.Unvaccinated1;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart1_state Vaccinated1 = statechart1_state.Vaccinated1;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart1_state Employed1 = statechart1_state.Employed1;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart1_state UnEmployed1 = statechart1_state.UnEmployed1;

  public enum statechart2_state implements IStatechartState<Person, statechart2_state> {
    Unvaccinated2,
    Vaccinated2,
    Employed2,
    UnEmployed2;

    @AnyLogicInternalCodegenAPI
    private Collection<statechart2_state> _simpleStatesDeep_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<statechart2_state> _fullState_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<statechart2_state> _statesInside_xjal;

    @Override
    @AnyLogicInternalCodegenAPI
    public Collection<statechart2_state> getSimpleStatesDeep() {
      Collection<statechart2_state> result = _simpleStatesDeep_xjal;
      if (result == null) {
        _simpleStatesDeep_xjal = result = calculateAllSimpleStatesDeep();
      }
      return result;
    }
    
    @Override
    public Set<statechart2_state> getFullState() {
      Set<statechart2_state> result = _fullState_xjal;
      if (result == null) {
        _fullState_xjal = result = calculateFullState();
      }
      return result;
    }
    
    @Override
    @AnyLogicInternalCodegenAPI
    public Set<statechart2_state> getStatesInside() {
      Set<statechart2_state> result = _statesInside_xjal;
      if (result == null) {
        _statesInside_xjal = result = calculateStatesInside();
      }
      return result;
    }

    @Override
    @AnyLogicInternalCodegenAPI
    public Statechart<statechart2_state> getStatechart( Person _a ) {
      return _a.statechart2;
    }
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart2_state Unvaccinated2 = statechart2_state.Unvaccinated2;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart2_state Vaccinated2 = statechart2_state.Vaccinated2;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart2_state Employed2 = statechart2_state.Employed2;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart2_state UnEmployed2 = statechart2_state.UnEmployed2;


  @AnyLogicInternalCodegenAPI
  private void enterState( statechart_state self, boolean _destination ) {
    switch( self ) {
      case Unvaccinated:
  	    logToDBEnterState(statechart, self);
        // (Simple state (not composite))
        statechart.setActiveState_xjal( Unvaccinated );
        {
shapeBody.setFillColor(red); 
;}
        Is_Vaccinated.start();
        transition.start();
        Employment.start();
        transition3.start();
        UnEmployment.start();
        return;
      case Vaccinated:
  	    logToDBEnterState(statechart, self);
        // (Simple state (not composite))
        statechart.setActiveState_xjal( Vaccinated );
        {
shapeBody.setFillColor(limeGreen); 
;}
        return;
      case Employed:
  	    logToDBEnterState(statechart, self);
        // (Simple state (not composite))
        statechart.setActiveState_xjal( Employed );
        {
shapeBody.setFillColor(dodgerBlue); 
;}
        return;
      case UnEmployed:
  	    logToDBEnterState(statechart, self);
        // (Simple state (not composite))
        statechart.setActiveState_xjal( UnEmployed );
        {
shapeBody.setFillColor(yellow); 
;}
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitState( statechart_state self, Transition _t, boolean _source ) {
    switch( self ) {
      case Unvaccinated: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != Is_Vaccinated) Is_Vaccinated.cancel();
        if ( !_source || _t != transition) transition.cancel();
        if ( !_source || _t != Employment) Employment.cancel();
        if ( !_source || _t != transition3) transition3.cancel();
        if ( !_source || _t != UnEmployment) UnEmployment.cancel();
        {
 
;}
        return;
      case Vaccinated: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Simple state (not composite))
        {
sendToAllConnected("Employed"); 
;}
        return;
      case Employed: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Simple state (not composite))
        {
 
;}
        return;
      case UnEmployed: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Simple state (not composite))
        {
 
;}
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitInnerStates( statechart_state _destination ) {
    statechart_state _state = statechart.getActiveSimpleState();
    while( _state != _destination ) {
			exitState( _state, null, false );
			_state = _state.getContainerState();
		}
	}
  @AnyLogicInternalCodegenAPI
  private void enterState( statechart1_state self, boolean _destination ) {
    switch( self ) {
      case Unvaccinated1:
  	    logToDBEnterState(statechart1, self);
        // (Simple state (not composite))
        statechart1.setActiveState_xjal( Unvaccinated1 );
        {
shapeBody.setFillColor(red); 
;}
        Is_Vaccinated1.start();
        transition1.start();
        Employment1.start();
        transition4.start();
        Employment3.start();
        return;
      case Vaccinated1:
  	    logToDBEnterState(statechart1, self);
        // (Simple state (not composite))
        statechart1.setActiveState_xjal( Vaccinated1 );
        {
shapeBody.setFillColor(limeGreen); 
;}
        return;
      case Employed1:
  	    logToDBEnterState(statechart1, self);
        // (Simple state (not composite))
        statechart1.setActiveState_xjal( Employed1 );
        {
shapeBody.setFillColor(dodgerBlue); 
;}
        return;
      case UnEmployed1:
  	    logToDBEnterState(statechart1, self);
        // (Simple state (not composite))
        statechart1.setActiveState_xjal( UnEmployed1 );
        {
shapeBody.setFillColor(yellow); 
;}
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitState( statechart1_state self, Transition _t, boolean _source ) {
    switch( self ) {
      case Unvaccinated1: 
  	    logToDBExitState(statechart1, self);
  	    logToDB(statechart1, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != Is_Vaccinated1) Is_Vaccinated1.cancel();
        if ( !_source || _t != transition1) transition1.cancel();
        if ( !_source || _t != Employment1) Employment1.cancel();
        if ( !_source || _t != transition4) transition4.cancel();
        if ( !_source || _t != Employment3) Employment3.cancel();
        {
 
;}
        return;
      case Vaccinated1: 
  	    logToDBExitState(statechart1, self);
  	    logToDB(statechart1, _t, self);
      // (Simple state (not composite))
        {
 
;}
        return;
      case Employed1: 
  	    logToDBExitState(statechart1, self);
  	    logToDB(statechart1, _t, self);
      // (Simple state (not composite))
        {
 
;}
        return;
      case UnEmployed1: 
  	    logToDBExitState(statechart1, self);
  	    logToDB(statechart1, _t, self);
      // (Simple state (not composite))
        {
 
;}
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitInnerStates( statechart1_state _destination ) {
    statechart1_state _state = statechart1.getActiveSimpleState();
    while( _state != _destination ) {
			exitState( _state, null, false );
			_state = _state.getContainerState();
		}
	}
  @AnyLogicInternalCodegenAPI
  private void enterState( statechart2_state self, boolean _destination ) {
    switch( self ) {
      case Unvaccinated2:
  	    logToDBEnterState(statechart2, self);
        // (Simple state (not composite))
        statechart2.setActiveState_xjal( Unvaccinated2 );
        {
shapeBody.setFillColor(red); 
;}
        Is_Vaccinated2.start();
        transition2.start();
        Employment2.start();
        transition5.start();
        Employment4.start();
        return;
      case Vaccinated2:
  	    logToDBEnterState(statechart2, self);
        // (Simple state (not composite))
        statechart2.setActiveState_xjal( Vaccinated2 );
        {
shapeBody.setFillColor(limeGreen); 
;}
        return;
      case Employed2:
  	    logToDBEnterState(statechart2, self);
        // (Simple state (not composite))
        statechart2.setActiveState_xjal( Employed2 );
        {
shapeBody.setFillColor(dodgerBlue); 
;}
        return;
      case UnEmployed2:
  	    logToDBEnterState(statechart2, self);
        // (Simple state (not composite))
        statechart2.setActiveState_xjal( UnEmployed2 );
        {
shapeBody.setFillColor(yellow); 
;}
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitState( statechart2_state self, Transition _t, boolean _source ) {
    switch( self ) {
      case Unvaccinated2: 
  	    logToDBExitState(statechart2, self);
  	    logToDB(statechart2, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != Is_Vaccinated2) Is_Vaccinated2.cancel();
        if ( !_source || _t != transition2) transition2.cancel();
        if ( !_source || _t != Employment2) Employment2.cancel();
        if ( !_source || _t != transition5) transition5.cancel();
        if ( !_source || _t != Employment4) Employment4.cancel();
        {
 
;}
        return;
      case Vaccinated2: 
  	    logToDBExitState(statechart2, self);
  	    logToDB(statechart2, _t, self);
      // (Simple state (not composite))
        {
 
;}
        return;
      case Employed2: 
  	    logToDBExitState(statechart2, self);
  	    logToDB(statechart2, _t, self);
      // (Simple state (not composite))
        {
 
;}
        return;
      case UnEmployed2: 
  	    logToDBExitState(statechart2, self);
  	    logToDB(statechart2, _t, self);
      // (Simple state (not composite))
        {
 
;}
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitInnerStates( statechart2_state _destination ) {
    statechart2_state _state = statechart2.getActiveSimpleState();
    while( _state != _destination ) {
			exitState( _state, null, false );
			_state = _state.getContainerState();
		}
	}
  


  public TransitionRate Is_Vaccinated = new TransitionRate( this );
  public TransitionRate Employment = new TransitionRate( this );
  public TransitionRate UnEmployment = new TransitionRate( this );
  public TransitionRate Is_Vaccinated1 = new TransitionRate( this );
  public TransitionRate Employment1 = new TransitionRate( this );
  public TransitionRate Employment3 = new TransitionRate( this );
  public TransitionRate Is_Vaccinated2 = new TransitionRate( this );
  public TransitionRate Employment2 = new TransitionRate( this );
  public TransitionRate Employment4 = new TransitionRate( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionRate _t ) {
    if ( _t == Is_Vaccinated ) return "Is_Vaccinated";
    if ( _t == Employment ) return "Employment";
    if ( _t == UnEmployment ) return "UnEmployment";
    if ( _t == Is_Vaccinated1 ) return "Is_Vaccinated1";
    if ( _t == Employment1 ) return "Employment1";
    if ( _t == Employment3 ) return "Employment3";
    if ( _t == Is_Vaccinated2 ) return "Is_Vaccinated2";
    if ( _t == Employment2 ) return "Employment2";
    if ( _t == Employment4 ) return "Employment4";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionRate _t ) { 
    if ( _t == Is_Vaccinated ) return statechart;
    if ( _t == Employment ) return statechart;
    if ( _t == UnEmployment ) return statechart;
    if ( _t == Is_Vaccinated1 ) return statechart1;
    if ( _t == Employment1 ) return statechart1;
    if ( _t == Employment3 ) return statechart1;
    if ( _t == Is_Vaccinated2 ) return statechart2;
    if ( _t == Employment2 ) return statechart2;
    if ( _t == Employment4 ) return statechart2;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testGuardOf( TransitionRate _t ) {
    if ( _t == Is_Vaccinated ) return 
 
;
    if ( _t == Employment ) return 
 
;
    if ( _t == UnEmployment ) return 
 
;
    if ( _t == Is_Vaccinated1 ) return 
 
;
    if ( _t == Employment1 ) return 
 
;
    if ( _t == Employment3 ) return 
 
;
    if ( _t == Is_Vaccinated2 ) return 
 
;
    if ( _t == Employment2 ) return 
 
;
    if ( _t == Employment4 ) return 
 
;
    return super.testGuardOf(  _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionRate self ) {
    if ( self == Is_Vaccinated ) {
      exitState( Unvaccinated, self, true );
      {
 
;}
          enterState( Vaccinated, true );
      return;
    }
    if ( self == Employment ) {
      {
sendToRandom("Employed"); 
;}
      Employment.start();
      return;
    }
    if ( self == UnEmployment ) {
      {
sendToRandom("UnEmployed"); 
;}
      UnEmployment.start();
      return;
    }
    if ( self == Is_Vaccinated1 ) {
      exitState( Unvaccinated1, self, true );
      {
 
;}
          enterState( Vaccinated1, true );
      return;
    }
    if ( self == Employment1 ) {
      {
sendToRandom("Employed"); 
;}
      Employment1.start();
      return;
    }
    if ( self == Employment3 ) {
      {
sendToRandom("UnEmployed"); 
;}
      Employment3.start();
      return;
    }
    if ( self == Is_Vaccinated2 ) {
      exitState( Unvaccinated2, self, true );
      {
 
;}
          enterState( Vaccinated2, true );
      return;
    }
    if ( self == Employment2 ) {
      {
sendToRandom("Employed"); 
;}
      Employment2.start();
      return;
    }
    if ( self == Employment4 ) {
      {
sendToRandom("UnEmployed"); 
;}
      Employment4.start();
      return;
    }
    super.executeActionOf( self );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateRateOf( TransitionRate _t ) {
    double _value;
    if ( _t == Is_Vaccinated ) {
      _value = 
Vaccination_Rate 
;
      _value = toModelRate( _value, PER_MONTH );
      return _value;
    }
    if ( _t == Employment ) {
      _value = 
Employment_Rate 
;
      _value = toModelRate( _value, PER_MONTH );
      return _value;
    }
    if ( _t == UnEmployment ) {
      _value = 
UnEmployment_Rate 
;
      _value = toModelRate( _value, PER_MONTH );
      return _value;
    }
    if ( _t == Is_Vaccinated1 ) {
      _value = 
Vaccination_Rate_Zero 
;
      _value = toModelRate( _value, PER_MONTH );
      return _value;
    }
    if ( _t == Employment1 ) {
      _value = 
Employment_Rate_ZeroVaccination 
;
      _value = toModelRate( _value, PER_MONTH );
      return _value;
    }
    if ( _t == Employment3 ) {
      _value = 
UnEmployment_Rate1 
;
      _value = toModelRate( _value, PER_MONTH );
      return _value;
    }
    if ( _t == Is_Vaccinated2 ) {
      _value = 
Vaccination_Rate_HundredPercent 
;
      _value = toModelRate( _value, PER_MONTH );
      return _value;
    }
    if ( _t == Employment2 ) {
      _value = 
Employment_Rate_HundredVaccination 
;
      _value = toModelRate( _value, PER_MONTH );
      return _value;
    }
    if ( _t == Employment4 ) {
      _value = 
UnEmployment_Rate2 
;
      _value = toModelRate( _value, PER_MONTH );
      return _value;
    }
    return super.evaluateRateOf( _t );
  }

  public TransitionMessage transition = new TransitionMessage( this );
  public TransitionMessage transition3 = new TransitionMessage( this );
  public TransitionMessage transition1 = new TransitionMessage( this );
  public TransitionMessage transition4 = new TransitionMessage( this );
  public TransitionMessage transition2 = new TransitionMessage( this );
  public TransitionMessage transition5 = new TransitionMessage( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionMessage _t ) {
    if ( _t == transition ) return "transition";
    if ( _t == transition3 ) return "transition3";
    if ( _t == transition1 ) return "transition1";
    if ( _t == transition4 ) return "transition4";
    if ( _t == transition2 ) return "transition2";
    if ( _t == transition5 ) return "transition5";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionMessage _t ) { 
    if ( _t == transition ) return statechart;
    if ( _t == transition3 ) return statechart;
    if ( _t == transition1 ) return statechart1;
    if ( _t == transition4 ) return statechart1;
    if ( _t == transition2 ) return statechart2;
    if ( _t == transition5 ) return statechart2;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testGuardOf( TransitionMessage _t ) {
    if ( _t == transition ) return 
randomTrue(Employment_Rate) 
;
    if ( _t == transition3 ) return 
randomTrue(UnEmployment_Rate) 
;
    if ( _t == transition1 ) return 
randomTrue(Employment_Rate_ZeroVaccination) 
;
    if ( _t == transition4 ) return 
randomTrue(UnEmployment_Rate1) 
;
    if ( _t == transition2 ) return 
randomTrue(Employment_Rate_HundredVaccination) 
;
    if ( _t == transition5 ) return 
randomTrue(UnEmployment_Rate2) 
;
    return super.testGuardOf(  _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionMessage self, Object _msg ) {
    if ( self == transition ) {
      exitState( Unvaccinated, self, true );
      {
        String msg = (String) _msg;
 
;}
          enterState( Employed, true );
      return;
    }
    if ( self == transition3 ) {
      exitState( Unvaccinated, self, true );
      {
        String msg = (String) _msg;
 
;}
          enterState( UnEmployed, true );
      return;
    }
    if ( self == transition1 ) {
      exitState( Unvaccinated1, self, true );
      {
        String msg = (String) _msg;
 
;}
          enterState( Employed1, true );
      return;
    }
    if ( self == transition4 ) {
      exitState( Unvaccinated1, self, true );
      {
        String msg = (String) _msg;
 
;}
          enterState( UnEmployed1, true );
      return;
    }
    if ( self == transition2 ) {
      exitState( Unvaccinated2, self, true );
      {
        String msg = (String) _msg;
 
;}
          enterState( Employed2, true );
      return;
    }
    if ( self == transition5 ) {
      exitState( Unvaccinated2, self, true );
      {
        String msg = (String) _msg;
 
;}
          enterState( UnEmployed2, true );
      return;
    }
    super.executeActionOf( self, _msg );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testMessageOf( TransitionMessage _t, Object _msg ) {
    if ( _t == transition ) {
      if ( !(_msg instanceof String) )
        return false;
      
String 
msg = (String) _msg;
      Object _g = 
"Employed" 
;
      return msg.equals( _g );
    }
    if ( _t == transition3 ) {
      if ( !(_msg instanceof String) )
        return false;
      
String 
msg = (String) _msg;
      Object _g = 
"UnEmployed" 
;
      return msg.equals( _g );
    }
    if ( _t == transition1 ) {
      if ( !(_msg instanceof String) )
        return false;
      
String 
msg = (String) _msg;
      Object _g = 
"Employed" 
;
      return msg.equals( _g );
    }
    if ( _t == transition4 ) {
      if ( !(_msg instanceof String) )
        return false;
      
String 
msg = (String) _msg;
      Object _g = 
"UnEmployed" 
;
      return msg.equals( _g );
    }
    if ( _t == transition2 ) {
      if ( !(_msg instanceof String) )
        return false;
      
String 
msg = (String) _msg;
      Object _g = 
"Employed" 
;
      return msg.equals( _g );
    }
    if ( _t == transition5 ) {
      if ( !(_msg instanceof String) )
        return false;
      
String 
msg = (String) _msg;
      Object _g = 
"UnEmployed" 
;
      return msg.equals( _g );
    }
    return super.testMessageOf( _t, _msg );
  }
  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForCodeCompletion_xjal(){
    {double _t = 
0 
;}
    {double _t = 
1 
;}
    class _Stub_Implements_xjal implements 
  {}
    class _Stub_Extends_xjal extends 
  {}
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
  protected static final int _shapeBody = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _person = 2;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 3;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 3.0, -1.0, -2.0, -2.0, -2.0, 0.0, -1.0, 0.0, 1.0, 3.0, 4.0, 5.0, 4.0, 6.0, 6.0, 6.0, 5.0, 1.0, 4.0, 4.0, 4.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDY_xjal() {
    return new double[] { 0.0, 4.0, 2.0, 3.0, 3.0, 10.0, 11.0, 11.0, 9.0, 17.0, 17.0, 17.0, 17.0, 9.0, 11.0, 11.0, 10.0, 3.0, 3.0, 2.0, 4.0, 0.0, -3.0, -3.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(person);
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _shapeBody:
        if (true) {
          ShapeCurve self = this.shapeBody;
          
 
        }
        break;
      case _person:
        if (true) {
          ShapeGroup self = this.person;
          
 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onShapeGroupDraw( int _shape, int index ) {
    switch( _shape ) {
      case _person:
          
 
        break;
      default:
        super.onShapeGroupDraw( _shape, index );
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
  }

  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _shapeBody_SetDynamicParams_xjal( ShapeCurve shape ) {
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
    shape.setZHeight(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setScaleZ(
 
);
    shape.setRotation(
 
);
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
    shape.setNPoints(
 
);
    for (int indexPt = 0; indexPt < shape.getNPoints(); indexPt++) {
      shape.setPointDx( indexPt, 
 
);
     }
    for (int indexPt = 0; indexPt < shape.getNPoints(); indexPt++) {
      shape.setPointDy( indexPt, 
 
);
    }
    for (int indexPt = 0; indexPt < shape.getNPoints(); indexPt++) {
      shape.setPointDz( indexPt, 
 
);
    }
 	}
  }
  
  protected ShapeCurve shapeBody;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _person_SetDynamicParams_xjal( ShapeGroup shape ) {
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
    shape.setScaleZ(
 
);
    shape.setRotationY(
 
);
    shape.setRotationX(
 
);
    shape.setRotationZ(
 
);
 	}
  }
  
  protected ShapeGroup person;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    shapeBody = new ShapeCurve(
      true,-2.0, -7.0, 
      null, black,
      24, true, _shapeBody_pointsDX_xjal(), _shapeBody_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    ) {
      @Override
      public void updateDynamicProperties() {
        _shapeBody_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -9211363899023423102L;
    };

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    person = new ShapeGroup( Person.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , shapeBody ) {
      @Override
      public void updateDynamicProperties() {
        _person_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void onDraw() {
        onShapeGroupDraw( _person, 0 );
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = -9211363900180984701L;
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
  public Person( Engine engine, Agent owner, AgentList<? extends Person> ownerPopulation ) {
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
    main = get_Main();
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Person() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Person( double Vaccination_Rate, double Employment_Rate, double Vaccination_Rate_Zero, double Employment_Rate_ZeroVaccination, double Vaccination_Rate_HundredPercent, double Employment_Rate_HundredVaccination, double UnEmployment_Rate, double UnEmployment_Rate1, double UnEmployment_Rate2 ) {
    markParametersAreSet();
    this.Vaccination_Rate = Vaccination_Rate;
    this.Employment_Rate = Employment_Rate;
    this.Vaccination_Rate_Zero = Vaccination_Rate_Zero;
    this.Employment_Rate_ZeroVaccination = Employment_Rate_ZeroVaccination;
    this.Vaccination_Rate_HundredPercent = Vaccination_Rate_HundredPercent;
    this.Employment_Rate_HundredVaccination = Employment_Rate_HundredVaccination;
    this.UnEmployment_Rate = UnEmployment_Rate;
    this.UnEmployment_Rate1 = UnEmployment_Rate1;
    this.UnEmployment_Rate2 = UnEmployment_Rate2;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_Person_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Person.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( Person.this, getElementProperty( "covid_19_impact.Person.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Person.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(AgentExtension _ext) {
    // Agent properties setup
    if ( _ext instanceof ExtAgentWithSpatialMetrics && _ext instanceof ExtWithSpaceType && !(tryExt(ExtAgentWithSpatialMetrics.class) instanceof ExtWithSpaceType) ) {
      double _speed;
      _speed = 
10 
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
    statechart.start();
    statechart1.start();
    statechart2.start();
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
    setupPlainVariables_Person_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Person_xjal() {
  }

  // User API -----------------------------------------------------
  public Main get_Main() {
    {
      Agent owner = getOwner();
      if ( owner instanceof Main ) return (Main) owner;
    }
    return null;
  }

  /**
   * Read-only variable. <em>Shouldn't be modified by user.</em>
   */
  @AnyLogicCustomSerialization(AnyLogicCustomSerializationMode.REFERENCE)
  public transient covid_19_impact.Main main;

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
    
 
    statechart.fireEvent( _msg_xjal );
    statechart1.fireEvent( _msg_xjal );
    statechart2.fireEvent( _msg_xjal );
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends Person> getPopulation() {
    return (AgentList<? extends Person>) super.getPopulation();
  }

  public List<? extends Person> agentsInRange( double distance ) {
    return (List<? extends Person>) super.agentsInRange( distance );
  }

  // Reaction on changes -------------------------------------
  public void onChange() {
    super.onChange();
    statechart.onChange();
    statechart1.onChange();
    statechart2.onChange();
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    statechart.onDestroy();
    statechart1.onDestroy();
    statechart2.onDestroy();
    // On destroy code
    
 
    super.onDestroy();
  }

  // Additional class code

 
  // End of additional class code  
  /**
   * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
   */ 
  @AnyLogicInternalCodegenAPI
  private static final long serialVersionUID = -9211363900386222717L;


}
