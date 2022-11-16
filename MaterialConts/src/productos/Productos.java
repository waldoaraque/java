package productos;

public class Productos {
	protected int id;
	protected String nombre;
	protected String tipo;
	protected Float anchura;
	protected Float profundidad;
	protected Float altura;
	
	public Productos() {
		this.id = 0;
		this.nombre = "";
		this.tipo = "";
		this.anchura = 0.0f;
		this.profundidad = 0.0f;
		this.altura = 0.0f;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Float getAnchura() {
		return anchura;
	}

	public void setAnchura(Float anchura) {
		this.anchura = anchura;
	}

	public Float getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Float profundidad) {
		this.profundidad = profundidad;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}


	public String mostarInfo() {
		return "";
	}
}
