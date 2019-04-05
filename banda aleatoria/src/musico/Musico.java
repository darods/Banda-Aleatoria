package musico;

import instrumentos.GestorInstrumento;
import instrumentos.Instrumento;

public class Musico {
	 private int ID;
	 private int numInstrumento;
	 private Instrumento instrumento;
	 private GestorInstrumento a;  
	
	    
	    
	   
	    public Musico(int ID){
	        this.SetID(ID);
	        this.numInstrumento=(int)(Math.random()*2)+1;
	        a= new GestorInstrumento (this.numInstrumento);
	        instrumento= a.generarInstrumentoAleatorio(this.numInstrumento);
	        
	    }
	    
	    public Instrumento GetInstrumento() {
	        return this.instrumento;
	    }    


	    public int GetID() {
	        return ID;
	    }

	    public void SetID(int ID) {
	        this.ID = ID;
	    }

}
