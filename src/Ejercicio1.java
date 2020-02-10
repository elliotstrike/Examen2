import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[]=new int [50];
		int cont5=0,menor5=0,cont100=0;
		Scanner sn=new Scanner(System.in);
		for(int i=0;i<numeros.length;i++) {
			System.out.println((i+1)+".Introduce los numeros");
			numeros[i]=sn.nextInt();

			if(numeros[i]>5) {
				cont5++;
			}
			else if(numeros[i]<5) {
				menor5++;
			}
			if(numeros[i]==100) {
				cont100++;
			}

		}
		System.out.println("Mayores de 5 son: "+cont5+" menores de 5: "+menor5+" numeros iguales al 100: "+cont100);
	}

}
