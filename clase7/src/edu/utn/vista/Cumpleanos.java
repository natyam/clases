package edu.utn.vista;
import java.util.Scanner;

public class Cumpleanos {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese su nombre");
		String nombre =scan.nextLine();

		System.out.println("Ingrese el dia del cumpleaños");
		int d=ingresoDato(scan,"dia", 29,0);
		
		int m=ingresoDato(scan,"mes", 12,0);
		
		int a= ingresoDato(scan,"año",2018, 2000);
		System.out.println(String.format("%s Su cumple es %d/%d/%d",nombre, d,m,a));
		
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
		
		/*while(fecha>valormaximo)
		{
			System.out.println(String.format(mensaje, momento,valormaximo));
			fecha = scan.nextInt();
		}
		if(momento=="ano")
		{
			while(fecha<valormaximo)
			{
				mensaje="Ingrese %s de su cumple (Valor minimo %d) ";
				System.out.println(String.format(mensaje, momento,valormaximo));
				fecha = scan.nextInt();
			}
		}
		else
		{
			if (fecha<=0)
			{
				System.out.println("ingrese una fecha mayor a cero");
			}
		}*/
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

}
