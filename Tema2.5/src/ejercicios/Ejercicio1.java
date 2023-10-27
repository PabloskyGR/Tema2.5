package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número que introduzca el usuario
		int num;
		
		// Le pedimos al usuario un número
		System.out.println("Dime un número:");
		num = sc.nextInt();
		
		// Usamos el bucle for para mostrar todos los números que hay entre el 1 y el número introducido
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
		// Mostramos un mensaje al final
		System.out.println("FIN");
		// Cerramos el scanner
		sc.close();
		

	}

}
