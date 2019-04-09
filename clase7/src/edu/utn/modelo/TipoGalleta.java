package edu.utn.modelo;

public enum TipoGalleta {
	CHOCOLINA(1),
	OREO(2),
	PITUSA(3),
	TODDY(4);
	private int numero;
	private TipoGalleta (int numero)
	{
		this.numero= numero;
	}
	public int precio()
	{
		return numero;
	}
}
