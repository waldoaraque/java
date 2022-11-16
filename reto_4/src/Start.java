/******************************************************************************
                    IFP Desarrollo de Aplicaciones Web
                    1er Ciclo - Programación A
                            Waldo Araque
                            
               Reto 4 - Programación Orientada a Objetos
							 
							 16/11/2022
*******************************************************************************/
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona hermana = null;
		Persona hermano = null;
		Persona padre = null;
		
		hermana = new Persona("Ludy Araque", 43, "Femenino", 57.0f, 1.63f);
		hermano = new Persona("Willmer Araque", 39, "Masculino", 73.0f, 1.72f);
		padre = new Persona("Gregorio Araque", 72, "Masculino", 70.0f, 1.67f);
		
		System.out.println(padre.getPersonaInfo());
		System.out.println(hermana.getPersonaInfo());
		System.out.println(hermano.getPersonaInfo());
	}

}
