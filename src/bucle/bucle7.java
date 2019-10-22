package bucle;

public class bucle7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumapar=0;
		int sumaimpar=0;
		
		for (int i = 1; i < 101; i++) {
			if (i%2==0) {
				sumapar=sumapar+i;
			}else {
				sumaimpar=sumaimpar+i;
			}
		}
		System.out.println(sumapar);
		System.out.println(sumaimpar);
		}
	}


