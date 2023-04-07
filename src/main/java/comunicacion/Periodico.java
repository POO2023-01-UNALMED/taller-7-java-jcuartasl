package comunicacion;

public class Periodico extends Escrito {
	private static int factor = 10;
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPrimicia() {
		return primicia;
	}

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
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
		c += fecha + "\n";
		c += primicia;
		return c;
	}
	
}
