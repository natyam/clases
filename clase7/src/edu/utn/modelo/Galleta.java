package edu.utn.modelo;

public class Galleta {

	//todos los atributos son provados
	
	
	/*
	private solo puede ser leido por la misma clase
	public lo puede ver la clase corriente y las ortas clases
	protected   la clase corriente + las q hereden
	
	*/  
	
	
	private String nombre;
	private Double precio;
	private String descripcion;
	
	//protected modifica el ambito de vivibilidad del constructor en este caso
	//osea solamente permite q el metodo sea visible solamente por las clases q estan en el 
	//mismo paquete
	/*
	 * protected Galleta() {
		this.nombre="";
		this.descripcion="";
		this.precio= new Double(0.0);
	}
	 */
	
	public Galleta() {
		this.nombre="";
		this.descripcion="";
		this.precio= new Double(0.0);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}
	@Override
	public String toString() {
		String res = String.format("Galletita: %s sale $ %f",this.nombre,this.precio);
		return super.toString();
	}

	public void setPrecio(Double p)
	{
		this.precio=p;
	}
	
	
	
	
}