
public class Tablero extends Lista<Lista<Casilla>> {

	
	private final int sizeX=15, sizeY=15;
	public Lista<Lista<Casilla>> TAB = new Lista<Lista<Casilla>>();
	
	public Tablero(){
	
	newTab(sizeX,sizeY);
	}
	
	
	public void newTab(int x, int y){
		
			for(int i=0; i<x; i++){
			
			TAB.addDataEnd(new Lista<Casilla>());
			for (int j=0; j<y; j++){
				TAB.getObject(i).addDataEnd(new Casilla());
			     }
		     }
	  }
	
	
	public Casilla getCas(int x, int y){
	
		Casilla casXY = TAB.getObject(x).getObject(y);
		return casXY;
	}
	
	public void setCas(Casilla newCas,int x, int y){
		Casilla oldCas=TAB.getObject(x).getObject(y) ;
		
		oldCas= newCas;
		
	}
	
}
