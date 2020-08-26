/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia;

/**
 *
 * @author gonza
 */
public class Producto {
    private String nombre;
    private int precio;
    private int stock;

    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    public int getPrecio(){
        return this.precio;
    }
    public int getStock(){
        return this.stock;
    }
    public void descontarStock(int descuento){
        stock=stock-descuento;
    }
    public String getNombre(){
        return this.nombre;
    }
}
