/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadotrueque;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author gonza
 */
public class Plataforma {
    private AdminVentanas ventana;
    private HashMap <String,Cuenta> cuentas;
    private AdminAviso adminAviso;
    //
    private Cuenta cuentaActual;
    //
    //private int regionBusqueda;
    //private String categoriaBusqueda;
    private ArrayList<String> tagBusqueda;
    //
    //adminAvisos
    //id aviso
    
    //cargAviso
    //addAviso
    
    public Plataforma() {
        ventana = new AdminVentanas();
        cuentas=new  <String,Cuenta> HashMap();
        tagBusqueda=new ArrayList<String>();
        adminAviso=new AdminAviso();
        cargarDatos();
    }
    private void cargarDatos(){
        cargarUsuarios();
        //cargarAvisos(), etc...///////////////////////////////////////////////
    }
    private void cargarUsuarios() {//c.l
        
    }
    public Cuenta abrirLogin(){
        String hash= ventana.abrirLogin(cuentas);
        //System.out.println("hash = "+hash);
        ventana.cerrarLogin();
        return (Cuenta)cuentas.get(hash);
    }
    public void abrirMenu(Cuenta user){//ojo!,ir controlando los nuevos eventos
        ventana.abrirMenu(user);
        int regionBusqueda = ventana.menuRegion();
        String categoriaBusqueda=ventana.menuCategoria();
        String textoBusquedaInput=null;
        do{
            textoBusquedaInput=JOptionPane.showInputDialog("Ingrese nombre de articulo o aviso que busca");
        }while(textoBusquedaInput==null);
        obtenerTagBusqueda(textoBusquedaInput);
        cargarBusqueda(regionBusqueda,categoriaBusqueda);
    }
    
    public void obtenerTagBusqueda(String textoTag){
        String tag="";
        tagBusqueda.clear();
        for(int i=0;i<textoTag.length()-1;i++){
            if(textoTag.charAt(i)!=' ') tag+=textoTag.charAt(i);
            if(textoTag.charAt(i+1)==' '){
                tagBusqueda.add(tag);
                tag="";
            }
        }
    }
    private void acotarBusqueda(ArrayList <Integer>arrayAcotadoHashKey,HashMap<Integer, Aviso>coleccionAvisos,ArrayList<Integer> coleccionKeyHash,int region,String categoria){
        for(int i=0;i<coleccionKeyHash.size();i++){
            Aviso avisoActual=adminAviso.getAviso(coleccionKeyHash.get(i));
            if(avisoActual.getRegion() == region){//el primer filtro_ a futuro agregar sin filtro de region(region 0)
                if(avisoActual.getCategoria().equals(categoria)){//segunda filtro_a futuro crear sistema puntuacion para los match
                    arrayAcotadoHashKey.add(coleccionKeyHash.get(i));
                }
            }
        }
    }
    private void cargarBusqueda(int regionBusqueda,String categoriaBusqueda){
        ventana.cerrarMenuB();
        //generarnarray acotado de avisos
        ArrayList <Integer>arrayAcotado=new ArrayList <Integer>();
        
        acotarBusqueda(arrayAcotado,
                adminAviso.getColeccionAviso(),adminAviso.getKeyAvisoColeccion(),
                regionBusqueda,categoriaBusqueda);
        
        ventana.MenuBusqueda(cuentaActual,arrayAcotado,adminAviso);
    }
    
    public boolean addCuenta(String nickname, String clave, String correo){
        if(!isCuenta(correo)){
            Cuenta nuevaCuenta=new Cuenta(nickname, clave, correo);
            cuentas.put(correo, nuevaCuenta);
            return true;
        }else{
            return false;
        }
    }
    public boolean isCuenta(String correo){
        return ( cuentas.get(correo)!=null );
    }
    public void addAviso(String correo,String titulo,int precio,int alonsoCoin,String descripcion,int region,String categoria){
        Aviso nuevoAviso=new Aviso(cuentas.get(correo),titulo,precio,alonsoCoin,descripcion,region,categoria);
        adminAviso.addAvisoColeccion(nuevoAviso);
        //agregar aviso a cuenta User
    }
}
