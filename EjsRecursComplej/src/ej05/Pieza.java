package ej05;

import java.util.ArrayList;
import java.util.List;

public class Pieza {
	private String nombre;
	private boolean esDefectuosa;
	private List<Pieza> componentes; //Piezas necesarias para montar esta
	
	public Pieza(String nombre, boolean esDefectuosa) {
		this.nombre = nombre;
		this.esDefectuosa = esDefectuosa;
		this.componentes = new ArrayList<>();
	}
	
	public boolean isDefectuosa() {
		return this.esDefectuosa;
	}
	
	public List<Pieza> getComponentes(){
		return this.componentes;
	}
	
	public static boolean contieneDefectos(Pieza piezaPrincipal) {
		if(piezaPrincipal == null) {
			return false;
		}
		
		if(piezaPrincipal.isDefectuosa()) {
			return true;
		}
		
		if(piezaPrincipal.getComponentes() != null) {
			for(Pieza pz : piezaPrincipal.getComponentes()) {
				if(contieneDefectos(pz)) {
					return true;
				}
			}
		}		
		
		return false;
	}
}
