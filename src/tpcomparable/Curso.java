package tpcomparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Curso {
    private ArrayList<Estudiante> lista;

    public Curso() {
        this.lista = new ArrayList();
    }
    public void agregar(Estudiante aux){
        this.lista.add(aux);
    }
    
    public void ImprimirLista(){
        int i=1;
        for ( Estudiante aux : lista) {
            System.out.println(i+". "+aux.toString());
            i++;
        }
    }
    public void ImprimirLista2(){
        Collections.sort(lista);
        int i=1;
        for ( Estudiante aux : lista) {
            System.out.println(i+". "+aux.toString());
            i++;
        }
    }

    }