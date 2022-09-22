package concesionarioventas;

import concesionario.coche;

public class venta {
String fechaDeVenta; 
coche vehiculo;
String nombreDelComprador;

public String getVenta(venta x) {
	String texto = "La fecha de compra es " + x.getFechaDeVenta() + " "+ " del vehiculo..." + x.getVehiculo().getMarca()+ x.getVehiculo().getModelo() + " de " + x.getNombreDelVendedor() + " a " + x.getNombreDelComprador();
	 return texto;
}


public String getFechaDeVenta() {
	return fechaDeVenta;
}
public void setFechaDeVenta(String fechaDeVenta) {
	this.fechaDeVenta = fechaDeVenta;
}
public coche getVehiculo() {
	return vehiculo;
}
public void setVehiculo(coche vehiculo) {
	this.vehiculo = vehiculo;
}
public String getNombreDelComprador() {
	return nombreDelComprador;
}
public void setNombreDelComprador(String nombreDelComprador) {
	this.nombreDelComprador = nombreDelComprador;
}
public String getNombreDelVendedor() {
	return nombreDelVendedor;
}
public void setNombreDelVendedor(String nombreDelVendedor) {
	this.nombreDelVendedor = nombreDelVendedor;
}
String nombreDelVendedor;

}
