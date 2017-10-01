package tpespecial;

public class Atributo {
	private String nombre;
	private double valor;
	
	public Atributo(String nombre, double valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String imprimir(){
		return("\n    Atributo: "+this.nombre+"    valor: "+ this.valor );
	}

	public boolean esIgual(Atributo a1) {
		if (this.nombre ==(a1.getNombre())) {
			return true;
		}
		
		return false;
		
	};
}
