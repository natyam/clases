package edu.utn.modelo;

public class Persona {
	private String nombre;
	private int dia;
	private int mes;
	private int ano;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void identificarse()
	{
			System.out.println(this.getNombre() +" tiene " + (2019-this.getAno())+ "años");
			
	}
	

}
