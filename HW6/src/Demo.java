
public class Demo {
	
	public static void main(String[] args) {
        Invoker invoker = new Invoker();
        BeeBot bot = new BeeBot();

        invoker.setCommand(new Forward(bot));
        invoker.executeCommand();

        invoker.setCommand(new Left(bot));
        invoker.executeCommand();

        invoker.setCommand(new Back(bot));
        invoker.executeCommand();

        invoker.setCommand(new Forward(bot));
        invoker.executeCommand();

        invoker.setCommand(new Right(bot));
        invoker.executeCommand();

        invoker.setCommand(new Borrar_UltimaTecla(bot));
        invoker.executeCommand();
        
        invoker.setCommand(new GO(bot));
        invoker.executeCommand();
    } 

}
