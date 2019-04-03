package edu.utn.vista;

import java.util.Scanner;

import edu.utn.modelo.FabricaGalletita;
import edu.utn.modelo.Galleta;

public class VistaMain {
public static void main(String[] args) {
	
	
	System.out.println("Ingrese el tipo de galleta que quiero crear. 99 para terminar");
	System.out.println("1 ------ chocolina");
	System.out.println("2 ------ Oreo");
	System.out.println("3 ------ Pitussa");
	System.out.println("4 ------ Toddy");
	int precio;
	//Double p=0.0;
	Scanner scan= new Scanner(System.in);
	int num= scan.nextInt();
	while (num!=99) {
		while(num>4 || num<1) {
			System.out.println("Numero invalido. INGRESE DE NUEVO");
			num= scan.nextInt();
		}
		System.out.println("Ingrese precio de la galletita, valor del 100 al 103");
		precio=scan.nextInt();
		
		while(precio>103||precio<100)
		{
				System.out.println("Precio invalido, ingrese un numero del 100 al 103");
				precio=scan.nextInt();
	
					
						}
		Double p= new Double(precio);
		/*switch (precio) {
					case 100:
						p=100.0;
						break;
					case 101:
						p=101.0;
						break;
					case 102:
						p=102.0;
						break;
					case 103:
						p=103.0;
						break;
					case 104:
						p=104.0;
						break;
					default:
						System.out.println("Error al crear el Double");
						break;
					}*/
		
		System.out.println("precio"+ p);
			Galleta galle= new Galleta();
			FabricaGalletita fg= new FabricaGalletita();
			galle=fg.CrearGalletas(num,p);

			
			//Double p= new Double(num*precio);	
			
			System.out.println("La galleta creada es: ");
			System.out.println(galle.getNombre());
			System.out.println(galle.getPrecio());
	}

	
	}
}