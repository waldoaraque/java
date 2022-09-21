/******************************************************************************
                    IFP Desarrollo de Aplicaciones Web
                    1er Ciclo - Programación A
                            Waldo Araque
                            
               		Ejercicio Evaluativo - Calculadora
							 
							 21/09/2022
*******************************************************************************/
import java.util.Scanner;

public class Start {
    
	protected static Scanner capturaDatos = new Scanner(System.in); 
	protected static int option;
	protected static Float a,b,c;
	protected static String d;
	protected static Float resultado;
	protected static Boolean res;
	
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
			System.out.println("     6. Capicua                   ");
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
				
				//System.out.println("A sumar! ");
				a = captureNumber("primer", "sumar");
				b = captureNumber("segundo", "sumar");
				resultado = suma(a, b);
				getResult("suma", resultado, null);
				cleanConsole();
				break;
			case 2: // RESTAR
				//System.out.println("A restar! ");
				a = captureNumber("primer", "restar");
				b = captureNumber("segundo", "restar");
				resultado = resta(a, b);
				getResult("resta", resultado, null);
				cleanConsole();
				break;
			case 3: // MULTIPLICAR
				//System.out.println("A multiplicar! ");
				a = captureNumber("primer", "multiplicar");
				b = captureNumber("segundo", "multiplicar");
				resultado = multiplica(a, b);
				getResult("multiplicación", resultado, null);
				cleanConsole();
				break;
			case 4: // DIVIDIR
				//System.out.println("A dividir! ");
				a = captureNumber("primer", "dividir");
				b = captureNumber("segundo", "dividir");
				resultado = divide(a, b);
				getResult("división", resultado, null);
				cleanConsole();
				break;
			case 5: // MAYOR DE 3 NUMEROS
				//System.out.println("A calcular número mayor! ");
				a = captureNumber("primer", "evaluar");
				b = captureNumber("segundo", "evaluar");
				c = captureNumber("tercer", "evaluar");
				resultado = evaluaNumeroMayor(a, b, c);
				getResult("mayorde3", resultado, null);
				cleanConsole();
				break;
			case 6: // CAPICUA
				//System.out.println("A evaluar número! ");
				d = captureCapicua();
				res = capicua(d);
				getResult("capicua", null, res);
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
	
	public static Float captureNumber(String chance, String operation) {
		Float number = 0f;
		try {
			System.out.print("Introduzca el "+ chance +" número flotante a "+ operation +": ");
			number = capturaDatos.nextFloat();
		} catch (Exception e) {
			System.err.println("Error :: no se han capturado los datos esperados");
			capturaDatos.nextLine();
			cleanConsole();
		}
		

		return number;
	}
	
	public static String captureCapicua() {
		String number = "";
		
		try {
			System.out.print("Introduzca un número para saber si es capicúa: ");
			number = capturaDatos.next("[0-9]+"); // [0-9]+ patrón de regEx(solo números)
		} catch (Exception e) {
			System.err.println("Error :: no se han capturado los datos esperados");
			capturaDatos.nextLine();
			cleanConsole();
		}
		
		return number;
	}
	
	public static void getResult(String operation, Float res, Boolean capi) {
		if (operation == "mayorde3") {
			System.out.println("El número "+ res +" es el mayor de los 3 números\n");
			capturaDatos.nextLine();
		} else if (operation == "capicua" && capi != null) {
			if (capi == true) {
				System.out.println("SI es capicúa\n");
				capturaDatos.nextLine();
			} else {
				System.out.println("NO es capicúa\n");
				capturaDatos.nextLine();
			}
		} else {
			System.out.println(" La "+ operation +" de "+ a.toString() +" y "+ b.toString() + " es: "+ res.toString()+"\n");
			capturaDatos.nextLine();
		}
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
	
	public static Boolean capicua(String n) {
	/*
	 * Método para evaluar un string capicua
	 */
		String reverse = "";
		
		for (int i = n.length() -1; i >= 0; i--) {
			reverse = reverse + n.charAt(i);
		}
		
		if (reverse.equalsIgnoreCase(n)) {
			return true;
		} else {
			return false;
		}
		
	}
}
