import javax.swing.ImageIcon;


public class ImagenLetra extends ImageIcon {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	private String letter;
	private int valor;
	protected boolean moving;
	private boolean locked;
	
	
	
	public void setBloquear(boolean status){
		this.locked = status;
	}
	
	
	public boolean isBloqueada(){
		return this.locked;
	}
	
	public  ImagenLetra(String imagePath){
		super(imagePath);
		this.letter = "";
		this.valor = 0;
		this.x = 0;
		this.y = 0;
		this.moving = false;
		this.locked = false;
	}
	public ImagenLetra(String imagePath, int yp, int xp){
		
		super(imagePath);
		this.letter = "";
		this.valor = 0;
		this.x = xp*35;
		this.y = yp*35;
		this.locked = true;
	}
	public ImagenLetra(String imagePath, String letter, int valor, int x, int y){
		
		super(imagePath);
		this.letter = letter;
		this.valor = valor;
		this.x = x;
		this.y = y;
		this.locked = false;
	}
	public int getValor(){
		return this.valor;
	}
	public String getLetter(){
		return this.letter;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
}



