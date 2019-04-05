package main;

import banda.Banda;
import instrumentos.Instrumento;

public class Controlador {
	Instrumento inst;
    int Num_Musicos;
    Banda b;
    public Controlador(){
        Num_Musicos=(int)((Math.random()*20)+1);
        b=new Banda(Num_Musicos);
        for(int i=0;i<Num_Musicos;i++){
        	inst=b.m[i].GetInstrumento();
            System.out.println("el musico #"+b.m[i].GetID()+" toca: "+inst.GetNombreInstrumento());
            inst.afinarIntrumento();
            inst.tocarIntrumento();
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        new Controlador();
    }

}
