package ejsRecurs01;

public class Archivo {
	private String nombre;
	private double pesoMB;
	
	public Archivo(String nombre, double peso) {
		this.nombre = nombre;
		this.pesoMB = peso;
		
	}
	
	public double getPesoMB() {
		return this.pesoMB;
	}

	public String getNombre() {
		return this.nombre;
	}
}
