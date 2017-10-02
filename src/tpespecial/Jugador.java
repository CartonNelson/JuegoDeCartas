package tpespecial;
import java.util.Vector;


public class Jugador {
private String nombre;
private Mazo misCartas;
private Carta cartaElegida;
private Atributo atrElegido;

	public Jugador (String nombre){
		this.nombre=nombre;
		this.misCartas=new Mazo("de "+nombre);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Mazo getMisCartas() {
		Mazo aux=new Mazo (" de jugador: "+nombre);
		aux=this.misCartas;
		return aux;
	}
	public Carta getCartaElegida() {
		return this.cartaElegida;
	}
	
	public Atributo getAtrElegido(){
		return this.atrElegido;
	}
	public void setMisCartas() {
		this.misCartas.clear();
	}
	
	public void addCarta(Carta c1){
		this.misCartas.addCarta(c1);
	}
	
	public boolean sinCartas() {
		return this.misCartas.isEmpty();
	}
	

	public void elegirCarta(){
		if(!this.misCartas.isEmpty()){
			this.cartaElegida=this.misCartas.getPrimera();
		}
	}
	
	public void setCartaElegida(Carta cartaElegida) {
		this.cartaElegida = null;
	}
	

	public Atributo RandomAtr(Carta c1){
		Atributo a1;
		int posRandom=(int)(Math.random() * c1.getAtributos().size());
		a1= (Atributo) (c1.getAtributos().get(posRandom));
		this.atrElegido=a1;
		return a1;
		
	}
	
	
	public void seleccionarAtr(Atributo a1){
		
		for (int i = 0; i <this.cartaElegida.getAtributos().size(); i++) {
			
			if (((Atributo) this.cartaElegida.getAtributos().get(i)).esIgual(a1)) {
				this.atrElegido = (Atributo) this.cartaElegida.getAtributos().get(i);
			}
		}
		
		
	}
	
	public void perderCarta(){
		this.misCartas.remove();
	}
	
	
}
