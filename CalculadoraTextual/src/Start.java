/******************************************************************************
                    IFP Desarrollo de Aplicaciones Web
                    1er Ciclo - Programación A
                            Waldo Araque
                            
               		Ejercicio Evaluativo - Calculadora
							 
							 19/10/2022
*******************************************************************************/
import java.util.Scanner;

public class Start {
    
	protected static final Scanner capturaDatos = new Scanner(System.in); 
	protected static int option = 0;
	protected static Float a = 0.0f, b = 0.0f, c = 0.0f, resultado = 0.0f;
	
    public static void main(String[] args) {
	/*
	 * Ejecución del programa
	 */
		
		// Menú 
		companyBanner();
		getMenu();
		handler();
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
	
	public static void getMenu() {
	/*
	 * 
	 */
		try {
			System.out.println("Introduzca una opción del menú:   ");
			System.out.println("     1. Sumar                     ");
			System.out.println("     2. Restar                    ");
			System.out.println("     3. Multiplicar               ");
			System.out.println("     4. Dividir                   ");
			System.out.println("     5. Número mayor de 3 números ");
			System.out.println("     6. Factorial                 ");
			System.out.println("     0. Salir                    \n");
			
			System.out.print("Introduzca una opción: ");
			option = capturaDatos.nextInt();
		} catch(Exception e) {
			System.err.println("Error :: Opción errónea");
			capturaDatos.nextLine();
			cleanConsole();
		}
		
	}
	
	public static void handler() {
	/*
	 * Método para imprimir mensaje y capturar datos
	 */
		switch(option) {
		    case 0: // SALIR
		    	System.out.println("El programa ha finalizado");
		    	System.exit(0);
		    	break;
			case 1: // SUMAR
				
				System.out.println("Introduzca el primer número flotante a sumar: ");
				a = capturaDatos.nextFloat();
				System.out.println("Introduzca el segundo número flotante a sumar: ");
				b = capturaDatos.nextFloat();
				resultado = suma(a, b);
				System.out.println("La suma de "+ a +" y "+ b +" es "+ resultado);
				capturaDatos.nextLine();
				cleanConsole();
				break;
			case 2: // RESTAR
				System.out.println("Introduzca el primer número flotante a restar: ");
				a = capturaDatos.nextFloat();
				System.out.println("Introduzca el segundo número flotante a restar: ");
				b = capturaDatos.nextFloat();
				resultado = resta(a, b);
				System.out.println("La resta de "+ a +" y "+ b +" es "+ resultado);
				capturaDatos.nextLine();
				cleanConsole();
				break;
			case 3: // MULTIPLICAR
				System.out.println("Introduzca el primer número flotante a multiplicar: ");
				a = capturaDatos.nextFloat();
				System.out.println("Introduzca el segundo número flotante a multiplicar: ");
				b = capturaDatos.nextFloat();
				resultado = multiplica(a, b);
				System.out.println("La multiplicación de "+ a +" y "+ b +" es "+ resultado);
				capturaDatos.nextLine();
				cleanConsole();
				break;
			case 4: // DIVIDIR
				System.out.println("Introduzca el primer número flotante a dividir: ");
				a = capturaDatos.nextFloat();
				System.out.println("Introduzca el segundo número flotante a dividir: ");
				b = capturaDatos.nextFloat();
				resultado = divide(a, b);
				System.out.println("La división de "+ a +" y "+ b +" es "+ resultado);
				capturaDatos.nextLine();
				cleanConsole();
				break;
			case 5: // MAYOR DE 3 NUMEROS
				System.out.println("A calcular número mayor! ");
				System.out.println("Introduzca el primer número flotante de los 3: ");
				a = capturaDatos.nextFloat();
				System.out.println("Introduzca el segundo número flotante de los 3: ");
				b = capturaDatos.nextFloat();
				System.out.println("Introduzca el tercer número flotante de los 3: ");
				c = capturaDatos.nextFloat();
				resultado = evaluaNumeroMayor(a, b, c);
				System.out.println("La número "+ resultado + " es el mayor de los 3 números");
				capturaDatos.nextLine();
				cleanConsole();
				break;
			case 6: // FACTORIAL
				int num = 0; 
				int res = 0;
				System.out.println("Introduzca el número para calcular el factorial: ");
				num = capturaDatos.nextInt();
				res = factorial(num);
				System.out.println("El factorial de "+ num +" es "+ res);
				capturaDatos.nextLine();
				cleanConsole();
				break;
			default: // OTRO 
				System.err.println("Error :: Opción errónea");
				capturaDatos.nextLine();
				cleanConsole();
				break;
		}

	}
	
	public static void cleanConsole() {
		capturaDatos.nextLine();
		companyBanner();
		getMenu();
		handler();
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
			System.err.println("Error :: división por 0");
			capturaDatos.nextLine();
			cleanConsole();
		} 
		
		return x / y;
	}
	
	public static Float evaluaNumeroMayor(Float x,Float y,Float z) {
	/*
	 * Método para evaluar el mayor de tres números
	 */
		if (x > y && x > z) {
			return x;
		} else if (y > x && y > z) {
			return y;
		} else if (z > x && z > y) {
			return z;
		}
		
		return 0.0f;
	}
	
	public static int factorial(int n) {
	/*
	 * Método para sacar el factorial de un número mayor que 0
	 */
		if(n > 0) {
			for(int i = n -1; i > 0; i--) {
				n = n * i;
			}
			return n;
		} else {
			System.err.println("Error :: valor inferior a 0, introduzca un valor superior a 0");
			capturaDatos.nextLine();
			cleanConsole();
			return 0;
		}
	}
}
