package edu.utn.modelo;

public class Boxeador {
	private String nombre;
	private Categoria cat;
	private double peso;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Categoria getCat() {
		return cat;
	}
	public void setCat(Categoria cat) {
		this.cat = cat;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		
		return nombre;
	}
	

}
