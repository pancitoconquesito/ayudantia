/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadotrueque;

import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Image.SCALE_SMOOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author gonza
 */
public class JFBusqueda extends javax.swing.JFrame {

    /**
     * Creates new form JFBusqueda
     */
    private int posicionX;
    private int posicionY;
    private static final int MARGENX = 17;
    private static final int MARGENY = 21;
    //leugo promover a constantes
    private int cantidadaAvisos;
    private int ancho,alto;
    private int anchoTexto;
    private int separacionTexto;
    public JFBusqueda() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(bgGif, "src/img/azul.gif");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        posicionX=MARGENX;
        posicionY=MARGENY;
        cantidadaAvisos=0;
        ancho=150;
        alto=200;
        anchoTexto=17;
        separacionTexto=140;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        bgGif = new javax.swing.JLabel();
        panelAvisos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MercadoTrueque - Busqueda");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        bgGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/azul.gif"))); // NOI18N

        panelAvisos.setOpaque(false);
        panelAvisos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 50, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(panelAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 1246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bgGif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1288, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(panelAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bgGif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFBusqueda().setVisible(true);
            }
        });
    }
    private void addTextoAviso(String titulo){
        JLabel textoLabel=new JLabel();
        textoLabel.setText(formatoTitulo(titulo));
        textoLabel.setBounds(posicionX+ancho+2, posicionY, separacionTexto, alto);
        Border border = LineBorder.createGrayLineBorder();
        textoLabel.setBorder(border);
        textoLabel.setForeground(Color.white);
        panelAvisos.add(textoLabel);
    }
    public void addAvisoInterfaz(Aviso aviso){
        JButton boton=new JButton();
        //imagen y posicion
        ImageIcon imagen=new ImageIcon("src/img/avisoMarco.png");
        boton.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(150, alto, SCALE_SMOOTH)));  
        posicion();
        boton.setBounds(posicionX, posicionY, ancho, alto);
        boton.setContentAreaFilled(false);
        cantidadaAvisos++;
        //interactividad
        panelAvisos.add(boton);//agregarlo primero
        boton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ActionListener action=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("deja de hacerme click que duele eso ohhh!");
                abrirVentanaAviso(aviso);
                /////////////////////////////////////////////////////////////////////////////////////////////////////TODO
            }
        }; 
        boton.addActionListener(action);
        addTextoAviso(aviso.getTitulo());
    }
    private void abrirVentanaAviso(Aviso aviso){
        JFPublicacion ventanaPublicacion=new JFPublicacion();
        ventanaPublicacion.agregarInfo(aviso);
    }
    @Deprecated
    public void addAvisoInterfazPrueba(Aviso aviso){
        JLabel labelAvisoNuevo=new JLabel();
        labelAvisoNuevo.setIcon(new ImageIcon("src/img/avisoMarco.png"));
        posicion();
        labelAvisoNuevo.setBounds(posicionX, posicionY, ancho, alto);
        cantidadaAvisos++;
        
        //JLabel titulolAvisoNuevo=new JLabel();
        //titulolAvisoNuevo.setText("ahhhhhhh");
        //if(cantidadaAvisos==1)
        //    titulolAvisoNuevo.setHorizontalAlignment(HEIGHT);
        //panelAvisos.add(titulolAvisoNuevo);
        
        labelAvisoNuevo.setText(formatoTitulo(aviso.getTitulo()));//
        //labelAvisoNuevo.setVerticalTextPosition(15);/////////////////////////////////////
        
        //labelAvisoNuevo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "Datos Personales",TitledBorder.CENTER,ICONIFIED));
        //new Border border = LineBorder.createGrayLineBorder();
        
        Border border = LineBorder.createGrayLineBorder();
        labelAvisoNuevo.setBorder(border);
        
        labelAvisoNuevo.setForeground(Color.white);
        labelAvisoNuevo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        /*ActionListener action=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ProcessBuilder p=new ProcessBuilder();
                try {
                    Sonido sonido1=new Sonido("sound\\click_1.wav",1);
                    back.stop();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Throwable ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
                p.command("cmd.exe","/c",pelicula.getDir());
                
                try {
                    p.start();
                } catch (IOException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(" nombre ; "+pelicula.getDir());
                    JOptionPane.showMessageDialog(null,"Error.");
                }
            }
        }; 
        boton.addActionListener(action);
        //
        ActionListener action=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("waaaa");
            }
        }; 
        boton.addActionListener(action);
        */
        panelAvisos.add(labelAvisoNuevo);
        
    }
    
    public void posicion(){
        if(cantidadaAvisos!=0){
            posicionX+=MARGENX+ancho+140;
            if(cantidadaAvisos % 4 == 0){
                posicionY=MARGENY*2+alto;
                posicionX=MARGENX;
            }
        }  
    }
    public String formatoTitulo(String textoLLegada){
        String textoSalida="<html>&nbsp;__________<br><br><br>";
        for(int i=0;i<textoLLegada.length();i++){
            if(i==0)    textoSalida+="&nbsp;&nbsp;";
            if(i%anchoTexto==0 && i!=0){
                if(textoLLegada.charAt(i)!=' ' && textoLLegada.charAt(i+1)!=' ')   textoSalida+="-";
                textoSalida+="<br>&nbsp;&nbsp;";
            }
            textoSalida+=textoLLegada.charAt(i);
        }
        textoSalida+="<br><br>&nbsp;______________";
        return textoSalida;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgGif;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelAvisos;
    // End of variables declaration//GEN-END:variables
}
