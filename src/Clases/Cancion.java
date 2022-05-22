
package Clases;

import java.util.Objects;

/**
 * Clase que tiene los atributos de nuestras canciones que vamos a utilizar.
 * @author Migue
 */
public class Cancion implements Comparable {
    
    private String nombre;
    private String ruta;
    private int duracion;

    /**
     * 
     * @param nombre -> String con el nombre
     * @param ruta -> String con la ruta del archivo
     * @param duracion  -> Int con la duración de la canción
     */
    public Cancion(String nombre, String ruta, int duracion){
        if(nombre.isBlank()){
            throw new IllegalArgumentException("El nombre de la canción no puede estar vacío");
        }
        
        if(ruta.isBlank()){
            throw new IllegalArgumentException("El ruta no puede estar vacío");
        }
        
        if(duracion <= 0){
            throw new IllegalArgumentException("La duración debe ser > 0");
        }
        
        this.nombre = nombre;
        this.ruta = ruta;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.isBlank()){
            throw new IllegalArgumentException("El nombre de la canción no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        if(ruta.isBlank()){
            throw new IllegalArgumentException("El ruta no puede estar vacío");
        }
        
        this.ruta = ruta;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if(duracion <= 0){
            throw new IllegalArgumentException("La duración debe ser > 0");
        }
        
        this.duracion = duracion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.ruta);
        hash = 41 * hash + this.duracion;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        if (this.duracion != other.duracion) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.ruta, other.ruta);
    }

    

    @Override
    public int compareTo(Object o) {
        return this.duracion - ((Cancion)o).getDuracion();
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", ruta=" + ruta + ", duracion=" + duracion + '}';
    }
    
    
}
