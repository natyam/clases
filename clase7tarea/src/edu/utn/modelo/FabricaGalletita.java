package edu.utn.modelo;
import edu.utn.modelo.Galleta;
public class FabricaGalletita {
	public Galleta CrearGalletas(int tipo , Double rangoPrecio)
	{
		Galleta g= new Galleta();
		
		switch (tipo) {
		case 1:
			g.setNombre("CHOCOLINA");
			break;
		case 2:
			g.setNombre("OREO");
			break;
		case 3:
			g.setNombre("PITUSSA");
	
	break;
		case 4:
			g.setNombre("TODDY");
			break;
		default:
			System.out.println("NO SE PUEDE CREAR GALLETA");
			break;
		}
		//Double p= new Double(tipo*rangoPrecio);
		g.setPrecio(rangoPrecio);
		return g;
	}
		
	}