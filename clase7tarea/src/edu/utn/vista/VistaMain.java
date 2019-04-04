package edu.utn.vista;

import java.util.Scanner;

import edu.utn.modelo.FabricaGalletita;
import edu.utn.modelo.Galleta;

public class VistaMain {
public static void main(String[] args) {
	
	
	int precio;

	Scanner scan= new Scanner(System.in);
	int num= ingreseTipoGalleta(scan);
	int n=0;
	Galleta galle= new Galleta();
	FabricaGalletita fg= new FabricaGalletita();
	while (num!=99) {
		
	
		precio=ingresePrecio(scan);
		
		galle=fg.CrearGalletas(num,new Double(precio));
		
		
		System.out.println("==========Galleta "+(n+1)+"=========="); 
		System.out.println(galle.getNombre()+" y cuesta "+galle.getPrecio());
			
	
		System.out.println("Ingrese otra galleta");
		num=ingreseTipoGalleta(scan);
		n++;
	}
	
		
	}
	
private static int ingreseTipoGalleta(Scanner scan)
	{
		System.out.println("Ingrese el tipo de galleta que quiero crear. 99 para terminar");
		System.out.println("1 ------ chocolina");
		System.out.println("2 ------ Oreo");
		System.out.println("3 ------ Pitussa");
		System.out.println("4 ------ Toddy");
		int num= scan.nextInt();
		if(num==99)
			return 99;
		while(num>4 || num<1) {
			System.out.println("Numero invalido. INGRESE DE NUEVO");
			num= scan.nextInt();
			if(num==99)
				return 99;
		}
		return num;

	}
	private static int ingresePrecio(Scanner scan)
	{
		System.out.println("Ingrese precio de la galletita, valor del 100 al 103");
		System.out.println("100 ------ Barato");
		System.out.println("102 ------ Medio");
		System.out.println("103 ------ Caro");
		System.out.println("104 ------ Carisimo");
		int p= scan.nextInt();
		while(p>104 || p<100)
		{
			System.out.println("Precio invalido. Ingrese otro precio");
			p=scan.nextInt();
		}
		return p;
		
		}


	}
