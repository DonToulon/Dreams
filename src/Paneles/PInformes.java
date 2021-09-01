/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import java.awt.BorderLayout;

/**
 *
 * @author TOULON
 */
public class PInformes extends javax.swing.JPanel {

    /**
     * Creates new form PInformes
     */
    public PInformes() {
        initComponents();
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
        butInformeVentas = new javax.swing.JButton();
        butInformeInventario = new javax.swing.JButton();
        butInformeVencimientos = new javax.swing.JButton();
        butInformeProveedores = new javax.swing.JButton();
        butInformeVentaPack = new javax.swing.JButton();
        butInformeComunas = new javax.swing.JButton();
        panelVisor = new javax.swing.JPanel();

        labTitulo.setBackground(new java.awt.Color(102, 102, 255));
        labTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitulo.setText("Informes");
        labTitulo.setOpaque(true);

        jToolBarMenu.setFloatable(false);
        jToolBarMenu.setRollover(true);
        jToolBarMenu.setOpaque(false);

        butInformeVentas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        butInformeVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_venta_32.png"))); // NOI18N
        butInformeVentas.setText("Informe de Ventas");
        butInformeVentas.setToolTipText("Informe de Ventas");
        butInformeVentas.setBorderPainted(false);
        butInformeVentas.setFocusable(false);
        butInformeVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butInformeVentas.setMaximumSize(new java.awt.Dimension(69, 69));
        butInformeVentas.setMinimumSize(new java.awt.Dimension(69, 69));
        butInformeVentas.setPreferredSize(new java.awt.Dimension(69, 69));
        butInformeVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        butInformeVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInformeVentasActionPerformed(evt);
            }
        });
        jToolBarMenu.add(butInformeVentas);

        butInformeInventario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        butInformeInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_confirmacion_32.png"))); // NOI18N
        butInformeInventario.setText("Informe Inventario");
        butInformeInventario.setToolTipText("Informe Inventario");
        butInformeInventario.setBorderPainted(false);
        butInformeInventario.setFocusable(false);
        butInformeInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butInformeInventario.setMaximumSize(new java.awt.Dimension(69, 69));
        butInformeInventario.setMinimumSize(new java.awt.Dimension(69, 69));
        butInformeInventario.setPreferredSize(new java.awt.Dimension(69, 69));
        butInformeInventario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        butInformeInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInformeInventarioActionPerformed(evt);
            }
        });
        jToolBarMenu.add(butInformeInventario);

        butInformeVencimientos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        butInformeVencimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_listasdestino_32.png"))); // NOI18N
        butInformeVencimientos.setText("Informe de Vencimientos");
        butInformeVencimientos.setToolTipText("Informe de Vencimientos");
        butInformeVencimientos.setBorderPainted(false);
        butInformeVencimientos.setFocusable(false);
        butInformeVencimientos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butInformeVencimientos.setMaximumSize(new java.awt.Dimension(69, 69));
        butInformeVencimientos.setMinimumSize(new java.awt.Dimension(69, 69));
        butInformeVencimientos.setPreferredSize(new java.awt.Dimension(69, 69));
        butInformeVencimientos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        butInformeVencimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInformeVencimientosActionPerformed(evt);
            }
        });
        jToolBarMenu.add(butInformeVencimientos);

        butInformeProveedores.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        butInformeProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_actualizardespacho_32.png"))); // NOI18N
        butInformeProveedores.setText("Informe de Proveedores");
        butInformeProveedores.setToolTipText("Informe de Proveedores");
        butInformeProveedores.setBorderPainted(false);
        butInformeProveedores.setFocusable(false);
        butInformeProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butInformeProveedores.setMaximumSize(new java.awt.Dimension(69, 69));
        butInformeProveedores.setMinimumSize(new java.awt.Dimension(69, 69));
        butInformeProveedores.setPreferredSize(new java.awt.Dimension(69, 69));
        butInformeProveedores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        butInformeProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInformeProveedoresActionPerformed(evt);
            }
        });
        jToolBarMenu.add(butInformeProveedores);

        butInformeVentaPack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        butInformeVentaPack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_actualizardespacho_32.png"))); // NOI18N
        butInformeVentaPack.setText("Informe de Venta Pack");
        butInformeVentaPack.setToolTipText("Informe de Venta Pack");
        butInformeVentaPack.setBorderPainted(false);
        butInformeVentaPack.setFocusable(false);
        butInformeVentaPack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butInformeVentaPack.setMaximumSize(new java.awt.Dimension(69, 69));
        butInformeVentaPack.setMinimumSize(new java.awt.Dimension(69, 69));
        butInformeVentaPack.setPreferredSize(new java.awt.Dimension(69, 69));
        butInformeVentaPack.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        butInformeVentaPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInformeVentaPackActionPerformed(evt);
            }
        });
        jToolBarMenu.add(butInformeVentaPack);

        butInformeComunas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        butInformeComunas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_actualizardespacho_32.png"))); // NOI18N
        butInformeComunas.setText("Informe por Comunas");
        butInformeComunas.setToolTipText("Informe por Comunas");
        butInformeComunas.setBorderPainted(false);
        butInformeComunas.setFocusable(false);
        butInformeComunas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butInformeComunas.setMaximumSize(new java.awt.Dimension(69, 69));
        butInformeComunas.setMinimumSize(new java.awt.Dimension(69, 69));
        butInformeComunas.setPreferredSize(new java.awt.Dimension(69, 69));
        butInformeComunas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarMenu.add(butInformeComunas);

        javax.swing.GroupLayout panelVisorLayout = new javax.swing.GroupLayout(panelVisor);
        panelVisor.setLayout(panelVisorLayout);
        panelVisorLayout.setHorizontalGroup(
            panelVisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelVisorLayout.setVerticalGroup(
            panelVisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addComponent(panelVisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelVisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butInformeVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInformeVentasActionPerformed
        // TODO add your handling code here:
        PInformeVentas PanelIVentas = new PInformeVentas();
        PanelIVentas.setVisible(true);
        PanelIVentas.setSize(1000, 525);
        PanelIVentas.setLocation(0, 0);
        
        panelVisor.removeAll();
        panelVisor.add(PanelIVentas, BorderLayout.CENTER);
        panelVisor.revalidate();
        panelVisor.repaint();
    }//GEN-LAST:event_butInformeVentasActionPerformed

    private void butInformeInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInformeInventarioActionPerformed
        // TODO add your handling code here:
        PInformeInventario PanelIInventarios = new PInformeInventario();
        PanelIInventarios.setVisible(true);
        PanelIInventarios.setSize(1000, 525);
        PanelIInventarios.setLocation(0, 0);
        
        panelVisor.removeAll();
        panelVisor.add(PanelIInventarios, BorderLayout.CENTER);
        panelVisor.revalidate();
        panelVisor.repaint();
    }//GEN-LAST:event_butInformeInventarioActionPerformed

    private void butInformeVencimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInformeVencimientosActionPerformed
        // TODO add your handling code here:
        PInformeVencimientos PanelIVencimientos = new PInformeVencimientos();
        PanelIVencimientos.setVisible(true);
        PanelIVencimientos.setSize(1000, 525);
        PanelIVencimientos.setLocation(0, 0);
        
        panelVisor.removeAll();
        panelVisor.add(PanelIVencimientos, BorderLayout.CENTER);
        panelVisor.revalidate();
        panelVisor.repaint();
    }//GEN-LAST:event_butInformeVencimientosActionPerformed

    private void butInformeProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInformeProveedoresActionPerformed
        // TODO add your handling code here:
        PInformeProveedores PanelIProveedores = new PInformeProveedores();
        PanelIProveedores.setVisible(true);
        PanelIProveedores.setSize(1000, 525);
        PanelIProveedores.setLocation(0, 0);
        
        panelVisor.removeAll();
        panelVisor.add(PanelIProveedores, BorderLayout.CENTER);
        panelVisor.revalidate();
        panelVisor.repaint();
    }//GEN-LAST:event_butInformeProveedoresActionPerformed

    private void butInformeVentaPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInformeVentaPackActionPerformed
        // TODO add your handling code here:
        PInformeVentaPack PanelIVentaPack = new PInformeVentaPack();
        PanelIVentaPack.setVisible(true);
        PanelIVentaPack.setSize(1000, 525);
        PanelIVentaPack.setLocation(0, 0);
        
        panelVisor.removeAll();
        panelVisor.add(PanelIVentaPack, BorderLayout.CENTER);
        panelVisor.revalidate();
        panelVisor.repaint();
    }//GEN-LAST:event_butInformeVentaPackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butInformeComunas;
    private javax.swing.JButton butInformeInventario;
    private javax.swing.JButton butInformeProveedores;
    private javax.swing.JButton butInformeVencimientos;
    private javax.swing.JButton butInformeVentaPack;
    private javax.swing.JButton butInformeVentas;
    private javax.swing.JToolBar jToolBarMenu;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JPanel panelVisor;
    // End of variables declaration//GEN-END:variables
}
