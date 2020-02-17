package co.edu.uniminuto.CalcularSeno.Modelo;

import java.util.Scanner;

public class pruebafact {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese Numero");
		int num = teclado.nextInt();
		
		pruebafact b = new pruebafact();
		System.out.println("El factorial de"+ num +"es" + b.Factorizacion(num));
		
	}

	private int Factorizacion(int num) {
		int fact=1;

		if (num == 0 || num == 1) {
			return 1;
		} else {
			for (int i = 2; i <= num; i++) {
				fact *= i;
			}

		}
		return fact;

	}
}
