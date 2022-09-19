
import java.util.Scanner;

public class Start {
    
	protected static Scanner capturaDatos = new Scanner(System.in); 
	protected static int option;
	
    public static void main(String[] args) {
	/*
	 * Ejecución del programa
	 */
		
		// Menú 
		companyBanner();
		getMenu();
		handler();
		
		/*
		Float resultado;
		resultado = suma(3, 4);
		System.out.print(resultado.toString());
		*/
	}
		
	public static Float suma(Float x, Float y) {
	/*
	 * Método para sumar
	 */
		return x + y;
		
	}
	
	public static Float resta(Float x, Float y) {
	/*
	 * Método para restar
	 */
		return x - y;
	}
	
	public static Float multiplica(Float x, Float y) {
	/*
	 * Método para multiplicar
	 */
		return x * y;
	}
	
	public static Float divide(Float x, Float y) {
	/*
	 * Método para dividir
	 */
		if (y == 0) {
			System.err.print("Error :: division por 0 es inválida");
		} 
		
		return x / y;
	}
	
	public static void evaluaNumeroMayor(Float x,Float y,Float z) {
	/*
	 * Método para evaluar el mayor de tres números
	 */
	}
	
	public static void capicua(int n) {
	/*
	 * Método para evaluar un string capicua
	 */
	}
	
	public static void getMenu() {
	/*
	 * 
	 */
		System.out.println("Introduzca una opción del menú:   ");
		System.out.println("     1. Sumar                     ");
		System.out.println("     2. Restar                    ");
		System.out.println("     3. Multiplicar               ");
		System.out.println("     4. Dividir                   ");
		System.out.println("     5. Número mayor de 3 números ");
		System.out.println("     6. Capicua                   ");
		System.out.println("     0. Salir                    \n");
		
		System.out.print("Introduzca una opción: ");
		option = capturaDatos.nextInt();
	}
	
	public static void companyBanner() {
		String banner = "                           Calculadora by                            \n"+
	                    "   ____    _    _     ____ _   _ _        _  _____ ___  ____  \n"+
				        "  / ___|  / \\  | |   / ___| | | | |      / \\|_   _/ _ \\|  _ \\ \n"+
	                    " | |     / _ \\ | |  | |   | | | | |     / _ \\ | || | | | |_) |\n"+
				        " | |___ / ___ \\| |__| |___| |_| | |___ / ___ \\| || |_| |  _ <  \n"+
				        "  \\____/_/   \\_\\_____\\____|\\___/|_____/_/   \\_\\_| \\___/|_| \\_\\  S.A\n";
		
		System.out.println(banner);
	}
	
	public static void handler() {
	/*
	 * Método para imprimir mensaje y capturar datos
	 */
		switch(option) {
		    case 0: // SALIR
		    	System.out.println("Adiós! ");
		    	System.out.flush();
		    	break;
			case 1: // SUMAR
				System.out.println("A sumar! ");
				break;
			case 2: // RESTAR
				System.out.println("A restar! ");
				break;
			case 3: // MULTIPLICAR
				System.out.println("A multiplicar! ");
				break;
			case 4: // DIVIDIR
				System.out.println("A dividir! ");
				break;
			case 5: // MAYOR DE 3 NUMEROS
				System.out.println("A calcular número mayor! ");
				break;
			case 6: // CAPICUA
				System.out.println("A evaluar número! ");
				break;
			default: // OTRO 
				System.err.println("Error :: Ha introducido una opción inválida.");
				break;
		}

	}

}
