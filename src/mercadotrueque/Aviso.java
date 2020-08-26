/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadotrueque;

/**
 *
 * @author gonza
 */
public class Aviso {
    private Cuenta cuentaPublicador;
    private String titulo;
    private int precio;
    private int alonsoCoin;
    private String descripcion;
    private int region;
    private String categoria;
    //private ArrayList tag;
    //comentarios 
    //Cuenta tipo,String titulo,int precio,int alonsoCoin,String descripcion

    public Aviso(Cuenta cuentaPublicador, String titulo, int precio, int alonsoCoin, String descripcion,int region,String categoria) {
        this.cuentaPublicador = cuentaPublicador;
        this.titulo = titulo;
        this.precio = precio;
        this.alonsoCoin = alonsoCoin;
        this.descripcion = descripcion;
        this.region=region;
        this.categoria=categoria;
    }

    public int getRegion() {
        return region;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public Cuenta getCuentaPublicador() {
        return cuentaPublicador;
    }

    public int getPrecio() {
        return precio;
    }

    public int getAlonsoCoin() {
        return alonsoCoin;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
