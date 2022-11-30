/******************************************************************************
                    IFP Desarrollo de Aplicaciones Web
                    1er Ciclo - Programación A
                            Waldo Araque
                            
                    Ejercicio Teórico - Arrays
							 
							 30/11/2022
*******************************************************************************/

public class Start {
 
    public static void main(String[] args) {
        int x = 0,y = 0,z = 0;
 
        //Array unidimensional 
        System.out.println("Array/Lista de Materias");
        String[] arrayUni = new String[4];
        arrayUni[0] = "Programación";
        arrayUni[1] = "Matemáticas";
        arrayUni[2] = "Sistemas";
        arrayUni[3] = "Inglés";
 
        for (x = 0; x < arrayUni.length; x++) {
            System.out.println((x+1) +" "+ arrayUni[x]);
        }
        
        //Array bidimensional 
        System.out.println("");
        System.out.println("Array/Lista de Alumnos");
        String[][] arrayBidi = {// Array 3 x 3
                {"Waldo", "Araque", "programacion1"}, 
                {"Joan", "Barrios", "ingles"}, 
                {"Ricardo", "Gonzales", "sistemas"}  
        };
 
        for (x = 0; x < arrayBidi.length; x++) { //Filas
            for (y = 0; y < arrayBidi[x].length; y++) { //Columnas
                System.out.print(" "+arrayBidi[x][y]+" ");
            }
            System.out.println("");
        }
 
        //Array tridimensional
        System.out.println("");
        System.out.println("Array tres dimensiones x, y, z");
        Float[][][] arrayTri = {
        		{//z
                    {1.6f, 1.3f, 6.2f},// x
                    {-2.3f, -6.9f, 10.4f},// x
                    {3.8f, -4f, 6.2f} // x
                },  // y    y    y
                {//z
                	{1.6f, 1.3f, 6.2f},// x
                    {-2.3f, -6.9f, 10.4f},// x
                    {3.8f, -4f, 6.2f} // x
                }
        };
 
        for (x = 0; x < arrayTri.length; x++) {
            for (y = 0; y < arrayTri[x].length; y++) {
                for (z = 0; z < arrayTri[x][y].length; z++) {
                    System.out.print(" "+arrayTri[x][y][z]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
 
    }
}