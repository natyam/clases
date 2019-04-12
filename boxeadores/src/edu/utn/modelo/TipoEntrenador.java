package edu.utn.modelo;

public enum TipoEntrenador {
	AAA(1),
	BBB(2),
	CCC(3),
	DDD(4),
	EEE(5);
	
	private int num;
	private TipoEntrenador(int num)
	{
		this.num=num;
	}
	public int num()
	{
		return num;
	}
}
