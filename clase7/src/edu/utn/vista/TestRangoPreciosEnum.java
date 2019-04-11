package edu.utn.vista;

import edu.utn.modelo.RangoPrecios;
import edu.utn.modelo.TipoGalleta;


public class TestRangoPreciosEnum {
	public static void main(String[] args) {
		System.out.println(RangoPrecios.CARISIMO.toString());
		System.out.println(RangoPrecios.BARATO.factor());
		System.out.println(TipoGalleta.CHOCOLINA.toString());
		System.out.println(TipoGalleta.OREO);
	}
}
