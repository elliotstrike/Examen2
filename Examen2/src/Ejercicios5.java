
public class Ejercicios5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {1,2,3,4,5,6,7,8,9,10};
		int array2[]={1,2,3,4,5,6,7,8,9,10};
		int array3[]={1,2,3,4,5,6,7,8,9,10};
		int array4[]={1,2,3,4,5,6,7,8,9,10};
		int array5[]={1,2,3,4,5,6,7,8,9,10};
		int arraybi[][]=new int[5][10];
		for(int i=0;i<arraybi.length;i++) {
			for(int j=0;j<array1.length;j++) {
				arraybi[i][j]=array1[i];

			}
			for(int j=0;j<array2.length;j++) {
				arraybi[i][j]=array1[i];

			}
			for(int j=0;j<array3.length;j++) {
				arraybi[i][j]=array1[i];

			}
			for(int j=0;j<array4.length;j++) {
				arraybi[i][j]=array1[i];

			}
			for(int j=0;j<array5.length;j++) {
				arraybi[i][j]=array1[i];

			}
		}
		for(int i=0;i<arraybi.length;i++) {
			for(int j=0;j<arraybi[i].length;j++) {
				System.out.print(arraybi[i][j]);

			}
			System.out.println(" ");
		}


	}

}
