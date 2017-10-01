package tpespecial;
import java.util.Vector;


public class Jugador {
private String nombre;
private Mazo misCartas;
private boolean turno;

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
	
	public void setMisCartas() {
		this.misCartas.clear();
	}
	
	public void addCarta(Carta c1){
		this.misCartas.addCarta(c1);
	}
	
	public boolean isTurno() {
		return turno;
	}
	
	public void setTurno(boolean turno) {
		this.turno = turno;
	}
	
	public Atributo seleccionarAtr(Carta c1){
		int posRandom=(int)(Math.random() * c1.getAtributos().size());
		return (Atributo) (c1.getAtributos().get(posRandom));
		
	}

	
}
