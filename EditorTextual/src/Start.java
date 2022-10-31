import java.util.Scanner;

public class Start {
	
	protected static final Scanner capturaDatos = new Scanner(System.in); 
	protected static int option = 0;
	protected static String file;
	
	public static void main(String[] args) {
	/*
	 * Ejecución del programa
	 */
		companyBanner();
		getMenu();
		handler();
	}
	
	public static void companyBanner() {
	/*
	 * Método para imprimir el banner por separado
	 */
		String banner = "    **************************************    \n"+
	                    "                                              \n"+
	                    "                EDITOR DE TEXTO               \n"+
				        "                                              \n"+
	                    "    **************************************    \n";
		System.out.println(banner);
	}
	
	public static void getMenu() {
	/*
	 * Método para imprimir el menú las veces que se requiera
	 */
		try {
			System.out.println("Introduzca una opción del menú:   ");
			System.out.println("     1. Crear un fichero   ");
			System.out.println("     2. Editar un fichero  ");
			System.out.println("     3. Borrar un fichero  ");
			System.out.println("     4. Crear una carpeta  ");
			System.out.println("     5. Borrar una carpeta ");
			System.out.println("     0. Salir            \n");
			
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
	 * Método para gestionar entrada y salida de datos
	 */
		switch(option) {
		    case 0: // SALIR
		    	System.out.println("El programa ha finalizado");
		    	System.exit(0);
		    	break;
			case 1: // CREAR FICHERO
				
				System.out.println("Introduzca el nombre del nuevo fichero: ");
				file = capturaDatos.next();
				//if() {
					
				//}
				
				System.out.println("fichero creado...");
				capturaDatos.nextLine();
				cleanConsole();
				break;
			case 2: // EDITAR FICHERO
				System.out.println("Introduzca el nombre del fichero a editar: ");
				file = capturaDatos.next();
				
				
				System.out.println("fichero editado...");
				capturaDatos.nextLine();
				cleanConsole();
				break;
			case 3: // BORRAR FICHERO
				System.out.println("Introduzca el nombre del fichero a borrar: ");
				file = capturaDatos.next();
				
				System.out.println("fichero editado...");
				capturaDatos.nextLine();
				cleanConsole();
				break;
			case 4: // CREAR CARPETA
				System.out.println("Introduzca el nombre de la carpeta a crear: ");
				file = capturaDatos.next();
				
				
				System.out.println("carpeta creada...");
				capturaDatos.nextLine();
				cleanConsole();
				break;
			case 5: // BORRAR CARPETA
				System.out.println("Introduzca el nombre de la carpeta a borrar: ");
				
				
				System.out.println("carpeta borrada...");
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
	/*
	 * Método para limpiar la consola después de ejecutar operaciones
	 */
		capturaDatos.nextLine();
		companyBanner();
		getMenu();
		handler();
	}
}
