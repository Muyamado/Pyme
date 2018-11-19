package instrumentos;

public abstract class Instrumento {
	
	private double precio;
	private String marca;
	private int tipoInstrumento;
	
	public Instrumento(double precio,String marca,int tipoInstrumento) {
		this.precio = precio;
		this.marca = marca;
		this.tipoInstrumento = tipoInstrumento;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double nuevoPrecio) {
		precio = nuevoPrecio;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getTipoInstrumento() {
		return tipoInstrumento;
	}
}
