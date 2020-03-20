package scikit;

import javax.script.ScriptEngine;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.IOException;
import Main.Console;
import Main.Library;

public class scikitCART extends scikitMethod{
	
	public scikitCART(String strAdresse, String strVariable, double propApp, ScriptEngine engine) {
		super(strAdresse, strVariable, propApp, engine);
		}

	public double run() {
		double accuracy = 0;
		String output="";
    	StringWriter outputWriter=null;
    	
		try {
			Process p = Runtime.getRuntime().exec("python src/coca/tree.py");
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";
            try {
                while((line = reader.readLine()) != null) {
                    // Traitement du flux de sortie de l'application si besoin est
                	outputWriter = new StringWriter();
                	
                }
            } finally {
                reader.close();
            }
        }
		catch(IOException ioe) {
           ioe.printStackTrace();
        }
    }
}