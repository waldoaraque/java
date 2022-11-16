package vehiculos;

public class VehiculoGasolina extends Vehiculo {
	protected String contaminacion;
	protected String tamanyo_deposito;
	
	public VehiculoGasolina() {
		this.contaminacion = "";
		this.tamanyo_deposito = "";
	}
	
	public String getContaminacion() {
		return contaminacion;
	}
	public void setContaminacion(String contaminacion) {
		this.contaminacion = contaminacion;
	}
	public String getTamanyo_deposito() {
		return tamanyo_deposito;
	}
	public void setTamanyo_deposito(String tamanyo_deposito) {
		this.tamanyo_deposito = tamanyo_deposito;
	}
	public String mostarInfo() {
		String info = "";
		
		info = info + "Marca: "+ this.marca+ "\n";
		info = info + "Precio: "+ this.precio+ "\n";
		info = info + "Color: "+ this.color+ "\n";
		info = info + "Tipo: Gasolina \n";
		info = info + "Contaminacion: "+ this.contaminacion+ "\n";
		info = info + "Deposito de Gasolina: "+ this.tamanyo_deposito+ "\n";
		info = info + "Peso: "+ this.peso+ "\n";
		info = info + "Longitud: "+ this.longitud+ "\n";
		return info;
	}
	
}
