package clase4while;

public class Testswhichcase {
	
	public static void main (String[] args)
	{
		char key ='r';
		switch (key) {
		case 'r': case 'R':
			System.out.println("color rojo");
			break;
		case 'a':
			System.out.println("color azul");
			break;
		case 'y':
			System.out.println("color amarillo");
			break;
		default:
			System.out.println("no reconosco el error");
			break;
		
		
		}
		
		
		//HAGO LO MISMO CON LOS ENTEROS
		int color = 22;
		switch (key) {
		//se fija el valor de r en el codigo asqui y lo compara con el int color
		//puedo agregar int color ='r' y funciona igual xq le agrego el valor de codigo asqui
		//a la variable color
		case 'r': case 22:
			System.out.println("color rojo");
			break;
		case 'a':
			System.out.println("color azul");
			break;
		case 'y':
			System.out.println("color amarillo");
			break;
		default:
			System.out.println("no reconosco el error");
			break;
		
		
		}
		
		
		
	}
	

}
