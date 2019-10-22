package bucle;

import java.util.Scanner;

public class bucle6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer;
		leer = new Scanner(System.in);
		int numero= 0;
		int contador = 0;
		System.out.println("introduce un numero");
		numero=leer.nextInt();
		
		for (int i = 1; i < numero; i++) {
			if (i%3==0) {
				System.out.println(i);
				contador++;
			}
		}
		System.out.println("hay tantos multiplos "+contador);
		
		
	}

}
