/******************************************************************************
                    IFP Desarrollo de Aplicaciones Web
                    1er Ciclo - Programación A
                            Waldo Araque
                            
               Reto 3 - Lectura de fichero y obtención de resultado
							 
							 02/11/2022
*******************************************************************************/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Start {
	protected static final String workdir = System.getProperty("user.dir");
	protected static final Path path = Paths.get(workdir, "notasPepe.txt");
	protected static final File file = new File(path.toString());
	protected static String dataInFile = null;
	protected static Float nota = 0.0f;
	protected static Float unidades = 0.0f;
	protected static Float sum = 0.0f;

	public static void main(String[] args) throws FileNotFoundException {
	/*
	 * Ejecución del programa
	 */
		Scanner reader = new Scanner(file);
		if(file.exists() && file.isFile()) {	
			while(reader.hasNextLine()) {
				unidades += 1;
				dataInFile = reader.nextLine();
				dataInFile = dataInFile.substring(dataInFile.length() -2, dataInFile.length());
				nota = Float.parseFloat(dataInFile);
				sum += nota; 
			}
			reader.close();
			
			System.out.println("La nota media del alumno es: "+ promedio(sum, unidades));
		} else {
			
			System.out.println("Fichero inexistente");
		}
	}
	
	public static Float promedio(Float notaTotal, Float unidades) {
	/*
	 * Método para calcular promedio
	 */
		return notaTotal / unidades;
	}
	
}
