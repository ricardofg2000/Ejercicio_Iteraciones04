package unico;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.
		 */

		Scanner leer = new Scanner (System.in);
		
		int n = 0;
		int i = 1;
		System.out.print("Introduzca un número ");
		n = Integer.parseInt(leer.nextLine());
		
		 do {
			System.out.println(i);
			i++;
			} while (i != n+1);
		
		
	}

}
