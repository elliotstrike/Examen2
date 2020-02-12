
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont1=33,cont2=100;
		int numeros[][]=new int[cont1][cont2];
		
		for(int i=0;i<numeros.length;i++) {
			if(cont1 % 2==0) {
				numeros[i][0]=cont1;
				cont1++;
			}
			for(int j=0;i<numeros[i].length;j++) {
				if(cont2 % 3==0) {
					numeros[i][j]=cont2;
					cont2++;
				}
			}


		}
		for(int i=0;i<numeros.length;i++) {
			for(int j=0;j<numeros[i].length;j++) {
				System.out.println(numeros[i][j]);
			}
			System.out.println(" ");
		}

	}

}
