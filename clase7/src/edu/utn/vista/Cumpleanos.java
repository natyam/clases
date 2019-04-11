package edu.utn.vista;
import java.util.Scanner;

import edu.utn.modelo.Persona;

public class Cumpleanos {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		int dias[]={31,28,31,30,31,30,31,30,31,30,31,31};
		Persona personas[]= new Persona[3];
		int bandera=0;
		int menor=0;
		//String nombre;
		
		
		for(int i=0; i<3;i++)
		{
			Persona per= new Persona();
			System.out.println("Ingrese su nombre");
			
		String nombre =scan.next();
		per.setNombre(nombre);
		
		//per.setNombre(scan.nextLine());

		
	
		//int m=ingresoDato(scan,"mes", 12,dias[m-1]);
		int m=ingresoDato(scan,"mes", 12,0);
		per.setMes(m);
		
		//System.out.println("Ingrese el dia del cumpleaños");
		int d=ingresoDato(scan,"dia", dias[m-1],0);
		per.setDia(d);
		
		
		
		
		int a= ingresoDato(scan,"año",2018, 2000);
		per.setAno(a);
		
		personas[i] = per;	
		
		
		
		System.out.println(personas[i].getNombre()+ " : " + d + "/" + m + "/" + a);
		
		
		//System.out.println(String.format("%s Su cumple es %d/%d/%d",nombre, d,m,a));
		
		
		if(bandera==0)
		{
			bandera++;
		}
		else
		{
			menor= compararmenor(personas[menor], personas[i], menor, i);
			//comparo los dos y regreso el valor menor
		}
		
		
			
		}
		
		System.out.println("El mas joven es " + personas[menor].getNombre());
	
		
		System.out.println("-----------------");
		for (Persona persona : personas) {
			persona.identificarse();
		}
	
		
		
		

		
	}
	private static int ingresoDato(Scanner scan,  String momento, int valormaximo, int valorminimo )
	{
		String mensaje="Ingrese %s de su cumple (Valor maximo %d) ";
		System.out.println("Ingrese "+momento+" de su cumple");
		int fecha = scan.nextInt();
		while(validar(fecha,valormaximo,valorminimo))
		{
			fecha=scan.nextInt();
		}
		
		
		return fecha;
	}
	private static boolean validar(int fecha, int valormaximo, int valorminimo)
	{
		if(fecha<=valorminimo || fecha>valormaximo)
		{
			
			System.out.println(String.format("Ingrese una fecha mayor a %d y menor a %d",valorminimo,valormaximo));
			
			return true;
		}
		return false;
	}
	
	private static int compararmenor (Persona a, Persona b, int bandera, int i) 
	{
		if((2019-a.getAno())>(2019-b.getAno()))
		{
			//a es mayor, entonces b es menor
			return i;
		}
		if ((2019-a.getAno())==(2019-b.getAno()))
		{
			if (a.getMes()  >  b.getMes())
			{
				return i;
			}
			if(a.getDia()> b.getDia())
			{
				return i;
			}
			else
				return bandera;
		}
		
		
		
		
		return bandera;
			
	}
	
	

}
