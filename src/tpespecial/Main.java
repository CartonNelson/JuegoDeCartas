package tpespecial;

public class Main {

	public static void main(String[] args) {
		
		Carta c1 = new Carta("minion clasico");
		Carta c2 = new Carta("minion enojado");
		Carta c3 = new Carta("minion cansado");
		Carta c4 = new Carta("minion pijotero");
		Carta c5 = new Carta("minion trabajador");
		
		Atributo tern1 = new Atributo("ternura",80.4);
		Atributo tern2 = new Atributo("ternura",20.6);
		Atributo tern3 = new Atributo ("ternura",67.0);
		Atributo tern4 = new Atributo ("ternura",17.0);
		
		Atributo fuerza1 = new Atributo("fuerza",40.4);
		Atributo fuerza2 = new Atributo("fuerza",25.6);
		Atributo fuerza3 = new Atributo ("fuerza",17.0);
		Atributo fuerza4 = new Atributo ("fuerza",75.0);
		
		Atributo vel1 = new Atributo("velocidad",40.4);
		Atributo vel2 = new Atributo("velocidad",25.6);
		Atributo vel3 = new Atributo ("velocidad",17.0);
		Atributo vel4 = new Atributo ("velocidad",75.0);
		
	
		
		c1.addAtributo(tern1);
		c1.addAtributo(fuerza1);
		c1.addAtributo(vel1);
		
		c2.addAtributo(tern2);
		c2.addAtributo(fuerza2);
		c2.addAtributo(vel2);
		
		c3.addAtributo(tern3);
		c3.addAtributo(fuerza3);
		c3.addAtributo(vel3);
		

		c4.addAtributo(tern4);
		c4.addAtributo(fuerza4);
		c4.addAtributo(vel4);
		
		c5.addAtributo(tern1);
		c5.addAtributo(fuerza2);
		c5.addAtributo(vel3);
		
		
		Jugador j1= new Jugador ("nelson");
		Jugador j2= new Jugador ("ema");
	
		
		Mazo m1 = new Mazo("Minions");
		m1.addCarta(c1);
		m1.addCarta(c2);
		m1.addCarta(c3);
		m1.addCarta(c4);
		m1.addCarta(c5);
		juegoModoRondas juegoEspecial = new juegoModoRondas ("minions",m1,j1,j2,3);
		juegoModoClasico juegoComun = new juegoModoClasico ("minions",m1,j1,j2);
		
		
		
		//juegoComun.jugar();
		//System.out.println("winner "+juegoComun.getWinner());
		
		juegoEspecial.jugar();
		System.out.println("winner "+juegoEspecial.getWinner());
	
//		System.out.println(j1.getMisCartas().imprimir());
//		System.out.println(j2.getMisCartas().imprimir());
		
		
	}

}
