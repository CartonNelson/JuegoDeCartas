package tpespecial;
import java.util.Vector;

public class Mazo {
	private String nombre;
	private Vector cartas;
	private static final int MIN_ATR=3;
	private static final int MAX_ATR=6;
	
	public Mazo(String nombre) {
		this.nombre = nombre;
		this.cartas = new Vector<Carta>();
	}
	
	public Vector getCartas(){
		Vector aux = new Vector<Carta>();
		aux=this.cartas;
		return aux;
	}
	public String imprimir(){
		String info="\n Mazo "+this.nombre;
		info+="\n -------------------";
		for (int i = 0; i < cartas.size(); i++) {
			info+=((Carta) cartas.get(i)).imprimir();
		}
		return info;
	}
	
	
	public boolean checkCantAtr(Carta c1){
		int cont=0;
		for (int i = 0; i < c1.getAtributos().size(); i++) {
			cont++;
		}
		if (cont<MIN_ATR||cont>MAX_ATR) {
			return false;
			
		}
	return true;
	}
	
	
	public void addCarta(Carta c1) {
		
		if (checkCantAtr(c1)) {
			if(cartas.isEmpty()) {
				this.cartas.add(c1);
			
			}else {
				if(((Carta) this.cartas.get(0)).comparar(c1)) {
					this.cartas.add(c1);
				}else {
					System.out.println("Carta incompatible");
				}
			}
		}else{
			System.out.println(c1.getNombrePersonaje()+" posee una cantidad de atributos incorrecta");
		}
	}
	
	public boolean checkParidad(){
		if ((this.cartas.size()%2)==0) {
			return true;
		}else{
			return false;
		}
		
	}
	
	public void clear(){
		this.cartas.clear();
	}
	
	
}
