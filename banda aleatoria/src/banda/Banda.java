package banda;

import musico.Musico;

public class Banda {
	public Musico m[];
    
    public Banda(int Num_Musicos){
        GenerarBanda(Num_Musicos);
        
    }
    public void GenerarBanda(int Num_Musicos){
        m=new Musico[Num_Musicos];
        for(int i=0;i<Num_Musicos;i++){
            m[i]=new Musico(i+1);

        }
    }
}
