package vehiculos;

public class Vehiculo {
	//Atributos
	protected String marca;
	protected Float precio;
	protected Float peso;
	protected String color;
	protected Float longitud;
	
	public Vehiculo() {
		this.marca = "";
		this.precio = 0.0f;
		this.peso = 0.0f;
		this.color = "";
		this.longitud = 0.0f;
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Float getLongitud() {
		return longitud;
	}

	public void setLongitud(Float longitud) {
		this.longitud = longitud;
	}
	
	public String mostrarInfo() {
		return "";
	}
}
