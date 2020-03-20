package scikit;

import javax.script.ScriptEngine;


public abstract class scikitMethod {
	
	/** 
	 * classe abstraite qui sert de modèle aux trois méthodes de Scikit-Learn
	 */
	
	String strAdresse;
	String strVariable;
	double propApp;
	ScriptEngine engine;
	
	public scikitMethod(String strAdresse, String strVariable, double propApp, ScriptEngine engine) {
		this.strAdresse = strAdresse;
		this.strVariable = strVariable;
		this.propApp = propApp;
		this.engine = engine;
	}
	
	public abstract double run();
	
}
