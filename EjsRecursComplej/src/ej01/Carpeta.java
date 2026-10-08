package ej01;

import java.util.ArrayList;
import java.util.List;

//Representa una carpeta que puede contener archivos y otras subcarpetas
public class Carpeta {
	private String nombre;
	private List<Archivo> archivos; //Archivos directos en esta carpeta
	private List<Carpeta> subcarpetas; //Carpetas dentro de esta carpeta

	public Carpeta(String normen) {
		this.nombre = nombre;
		this.archivos = new ArrayList<>();
		this.subcarpetas = new ArrayList<>();
	}
	
	public List<Archivo> getArchivos() {
		return this.archivos;
	}
	
	public List<Carpeta> getSubcarpetas(){
		return this.subcarpetas;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
