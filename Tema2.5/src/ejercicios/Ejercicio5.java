package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Variable donde guardamos el número que introduzca el usuario
		double num;
		
		// Variable donde guardaremos el total de todos los números
		double total = 0;
		
		// Bucle para pedir los 10 números e ir sumandolos a la variable total
		for(int i = 1; i <= 10; i++) {
			System.out.println("Dime un número:");
			num = sc.nextDouble();
			total += num;
		}
		
		// Mostramos la media de los 10 números introducidos por el usuario
		System.out.println("La media de todos los números es de: " + (total / 10));
		
		// Cerramos el scanner
		sc.close();

	}

}
