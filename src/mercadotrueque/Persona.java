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
public abstract class Persona {
    private String nombre;
    private String direccion;
    private int telefono;
    //private String region;//c.i

    public Persona() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //public void setRegion(String region) {
    //    this.region = region;
    //}
    
}
