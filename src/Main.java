
public class Main {
	
	public static void main (String arg[]){
		
		
		
		char a=97;
		Lista<Lista<String>> ABC= new Lista<Lista<String>>();
		Lista<String> letraA ;
		
		
		
		Tablero tablero= new Tablero();
		//tablero.setCas(new Casilla("g",4), 5, 5);
		tablero.setCas(new Casilla(new Ficha(0,null)),0,0);
		Casilla algo=tablero.getCas(5, 5);
		
		System.out.print(""+algo.getBonus());
		
		
		
		
		
		
		
		for (int i=65; i<91; i++){
			
			
			ABC.addDataEnd(new Lista<String>());
			//System.out.println(""+(char)i);
		}
		
		
		letraA = ABC.getObject(0);
		
		letraA= letraA.creaLista(a);
		
		
		
		
		
		
		
		
		
		
		
		
		/**
		for (int i=0; i<26; i++){
			
			 obj = ABC.getObject(i);
			 temp= (Lista)obj;
			 Alfabeto.addDataEnd(temp);
			 
			System.out.println(""+obj);
		}
		
		**/
		
		
		
		
		
		
		
	}

	

}
