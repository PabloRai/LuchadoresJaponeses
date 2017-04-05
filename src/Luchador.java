
public class Luchador {
	private int peso;
	private int altura;
	
	public Luchador(int peso, int altura) {
		this.peso = peso;
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	// Devuelve 1 si el luchador llamador domina, devuelve 2 si el luchador parametro domina, devuelve 0 si
	// ninguno domina
	public byte domina(Luchador obj){
		if((peso > obj.peso && altura > obj.altura) || (peso == obj.peso && altura > obj.altura) || (altura == obj.altura && peso > obj.peso))
			return 1;
		else if( (peso < obj.peso && altura < obj.altura) || (peso == obj.peso && altura < obj.altura) || (altura == obj.altura && peso < obj.peso))
			return 2;
		return 0;
	}
	@Override
	public String toString() {
		return "Luchador [peso=" + peso + ", altura=" + altura + "]";
	}
	
}
