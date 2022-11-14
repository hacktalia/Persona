
public abstract class Familia {
	
	protected int numeroDeLibroDeFamilia;
	protected String direccion;
	protected String poblacion;
	protected String provincia;
	
	
	public Familia () {
		
		this.numeroDeLibroDeFamilia=0;
		this.direccion="";
		this.poblacion="";
		this.provincia="";
		
		
	}
	
	public Familia (int numeroDeLibroDeFamilia, String direccion, String poblacion, String provincia){
		this.numeroDeLibroDeFamilia = numeroDeLibroDeFamilia;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.provincia = provincia;

	}
	
	
	public abstract float imc ();
	
	
	
	
	public void print()
	{
		System.out.println(this.numeroDeLibroDeFamilia+ "-" + this.direccion + "-" + this.poblacion+ "-" + this.provincia);
	}
	
	
	
	
	
	public int getNumeroDeLibroDeFamilia() {
		return numeroDeLibroDeFamilia;
	}
	public void setNumeroDeLibroDeFamilia(int numeroDeLibroDeFamilia) {
		this.numeroDeLibroDeFamilia = numeroDeLibroDeFamilia;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	

}
