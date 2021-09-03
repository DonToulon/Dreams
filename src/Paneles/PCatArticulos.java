                   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Clases.CCatArticulos;
import ModelosTablas.MTCatArticulos;
import Objetos.OCatArticulos;
import Objetos.OError;

/**
 *
 * @author Usuario
 */
public class PCatArticulos extends javax.swing.JPanel {

    /**
     * Creates new form PCatArticulos
     */
    public PCatArticulos() {
           initComponents();
           ListarCategoria();
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
        labBusqueda = new javax.swing.JLabel();
        txtBusquedaCArticulos = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCArticulos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNombreCatArt = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        butAgregar = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        butEditar = new javax.swing.JButton();
        butDesactivar = new javax.swing.JButton();
        butCancel = new javax.swing.JButton();

        labTitulo.setBackground(new java.awt.Color(102, 102, 255));
        labTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitulo.setText("Categorías Artículos");
        labTitulo.setOpaque(true);

        labBusqueda.setText("Busqueda");

        txtBusquedaCArticulos.setToolTipText("Tipee lo que desea Buscar");

        jTableCArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableCArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCArticulosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCArticulos);

        jLabel1.setText("Categoría Artículo");

        txtNombreCatArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCatArtActionPerformed(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);
        jToolBar1.setOpaque(false);

        butAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_agregar_32.png"))); // NOI18N
        butAgregar.setText("Agregar");
        butAgregar.setFocusable(false);
        butAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butAgregar.setMaximumSize(new java.awt.Dimension(69, 69));
        butAgregar.setMinimumSize(new java.awt.Dimension(69, 69));
        butAgregar.setName(""); // NOI18N
        butAgregar.setPreferredSize(new java.awt.Dimension(69, 69));
        butAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        butAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(butAgregar);

        jToolBar2.setFloatable(false);
        jToolBar2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar2.setRollover(true);
        jToolBar2.setOpaque(false);
        jToolBar1.add(jToolBar2);

        butEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_editar_32.png"))); // NOI18N
        butEditar.setText("Editar");
        butEditar.setFocusable(false);
        butEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butEditar.setMaximumSize(new java.awt.Dimension(69, 69));
        butEditar.setMinimumSize(new java.awt.Dimension(69, 69));
        butEditar.setName(""); // NOI18N
        butEditar.setPreferredSize(new java.awt.Dimension(69, 69));
        butEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        butEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(butEditar);

        butDesactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_desactivar_32.png"))); // NOI18N
        butDesactivar.setText("Desactivar");
        butDesactivar.setFocusable(false);
        butDesactivar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butDesactivar.setMaximumSize(new java.awt.Dimension(69, 69));
        butDesactivar.setMinimumSize(new java.awt.Dimension(69, 69));
        butDesactivar.setName(""); // NOI18N
        butDesactivar.setPreferredSize(new java.awt.Dimension(69, 69));
        butDesactivar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        butDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDesactivarActionPerformed(evt);
            }
        });
        jToolBar1.add(butDesactivar);

        butCancel.setText("Cancelar");
        butCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labBusqueda)
                        .addGap(4, 4, 4)
                        .addComponent(txtBusquedaCArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreCatArt)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 318, Short.MAX_VALUE)
                        .addComponent(butCancel)))
                .addGap(18, 18, 18)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBusquedaCArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labBusqueda))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreCatArt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butCancel))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 3, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableCArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCArticulosMouseClicked
        // TODO add your handling code here:
        OCatArticulos catArt = ((MTCatArticulos) jTableCArticulos.getModel()).getCategoria().get(jTableCArticulos.getSelectedRow());
        txtNombreCatArt.setText(catArt.getNombre());
    }//GEN-LAST:event_jTableCArticulosMouseClicked

    private void txtNombreCatArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCatArtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCatArtActionPerformed

    private void butAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAgregarActionPerformed
        // TODO add your handling code here:
        //Agregar
        CCatArticulos cateArt = new CCatArticulos(0, txtNombreCatArt.getText(), true);
        OError error = cateArt.Agregar();
        if (error.isConfirma()) {
            ListarCategoria();
            System.out.println(error.getMensaje());
            txtNombreCatArt.setText("");

        } else {
            System.out.println(error.getMensaje());
        }
    }//GEN-LAST:event_butAgregarActionPerformed

    private void butEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEditarActionPerformed
        // TODO add your handling code here:
        //Editar
        OCatArticulos cateArt = ((MTCatArticulos) jTableCArticulos.getModel()).getCategoria().get(jTableCArticulos.getSelectedRow());
        CCatArticulos CaArt = new CCatArticulos(cateArt.getId(), txtNombreCatArt.getText(), true);
        OError error1 = CaArt.Editar();
        if (error1.isConfirma()) {
            ListarCategoria();
            System.out.println(error1.getMensaje());
            txtNombreCatArt.setText("");

        } else {
            System.out.println(error1.getMensaje());

        }
    }//GEN-LAST:event_butEditarActionPerformed

    private void butDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDesactivarActionPerformed
        //TODO add your handling code here:
        OCatArticulos catArt = (OCatArticulos) ((MTCatArticulos) jTableCArticulos.getModel()).getCategoria().get(jTableCArticulos.getSelectedRow());
        OError Error = new CCatArticulos(catArt.getId(), catArt.getNombre(), false).Eliminar();
        if (Error.isConfirma()) {
            ListarCategoria();
            this.txtNombreCatArt.setText("");
        } else {
            System.out.println(Error.getMensaje());
        }
    }//GEN-LAST:event_butDesactivarActionPerformed

    private void butCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelActionPerformed
        // TODO add your handling code here:
        txtNombreCatArt.setText("");
    }//GEN-LAST:event_butCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAgregar;
    private javax.swing.JButton butCancel;
    private javax.swing.JButton butDesactivar;
    private javax.swing.JButton butEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCArticulos;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel labBusqueda;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JTextField txtBusquedaCArticulos;
    private javax.swing.JTextField txtNombreCatArt;
    // End of variables declaration//GEN-END:variables

  public void ListarCategoria() {
        MTCatArticulos ModeloCategoria = new MTCatArticulos(new CCatArticulos().Listar(""));
        jTableCArticulos.setModel(ModeloCategoria);

        jTableCArticulos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableCArticulos);
        if (jTableCArticulos.getColumnModel().getColumnCount() > 0) {
            jTableCArticulos.getColumnModel().getColumn(0).setResizable(false);
            jTableCArticulos.getColumnModel().getColumn(0).setPreferredWidth(390);
            jTableCArticulos.getColumnModel().getColumn(1).setResizable(false);
            jTableCArticulos.getColumnModel().getColumn(1).setPreferredWidth(80);
        }
    
    }

}
