
public class Invoker {
	
	 private Command command;

	 public void setCommand(Command c){
	        this.command = c;
	    }

	 
	  public void executeCommand(){
	        command.execute();
	    }

}
