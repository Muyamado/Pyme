package instrumentos;

public class Violin extends instrumentoCuerda{
	
	private int medida;
	
	public Violin(double precio, String marca, int tipoInstrumento, int cuerdas, int trastes, int material,int medida) {
		super(precio, marca, tipoInstrumento, cuerdas, trastes, material);
		this.medida = medida;
	}
	
	public int getMedida() {
		return medida;
	}
	
	public void setMedida(int nuevaMedida) {
		medida = nuevaMedida;
	}
	
}
