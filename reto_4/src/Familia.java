
public class Familia {
	//Atributos
	protected int numeroLibroDeFamilia;
	protected String direccion;
	protected String poblacion;
	protected String provincia;
	protected Persona padre;
	protected Persona hermano;
	protected Persona hermana;
	
	
	public Familia(int numFamilia, String adress, String pob, String provi, Persona father, Persona brother, Persona sister) {
		this.numeroLibroDeFamilia = numFamilia;
		this.direccion = adress;
		this.poblacion = pob;
		this.provincia = provi;
		this.padre = father;
		this.hermano = brother;
		this.hermana = sister;
	}
	
	public int getNumeroLibroDeFamilia() {
		return numeroLibroDeFamilia;
	}
	public void setNumeroLibroDeFamilia(int numeroLibroDeFamilia) {
		this.numeroLibroDeFamilia = numeroLibroDeFamilia;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public Float imc(Persona person) {
		return person.peso / person.altura * person.altura;
	}
	
}
