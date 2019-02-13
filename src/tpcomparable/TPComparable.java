package tpcomparable;



import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TPComparable {

    
    public static void main(String[] args){
        try {
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");        
        Calendar c1=Calendar.getInstance();
        c1.setTime(sdf.parse("07/01/1993"));
        Curso lista= new Curso();       
        
        lista.agregar(new Estudiante("05", "Raul",c1, 5.2));
        Calendar c2=Calendar.getInstance();
        c2.setTime(sdf.parse("08/01/1995"));
        lista.agregar(new Estudiante("15", "Jose",c2, 3.2));
        Calendar c3=Calendar.getInstance();
       c3.setTime(sdf.parse("09/01/1998"));
       lista.agregar(new Estudiante("18", "Ana",c3, 8.2));
       Calendar c4=Calendar.getInstance();
       c4.setTime(sdf.parse("10/01/2001"));
        lista.agregar(new Estudiante("20", "Maria",c4, 4.2));
         lista.ImprimirLista();
            System.out.println("");
         lista.ImprimirLista2();
        } catch (Exception e) {
        }
        
                 
        
    }
    
}