
package Clases;

import java.util.Comparator;

public class comparaTitulos implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return((Cancion)o1).getNombre().compareTo(((Cancion)o2).getNombre());
    }
    
}
