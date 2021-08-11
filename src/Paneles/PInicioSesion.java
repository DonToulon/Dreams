/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Clases.CInicioSesion;
import Dialogos.DError;
import Objetos.OError;
import Objetos.OUsuario;
import Ventanas.VPrincipal;

/**
 *
 * @author TOULON-NOTE
 */
public class PInicioSesion extends javax.swing.JPanel {

    private final VPrincipal Principal;
    /**
     * Creates new form PInicioSesion
     * @param Principal
     */
    public PInicioSesion(VPrincipal Principal) {
        initComponents();
        this.Principal = Principal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labTitulo = new javax.swing.JLabel();
        panelContenedor = new javax.swing.JPanel();
        labUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        labClave = new javax.swing.JLabel();
        butIngresar = new javax.swing.JButton();
        txtClave = new javax.swing.JPasswordField();

        labTitulo.setBackground(new java.awt.Color(102, 102, 255));
        labTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitulo.setText("Inicio de Sesion");
        labTitulo.setOpaque(true);

        panelContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Inicio"));

        labUsername.setText("Username");

        labClave.setText("Clave");

        butIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_acceso_32.png"))); // NOI18N
        butIngresar.setText("Ingresar");
        butIngresar.setIconTextGap(10);
        butIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(butIngresar)
                    .addComponent(labClave, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labUsername, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(labUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labClave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(butIngresar)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butIngresarActionPerformed
        // TODO add your handling code here:
        OError Error = new CInicioSesion(0, "", "", txtUsername.getText().trim(), String.valueOf(txtClave.getPassword()).trim(), false).Iniciar();
        if(Error.isConfirma()){
            Principal.setUsuario((OUsuario)Error.getRetorno());
            Principal.IniciarModulos();
        }
        else{
            DError Mensaje = new DError(new javax.swing.JDialog(), true);
            Mensaje.labMensaje.setText(Error.getMensaje());
            Mensaje.setVisible(true);
        }        
    }//GEN-LAST:event_butIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butIngresar;
    private javax.swing.JLabel labClave;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JLabel labUsername;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}