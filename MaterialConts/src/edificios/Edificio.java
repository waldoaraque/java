package edificios;

public abstract class Edificio {
	protected Float anchura;
	protected Float altura;
	protected Float profundidad;
	protected String funcionalidad;
	protected String tipo;
	
	public Edificio() {
		this.anchura = 1.0f;
		this.altura = 1.0f;
		this.profundidad = 1.0f;
		this.funcionalidad = "";
		this.tipo = "";
	}
	
	public Float getAnchura() {
		return anchura;
	}
	public void setAnchura(Float anchura) {
		this.anchura = anchura;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	public Float getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(Float profundidad) {
		this.profundidad = profundidad;
	}
	public String getFuncionalidad() {
		return funcionalidad;
	}
	public void setFuncionalidad(String funcionalidad) {
		this.funcionalidad = funcionalidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public  Float costePintura(Float n) {
		if(n < 0) {
			return -1.0f;
		} else {
			return n * this.anchura * this.altura * this.profundidad;
		}
	}
	
	public Float costePintura(String c, Float n) {
		if (n < 0) {
			return -1.0f;
		} else {
			if(c == "ladoanchura") {
				return n * this.anchura * this.altura;
			} else if (c == "ladoprofundidad") {
				return n * this.altura *this.profundidad;
			} else {
				return -1.0f;
			}
		}
	}
	
	public String mostrarInfo() {
		return "";
	}
	
	public abstract String funcionalidadEdificio();
	
}
