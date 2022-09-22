package concesionario;

public class coche {
	String marca;
	String modelo;
	int precio;
	String potencia;
	
	public String getCoche(coche x){
		 String texto = x.getMarca() + " " + x.getModelo() + " " + x.getPotencia() + " " + x.getPrecio();
		 return texto;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

}
