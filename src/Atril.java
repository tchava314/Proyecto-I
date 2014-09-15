
public class Atril extends Tablero{

	private final int sizeX=1, sizeY=7;
	
	public Atril(){
		super.newTab(sizeX, sizeY);
	}
	
	
	public Casilla getFicha (int x, int y){
		
		Casilla fichaXY= super.getCas( x, y);
		return fichaXY;
	}
	
	public void setFicha(Casilla newCas,int x, int y){
		super.setCas(newCas, x, y);
		
	}
}
