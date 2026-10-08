package ej02;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
	private String nombre;
	private double salario;
	private List<Empleado> subordinados; //Lista de empleados a su cargo

	public Empleado(String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
		this.subordinados = new ArrayList<>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public List<Empleado> getSubordinados(){
		return this.subordinados; 
	}
}
