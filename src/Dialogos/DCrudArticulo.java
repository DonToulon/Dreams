/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import Clases.CArticulos;
import Clases.CCatArticulos;
import ModeloCombox.MCCatArticulos;
import Objetos.OError;
import java.text.SimpleDateFormat;

/**
 *
 * @author TOULON-NOTE
 */
public class DCrudArticulo extends javax.swing.JDialog {

    /**
     * Creates new form DCrudArticulo
     */
    public DCrudArticulo(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LlenarComboComuna();
        //JDateChooser dateChooser = new JDateChooser("yyyy/MM/dd", "####/##/##", '_');
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        dateFechaVencimiento = new com.toedter.calendar.JDateChooser("dd-MM-yyyy", "##/##/####", '_');
        labFechaVencimiento = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        labStok = new javax.swing.JLabel();
        conboxCategoria = new javax.swing.JComboBox<>();
        labCategoria = new javax.swing.JLabel();
        jToggleButtonEstado = new javax.swing.JToggleButton();
        butGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labNombre.setText("Nombre");

        labFechaVencimiento.setText("Fecha Vencimiento");

        labStok.setText("Stok");

        conboxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labCategoria.setText("Categoria");

        jToggleButtonEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_switchoff_32.png"))); // NOI18N
        jToggleButtonEstado.setSelected(true);
        jToggleButtonEstado.setText("Activado");
        jToggleButtonEstado.setIconTextGap(8);
        jToggleButtonEstado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_switchon_32.png"))); // NOI18N

        butGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_guardar_32.png"))); // NOI18N
        butGuardar.setText("Guardar");
        butGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labNombre))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labFechaVencimiento)
                                .addComponent(dateFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labStok))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labCategoria)
                                .addComponent(conboxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jToggleButtonEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNombre)
                    .addComponent(labFechaVencimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labStok)
                    .addComponent(labCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButtonEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGuardarActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(dateFechaVencimiento.getDate());
        CArticulos arti = new CArticulos(0, txtNombre.getText(), Integer.parseInt(txtStok.getText()), date
                , jToggleButtonEstado.isSelected(), ((MCCatArticulos)conboxCategoria.getModel()).getCatArticulos().get(conboxCategoria.getSelectedIndex()));
        OError error = arti.Insertar();
        if (error.isConfirma()) {
            //ListarArticulos();
            System.out.println(error.getMensaje());
            txtNombre.setText("");
            txtStok.setText("");
            dateFechaVencimiento.setDate(null);
            jToggleButtonEstado.setSelected(true);
            

        } else {
            System.out.println(error.getMensaje());
        }
    }//GEN-LAST:event_butGuardarActionPerformed

    private void LlenarComboComuna(){
        conboxCategoria.setModel(new MCCatArticulos(new CCatArticulos().Listar("Activos")));
    }
    
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
            java.util.logging.Logger.getLogger(DCrudArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DCrudArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DCrudArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DCrudArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DCrudArticulo dialog = new DCrudArticulo(new javax.swing.JDialog(), true);
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
    private javax.swing.JComboBox<String> conboxCategoria;
    private com.toedter.calendar.JDateChooser dateFechaVencimiento;
    private javax.swing.JToggleButton jToggleButtonEstado;
    private javax.swing.JLabel labCategoria;
    private javax.swing.JLabel labFechaVencimiento;
    private javax.swing.JLabel labNombre;
    private javax.swing.JLabel labStok;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}