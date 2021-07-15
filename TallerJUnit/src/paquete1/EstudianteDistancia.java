
package paquete1;

import java.util.ArrayList;

public class EstudianteDistancia extends Estudiante{
       
    private ArrayList<Nota> nota;
    private double mejorN;
    private double peorNot;
    private double promedi;
    
    
    
    public void establecerNotas(ArrayList<Nota> ns){
        nota = ns;
    
    }
    
    public ArrayList<Nota> obtenerNotas(){
        return nota;
    
    }
    
    

     public void establecerMejorNota(){
       for (int i = 0; i < nota.size(); i++) {
            if (nota.get(i).obtenerValor() > mejorN) {
                mejorN = nota.get(i).obtenerValor();
            }
        }
    
    }
     
     
    
    public double obtenerMejorNota(){
        return mejorN;
    
        
        
    }
    public void establecerPeorNota() {
        double s = 10;
        for (int i = 0; i < nota.size(); i++) {
            if (s > nota.get(i).obtenerValor()) {
                s = nota.get(i).obtenerValor();
            }
        }
        peorNot = s;
    }
       
     
    public double obtenerPeorNota(){
      
    return peorNot;
    }
    
    
    
     public void establecerPromedio(){
         double suma = 0;
       for (int i = 0; i < nota.size(); i++) {
           
            suma = suma +nota.get(i).obtenerValor() ;
               
            }
       promedi = suma/nota.size();
    
    }
     
    public double obtenerPromedio(){
        return promedi; 
    
    }
      
     
    
    @Override
    public String toString(){
        
        
     String cadena = String.format("%sNotas: \n", super.toString());
        for (int i = 0; i < nota.size(); i++) {
            cadena = String.format("%s%.1f", cadena, nota.get(i).obtenerValor());
        }
        
        
        cadena = String.format("%sProemdio: %.1fMejor Nota: %.1fPeor Nota: %.1f",
                cadena, promedi, mejorN, peorNot);
        return cadena;
    }
    
    
    

}
