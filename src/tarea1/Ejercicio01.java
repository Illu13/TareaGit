package tarea1;

public class Ejercicio01 {

	public static void main(String[] args) {

		int opcion = Utils
				.obtenerEnteroPorJOptionPaneConDescripcion("1.-Suma" + "\n2.-Resta" + "\n3.-Multiplicación" + "n\4.-Resto división" + "\nIntroduzca una opción.");
		int numero1 = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el primer número");
		int numero2 = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el segundo número");

		switch (opcion) {
		
		
		case 1:
			System.out.println(numero1 + numero2);
			break;
		case 2:
			System.out.println(numero1 - numero2);
			break;
		case 3:
			System.out.println(numero1 * numero2);
			break;
		case 4:
			System.out.println(numero % numero2);
			break;

		}

	}

}
