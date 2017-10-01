package tpespecial;
import java.util.Vector;

public class Carta {
	
	private String nombrePersonaje;
	private Vector atributos;
	

	public Carta(String nombrePersonaje) {
		this.nombrePersonaje = nombrePersonaje;
		this.atributos = new Vector<Atributo>();
	}
	
	public void addAtributo(Atributo a1) {
		boolean agregar=true;
		for (int i = 0; i < this.atributos.size(); i++) {
			if(((Atributo) this.atributos.get(i)).esIgual(a1)){
				agregar=false;
				i=this.atributos.size();
			}
		}
		if (agregar==true) {
			this.atributos.add(a1);
		}else{
			System.out.println("La carta ya posee ese atributo");
		}
		
	}

	public String getNombrePersonaje() {
		return nombrePersonaje;
	}


	public void setNombrePersonaje(String nombrePersonaje) {
		this.nombrePersonaje = nombrePersonaje;
	}
	
	public String imprimir(){
		String atr="";
		for (int i = 0; i < this.atributos.size(); i++) {
			atr+=((Atributo) this.atributos.get(i)).imprimir().toString();
		}
		atr=("\nPersonaje: "+this.nombrePersonaje+atr);
		return atr;
	}

	public Vector getAtributos() { //devuelve copia
		Vector aux = new Vector<Atributo>();
		aux = this.atributos;
		return aux;
	}
	
	
	
	public boolean comparar(Carta c1) {
		boolean result=false;
		if(this.atributos.size() == c1.getAtributos().size()) {//check de cant de atributos
			
			for(int i = 0;i < this.atributos.size();i++) {
				
				Atributo a1 = (Atributo) this.atributos.get(i);
				
				
				for(int j=0; j<c1.atributos.size();j++) {
			
					
					if(a1.esIgual((Atributo) c1.getAtributos().get(j))) {
						result = true;
						j=c1.atributos.size();
					}else{
						result=false;
					}
				}
				if (result==false) {
					return false;
				}
			}
		}
		return result;
	};
	
}
