package instrumentos;

public class Teclas extends Instrumento {
	
	private int octavas;
	private int material;
	
	
	public Teclas(double precio, String marca, int tipoInstrumento,int octavas,int material) {
		super(precio, marca, tipoInstrumento);
		this.octavas = octavas;
		this.material = material;
	}

	public int getOctavas() {
		return octavas;
	}
	
	public void setOctavas(int nuevaOctava) {
		octavas = nuevaOctava;
	}
	
	public int setMaterial() {
		return material;
	}
}
