package edu.utn.modelo;
import edu.utn.modelo.Galleta;
public class FabricaGalletita {
	public Galleta CrearGalletas(int tipo , Double rangoPrecio)
	{
		
		Galleta g= new Galleta();
		
		switch (tipo) {
		case 1:
			g.setNombre(TipoGalleta.CHOCOLINA.toString());
			Double precio=new Double(TipoGalleta.CHOCOLINA.precio()*rangoPrecio);
			g.setPrecio(precio);
			break;
		case 2:
			g.setNombre(TipoGalleta.OREO.toString());
			g.setPrecio(new Double(TipoGalleta.OREO.precio()*rangoPrecio));
			
			break;
		case 3:
			
			g.setNombre(TipoGalleta.PITUSA.toString());
			g.setPrecio(new Double(TipoGalleta.PITUSA.precio()*rangoPrecio));
	
	break;
		case 4:
			g.setNombre(TipoGalleta.TODDY.toString());
			g.setPrecio(new Double(TipoGalleta.TODDY.precio()*rangoPrecio));
			break;
		default:
			System.out.println("NO SE PUEDE CREAR GALLETA");
			break;
		}
		
		return g;
	}
		
	}