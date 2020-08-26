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
public class MercadoTrueque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Plataforma app=new Plataforma();
        // poblar unos datos a la mala y rapido solo como prueba LUEGO CAMBIAR EN PROXIMA ENTREGA!!!!///
        //juan ingresa, y busca un notebook, busca por "notebook asus"
        app.addCuenta("juan", "123", "juan@gmail.com");// hara de visitante (iniciar con este)
        app.addCuenta("TodoNotebook", "123", "todonotebook@gmail.com");// será el vendedor 
        //creo un aviso, todo esto sera modificado a futuro//hash,titulo,precio,alonsoCoin,descripcion y la region de ese aviso en particular y categoria producto
        app.addAviso("todonotebook@gmail.com", "notebook asus vivoBook Pro n580g", 500000, 5, "esta como nuevo impecable,solo tiene un detalle que no prende ni carga.",5,"pc");
        app.addAviso("todonotebook@gmail.com", "zapato volador", 1900000, 10, "esta como nuevo impecable,solo no vuela.",5,"moda");
        ////////pruebas
        app.addAviso("todonotebook@gmail.com", "tarjeta madre luchona", 500000, 5, "esta como nuevo, impecable,solo tiene un detalle que es muy luchona.",5,"pc");
        app.addAviso("todonotebook@gmail.com", "teclado gamer rbg ultra gamer", 200000, 3, "esta como nuevo, impecable,solo tiene un detalle no escribe.",5,"pc");
        app.addAviso("todonotebook@gmail.com", "mouse gamer rgb", 150000, 2, "esta como nuevo, impecable,muy gamer, pero no te hara ganar, no es magia.",5,"pc");
        app.addAviso("todonotebook@gmail.com", "taza de cafe gamer rgba", 500000, 5, "todo es gamer, incluso es rbga",5,"pc");
        app.addAviso("todonotebook@gmail.com", "tarjeta grafica NVidea RTX 9999999", 800000, 7, "esta como nuevo impecable,solo tiene un detalle que no renderiza",5,"pc");
        app.addAviso("todonotebook@gmail.com", "memoria ram ddr4 1GB 10GHZ", 10000, 2, "esta como nuevo impecable,solo tiene un detalle que es 1 GB.",5,"pc");
        app.addAviso("todonotebook@gmail.com", "ssd m2 Nvme 10 tb", 10000, 2, "esta como nuevo impecable,solo tiene un detalle que no graba,pero... son 10tb.",5,"pc");
        
        ////////////////////////////
        Cuenta userActual=app.abrirLogin();
        app.abrirMenu(userActual);
        
        
        
        
        
        System.out.println("fin");       
    }
    
}
