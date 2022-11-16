
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Familia araqueFamily = null;
		Persona hermana = null;
		Persona hermano = null;
		Persona padre = null;
		
		hermana = new Persona("Ludy Araque", 43, "Femenino", 57.0f, 1.63f);
		hermano = new Persona("Willmer Araque", 39, "Masculino", 73.0f, 1.72f);
		padre = new Persona("Gregorio Araque", 72, "Masculino", 70.0f, 1.67f);
		
		araqueFamily = new Familia(17893, "Av. Reyes Católicos, 14, 3A", "Cuenca", "Cuenca", padre, hermano, hermana);
		System.out.println(padre.getPersonaInfo() + "El peso ideal es: "+ araqueFamily.imc(padre) + "\n");
		System.out.println(hermana.getPersonaInfo() + "El peso ideal es: " + araqueFamily.imc(hermana) + "\n");
		System.out.println(hermano.getPersonaInfo() + "El peso ideal es: "+ araqueFamily.imc(hermano) + "\n");
	}

}
