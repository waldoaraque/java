import java.util.Scanner;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Start {
	
	protected static final Scanner capturaDatos = new Scanner(System.in); 
	protected static final String workdir = System.getProperty("user.dir");
	protected static int option = 0;
	protected static File file;
	protected static String fileName, miniOption;
	
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
			System.out.println("Introduzca una opción del menú:   \n");
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
				fileName = capturaDatos.next();
				
				createFile(fileName);
				
				capturaDatos.nextLine();
				cleanConsole();
				break;
			case 2: // EDITAR FICHERO
				System.out.println("Introduzca el nombre del fichero a editar: ");
				fileName = capturaDatos.next();
				updateFile(fileName);
				
				capturaDatos.nextLine();
				cleanConsole();
				break;
			case 3: // BORRAR FICHERO
				System.out.println("Introduzca el nombre del fichero a borrar: ");
				fileName = capturaDatos.next();
				deleteFile(fileName);
				
				capturaDatos.nextLine();
				cleanConsole();
				break;
			case 4: // CREAR CARPETA
				System.out.println("Introduzca el nombre de la carpeta a crear: ");
				fileName = capturaDatos.next();
				
				
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
	
	public static void createFile(String fileName) {
	/*
	 * Método para validar y crear fichero
	 */
		Path path = Paths.get(workdir, fileName);
		
		file = new File(path.toString());
		
		if(file.exists()) {
			System.out.println("Fichero existente ¿Desea sobrescribirlo?");
			miniOption = capturaDatos.next("(Si|No)$");
			
			if(miniOption.startsWith("Si")) {
				System.out.println("creating filesystemccsadsfa");
				//return file;
			} else {
				cleanConsole();
			}
		} else {
			System.out.println("nuevo file");
		}
	}
	
	public static void updateFile(String fileName) {
	/*
	 * Método para actualizar fichero
	 */
		Path path = Paths.get(workdir, fileName);
		
		file = new File(path.toString());
		if(file.exists()) {
			System.out.println("Introduzca el texto que desea añadir al fichero: ");
			miniOption = capturaDatos.next();
			// añadir al final del fichero el texto
			//System.out.println("Documento editado correctamente.");
		} else {
			System.out.println("Fichero inexistente");
			capturaDatos.nextLine();
			cleanConsole();
		}
	}
	
	public static void deleteFile(String fileName) {
	/*
	 * Método para borrar fichero
	 */
		Path path = Paths.get(workdir, fileName);
		
		file = new File(path.toString());
		if(file.exists()) {
			System.out.println("¿Estás seguro de que deseas borrarlo (Afirmación S)?");
			try {
				miniOption = capturaDatos.next("(S|s)$");
				if(miniOption.contentEquals("S")) {
					System.out.println(miniOption);
					// eliminar fichero
				} else {
					System.out.println("El fichero no se borró del sistema.");
					capturaDatos.nextLine();
					cleanConsole();
				}	
			} catch (Exception e) { //Capturamos excepción por si el usuario ingresa cualquier cosa
				System.out.println("El fichero no se borró del sistema.");
				capturaDatos.nextLine();
				cleanConsole();
			}
		} else {
			System.out.println("Fichero inexistente");
			capturaDatos.nextLine();
			cleanConsole();
		}
	}
}
