package tpespecial;

public class juegoModoRondas extends Juego{
	private int rondas;
	
	public juegoModoRondas(String nombre,Mazo mazo,Jugador j1,Jugador j2,int cantRondas){
		super(nombre,mazo,j1,j2);
		this.rondas=cantRondas;
	}
	
	public void jugar() {
		repartir();
		for (int i = 0; i < this.rondas; i++) {
			if ((!j1.sinCartas())&&(!j2.sinCartas())) {
				jugarRonda();
				resultadoRonda();
			}else{
				this.ganador = winner();
				
			}
			
		}
		this.ganador = winner();
	}

	
	public Jugador winner() {
		if (j1.getMisCartas().size()>j2.getMisCartas().size()) {
			return j1;
		}else{
			return j2;
		}
	}
	
	
}
