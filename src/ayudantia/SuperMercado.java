/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia;

import java.util.HashMap;

/**
 *
 * @author gonza
 */
public class SuperMercado {
    private HashMap <String,Producto> bodega;
    public SuperMercado() {
        bodega=new <String,Producto>HashMap();
    }
    public boolean addProducto(String nombre,int precio,int stock){
        if(!isProducto(nombre) && precio>0 && stock >0){
           Producto nuevoProducto=new Producto(nombre,precio,stock);
           bodega.put(nombre, nuevoProducto); 
           return true;
        }else{
            return false;
        }   
    }
    public boolean isProducto(String nombre){
        return bodega.get(nombre)!=null;
    }
    public boolean setStockProducto(int nuevoStock,String nombreProducto){
        if(isProducto(nombreProducto) && nuevoStock > 0){
            bodega.get(nombreProducto).setStock(nuevoStock);
            return true;
        }else{
            return false;
        }
    }
    public Producto getProducto(String nombre){
        return bodega.get(nombre);
    }
    public int stockPosible(String nombreProducto,int cantidadPedida){
        int cantidadBodega=bodega.get(nombreProducto).getStock();
        if(cantidadBodega <= cantidadPedida){
            return cantidadBodega;
        }else{
            return cantidadPedida;
        }
    }
    public boolean eliminarProducto(String nombreProducto){
        if(isProducto(nombreProducto)){
            bodega.remove(nombreProducto);
            return true;
        }
        return false;
    }
}
