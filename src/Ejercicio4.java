import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st=new Scanner(System.in);
		String personas[][]=new String [1][5];
		String lista[][]=new String[1][];
		//NO lo guarda
		for(int i=0;i<personas.length;i++) {
			System.out.println("Introduce el nombre");
			personas[i][0]=st.nextLine();
			System.out.println("Introduce tu apellido");
			personas[i][1]=st.nextLine();
			System.out.println("Introduce provincia ");
			personas[i][2]=st.nextLine();
			if(personas[i][2].equalsIgnoreCase("Madrid") && personas[i][2].equalsIgnoreCase("Barcelona")) {
				int k=0;
				for(int j=0;j<personas.length;j++) {
					personas[i][j]=lista[k][0];
					k++;
				}
			}
			personas[i][2]=st.nextLine();
			System.out.println("Introduce direccion ");
			personas[i][3]=st.nextLine();
			System.out.println("Introduce telefono ");
			personas[i][4]=st.nextLine();
		}
		for(int i=0;i<personas.length;i++) {
			
		}
		System.out.println("Los que son de Madrid y Barcelona son: ");
		
		for(int i=0;i<lista.length;i++) {
			for(int j=0;j<lista[i].length;j++) {
				System.out.print(lista[i][j]);
				
			}
			System.out.println(" ");
		}
	}

}
