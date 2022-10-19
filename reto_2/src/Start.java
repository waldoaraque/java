/******************************************************************************
                    IFP Desarrollo de Aplicaciones Web
                    1er Ciclo - Programación A
                            Waldo Araque
                            
                     Reto 2 - Evalua número primo
							 
							 19/10/2022
*******************************************************************************/

import java.util.Scanner;

public class Start {
    
	protected static Scanner capturaDatos = new Scanner(System.in); 
	protected static int n = 0;
	protected static boolean primo = false;
	
    public static void main(String[] args) {
	/*
	 * Ejecución del programa
	 */
		System.out.print("Introduzca un número: ");
		n = capturaDatos.nextInt();
 
		System.out.println("********* Números Primos **********");
		System.out.println("***********************************");
 
		primo = evaluateNumber(n);
 
		if(primo) {
			System.out.println("El número SI es primo.");
		} else {
			System.out.println("El número NO es primo.");
		}
		
		System.out.println("***********************************");
	}
    
    public static boolean evaluateNumber(int n) {
    /*
     * Función para validar si el número es primo
     */
    	
    	for(int i = n - 1; i > 1; i--) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
    }
	
}