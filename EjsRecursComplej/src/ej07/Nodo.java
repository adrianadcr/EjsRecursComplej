package ej07;

public class Nodo {
	
	int valor;
	Nodo izq;
	Nodo der;
	
	public Nodo(int valor) {
		this.valor = valor;
	}
	
	public Nodo getIzq() {
		return izq;
	}
	
	public Nodo getDer() {
		return der;
	}
	
	public int getValor() {
		return this.valor;
		
	}
	public static boolean esBST (Nodo nodo) {
		return esBSTAux(nodo, null, null);
	}

	private static boolean esBSTAux(Nodo nodo, Nodo min, Nodo max) {
		//Caso base: si llego a un nodo que no tiene ningun numero, pues ya está
		if(nodo == null) {
			return true;
		}
		
		//Compruebo que el subárbol izquierdo sea menor que el nodo y 
		// que el árbol derecho sea mayor que el nodo 
		if(min != null && nodo.getValor() <= min.getValor()) {
			return false;
		}
		
		if(max != null && nodo.getValor() >= max.getValor()) {
			return false;
		}
		
		//Paso recursivo: con lo de antes solo compruebo un nodo, ahora tengo que comprobar que los subnodos de cada nodo son
		//menores que el nodo si es el subarbol izq y mayores que el nodo si es el dcho, o devolver true si ya no hay nada
		//con que comparar (si solo queda un número)
		return esBSTAux(nodo.izq, min, nodo) & esBSTAux(nodo.der, nodo, max); 
	}
}
