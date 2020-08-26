/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadotrueque;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author gonza
 */
public class AdminAviso {
    private HashMap<Integer,Aviso>coleccionAviso;
    private ArrayList<Integer>keyAvisoColeccion;
    private static int ID_AVISO;
    public AdminAviso() {
        coleccionAviso=new HashMap<Integer,Aviso>();
        keyAvisoColeccion=new ArrayList<Integer>();
        ID_AVISO=0;
    }
    public void addAvisoColeccion(Aviso aviso){
        coleccionAviso.put(ID_AVISO, aviso);
        keyAvisoColeccion.add(ID_AVISO);
        ID_AVISO++;
    }

    public HashMap<Integer, Aviso> getColeccionAviso() {
        return coleccionAviso;
    }

    public ArrayList<Integer> getKeyAvisoColeccion() {
        return keyAvisoColeccion;
    }
    public Aviso getAviso(Integer hash){// leugo agregar comprobacion como en varias otras
        return (Aviso)coleccionAviso.get(hash);
    }
    
}
