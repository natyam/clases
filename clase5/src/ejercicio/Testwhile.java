package ejercicio;

import java.util.Scanner;

public class Testwhile { 
	
	public static void main(String[] args) {
		
		//la estructura de repeticion while nos permite ejecutar un conjunto de setencias
		//de manera repetitiva mientras se cumpl e la condicion 
		

		System.out.println("Ingrese un numero  ");	
		Scanner scan = new Scanner(System.in); 
		
		//ingreso una linea de caracteres
		//String ingresoUsuario = scan.nextLine(); 
		
		//ingreso un numero
		int ingresousuario = scan.nextInt();
		//System.out.println("El numero que ingreso es " + ingresousuario);	
		
		int i=0;
		
		while (ingresousuario!=0)
		{
			System.out.println("Hola mundo " +i);
			ingresousuario = scan.nextInt();
			i++;
			
		}
		System.out.println("Fin while");

		
	/*	
		int i=0;
		while(i<25)
		{
			System.out.println("Hola mundo");
			i++;
			
		}
	*/	
	}

}
