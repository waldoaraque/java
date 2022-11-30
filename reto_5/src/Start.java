/******************************************************************************
                    IFP Desarrollo de Aplicaciones Web
                    1er Ciclo - Programación A
                            Waldo Araque
                            
                          Reto 5 - Arrays
							 
							 30/11/2022
*******************************************************************************/
import java.util.Scanner;

public class Start {
    
	protected static Scanner capturaDatos = new Scanner(System.in); 
	protected static int n = 0;
	protected static Float media = 0.0f;
	
    public static void main(String[] args) {
	/*
	 * Ejecución del programa
	 */
		System.out.print("Introduzca el número de empleados: ");
		n = capturaDatos.nextInt();
		
		String[] empleados = new String[n];
		Float[] salarios = new Float[n];
		
		for (int i=0; i < empleados.length && i < salarios.length; i++) {
			System.out.println("Introduzca el nombre del empleado "+ (i+1) +": ");
			empleados[i] = capturaDatos.nextLine();
			empleados[i] = capturaDatos.nextLine();
			System.out.println("Introduzca el salario del empleado "+ (i+1) +": ");
			salarios[i] = capturaDatos.nextFloat();
		}
		
		System.out.println("Empleados obtenidos: ");
		
		for (int i=0; i < empleados.length && i < salarios.length; i++) {
			System.out.println(empleados[i] +": "+ salarios[i]);
			media = media + salarios[i];
		}
		
		media = media / salarios.length;
		
		System.out.println("La media de Salarios es: "+ media.toString());
	}
}