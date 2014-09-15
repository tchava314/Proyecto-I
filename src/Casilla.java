public class Casilla {
	private String letra;
	private int valor;
	private int bonus;

	public Casilla() { // constructor
		String letra = null;
		int valor = 0;
		int bonus = 0;
	}

	public void setLetra(String letra) { // metodo que le asigana una letra a la
											// casilla
		this.letra = letra;
	}

	public void setValor(int valor) { // metodo que le asigna un valor en puntos
										// a la casilla
		this.valor = valor;
	}
	
	public void setLetra(String newLetra){
		Letra= newLetra;
		
	}

	public void setBonus(String bonus) {// metodo que reasigna un valor en
										// puntos a la casilla de acuerdo con el
										// bonus extra que tenga
		if (bonus == "2L") {
			this.valor = 2 * this.valor;
		}
		if (bonus == "3L") {
			this.valor = this.valor * 3;
		}
		if (bonus == "2P") {

		}
		if (bonus == "3P") {

		}

	}
}
