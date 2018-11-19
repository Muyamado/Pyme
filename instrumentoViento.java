package instrumentos;

public class instrumentoViento extends Instrumento {

	private String tipoBoquilla;
	private String tipoLengueta;
	private String tipoEmbocadura;
	private int material;
		
	public instrumentoViento(double precio, String marca, int tipoInstrumento,String tipoBoquilla,String tipoLengueta,String tipoEmbocadura,int material) {
		super(precio, marca, tipoInstrumento);
		this.tipoBoquilla = tipoBoquilla;
		this.tipoLengueta = tipoLengueta;
		this.tipoEmbocadura = tipoEmbocadura;
		this.material = material;
	}

	public String getTipoBoquilla(){
		return tipoBoquilla;
	}
	
	public String getTipoLengueta(){
		return tipoLengueta;
	}
	
	public String getTipoEmbocadura() {
		return tipoEmbocadura;
	}
	
	public void setTipoLengueta(String nuevoTipoLengueta) {
		tipoLengueta = nuevoTipoLengueta;
	}
	
	public int getMaterial() {
		return material;
	}
}
