
package main;

import Clases.Cancion;
import Clases.comparaTitulos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prueba {

    public static void main(String[] args) {
        List lista = new ArrayList<Cancion>();
        lista.add(new Cancion("A", "Ruta", 5));
        lista.add(new Cancion("C", "Ruta", 3));
        lista.add(new Cancion("B", "Ruta", 4));
        lista.add(new Cancion("D", "Ruta", 2));
        
        System.out.println("Lista desordenada ==>" + lista.toString());
        
        Collections.sort(lista);
        
        System.out.println("Lista ordenada con el comparable ==> " + lista.toString());
        
        lista.sort(new comparaTitulos());
        
        System.out.println("Lista ordanada con el comparator ==> " + lista.toString());
    }
    
}
