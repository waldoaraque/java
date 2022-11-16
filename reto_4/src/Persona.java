
public class Persona extends Familia {
	//Atributos
	protected String nombre;
	protected int edad;
	protected String sexo;
	protected Float peso;
	protected Float altura;
	
	public Persona(String name, int age, String sex, Float p, Float a) {
		this.nombre = name;
		this.edad = age;
		this.sexo = sex;
		this.peso = p;
		this.altura = a;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}
	
	public String getPersonaInfo() {
		String info = "";
		
		info = info + "Nombre: "+ this.nombre + "\n";
		info = info + "Edad: "+ this.edad + "\n";
		info = info + "Sexo: "+ this.sexo + "\n";
		info = info + "Peso: "+ this.peso + "\n";
		info = info + "Altura: "+ this.altura + "\n";
		info = info + "Dirección: "+ this.direccion+ "\n";
		info = info + "Población: "+ this.poblacion + "\n";
		info = info + "Provincia: "+ this.provincia + "\n";
		info = info + "El peso ideal es: "+ this.imc() + "\n";
		return info;
	}

	@Override
	public Float imc() {
		// TODO Auto-generated method stub
		return this.peso / this.altura * this.altura;
	}
	
	
}
