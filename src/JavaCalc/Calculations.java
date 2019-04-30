package JavaCalc;
import jdk.jshell.JShell;  
import java.util.List; 
import jdk.jshell.SnippetEvent;

public class Calculations {

	private JShell js; 
	private String input; 
	private List<SnippetEvent> eval ;
	
	public Calculations() {
		js = JShell.create(); 
		input = ""; 
	}
	
	public void setInput(String command) {
		input = command;
	}
	
    public String getInput() {
		return input; 
	}
    
    public String evaluate() {
    	eval = js.eval(input); 
    	eval.forEach(eval -> setInput(eval.value()));
    	

    	return input ;
    }
}
