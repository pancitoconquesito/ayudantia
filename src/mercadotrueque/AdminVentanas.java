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
public class AdminVentanas {

    private Login login;
    private JFMenu menu;
    private JFBusqueda busqueda;
    public AdminVentanas() {
        login = new Login();
        
    }
    
    public String abrirLogin(HashMap cuentas) {
        if(login.accesoCuenta(cuentas))
            //return login.getClaveLogin();
            return login.getCorreoLogin();
        return null;
    }

    public void cerrarLogin() {
        login.dispose();
    }

    public void abrirMenu(Cuenta user) { 
        menu=new JFMenu();
        menu.setInfo(user);
        
    }
    public int menuRegion(){
        return menu.carga();
    }
    public String menuCategoria(){
        return menu.subMenuA();
    }
    public void cerrarMenuB(){
        menu.dispose();
    }
    
    private void arrancarBusquedaVentana(){
        cerrarMenuB();
        busqueda=new JFBusqueda();
    }
    ////////////////modificar a futuro para poder ver mas de 8 avisos!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public void MenuBusqueda(Cuenta cuentaActual,ArrayList <Integer>arrayAcotado,AdminAviso adminAviso){
        arrancarBusquedaVentana();
        for(int i=0;i<arrayAcotado.size();i++){
            System.out.println(adminAviso.getAviso(arrayAcotado.get(i)).getTitulo());
            busqueda.addAvisoInterfaz(adminAviso.getAviso(arrayAcotado.get(i)));

        }
    }
}
