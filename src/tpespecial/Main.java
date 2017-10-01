package tpespecial;

public class Main {

	public static void main(String[] args) {
		
		Carta c1 = new Carta("minion clasico");
		Carta c2 = new Carta("minion enojado");
		Carta c3 = new Carta("minion cansado");
		Carta c4 = new Carta("minion pijotero");
		
		Atributo a1 = new Atributo("ternura",80.4);
		Atributo a2 = new Atributo("fuerza",20.6);
		Atributo a3 = new Atributo ("velocidad",10.0);
		
		c1.addAtributo(a1);
		c1.addAtributo(a2);
		c1.addAtributo(a3);
		
		c2.addAtributo(a1);
		c2.addAtributo(a2);
		c2.addAtributo(a3);
		
		c3.addAtributo(a1);
		c3.addAtributo(a2);
		c3.addAtributo(a3);
		

		c4.addAtributo(a1);
		c4.addAtributo(a2);
		c4.addAtributo(a3);
		
		
		Jugador j1= new Jugador ("nelson");
		Jugador j2= new Jugador ("ema");
		
		
		Mazo m1 = new Mazo("Minions");
		m1.addCarta(c1);
		m1.addCarta(c2);
		m1.addCarta(c3);
		m1.addCarta(c4);
		
		Juego juego = new Juego ("minions",m1,j1,j2);
		
		
		juego.repartir();
		System.out.println((j1.getMisCartas()).imprimir());
		System.out.println(j2.getMisCartas().imprimir());
		
		
	}

}
