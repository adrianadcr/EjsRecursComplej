package ej06;

/**
 * Método para ver si una palabra es palíndroma pero
 * he añadido una línea para que puedas meter también una
 * frase y siga funcionando. 
 */
public class TraumaPalindromo {
	
	public static boolean esPalindromo(String texto) {
		if(texto == null || texto.length() <= 1) {
			return true;
		}
		
		String textoBlank = texto.toLowerCase().replace(" ", "");

		if(textoBlank.charAt(0) != textoBlank.charAt(textoBlank.length()-1)) {
			return false;
		}
		
		String textoNuevo = textoBlank.substring(1, textoBlank.length()-1);
		return esPalindromo(textoNuevo);
		
	}
	
	public static void main(String[] args) {
		String txtNoPal = "Mis muertos en balsama";
		System.out.println("¿Es este texto palíndromo? " + esPalindromo(txtNoPal));
		String txtPal = "Anita lava la tina";
		System.out.println("¿Es este texto palíndromo? " + esPalindromo(txtPal));
	}

}
