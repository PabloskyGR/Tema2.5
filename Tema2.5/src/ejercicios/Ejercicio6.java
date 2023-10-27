package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Variabel donde guardaremos la suma de los números impares
		int suma = 0;

		// Bucle for para ir sumando los 10 primeros números impares
        for (int i = 1; i <= 20; i += 2) {
            suma += i;
        }

        // Mostramos un mensaje con el resultado de la suma de los números impares
        System.out.println("La suma de los 10 primeros números impares es: " + suma);

	}

}
