package edu.utn.vista;

import edu.utn.modelo.FabricaGalletita;
import edu.utn.modelo.Galleta;

public class TestFabricaGalletitas {
	public static void main(String[] args) {
		FabricaGalletita fg= new FabricaGalletita();
		Galleta g = new Galleta();
		g=fg.CrearGalletas(2, 100.0);
		System.out.println(g.getNombre() + " : " + g.getPrecio());
		//System.out.println(g.toString());
		g = fg.CrearGalletas(1, 103.0);
		System.out.println(g.getNombre() + ":" + g.getPrecio());
		
		
		g = fg.CrearGalletas(3, 100.0);
		System.out.println(g.getNombre() + ":" + g.getPrecio());
		
		g = fg.CrearGalletas(4, 101.0);
		System.out.println(g.getNombre() + ":" + g.getPrecio());
		
		
	}

}
