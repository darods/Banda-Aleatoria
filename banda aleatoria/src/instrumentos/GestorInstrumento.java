package instrumentos;

public class GestorInstrumento {
	private Instrumento a;
	
	public GestorInstrumento(int numInstrumento){
		
		generarInstrumentoAleatorio(numInstrumento);
		
	}
	
	public Instrumento generarInstrumentoAleatorio(int numInstrumento) {
		if(numInstrumento==1) {
			a = new Guitarra();
			return  a;
			}else {
				if(numInstrumento==2) {
					a = new Bateria();
					return  a;
				}else {
					return null;
				}
				
			}
		
		
		
	
	}

}
