package edu.utn.modelo;

public enum RangoPrecios {
	BARATO(100),
	MEDIO(101),
	CARO(102),
	CARISIMO(103);
	private Integer factor;
	//Integer puede ser un int o lo que quiera
	private RangoPrecios(int factor)
	{
		this.factor=factor;   
	}
	public int factor()
	{
		return factor;
	}
	
}
