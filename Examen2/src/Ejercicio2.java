
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=44,cont2=1;
		int impares[]=new int[457-44];
		do {
			if(cont % 3==0) {
				impares[cont2]=cont;
				cont2++;
			}
			cont++;

		}while(cont!=458);

		for(int i=0;i<impares.length;i++) {
			System.out.println("Los numeros son: "+impares[i]);
		}

	}

}
