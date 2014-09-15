import java.util.HashMap;
import java.util.Map;
 
//Hola

public class Score {
	
	
	public Score(){
		
	}
	
	public void setLetterPoints(){
		
		Map<String, Integer> letters = new HashMap<String, Integer>();
		
		letters.put( " ", new Integer(0));  
		
		letters.put( "E", new Integer(1));       
		letters.put( "A", new Integer(1));
		letters.put( "I", new Integer(1));
		letters.put( "O ",new Integer(1));
		letters.put( "N", new Integer(1));
		letters.put( "R", new Integer(1));
		letters.put( "T", new Integer(1));
		letters.put( "L", new Integer(1));
		letters.put( "S", new Integer(1));
		letters.put( "V", new Integer(1));
		
		letters.put( "D", new Integer(2));
		letters.put( "G", new Integer(2));
		
		letters.put( "B", new Integer(3));
		letters.put( "C", new Integer(3));
		letters.put( "M", new Integer(3));
		letters.put( "P", new Integer(3));
		
		letters.put( "F", new Integer(4));
		letters.put( "H", new Integer(4));
		letters.put( "V", new Integer(4));
		letters.put( "W", new Integer(4));
		letters.put( "Y", new Integer(4)); 
		
		letters.put( "K", new Integer(5));
		
		letters.put( "J", new Integer(8));
		letters.put( "X", new Integer(8));
		
		letters.put( "Q", new Integer(10));
		letters.put( "Z", new Integer(10));
		
		
		
		
		
		
	}
	
	public int wordPoints(Lista<String> word){
		
		return 0;
	}

}
