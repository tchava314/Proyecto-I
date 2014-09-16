public class Ficha {
	
	private int valor;
	private String letra;
	
	Ficha(int valor,String letra){
		this.letra=letra;
		this.valor=valor;
	}
	public String getLetra(){
		return letra;
	}
	public int getValor(){
		return valor; 
	} 
}
