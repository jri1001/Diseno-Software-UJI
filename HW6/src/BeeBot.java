
public class BeeBot {
	
	Historico_Comandos comandos = new Historico_Comandos();
	
	
	public void forward(){
        //System.out.println("Forward");
        comandos.anadir_comando("Forward");
        //System.out.println("Elementos de la lista" + " " + comandos.coman.toString());
    }
    
    public void back(){
        comandos.anadir_comando("Backward");
        //System.out.println("Elementos de la lista" + " " + comandos.coman.toString());
    }
    
    public void left(){
       //System.out.println("Turning left");
       comandos.anadir_comando("Turning left");
       //System.out.println("Elementos de la lista" + " " + comandos.coman.toString());
    }

    public void right(){
       //System.out.println("Turning right");
       comandos.anadir_comando("Turning right");
      //System.out.println("Elementos de la lista" + " " + comandos.coman.toString() );
    }
    
    public void borrar(){
      int ultimo = comandos.coman.size()-1;
      comandos.coman.remove(ultimo);
      //System.out.println("Elementos de la lista" + " " + comandos.coman.toString() );
    }
    
    public void Go(){
    	for(int i=0;i<comandos.coman.size();i++){
    		System.out.println(comandos.coman.get(i).toString());
    	}
    }
	
}
