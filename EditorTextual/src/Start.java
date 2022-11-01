import java.util.Scanner;
import java.io.File;
import java.io.IOException; 
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileNotFoundException;


public class Start {
	
	protected static final Scanner capturaDatos = new Scanner(System.in); 
	protected static final String workdir = System.getProperty("user.dir");
	protected static int option = 0;
	protected static File file = null;
	protected static FileWriter fileWriter = null;
	protected static String fileName = null, miniOption = null;

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
				try {
					updateFile(fileName);
				} catch(FileNotFoundException e) {
					System.err.println("Error:: Ha ocurrido un error ejecutando la edición de fichero");
				}
				
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
				createDir(fileName);
				capturaDatos.nextLine();
				cleanConsole();
				break;
			case 5: // BORRAR CARPETA
				System.out.println("Introduzca el nombre de la carpeta a borrar: ");
				fileName = capturaDatos.next();
				deleteDir(fileName);
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
		
		if(file.exists() && file.isFile()) {
			System.out.println("Fichero existente ¿Desea sobrescribirlo?");
			miniOption = capturaDatos.next("(Si|No)$");
			
			if(miniOption.startsWith("Si")) {
				try {
					fileWriter = new FileWriter(file);
					fileWriter.write("");
					fileWriter.close();
					System.out.println("Fichero creado correctamente.");
				} catch(IOException e) {
					System.err.println("Error:: Ha ocurrido un problema creando el fichero.");
					capturaDatos.nextLine();
					cleanConsole();
				}
			} else {
				cleanConsole();
			}
		} else {
			try {
				file.getParentFile().mkdirs();
				file.createNewFile();
			} catch(Exception e) {
				System.err.println("Error:: Ha ocurrido un problema creando el fichero.");
				capturaDatos.nextLine();
				cleanConsole();
			}
		}
	}
	
	public static void updateFile(String fileName) throws FileNotFoundException {
	/*
	 * Método para actualizar fichero
	 */
		Path path = Paths.get(workdir, fileName);
		String oldData = null;
		file = new File(path.toString());
		Long fileTime = file.lastModified();
		Scanner reader = new Scanner(file);
		
		if(file.exists() && file.isFile()) {
			
			try {
				
				while(reader.hasNextLine()) {
					oldData = reader.nextLine();
				}
				reader.close();
				System.out.print("Introduzca el texto que desea añadir al fichero: ");
				miniOption = capturaDatos.nextLine();
				miniOption = capturaDatos.nextLine(); // duda sobre esto...
				
				fileWriter = new FileWriter(file);
				fileWriter.write(oldData +" "+ miniOption);
				fileWriter.close();
				
				if(fileTime < file.lastModified()) {
					System.out.println("Documento editado correctamente.");
				}
				
			} catch(IOException e) {
				System.err.println("Error:: Ha ocurrido un problema creando el fichero.");
				capturaDatos.nextLine();
				cleanConsole();
			}
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
		if(file.exists() && file.isFile()) {
			System.out.println("¿Estás seguro de que deseas borrarlo (Afirmación S)?");
			try {
				miniOption = capturaDatos.next("(S|s)$");
				if(miniOption.contentEquals("S") || miniOption.contentEquals("s")) {
					file.delete();
					System.out.println("Fichero eliminado correctamente.");
				} else {
					System.out.println("El fichero no se borró del sistema.");
					capturaDatos.nextLine();
					cleanConsole();
				}	
			} catch(Exception e) { //Capturamos excepción por si el usuario ingresa cualquier cosa
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
	
	public static void createDir(String fileName) {
	/*
	 * Método para crear carpetas
	 */
		Path path = Paths.get(workdir, fileName);
		
		file = new File(path.toString());
		if(file.exists() && file.isDirectory()) {
			System.out.println("Carpeta ya existente.");
			capturaDatos.nextLine();
			cleanConsole();
		} else {
			file.mkdirs();
			System.out.println("Carpeta creada correctamente.");
		}
	}
	
	public static void deleteDir(String fileName) {
	/*
	 * Método para borrar carpetas
	 */
		Path path = Paths.get(workdir, fileName);
		
		file = new File(path.toString());
		if(file.exists() && file.isDirectory()) {
			System.out.println("¿Estás seguro de que deseas borrar la carpeta (Afirmación S)?");
			try {
				miniOption = capturaDatos.next("(S|s)$");
				if(miniOption.contentEquals("S") || miniOption.contentEquals("s")) {
					for(File subfile: file.listFiles()) {
						subfile.delete();
					}
					file.delete();
					System.out.println("Carpeta borrada correctamente.");
				} else {
					System.out.println("La carpeta no se borró del sistema.");
					capturaDatos.nextLine();
					cleanConsole();
				}	
			} catch(Exception e) { //Capturamos excepción por si el usuario ingresa cualquier cosa
				System.out.println("La carpeta no se borró del sistema.");
				capturaDatos.nextLine();
				cleanConsole();
			}
		} else {
			System.out.println("La carpeta no existe.");
			capturaDatos.nextLine();
			cleanConsole();
		}
	}
}
