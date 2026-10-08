package ej03;

import java.util.ArrayList;
import java.util.List;

public class Habilidad {
	private String id;
	private int costePuntos; //Coste para desbloquear esta habilidad
	private List<Habilidad> desbloqueables; //Habilidades que dependen de esta
	
	public Habilidad(String id, int costePuntos) {
		this.id = id;
		this.costePuntos = costePuntos;
		this.desbloqueables = new ArrayList<>();
	}
	
	public int getCoste() {
		return this.costePuntos;
	}
	
	public List<Habilidad> getDesbloqueables(){
		return this.desbloqueables;
	}
	public static int costeRamaCompleta(Habilidad raiz) {
		if(raiz == null) {
			return 0;
		}
		int coste = raiz.getCoste();
		
		if(raiz.getDesbloqueables() != null) {
		
		}
		
		return coste;
	}

}
