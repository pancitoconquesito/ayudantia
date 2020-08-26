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
public class Cuenta extends Usuario{
    //avisos
    private String hashKey;
    public Cuenta(String nickname, String clave, String correo) {
        super(nickname, clave, correo);
        hashKey=correo;
    }
    
    
}
