package instrumentos;

public class instrumentoPercusion extends Instrumento{

	private int tambores;
	private int platillos;
	private double tamano;
	
	public instrumentoPercusion(double precio, String marca, int tipoInstrumento,int tambores,int platillos,double tamano) {
		super(precio, marca, tipoInstrumento);
		this.tambores = tambores;
		this.platillos = platillos;
		this.tamano = tamano;
	}

	public int getTambores() {
		return tambores;
	}
	
	public void setTambores(int nuevoTambor) {
		tambores = nuevoTambor;
	}
	
	public int getPlatillos() {
		return platillos;
	}
	
	public void setPlatillos(int nuevoPlatillo) {
		platillos = nuevoPlatillo;
	}
	
	public double getTamano() {
		return tamano;
	}
}
