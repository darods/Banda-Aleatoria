package instrumentos;

public class Instrumento {
	
	protected String nombreInstrumento;
	
	public Instrumento() {
		this.nombreInstrumento="";
		
	}
	
	public Instrumento(String nombreInstrumento) {
		this.nombreInstrumento=nombreInstrumento;
		
	}
	
	public void tocarIntrumento() {
		System.out.println("Tocando "+this.nombreInstrumento);
		
	}
	
	public void afinarIntrumento() {
		System.out.println("Afinando  "+this.nombreInstrumento);
		
	}
	
	public String GetNombreInstrumento () {
		return this.nombreInstrumento;
	}

}
