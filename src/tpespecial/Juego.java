package tpespecial;
import java.util.Vector;



public class Juego {
protected String nombre;
protected Mazo mazoElegido;
protected Jugador j1;
protected Jugador j2;

	public Juego(String nombre,Mazo mazo,Jugador j1,Jugador j2){
		this.nombre=nombre;
		this.mazoElegido=mazo;
		this.j1=j1;
		this.j2=j2;
	}
	
	
	public void repartir(){
	int size;
		if (this.mazoElegido.checkParidad()) {
			size=this.mazoElegido.getCartas().size();
		}else{
			size=(this.mazoElegido.getCartas().size()-1);
		}
		
		for (int i = 0; i<size; i++) {
			if (i%2==0) {
				j1.addCarta((Carta) mazoElegido.getCartas().get(i));
			}else{
				j2.addCarta((Carta) mazoElegido.getCartas().get(i));
			}
		}
	}

}
