
public abstract class Familia {
	//Atributos
	protected int numeroLibroDeFamilia;
	protected String direccion;
	protected String poblacion;
	protected String provincia;
	
	public Familia() {
		this.numeroLibroDeFamilia = 17893;
		this.direccion = "Av. Reyes Católicos, 14, 3A";
		this.poblacion = "Cuenca";
		this.provincia = "Cuenca";
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
	public abstract Float imc();
}
