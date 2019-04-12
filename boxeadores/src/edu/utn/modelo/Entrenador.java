package edu.utn.modelo;

public class Entrenador {
	private Boxeador[] listaboxeadores;
	private int cont=0;
	private TipoEntrenador nombre;
	
	public Entrenador(TipoEntrenador nombre)
	{
		this.listaboxeadores= new Boxeador[5];
		this.nombre=nombre;
		
	}

	public int getCont() {
		return cont;
	}

	public Boxeador[] getListaboxeadores() {
		return listaboxeadores;
	}


	public TipoEntrenador getNombre() {
		return nombre;
	}

	public void setNombre(TipoEntrenador nombre) {
		this.nombre = nombre;
	}
	
	public int llenarListaboxeadores(Boxeador boxeador) {
		if(cont<5)
		{ 
			this.listaboxeadores[cont] = boxeador;
			cont++;	
			return 1;
		}
		System.out.println("Rechazado. El entrenador esta ocupado");
		return 0;
		
			
		
	}
	public void mostrarBoxeadores(Boxeador[] b)
	{
		for(int i=0;i<cont;i++)
		{
			//System.out.println("Boxeador:");
			System.out.println(b[i]);
		}
		

	}

	/* public void setCont(int cont) {
		this.cont = cont;
	} */
	
}
