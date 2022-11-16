import edificios.Edificio;
import productos.Productos;
import vehiculos.Vehiculo;
import vehiculos.VehiculoElectrico;

public class Empresa {
	protected String name;
	protected VehiculoElectrico vehiculo1;
	protected Vehiculo vehiculo2;
	protected Edificio edificio1;
	protected Edificio edificio2;
	protected Edificio edificio3;
	protected Productos producto1;
	protected Productos producto2;
	protected Productos producto3;
	protected Productos producto4;
	
	public Empresa() {
		this.name = "MATERIALCONTS";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String mostarInfo() {
		return "";
	}

	public VehiculoElectrico getVehiculo1() {
		return vehiculo1;
	}

	public void setVehiculo1(VehiculoElectrico vehiculo1) {
		this.vehiculo1 = vehiculo1;
	}

	public Vehiculo getVehiculo2() {
		return vehiculo2;
	}

	public void setVehiculo2(Vehiculo vehiculo2) {
		this.vehiculo2 = vehiculo2;
	}

	public Edificio getEdificio1() {
		return edificio1;
	}

	public void setEdificio1(Edificio edificio1) {
		this.edificio1 = edificio1;
	}

	public Edificio getEdificio2() {
		return edificio2;
	}

	public void setEdificio2(Edificio edificio2) {
		this.edificio2 = edificio2;
	}

	public Edificio getEdificio3() {
		return edificio3;
	}

	public void setEdificio3(Edificio edificio3) {
		this.edificio3 = edificio3;
	}

	public Productos getProducto1() {
		return producto1;
	}

	public void setProducto1(Productos producto1) {
		this.producto1 = producto1;
	}

	public Productos getProducto2() {
		return producto2;
	}

	public void setProducto2(Productos producto2) {
		this.producto2 = producto2;
	}

	public Productos getProducto3() {
		return producto3;
	}

	public void setProducto3(Productos producto3) {
		this.producto3 = producto3;
	}

	public Productos getProducto4() {
		return producto4;
	}

	public void setProducto4(Productos producto4) {
		this.producto4 = producto4;
	}
	
}
