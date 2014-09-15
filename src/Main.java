
public class Main {
	
	public static void main (String arg[]){
		
		
		
		char a=97;
		Lista<Lista<String>> ABC= new Lista<Lista<String>>();
		Lista<String> letraA ;
		
		
		
		Tablero tab= new Tablero();
		Atril atril1= new Atril();
		
		
		
		tab.getCas(0, 0).setLetra("Perrita");

		tab.getCas(0, 1).setLetra("Perrita");
		
		System.out.println(""+ tab.getCas(0, 14).getLetra());
		
		
		
		
		
		
		
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
