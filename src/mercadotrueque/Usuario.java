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
public abstract class Usuario extends Persona{
    //persona herencia
    private String nickname;
    private String clave;
    private String correo;
    
    public Usuario(String nickname, String clave, String correo) {
        this.nickname = nickname;
        this.clave = clave;
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public String getNickname() {
        return nickname;
    }
    
    
}
