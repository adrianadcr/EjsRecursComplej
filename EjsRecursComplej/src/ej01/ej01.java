package ej01;

public class ej01 {

	public static double calcularPesoTotal(Carpeta inicio) {
		/**
		 * CASO BASE: si la carpeta no tiene archivos
		 * el peso será cero
		 */
		if(inicio == null) {
			return 0.0;
		}
		double pesoTotal = 0.0;
		
		//Calcular el peso de los archivos
		if(inicio.getArchivos() != null) {
		for(Archivo arch : inicio.getArchivos()) {
			pesoTotal += arch.getPesoMB();
		}
		}
		
		/**
		 * PASO RECURSIVO: calcular peso de subcarpetas,
		 * aplicando el método, que calcula el peso de los
		 * archivos que están también en las subcarpetas,
		 * siempre que estas tengan archivos.
		 */
		if(inicio.getSubcarpetas() != null) {
		for(Carpeta carp : inicio.getSubcarpetas()) {
			pesoTotal += calcularPesoTotal(carp);
		}
		}
		return pesoTotal;
	}
}
