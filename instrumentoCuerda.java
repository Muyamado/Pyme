package instrumentos;

public class instrumentoCuerda extends Instrumento {

	private int cuerdas;
	private int trastes;
	private int material;
	
	public instrumentoCuerda(double precio, String marca, int tipoInstrumento,int cuerdas,int trastes,int material) {
		super(precio, marca, tipoInstrumento);
		this.cuerdas = cuerdas;
		this.trastes = trastes;
	}

	public int getCuerdas() {
		return cuerdas;
	}
	
	public int getTrastes() {
		return trastes;
	}
	
	public int getMaterial() {
		return material;
	}
}
