package vehiculos;

public class VehiculoGasoil extends Vehiculo {
	public VehiculoGasoil() {
		
	}
	
	public String mostarInfo() {
		String info = "";
		
		info = info + "Marca: "+ this.marca+ "\n";
		info = info + "Precio: "+ this.precio+ "\n";
		info = info + "Color: "+ this.color+ "\n";
		info = info + "Tipo: Gasoil \n";
		info = info + "Peso: "+ this.peso+ "\n";
		info = info + "Longitud: "+ this.longitud+ "\n";
		return info;
	}
}
