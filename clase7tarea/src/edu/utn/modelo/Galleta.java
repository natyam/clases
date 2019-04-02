package edu.utn.modelo;

public class Galleta {
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
	public Double setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	
	
}
