import edificios.Almacen;
import edificios.Fabrica;
import edificios.Oficina;
import productos.Productos;
import vehiculos.VehiculoElectrico;
import vehiculos.VehiculoGasoil;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa materialConts = new Empresa();
		System.out.println(materialConts.getName() + "\n");
		
		//VEHICULOS
		VehiculoElectrico vehiculoElec = new VehiculoElectrico();
		VehiculoGasoil vehiculoGasoil = new VehiculoGasoil();
		
		//EDIFICIOS
		Fabrica fabrica = new Fabrica();
		Oficina oficina = new Oficina();
		Almacen almacen = new Almacen();
		
		//PRODUCTOS
		Productos silla1 = new Productos();
		Productos silla2 = new Productos();
		Productos puerta1 = new Productos();
		Productos puerta2 = new Productos();
		
		// CREACION DE VEHICULOS DE LA EMPRESA
		vehiculoElec.setMarca("Seat Altea");
		vehiculoElec.setPrecio(20000.0f);
		vehiculoElec.setColor("rojo");
		vehiculoElec.setLongitud(3.0f);
		vehiculoElec.setPotencia(4000.0f);
		// creamos vehiculo electrico
		materialConts.setVehiculo1(vehiculoElec);
		System.out.println(vehiculoElec.mostarInfo());
		
		vehiculoGasoil.setMarca("Renault Kadjar");
		vehiculoGasoil.setPrecio(28000.0f);
		vehiculoGasoil.setPeso(4000.0f);
		vehiculoGasoil.setColor("azul");
		vehiculoGasoil.setLongitud(3.5f);
		// creamos vehiculo gasoil
		materialConts.setVehiculo2(vehiculoGasoil);
		System.out.println(vehiculoGasoil.mostarInfo());
		
		// CREACION DE EDIFICIOS DE LA EMPRESA
		fabrica.setAnchura(400.0f);
		fabrica.setAltura(400.0f);
		fabrica.setProfundidad(500.0f);
		fabrica.setFuncionalidad("Lugar donde se crean los productos");
		fabrica.setTipo("Fabrica");
		// creamos la fábrica
		materialConts.setEdificio1(fabrica);
		System.out.println(fabrica.mostarInfo());

		oficina.setAnchura(600.0f);
		oficina.setAltura(400.0f);
		oficina.setProfundidad(700.0f);
		oficina.setFuncionalidad("Lugar donde se gestionan los productos");
		oficina.setTipo("Oficina");
		// creamos la oficina
		materialConts.setEdificio2(oficina);
		System.out.println(oficina.mostarInfo());
		
		almacen.setAnchura(600.0f);
		almacen.setAltura(400.0f);
		almacen.setProfundidad(700.0f);
		almacen.setFuncionalidad("Lugar donde se almacenan los productos");
		almacen.setTipo("Almacen");
		// creamos el almacen
		materialConts.setEdificio3(almacen);
		System.out.println(almacen.mostarInfo() + "El coste para pintar el almacén a 30€/m es: "+ materialConts.edificio1.costePintura(30.0f));
		
		// CREACION DE PRODUCTOS DE LA EMPRESA
		silla1.setId(1);
		silla1.setNombre("Silla N20");
		silla1.setTipo("Silla");
		silla1.setAnchura(1.0f);
		silla1.setAltura(0.5f);
		silla1.setProfundidad(0.5f);
		// creación silla n20
		materialConts.setProducto1(silla1);
		System.out.println(silla1.mostarInfo());
		
		silla2.setId(2);
		silla2.setNombre("Silla M100");
		silla2.setTipo("Silla");
		silla2.setAnchura(1.5f);
		silla2.setAltura(0.5f);
		silla2.setProfundidad(1.5f);
		// creacion silla m100
		materialConts.setProducto2(silla2);
		System.out.println(silla2.mostarInfo());
		
		puerta1.setId(3);
		puerta1.setNombre("Puerta P9");
		puerta1.setTipo("Puerta");
		puerta1.setAnchura(1.5f);
		puerta1.setAltura(2.25f);
		puerta1.setProfundidad(0.25f);
		// creacion puerta p9
		materialConts.setProducto3(puerta1);
		System.out.println(puerta1.mostarInfo());
		
		puerta2.setId(4);
		puerta2.setNombre("Puerta F50");
		puerta2.setTipo("Puerta");
		puerta2.setAnchura(1.25f);
		puerta2.setAltura(1.25f);
		puerta2.setProfundidad(0.25f);
		// creacion puerta f50
		materialConts.setProducto3(puerta2);
		System.out.println(puerta2.mostarInfo());
		
	}

}
