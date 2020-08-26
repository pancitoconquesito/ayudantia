/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudantia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author gonza
 */
public class Ayudantia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        SuperMercado cofrima = new SuperMercado();
        Canasta canasta = new Canasta();

        int opcion;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        String nombreProducto;
        int valorProducto, stockProducto, cantidadProducto, cantidadProductoDisponible;
        do {
            System.out.println("2) agregarProductoBodega    3) modificarStockProducto    4) agreagarProductoCanasta\n5) mostrarCanasta    6) eliminarProductoCanasta    7) eliminar Producto Bodega\n8) eliminarXcantidadDeCanasta    9) Salir");
            opcion = Integer.parseInt(lector.readLine());
            switch (opcion) {
                case 2: {
                    //agregarProducto
                    System.out.println("Ingrese nombre producto");
                    nombreProducto = lector.readLine();
                    System.out.println("Ingrese valor producto");
                    valorProducto = Integer.parseInt(lector.readLine());
                    System.out.println("Ingrese stock producto");
                    stockProducto = Integer.parseInt(lector.readLine());
                    if (cofrima.addProducto(nombreProducto, valorProducto, stockProducto)) {
                        System.out.println("Agregado exitosamente");
                    } else {
                        System.out.println("Error en datos ingresados");
                    }
                    break;
                }
                case 3: {
                    //modificar stock de producto en bodega
                    System.out.println("Ingrese stock producto");
                    stockProducto = Integer.parseInt(lector.readLine());
                    System.out.println("Ingrese nombre producto");
                    nombreProducto = lector.readLine();
                    if (cofrima.setStockProducto(stockProducto, nombreProducto)) {
                        System.out.println("Stock modificado exitosamente");
                    } else {
                        System.out.println("Producto no existente");
                    }

                    break;
                }
                case 4: {
                    //
                    System.out.println("Ingrese nombre producto");
                    nombreProducto = lector.readLine();

                    if (cofrima.isProducto(nombreProducto)) {
                        System.out.println("Ingrese cantidad producto");
                        cantidadProducto = Integer.parseInt(lector.readLine());
                        if(cantidadProducto > 0){
                            cantidadProductoDisponible = cofrima.stockPosible(nombreProducto, cantidadProducto);
                            cofrima.getProducto(nombreProducto).descontarStock(cantidadProductoDisponible);
                            canasta.addProducto(cofrima.getProducto(nombreProducto), cantidadProductoDisponible);
                            if (cantidadProductoDisponible != cantidadProducto) {
                                System.out.println("Cantidad en bodega menor al solicitado, solo se agregaran " + cantidadProductoDisponible + " unidades");
                            } 
                        }
                        
                    } else {
                        System.out.println("No existe ese producto");
                    }
                    break;
                }
                case 5:{
                    canasta.mostrarCanasta();
                    break;
                }
                case 6:{
                    System.out.println("Ingrese nombre producto");
                    nombreProducto = lector.readLine();
                    if(canasta.eliminarProducto(nombreProducto)!=0)    System.out.println("eliminado exitosamente");
                    else    System.out.println("producto no existe en canasta");
                    // si elimnino de canasta deberia aumentar en bodega?
                    //cofrima.setStockProducto(cofrima.getProducto(nombreProducto).getStock()+canasta.eliminarProducto(nombreProducto),nombreProducto);
                }
                case 7:{
                    System.out.println("Ingrese nombre producto");
                    nombreProducto = lector.readLine();
                    if(cofrima.eliminarProducto(nombreProducto))System.out.println("eliminacion terminada");
                    else    System.out.println("producto no existe");
                    //si elimino de bogega debo eliminar de canasta?
                    //canasta.eliminarProducto(nombreProducto);
                }
                case 8:{
                    System.out.println("Ingrese nombre producto");
                    nombreProducto = lector.readLine();
                    if(cofrima.isProducto(nombreProducto)){
                        System.out.println("Ingrese cantidad producto");
                        cantidadProducto = Integer.parseInt(lector.readLine());
                        if(cantidadProducto<=0){
                            canasta.eliminarProducto(nombreProducto);
                            cofrima.setStockProducto(cofrima.getProducto(nombreProducto).getStock()+canasta.eliminarProducto(nombreProducto),nombreProducto);
                        }else{
                            canasta.eliminarXvecesProducto(nombreProducto,cantidadProducto);
                        }
                    }else {
                        System.out.println("No existe ese producto");
                    }
                    break;
                }
                case 9:{
                    break;
                }
                default:{
                    System.out.println("numero no valido");
                }   
            }
        } while (opcion != 9);
    }
}
