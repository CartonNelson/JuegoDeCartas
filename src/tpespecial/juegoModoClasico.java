package tpespecial;



public class juegoModoClasico extends Juego{

	public juegoModoClasico(String nombre,Mazo mazo,Jugador j1,Jugador j2){
		super(nombre,mazo,j1,j2);
	}
	
	public void jugar(){
		repartir();
		do{
			jugarRonda();
			resultadoRonda();
		}while((!j1.sinCartas())&&(!j2.sinCartas()));
		
		this.ganador = winner();
	}

		public Jugador winner(){
		if (j1.getMisCartas().isEmpty()) {
			return j2;
		}else{
			return j1;
		}
	}
		
	
	
}
