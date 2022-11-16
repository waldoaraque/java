package vehiculos;

public class VehiculoElectrico extends Vehiculo {
	protected Float potencia;
	
	public VehiculoElectrico() {
		this.potencia = 0.0f;
	}
	public Float getPotencia() {
		return potencia;
	}

	public void setPotencia(Float potencia) {
		this.potencia = potencia;
	}
	public String mostarInfo() {
		String info = "";
		
		info = info + "Marca: "+ this.marca+ "\n";
		info = info + "Precio: "+ this.precio+ "\n";
		info = info + "Color: "+ this.color+ "\n";
		info = info + "Tipo: Electrico \n";
		info = info + "Potencia: "+ this.potencia+ "\n";
		info = info + "Peso: "+ this.peso+ "\n";
		info = info + "Longitud: "+ this.longitud+ "\n";
		return info;
	}
}
