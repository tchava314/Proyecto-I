
import java.io.FileReader;
import java.io.BufferedReader;



public class Readtxt {
	
	
	private static BufferedReader br;
	public static void main(String arg[]){
		
		try{
			FileReader fr = new FileReader("src//CROSSWD.TXT");
			br = new BufferedReader(fr);
			
			String word;
			 word = br.readLine();
			 
			while( word.charAt(0) == 97  ){
				
				System.out.println(""+ word.charAt(0));
				//x--;
				word = br.readLine();
				
			}
		}catch(Exception ex){
			System.out.println("conejo");
			
		}
		
		
	}
	
	

}
