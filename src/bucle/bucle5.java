package bucle;

import java.util.Scanner;

public class bucle5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer;
		leer = new Scanner(System.in);
		String letra ="";
		
		do {
			System.out.println("introduce letra n o s");
			letra = leer.nextLine();
		}while(!(letra.equalsIgnoreCase("s") || letra.equalsIgnoreCase("n")));
	}
	}		
		
		
	
