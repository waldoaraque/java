package productos;

public class Silla extends Productos{
	public Silla() {
		
	}
	
	public String mostarInfo() {
		String info = "";
		
		info = info + "Nombre: "+ this.nombre+ "\n";
		info = info + "Tipo: "+ this.tipo+ "\n";
		info = info + "Altura: "+ this.altura+ "\n";
		info = info + "Anchura: "+ this.anchura+ "\n";
		info = info + "Profundidad: "+ this.profundidad + "\n";
		return info;
	}
}
