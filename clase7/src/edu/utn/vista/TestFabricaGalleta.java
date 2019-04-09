package edu.utn.vista;

import edu.utn.modelo.FabricaGalletita;
import edu.utn.modelo.Galleta;


public class TestFabricaGalleta{
	public static void main(String[] args) {
		FabricaGalletita fab= new FabricaGalletita();
		
		Galleta g= fab.CrearGalletas(2, 100);
		System.out.println("llega");
		System.out.println(g.getNombre() +" : " + g.getPrecio());
		System.out.println(g.toString());
		
		g=fab.CrearGalletas(1, 103);
		System.out.println(g.getNombre() +" : " + g.getPrecio());
		
		g=fab.CrearGalletas(3, 100);
		System.out.println(g.getNombre() +" : " + g.getPrecio());
		g=fab.CrearGalletas(4, 101);
		System.out.println(g.getNombre() +" : " + g.getPrecio());
		
	}
	
	
}
