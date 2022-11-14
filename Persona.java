
public class Persona extends Familia {

	protected String nombre;
	protected int edad;
	protected String dni;
	protected String sexo;
	protected float peso;
	protected float altura;

	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = "";
		this.peso = 0;
		this.altura = 0;

	}

	public Persona(String n, int e, String dni, String s, float peso, float altura, int numeroDeLibroDeFamilia,
			String direccion, String poblacion, String provincia)

	{

		super(numeroDeLibroDeFamilia, direccion, poblacion, provincia);

		this.nombre = n;
		this.edad = e;
		this.dni = dni;
		this.sexo = s;
		this.peso = peso;
		this.altura = altura;

	}

	public float imc() {

		float resultado = 0.0f;

		resultado = this.peso / (this.altura * this.altura);
		return resultado;

	}

	public String mostrarInfo() {
		String mostrarInfo = this.nombre + "-" + this.edad + "-" + this.dni + "-" + this.sexo + "-" + this.peso + "-"
				+ this.altura + "-" + this.numeroDeLibroDeFamilia + "-" + this.direccion + "-" + this.poblacion + "-"
				+ this.provincia;
		return mostrarInfo;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

}
