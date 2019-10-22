package bucle;

import java.util.Scanner;

public class bucle8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer;
		leer = new Scanner(System.in);
		
		int numero=0;
		int contador=0;
		int max=0;
		int min=0;
		
		
		System.out.println("introduce un numero");
		numero=leer.nextInt();
		do {
			numero=max;
			numero=min;
			
			if (min<numero){
				min=numero;
			}
			
			if (max>numero){
				max=numero;
			}
			System.out.println("introduce un numero");
			numero=leer.nextInt();
			contador++;
		}while(contador!=4);
		System.out.println(max);
		System.out.println(min);
	}

}
