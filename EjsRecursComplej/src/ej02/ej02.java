package ej02;

public class ej02 {
	public static double presupuestoEquipo(Empleado jefe) {
		/**
		 * CASO BASE: el empleado que le he metido
		 * al método no tiene subordinados entonces devuelve
		 * su salario
		 */
		if(jefe == null) {
			return 0.0;
		}
		
		double costeSalarios = jefe.getSalario();
		
		if(jefe.getSubordinados() != null) {
			for(Empleado e : jefe.getSubordinados()) {
				costeSalarios += presupuestoEquipo(e);
			}
		}
		
		return costeSalarios;
	}
}
