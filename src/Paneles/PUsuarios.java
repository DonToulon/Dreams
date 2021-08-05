/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Clases.CUsuario;
import Dialogos.DCrudUsuario;
import ModelosTablas.MTUsuarios;
import java.awt.event.MouseEvent;

/**
 *
 * @author TOULON-NOTE
 */
public class PUsuarios extends javax.swing.JPanel {
    
    private int RowIdSeleccionado;

    /**
     * Creates new form PUsuarios
     */
    public PUsuarios() {
        initComponents();
        butEditar.setEnabled(false);
        butDesactivar.setEnabled(false);
        ListarUsuarios();
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
        jToolBarMenu = new javax.swing.JToolBar();
        butAgregar = new javax.swing.JButton();
        butEditar = new javax.swing.JButton();
        butDesactivar = new javax.swing.JButton();
        jScrollPaneConTabla = new javax.swing.JScrollPane();
        jTableTabla = new javax.swing.JTable();
        labBusqueda = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jComboBoxPor = new javax.swing.JComboBox<>();
        butAvanzar = new javax.swing.JButton();
        butRetroseder = new javax.swing.JButton();
        labPagina = new javax.swing.JLabel();

        labTitulo.setBackground(new java.awt.Color(102, 102, 255));
        labTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitulo.setText("Usuarios");
        labTitulo.setOpaque(true);

        jToolBarMenu.setFloatable(false);
        jToolBarMenu.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBarMenu.setRollover(true);
        jToolBarMenu.setOpaque(false);

        butAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_agregar_32.png"))); // NOI18N
        butAgregar.setText("Agregar");
        butAgregar.setToolTipText("Agregar un Nuevo Usuario");
        butAgregar.setBorderPainted(false);
        butAgregar.setFocusable(false);
        butAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butAgregar.setMaximumSize(new java.awt.Dimension(69, 69));
        butAgregar.setMinimumSize(new java.awt.Dimension(69, 69));
        butAgregar.setPreferredSize(new java.awt.Dimension(69, 69));
        butAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        butAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAgregarActionPerformed(evt);
            }
        });
        jToolBarMenu.add(butAgregar);

        butEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_editar_32.png"))); // NOI18N
        butEditar.setText("Editar");
        butEditar.setToolTipText("Editar un Usuario Seleccionado");
        butEditar.setBorderPainted(false);
        butEditar.setFocusable(false);
        butEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butEditar.setMaximumSize(new java.awt.Dimension(69, 69));
        butEditar.setMinimumSize(new java.awt.Dimension(69, 69));
        butEditar.setPreferredSize(new java.awt.Dimension(69, 69));
        butEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        butEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEditarActionPerformed(evt);
            }
        });
        jToolBarMenu.add(butEditar);

        butDesactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_desactivar_32.png"))); // NOI18N
        butDesactivar.setText("Desactivar");
        butDesactivar.setToolTipText("Desactivar un Usuario Seleccionado");
        butDesactivar.setBorderPainted(false);
        butDesactivar.setFocusable(false);
        butDesactivar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butDesactivar.setMaximumSize(new java.awt.Dimension(69, 69));
        butDesactivar.setMinimumSize(new java.awt.Dimension(69, 69));
        butDesactivar.setPreferredSize(new java.awt.Dimension(69, 69));
        butDesactivar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarMenu.add(butDesactivar);

        jTableTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "Username", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableTabla.setRowHeight(30);
        jTableTabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTabla.getTableHeader().setReorderingAllowed(false);
        jTableTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTablaMouseClicked(evt);
            }
        });
        jScrollPaneConTabla.setViewportView(jTableTabla);
        if (jTableTabla.getColumnModel().getColumnCount() > 0) {
            jTableTabla.getColumnModel().getColumn(0).setPreferredWidth(315);
            jTableTabla.getColumnModel().getColumn(1).setPreferredWidth(315);
            jTableTabla.getColumnModel().getColumn(2).setPreferredWidth(180);
            jTableTabla.getColumnModel().getColumn(3).setResizable(false);
            jTableTabla.getColumnModel().getColumn(3).setPreferredWidth(81);
        }

        labBusqueda.setText("Busqueda");

        txtBusqueda.setToolTipText("Tipee lo que desea Buscar");

        jComboBoxPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por Nombre", "Por Apellido", "Por Username" }));
        jComboBoxPor.setToolTipText("Seleccionar tipo de Busqueda");

        butAvanzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_adelante_32.png"))); // NOI18N
        butAvanzar.setToolTipText("Avanzar Pagina");

        butRetroseder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_atras_32.png"))); // NOI18N
        butRetroseder.setToolTipText("Retroceder Pagina");

        labPagina.setText("Pagina 1 de 100");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPaneConTabla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(labBusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxPor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labPagina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(butRetroseder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butAvanzar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labBusqueda)
                            .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneConTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butAvanzar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butRetroseder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labPagina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(jToolBarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void ListarUsuarios(){
        MTUsuarios MUsuarios = new MTUsuarios(new CUsuario().Listar());
        jTableTabla.setModel(MUsuarios);
        jTableTabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableTabla.setRowHeight(30);
        jTableTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPaneConTabla.setViewportView(jTableTabla);
        if (jTableTabla.getColumnModel().getColumnCount() > 0) {
            jTableTabla.getColumnModel().getColumn(0).setPreferredWidth(315);
            jTableTabla.getColumnModel().getColumn(1).setPreferredWidth(315);
            jTableTabla.getColumnModel().getColumn(2).setPreferredWidth(180);
            jTableTabla.getColumnModel().getColumn(3).setResizable(false);
            jTableTabla.getColumnModel().getColumn(3).setPreferredWidth(81);
        }
    }
    
    private void butAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAgregarActionPerformed
        // TODO add your handling code here:
        DCrudUsuario CrudUsuario = new DCrudUsuario(new Ventanas.VPrincipal(), true);
        CrudUsuario.setTitle("Agregar Usuario");
        CrudUsuario.setVisible(true);
        if(CrudUsuario.Actualizar){
            ListarUsuarios();
        }
    }//GEN-LAST:event_butAgregarActionPerformed

    private void butEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEditarActionPerformed
        // TODO add your handling code here:
        DCrudUsuario CrudUsuario = new DCrudUsuario(new Ventanas.VPrincipal(), true, ((MTUsuarios)jTableTabla.getModel()).getUsuarios().get(jTableTabla.getSelectedRow()));
        CrudUsuario.setTitle("Editar Usuario");
        CrudUsuario.setVisible(true);
        if(CrudUsuario.Actualizar){
            ListarUsuarios();
        }
    }//GEN-LAST:event_butEditarActionPerformed

    private void jTableTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTablaMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1){
            butEditar.setEnabled(true);
            butDesactivar.setEnabled(true);
            
            //RowIdSeleccionado = jTableTabla.rowAtPoint(evt.getPoint());
            //String uno = jTableTabla.getValueAt(RowIdSeleccionado, 0).toString();
            MTUsuarios dos = (MTUsuarios)jTableTabla.getModel();
            
            System.out.println(String.valueOf(dos.getUsuarios().get(RowIdSeleccionado).getId()));
            if(evt.getClickCount() == 2){
                System.out.println("2 Click");
            }
        }
    }//GEN-LAST:event_jTableTablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAgregar;
    private javax.swing.JButton butAvanzar;
    private javax.swing.JButton butDesactivar;
    private javax.swing.JButton butEditar;
    private javax.swing.JButton butRetroseder;
    private javax.swing.JComboBox<String> jComboBoxPor;
    private javax.swing.JScrollPane jScrollPaneConTabla;
    private javax.swing.JTable jTableTabla;
    private javax.swing.JToolBar jToolBarMenu;
    private javax.swing.JLabel labBusqueda;
    private javax.swing.JLabel labPagina;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
