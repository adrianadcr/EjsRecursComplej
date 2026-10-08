package ejsRecurs01;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Archivo> archivos;
	private List<Carpeta> subcarpetas;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.archivos = new ArrayList<Archivo>();
		this.subcarpetas = new ArrayList<Carpeta>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<Archivo> getArchivos(){
		return this.archivos;
	}
	
	public List<Carpeta> getSubcarpetas(){
		return this.subcarpetas;
	}
	
	public void addArchivo(Archivo archivo) {
		this.archivos.add(archivo);
	}
	
	public void addCarpeta(Carpeta subcarpeta) {
		this.subcarpetas.add(subcarpeta);
	}
}
