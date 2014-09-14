
public class Main {
	
	public static void main (String arg[]){
		
		
		
		char a=97;
		Lista<Lista<String>> ABC= new Lista<Lista<String>>();
		
		Lista<Lista<Casilla>> TAB = new Lista<Lista<Casilla>>();
		
		Lista<String> letraA ;
		
		
		
		for(int i=0; i<15; i++){
			
			TAB.addDataEnd(new Lista<Casilla>());
			for (int j=0; j<15; j++){
				TAB.getObject(i).addDataEnd(new Casilla(false,null,null));
			}
		}
		
		
		for (int i=65; i<91; i++){
			
			
			ABC.addDataEnd(new Lista<String>());
			//System.out.println(""+(char)i);
		}
		
		
		letraA = ABC.getObject(0);
		
		letraA= letraA.creaLista(a);
		
		
		
		System.out.println(""+ TAB.getObject(0).getObject(0).getLetra() );
		
		
		
		
		
		
		
		
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
