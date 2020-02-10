import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		Scanner st=new Scanner(System.in);
		String medicos[][]=new String[1][5];
		String nColegiado="";
		int menu1=0,menu2=0;

		do {
			System.out.println("Seleccione el menu");
			System.out.println("1.Introducir datos médicos");
			System.out.println("2.Mostrar listado de médicos");
			System.out.println("3.Modificar los datos de un médico");
			System.out.println("4.Salir");
			menu1=sn.nextInt();
			switch(menu1) {
			case 1:
				System.out.println("Introduzca los datos");
				for(int i=0;i<medicos.length;i++) {
					System.out.println("\nIntroduzca el nombre");
					medicos[i][0]=st.nextLine();
					System.out.println("Introduzca el apellidos");
					medicos[i][1]=st.nextLine();
					System.out.println("Introduzca el nº de colegiado");
					medicos[i][2]=st.nextLine();
					
					boolean comprob=false;
					
					for(int j=0;j<medicos.length;j++) {
						if(medicos[i][2].equalsIgnoreCase(medicos[j][2])) {
							comprob=true;
							System.out.println("El nº de colegiado introducido ya existe");

						}
						else {
							comprob=false;
						}
					}
					System.out.println("Introduzca la edad");
					medicos[i][3]=st.nextLine();
					System.out.println("Introduzca el sueldo");
					medicos[i][4]=st.nextLine();
				}
				break;
			case 2:
				for(int i=0;i<medicos.length;i++) {
					for(int j=0;j<medicos[i].length;i++){
						System.out.print((i+1)+". "+medicos[i][j]);
					}
					System.out.println(" ");
				}
				break;
			case 3:
				System.out.println("Introduzca el numero de colegiado");
				nColegiado=st.nextLine();
				for(int i=0;i<medicos.length;i++) {
					if(nColegiado.equalsIgnoreCase(medicos[i][2])) {
						//SubMenu
						System.out.println("Seleccione que desea modificar(1.nombre,2.apellido,3.nºcolegiado,4.edad,5.sueldo,6.salir)");
						menu2=sn.nextInt();
						do {
							switch(menu2) {
							case 1:
								System.out.println("Introduzca el nuevo nombre");
								medicos[i][0]=st.nextLine();
								break;
							case 2:
								System.out.println("Introduzca el nuevo apellido");
								medicos[i][1]=st.nextLine();
								break;
							case 3:
								System.out.println("Introduzca el nuevo nº colegiado");
								medicos[i][0]=st.nextLine();
								boolean comprob=false;
								for(int j=0;j<medicos.length;j++) {
									if(medicos[i][2].equalsIgnoreCase(medicos[j][2])) {
										System.out.println("El nº de colegiado introducido ya existe");
										comprob=true;

									}
									else {
										comprob=false;
									}
								}
								break;
							case 4:
								System.out.println("Introduzca la nueva edad");
								medicos[i][3]=st.nextLine();
								break;
							case 5:
								System.out.println("Introduzca el nuevo sueldo");
								medicos[i][4]=st.nextLine();
								break;
							case 6:
								System.out.println("Ha salido del submenu");
								break;
							}

						}while(menu2!=6);
					}
				}

				break;
			case 4:
				System.out.println("Ha salido del programa");
				break;
			default:
				System.out.println("El numero seleccionado no esta dentro de los valores del menu");
			}

		}while(menu1!=4);
	}

}
