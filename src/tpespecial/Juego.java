package tpespecial;
import java.util.Vector;



public abstract class Juego {
protected String nombre;
protected Mazo mazoElegido;
protected Jugador j1;
protected Jugador j2;
protected Jugador turno;
protected Jugador secundario;
protected Jugador ganador;

	public Juego(String nombre,Mazo mazo,Jugador j1,Jugador j2){
		this.nombre=nombre;
		this.mazoElegido=mazo;
		this.j1=j1;
		this.j2=j2;
		this.turno=j1;
		this.secundario=j2;
	}
	
	public abstract void jugar();
	public abstract Jugador winner();
	
	public Jugador getTurno(){
		return this.turno;
	}
	public Jugador getSecundario(){
		return this.secundario;
	}
	
	public String getWinner(){
		return this.ganador.getNombre();
	}
	
	public void jugarRonda(){
		turno.elegirCarta();
		secundario.elegirCarta();
		turno.RandomAtr(turno.getCartaElegida());
		secundario.seleccionarAtr(turno.getAtrElegido());
	}
	
	
	public void resultadoRonda(){
		if (turno.getAtrElegido().getValor()>secundario.getAtrElegido().getValor()) {
			System.out.println("//////////////////////////");
			System.out.println("\n ganador de ronda "+turno.getNombre());
			repartirPremio(turno,secundario);
		}else{
			
			if (turno.getAtrElegido().getValor()<secundario.getAtrElegido().getValor()) {
				System.out.println("//////////////////////////");
				System.out.println("\n ganador de ronda "+secundario.getNombre());
				repartirPremio(secundario,turno);
				Jugador winner=turno;
				Jugador looser=secundario;
				setTurnos(winner,looser);
			}
		}
		
		System.out.println(j1.getMisCartas().imprimir());
		System.out.println(j2.getMisCartas().imprimir());
		System.out.println("//////////////////////////");
		
	}
	

	
	
	public void repartirPremio(Jugador winner, Jugador looser){
		winner.addCarta(winner.getCartaElegida());
		winner.addCarta(looser.getCartaElegida());
		winner.perderCarta();
		looser.perderCarta();
	}
	
	public void setTurnos(Jugador winner, Jugador looser){
		this.turno=winner;
		this.secundario=looser;
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
