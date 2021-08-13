/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import Clases.CUsuario;
import Objetos.OUsuario;

/**
 *
 * @author TOULON
 */
public class DCrudUsuario extends javax.swing.JDialog {
    public boolean Actualizar = false;
    private OUsuario usuario = new OUsuario();
    /**
     * Creates new form DCrudUsuario
     */
    public DCrudUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        labNombreError.setVisible(false);
        labApellidosError.setVisible(false);
        labUsernameError.setVisible(false);
        labIngreseClaveError.setVisible(false);
        labVerifiqueClaveError.setVisible(false);
    }
    
    public DCrudUsuario(java.awt.Frame parent, boolean modal, OUsuario usuario) {
        super(parent, modal);
        initComponents();
        labNombreError.setVisible(false);
        labApellidosError.setVisible(false);
        labUsernameError.setVisible(false);
        labIngreseClaveError.setVisible(false);
        labVerifiqueClaveError.setVisible(false);
        
        txtNombre.setText(usuario.getNombre());
        txtApellidos.setText(usuario.getApellidos());
        txtUsername.setText(usuario.getUsername());
        txtIngresaClave.setText(usuario.getClave());
        txtVerifiqueClave.setText(usuario.getClave());
        jToggleButtonEstado.setText(usuario.isEstado() ? "Activado" : "Desactivado");
        jToggleButtonEstado.setSelected(usuario.isEstado());
        
        this.usuario = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        labUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jToggleButtonEstado = new javax.swing.JToggleButton();
        jToolBar1 = new javax.swing.JToolBar();
        labUsernameError = new javax.swing.JLabel();
        labIngresaClave = new javax.swing.JLabel();
        txtIngresaClave = new javax.swing.JPasswordField();
        labVerifiqueClave = new javax.swing.JLabel();
        txtVerifiqueClave = new javax.swing.JPasswordField();
        butGuardar = new javax.swing.JButton();
        labNombreError = new javax.swing.JLabel();
        labApellidosError = new javax.swing.JLabel();
        labIngreseClaveError = new javax.swing.JLabel();
        labVerifiqueClaveError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crud Usuario");
        setResizable(false);

        labNombre.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        labApellidos.setText("Apellidos");

        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosKeyReleased(evt);
            }
        });

        labUsername.setText("Username");

        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });

        jToggleButtonEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_switchoff_32.png"))); // NOI18N
        jToggleButtonEstado.setSelected(true);
        jToggleButtonEstado.setText("Activado");
        jToggleButtonEstado.setDisabledIcon(null);
        jToggleButtonEstado.setIconTextGap(8);
        jToggleButtonEstado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_switchon_32.png"))); // NOI18N
        jToggleButtonEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEstadoActionPerformed(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);
        jToolBar1.setOpaque(false);

        labUsernameError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_interrogante_24.png"))); // NOI18N
        jToolBar1.add(labUsernameError);

        labIngresaClave.setText("Ingrese Clave");

        txtIngresaClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIngresaClaveKeyReleased(evt);
            }
        });

        labVerifiqueClave.setText("Verifique Clave");

        txtVerifiqueClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVerifiqueClaveKeyReleased(evt);
            }
        });

        butGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_guardar_32.png"))); // NOI18N
        butGuardar.setText("Guardar");
        butGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGuardarActionPerformed(evt);
            }
        });

        labNombreError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_interrogante_24.png"))); // NOI18N

        labApellidosError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_interrogante_24.png"))); // NOI18N

        labIngreseClaveError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_interrogante_24.png"))); // NOI18N

        labVerifiqueClaveError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_interrogante_24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labNombre)
                                    .addComponent(labApellidos)
                                    .addComponent(jToggleButtonEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labUsername))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labIngresaClave)
                            .addComponent(labVerifiqueClave)
                            .addComponent(txtIngresaClave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVerifiqueClave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNombreError, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labApellidosError, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labIngreseClaveError, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labVerifiqueClaveError, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labNombreError, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labApellidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labApellidosError, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labUsername)
                    .addComponent(labIngresaClave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButtonEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIngresaClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labIngreseClaveError, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labVerifiqueClave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtVerifiqueClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labVerifiqueClaveError, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(butGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void butGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGuardarActionPerformed
        // TODO add your handling code here:
        boolean Validacion = true;
        if(txtNombre.getText().trim().isEmpty()){
            labNombreError.setVisible(true);
            labNombreError.setToolTipText("El Nombre del Usuario es Obligatorio");
            Validacion = false;
        }
        if(txtApellidos.getText().trim().isEmpty()){
            labApellidosError.setVisible(true);
            labApellidosError.setToolTipText("El Apellido del Usuario es Obligatorio");
            Validacion = false;
        }
        if(txtUsername.getText().trim().isEmpty()){
            labUsernameError.setVisible(true);
            labUsernameError.setToolTipText("El Username del Usuario es Obligatorio");
            Validacion = false;
        }
        if(String.valueOf(txtIngresaClave.getPassword()).trim().isEmpty()){
            labIngreseClaveError.setVisible(true);
            labIngreseClaveError.setToolTipText("Ingresar una Clave es Obligatorio");
            Validacion = false;
        }
        if(String.valueOf(txtVerifiqueClave.getPassword()).trim().isEmpty()){
            labVerifiqueClaveError.setVisible(true);
            labVerifiqueClaveError.setToolTipText("Verificar la Clave es Obligatorio");
            Validacion = false;
        }
        if(!String.valueOf(txtIngresaClave.getPassword()).trim().isEmpty() && !String.valueOf(txtVerifiqueClave.getPassword()).trim().isEmpty()){
            String Clave1 = String.valueOf(txtIngresaClave.getPassword());
            String Clave2 = String.valueOf(txtVerifiqueClave.getPassword());
            if(!Clave1.equals(Clave2)){
                labIngreseClaveError.setVisible(true);
                labIngreseClaveError.setToolTipText("Las Claves no Coinciden");
                labVerifiqueClaveError.setVisible(true);
                labVerifiqueClaveError.setToolTipText("Las Claves no Coinciden");
                Validacion = false;
            }            
        }

        if(Validacion){
            CUsuario Usuario = null;
            if(String.valueOf(this.getTitle()).equals("Agregar Usuario")){
                Usuario = new CUsuario(0, txtNombre.getText().trim(), txtApellidos.getText().trim(), txtUsername.getText().trim(), String.valueOf(txtIngresaClave.getPassword()).trim(), jToggleButtonEstado.isSelected());
                if(Usuario.ExisteUsername().isConfirma()){
                    if(Usuario.Agregar().isConfirma()){
                        DCorrecto Mensaje = new DCorrecto(new javax.swing.JDialog(), true);
                        Mensaje.labMensaje.setText(Usuario.getError().getMensaje());
                        Mensaje.setVisible(true);
                        this.dispose();
                        Actualizar = true;
                    }
                    else{
                        DError Mensaje = new DError(new javax.swing.JDialog(), true);
                        Mensaje.labMensaje.setText(Usuario.getError().getMensaje());
                        Mensaje.setVisible(true);
                    }
                }
                else{
                    DError Mensaje = new DError(new javax.swing.JDialog(), true);
                    Mensaje.labMensaje.setText(Usuario.getError().getMensaje());
                    Mensaje.setVisible(true);
                }
            }
            else{
                Usuario = new CUsuario(usuario.getId(), txtNombre.getText().trim(), txtApellidos.getText().trim(), txtUsername.getText().trim(), String.valueOf(txtIngresaClave.getPassword()).trim(), jToggleButtonEstado.isSelected());
                if(Usuario.ExisteUsernameDiferente().isConfirma()){
                    if(Usuario.Editar().isConfirma()){
                        DCorrecto Mensaje = new DCorrecto(new javax.swing.JDialog(), true);
                        Mensaje.labMensaje.setText(Usuario.getError().getMensaje());
                        Mensaje.setVisible(true);
                        this.dispose();
                        Actualizar = true;
                    }
                    else{
                        DError Mensaje = new DError(new javax.swing.JDialog(), true);
                        Mensaje.labMensaje.setText(Usuario.getError().getMensaje());
                        Mensaje.setVisible(true);
                    }
                }
                else{
                    DError Mensaje = new DError(new javax.swing.JDialog(), true);
                    Mensaje.labMensaje.setText(Usuario.getError().getMensaje());
                    Mensaje.setVisible(true);
                }
            }                
        }
    }//GEN-LAST:event_butGuardarActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
        labNombreError.setVisible(false);
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyReleased
        // TODO add your handling code here:
        labApellidosError.setVisible(false);
    }//GEN-LAST:event_txtApellidosKeyReleased

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        // TODO add your handling code here:
        labUsernameError.setVisible(false);
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void txtIngresaClaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngresaClaveKeyReleased
        // TODO add your handling code here:
        labIngreseClaveError.setVisible(false);
    }//GEN-LAST:event_txtIngresaClaveKeyReleased

    private void txtVerifiqueClaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVerifiqueClaveKeyReleased
        // TODO add your handling code here:
        labVerifiqueClaveError.setVisible(false);
    }//GEN-LAST:event_txtVerifiqueClaveKeyReleased

    private void jToggleButtonEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEstadoActionPerformed
        // TODO add your handling code here:
        if(jToggleButtonEstado.isSelected()){
            jToggleButtonEstado.setText("Activado");
        }
        else{
            jToggleButtonEstado.setText("Desactivado");
        }
    }//GEN-LAST:event_jToggleButtonEstadoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

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
            java.util.logging.Logger.getLogger(DCrudUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DCrudUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DCrudUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DCrudUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DCrudUsuario dialog = new DCrudUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButtonEstado;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel labApellidos;
    private javax.swing.JLabel labApellidosError;
    private javax.swing.JLabel labIngresaClave;
    private javax.swing.JLabel labIngreseClaveError;
    private javax.swing.JLabel labNombre;
    private javax.swing.JLabel labNombreError;
    private javax.swing.JLabel labUsername;
    private javax.swing.JLabel labUsernameError;
    private javax.swing.JLabel labVerifiqueClave;
    private javax.swing.JLabel labVerifiqueClaveError;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JPasswordField txtIngresaClave;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtVerifiqueClave;
    // End of variables declaration//GEN-END:variables

}
