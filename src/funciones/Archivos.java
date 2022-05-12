package funciones;

import Clases.Cancion;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos {
    
    public static String url = "jdbc:derby://localhost:1527/ListasReproduccion";
    public static Connection dbConnection;
    public static String sqlSelectAll = "SELECT * from ejemplo";
    public static String sqlInsertInto = "INSERT INTO ejemplo VALUES";
    public static Statement sentencias;
    
    /**
     * Función que comprueba si una String tiene letras dentro 
     * (Para validar la duración obtenida)
     * @param cadena -> String a comprobar
     * @return -> Boolean (True => Contiene letras, False => No contiene letras)
     */
    private static boolean tieneLetras(String cadena){
        char[] cadenaCaracteres = cadena.toCharArray();
        boolean tieneLetras = false;
        for(char c:cadenaCaracteres){
            if(!Character.isDigit(c)){
                tieneLetras = true;
            }
        }
        return tieneLetras;
    }

    
    public boolean guardarPlaylistSQL(ArrayList<Cancion> lista){
        boolean continuar = false;
        
        return continuar;
    }
    
    public ArrayList<Cancion> cargarPlaylistSQL(){
        ArrayList<Cancion> lista = new ArrayList<>();
        
        
        
        return lista;
    }
}
