/******************************************************************************
                    IFP Desarrollo de Aplicaciones Web
                    1er Ciclo - Programación A
                            Waldo Araque
                            
                             Teorico 3 c
  Abrir un fichero de texto y añadir en el mismo la palabra "Agregado". Es decir, 
  si el fichero contenía información, se añadirá al final del mismo el texto "Agregado".
							 
							 02/11/2022
*******************************************************************************/
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Start {
	protected static final String workdir = System.getProperty("user.dir"); // gestionamos el directorio principal del proyecto java
	protected static final Path path = Paths.get(workdir, "fichero.txt"); // nuestro directorio entero + nombre del fichero
	protected static final File file = new File(path.toString()); // generamos la instancia de nuestro fichero 
	protected static FileWriter fileWriter = null; // iniciamos nuestra variable fileWriter
	protected static String dataFile = ""; // generamos variable para guardar el contenido existente del fichero.txt
	
	public static void main(String[] args) throws FileNotFoundException, IOException{ // añadimos throws directamente en la funcion para capturar el error de esta forma ya que son dos excepciones las que nos exigen capturar, al ser un caso sencillo dónde no necesitamos mandar un mensaje de error, podemos evitar usar dos trycatch
	/*
	 * Ejecución del programa
	 */
		
		Scanner reader = new Scanner(file); // generamos una instancia de snanner para leer el fichero.txt
		while(reader.hasNextLine()) {  // usamos while para leer cada vez que consiga una línea en el fichero
			dataFile += reader.nextLine() + "\n"; // guardamos el contenido del fichero en nuestra variable dataFile
		}
		reader.close(); // cerramos la conexion del scanner al fichero.txt
		
		fileWriter = new FileWriter(file); // instanciamos el fileWriter 
		fileWriter.write(dataFile +"\n"+"Agregado"); // escribimos el contenido que tenía el fichero y añadimos el nuevo "Agreagdo"
		fileWriter.close(); // cerramos la conexión del fileWriter con el fichero.txt
	}
}
