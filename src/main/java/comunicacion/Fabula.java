package comunicacion;

public class Fabula extends Escrito{
	private static int factor = 1;
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	public String getEnsenanza() {
		return ensenanza;
	}
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//METHODS
	
	int palabrasTotales(int i) {
		return i*factor*getPaginas();
	}
	
	String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String c = this.resumen() +"\n";
		c += ensenanza;
		return c;
	}
	
}
