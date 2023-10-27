package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número introducido por el usuario
		int num;
		
		// Le pedimos al usuario un número
		System.out.println("Dime un número:");
		num = sc.nextInt();
		
		// Bucle donde mostraremos los multiplos de 3
		for(int i = 0; i <= num; i += 3) {
			System.out.println(i);
		}
		
		// Mensaje de final del programa
		System.out.println("FIN");

		// Cerramos el scanner
		sc.close();
	}

}
