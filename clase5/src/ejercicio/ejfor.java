package ejercicio;

public class ejfor {
public static void main(String[] args) {
	
	for(int i=0;i<22;i++)
	{
		System.out.println("Hola mundo " +i+ ((i>1)? " veces" :"vez"));

	}
	
	//operador trinario:
	//condicion? accionpor verdadero : accion por falso
	
	
	
	
	
	
	
	
	
	
	int par=0;
	for(int i=0;i<22;i++)
	{
		if (i%2==0)
		{
			//int solo-pares = i%2==0? i: -1;
			par++;
			System.out.println("Hola mundo " +par+" vez");
		}

	}
	
	
	for(int i=35;i>=0;i--)
	{
		if (i%2==0)
		System.out.println("Hola mundo " +i+ ((i>1)? " veces" :"vez"));

	}
}

}
