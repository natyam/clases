package edu.utn.vista;

import java.util.Scanner;

import edu.utn.controlador.Clasificador;
import edu.utn.controlador.GimnasioControlador;
import edu.utn.modelo.Boxeador;
import edu.utn.modelo.Entrenador;


public class Gimnasio {
		public static void main(String[] args) {
			
			GimnasioControlador g= new  GimnasioControlador();
			
			
			int i=0;
			Boxeador box= new Boxeador();
			
			int tipoe;
			int aceptado=0, contrecha=0;
			Boxeador[] rechazados= new Boxeador[100];
			
			System.out.println("Ingrese los boxeadores");
			while(i!=07)
			{
				box= new Boxeador();
				Scanner scan= new Scanner(System.in);
				System.out.println("Ingrese nombre:");
				box.setNombre(scan.nextLine());
				System.out.println("Ingrese el peso: ");
				box.setPeso(scan.nextDouble());
				Clasificador.clasificar(box.getPeso(), box);
				
				tipoe= Clasificador.buscarentrenador(box.getCat());
				
				aceptado=g.ingresoBoxeador(box,tipoe);
				
				if(aceptado==1)
				{
					i++;
				}
				else
				{
					rechazados[contrecha]=box;
					contrecha++;
				}
				
			}
			mostrarEntrenadores(g.getListaEntrenadores());
			if(contrecha!=0)
			{
				mostrarRechazados(rechazados, contrecha);
			}
		}
		private static void mostrarEntrenadores(Entrenador[] listaAntrenadores)
		{
			
			
			
			
			for (Entrenador entrenador : listaAntrenadores) {
				
				System.out.println("Nombre entrenador:" + entrenador.getNombre());
				Clasificador.mostrarCategoriaEntrenador(entrenador.getNombre());
				if(entrenador.getCont()==0)
					{
						System.out.println("No tiene boxeadores asociados");
					}
				else
				{
					System.out.println("Boxeadores asignados: ");
					entrenador.mostrarBoxeadores(entrenador.getListaboxeadores());
				}
				
			}
			System.out.println();
			System.out.println();
		}
		private static void mostrarRechazados(Boxeador[] box, int max)
		{
			System.out.println("Boxeadores rechazados: ");
			System.out.println("Nombre              Categoria");
			/*for (Boxeador boxeador : box) {
				System.out.println(boxeador + "              " + boxeador.getCat());
				//System.out.print(boxeador.getNombre() + "              " );
				//System.out.print(boxeador.getCat().toString());
			}*/
			
			for(int i=0;i<max;i++)
			{
				System.out.println(box[i]+ "              " + box[i].getCat());
			}
		}



	
	
}

//}
