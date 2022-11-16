package edificios;

public class Oficina extends Edificio{
	public Oficina() {
		
	}
	public String mostarInfo() {
		String info = "";
		
		info = info + "Tipo: "+ this.tipo+ "\n";
		info = info + "Anchura: "+ this.anchura+ "\n";
		info = info + "Altura: "+ this.altura + "\n";
		info = info + "Profundidad: "+ this.profundidad + "\n";
		info = info + "Funcionalidad: "+ this.funcionalidad + "\n";
		return info;
	}
	@Override
	public String funcionalidadEdificio() {
		// TODO Auto-generated method stub
		return this.funcionalidad = "Etiqueta el Producto";
	}

}
