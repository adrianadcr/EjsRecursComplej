package ej04;

import java.util.ArrayList;
import java.util.List;

public class ElementoHTML {
	private String tag;
	private List<ElementoHTML> hijos;
	
	public ElementoHTML(String tag) {
		this.tag = tag;
		this.hijos = new ArrayList<>();
	}
	
	public String getTag() {
		return this.tag;
	}
	
	public List<ElementoHTML> getHijos(){
		return this.hijos;
	}
	
	public static int contarEtiquetas(ElementoHTML elemento, String tagBuscado) {
		if(elemento == null) {
			return 0;
		}
		int etiq = 0;
		if(elemento.getTag() == tagBuscado) {
			etiq++;
		}
		
		
		if(elemento.getHijos() != null) {
		for(ElementoHTML el : elemento.getHijos()) {
			 etiq += contarEtiquetas(el, tagBuscado);
			}
		}
		
			
		return etiq;
	}

}
