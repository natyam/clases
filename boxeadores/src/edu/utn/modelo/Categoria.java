package edu.utn.modelo;


public enum Categoria {
MOSCA(1),
GALLO(2),
PLUMA(3),
LIGERO(4),
WELTER(5),
MEDIANO(6),
MEDIOPESADO(7),
PESADO(8);
	private int factor;
	private double peso=0.0;
	
	private Categoria(int factor)
	{
		this.factor=factor;
	}
	
	
	/*public static void clasifica(double peso, Boxeador b)
	{
		
		if(peso>=0 && peso <= 52.162)
		{
			b.setCat(MOSCA);
		}
		
	
			if(peso>=52.163 && peso <= 55.337)
			{
				b.setCat(GALLO);
			}
			if(peso>=55.338 && peso <= 58.966)
			{
				b.setCat(PLUMA);
			}
			if(peso>=58.967 && peso <= 63.502)
			{
				b.setCat(LIGERO);
			}
			if(peso>=63.503  && peso <= 69.852)
			{
				b.setCat(WELTER);
			}
			if(peso>=69.853 && peso <= 76.204)
			{
				b.setCat(MEDIANO);
			}
			if(peso>=76.205 && peso < 91)
			{
				b.setCat(MEDIOPESADO);
			}
			if(peso>=91)
			{
				b.setCat(PESADO);
			}
			
			
		
		
	} 
	
	public static int buscare(Categoria c)
	{
		int i=0;
		switch (c) {
		case MOSCA:
			i= 1;
			break;
		case GALLO:
			i= 1;
					break;
		case PLUMA:
			i= 2;
			break;
		case LIGERO:
			i=  2;
			break;
		case WELTER:
			i=  3;
			break;
		case MEDIANO:
			i= 3;
			break;
		case MEDIOPESADO:
			i=  4;
			break;
		case PESADO:
			i=  4;
			break;
		
		default:
			System.out.println("Categoria no reconocida");
			break;
		}
		return i;
	}
	*/
	

}
