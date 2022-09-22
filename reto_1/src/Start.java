/******************************************************************************
                    IFP Desarrollo de Aplicaciones Web
                    1er Ciclo - Programación A
                            Waldo Araque
                            
               Reto 1 - Validación de Horas, Minutos y Segundos
							 
							 22/09/2022
*******************************************************************************/
import java.util.Scanner;

public class Start {
    
	protected static Scanner capturaDatos = new Scanner(System.in); 
	protected static int hrs, min, seg;
	
    public static void main(String[] args) {
	/*
	 * Ejecución del programa
	 */
		System.out.print("Introduce la hora: ");
		hrs = capturaDatos.nextInt();
		
		System.out.print("Introduce el minuto: ");
		min = capturaDatos.nextInt();
		
		System.out.print("Introduce el segundo: ");
		seg = capturaDatos.nextInt();
		
		if (validaHr(hrs) == true && validaMinSeg(min, seg) == true) {
			System.out.print("La hora es correcta.");
		} else {
			System.err.print("La hora NO es correcta.");
		}
		
	}
    
    public static Boolean validaHr(int hora) {
    /*
     * Función para validar rango de hora
     */
		if (hora <= 23 && hora >= 0) {
			return true;
		} else {
			return false;
		}
    	
    }
    
    public static Boolean validaMinSeg(int min, int seg) {
    /*
     * Función para validar rango de minutos y segundos
     */
		if (min <= 59 && min >= 0 || seg <= 59 && seg >= 0 ) {
			return true;
		} else {
			return false;
		}
		
    }
	
}
