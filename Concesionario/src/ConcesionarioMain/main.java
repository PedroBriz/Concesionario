package ConcesionarioMain;

import concesionario.coche;
import concesionarioventas.venta;

public class main {

	public static void main(String[] args) {
		
		coche c1 = new coche();
		coche c2 = new coche();
		
		c1.setMarca("Honda");
		c1.setModelo("Civic Type-R");
		c1.setPotencia("330CV");
		c1.setPrecio(47500);
		
		c2.setMarca("Renault");
		c2.setModelo("Clio 1.6 E-TECH TECHNO");
		c2.setPotencia("140CV");
		c2.setPrecio(26250);
		
		System.out.println ("DATOS DE LOS COCHES:");
		System.out.println(c1.getCoche(c1));
		System.out.println(c2.getCoche(c2));
		
		venta v1 = new venta();
		venta v2 = new venta();
		
		v1.setFechaDeVenta("23/01/2022"); 
		v1.setVehiculo(c1);
		v1.setNombreDelComprador("Pedro Briz");
		v1.setNombreDelVendedor("Jorge Samper SL");
		
		v2.setFechaDeVenta("25/01/2022"); 
		v2.setVehiculo(c2);
		v2.setNombreDelComprador("Alejandro Jimenez");
		v2.setNombreDelVendedor("Jorge Samper SL");
		
		System.out.println ("DATOS DE LAS VENTAS:");
		System.out.println(v1.getVenta(v1));
		System.out.println(v2.getVenta(v2));
		


	}
}
