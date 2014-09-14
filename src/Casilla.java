
public class Casilla {
	
	private boolean empty;
	
	private String ptsExtra,Letra;
	
	public Casilla(){
		
	}
	
	public Casilla(boolean empty,String ptsExtra, String Letra){
		this.empty= empty;
		this.ptsExtra= ptsExtra;
		this.Letra=Letra;
		}
	
	public boolean isEmpty(){
		return empty;
	}
	
	public void setEmpty(boolean valor){
		empty=valor;
	}
	
	public String getLetra(){
		return Letra;
	}

}
