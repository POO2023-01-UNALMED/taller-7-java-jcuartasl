package comunicacion;

public class Alfabeto extends Pictograma{
	private static String[] letras;
	private String interpretacion;
	
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public static String[] getLetras() {
		return letras;
	}
	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		int l = letras.length;
		return l;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String c = "";
		for (String i : letras) {
			if (i == letras[0]) {
				c+= i;
			} else {
			c+= ", "+ i;
			}
		}
		return c;
	}
}
