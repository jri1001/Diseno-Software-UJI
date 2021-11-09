import java.util.ArrayList;
import java.util.List;

public class Historico_Comandos<T> {
	
	List<T> coman = new ArrayList<T>(); 
	
	public Historico_Comandos(){
		this.coman= coman;
	}
	
	
	public void anadir_comando(T elem){
		coman.add(elem);
	}
		
}
