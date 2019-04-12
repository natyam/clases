package edu.utn.controlador;

import edu.utn.modelo.Boxeador;
import edu.utn.modelo.Entrenador;
import edu.utn.modelo.TipoEntrenador;

public class GimnasioControlador {
	
private Entrenador[] listaEntrenadores;

	
	
	public   GimnasioControlador()
	{
		this.listaEntrenadores = new Entrenador[4];
		this.listaEntrenadores[0]=new Entrenador(TipoEntrenador.AAA);
		this.listaEntrenadores[1]=new Entrenador(TipoEntrenador.BBB);
		this.listaEntrenadores[2]=new Entrenador(TipoEntrenador.CCC);
		this.listaEntrenadores[3]=new Entrenador(TipoEntrenador.DDD);
		
	}
	
		
public int ingresoBoxeador(Boxeador box, int tipoe)
{
	int i=0;
	switch (tipoe) {
	case 1:
		
		i=this.listaEntrenadores[0].llenarListaboxeadores(box);
						break;
		case 2:
			i=this.listaEntrenadores[1].llenarListaboxeadores(box);
						
						break;
		case 3:
			i=this.listaEntrenadores[2].llenarListaboxeadores(box);
			
			break;
		case 4:
			i=this.listaEntrenadores[3].llenarListaboxeadores(box);
			
			break;

	default:
		System.out.println("Error");
		break;
	}
	return i;
	
}


public Entrenador[] getListaEntrenadores() {
	return listaEntrenadores;
}

/*
public void setListaEntrenadores(Entrenador[] listaEntrenadores) {
	this.listaEntrenadores = listaEntrenadores;
} 
*/

}
