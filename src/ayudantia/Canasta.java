/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia;

import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class Canasta {

    private ArrayList<Producto> producto;
    private int totalPrecio;

    public Canasta() {
        producto = new ArrayList<Producto>();
        totalPrecio = 0;
    }

    public void addProducto(Producto producto, int cantidad) {
        totalPrecio += cantidad * producto.getPrecio();
        for (int i = 0; i < cantidad; i++) {
            this.producto.add(producto);
        }
    }

    public void mostrarCanasta() {
        String nombreProducto;
        int cantidad, totalProducto, i, j;
        boolean valido;
        Producto productoActual, productoJ;
        for (i = 0; i < producto.size(); i++) {
            productoActual = (Producto) producto.get(i);
            nombreProducto = productoActual.getNombre();
            valido = true;
            if (i != 0) {
                for (j = i; j > 0; j--) {
                    productoJ = (Producto) producto.get(j - 1);
                    if (nombreProducto.equals(productoJ.getNombre())) {
                        valido = false;
                        break;
                    }
                }
            }

            if (valido) {
                cantidad = 0;
                for (j = 0; j < producto.size(); j++) {
                    productoJ = (Producto) producto.get(j);
                    if (nombreProducto.equals(productoJ.getNombre())) {
                        cantidad++;
                    }
                }
                System.out.print("Producto : " + productoActual.getNombre() + " | cantidad : " + cantidad);
                System.out.println(" | valor Unitario : " + productoActual.getPrecio() + " | total : " + (productoActual.getPrecio() * cantidad));
            }

        }
        System.out.println("Total compra : "+this.totalPrecio);

    }

    public int eliminarProducto(String nombreProducto) {
        int i=0;
        Producto productoJ;
        int cantidadEliminadas=0;
        while(i<producto.size()){
            productoJ = (Producto) producto.get(i);
            if(productoJ.getNombre().equals(nombreProducto)){
                producto.remove(i);
                cantidadEliminadas++;
            }else{
               i++; 
            }
        }
        return cantidadEliminadas;
    }
    public void eliminarXvecesProducto(String nombreProducto,int cantidad){
        int i=0;
        Producto productoJ;
        int cantidadEliminadas=0;
        while(i<producto.size() && cantidad>0){
            productoJ = (Producto) producto.get(i);
            if(productoJ.getNombre().equals(nombreProducto)){
                producto.remove(i);
                cantidadEliminadas++;
                cantidad--;
            }else{
               i++; 
            }
        }
    }
}
