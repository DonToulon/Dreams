package Paneles;

import Objetos.OAnimacion;
import Clases.CProveedor;
import Clases.CVerificar;
import Dialogos.DCorrecto;
import Dialogos.DError;
import Dialogos.DPregunta;
import ModelosTablas.MTProveedor;
import Objetos.OError;
import Objetos.OProveedor;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.text.MaskFormatter;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author rodka
 */
public class PProveedor extends javax.swing.JPanel {
private List<OProveedor> Proveedor;
   
    public PProveedor() {
        initComponents();
        ListarUsuarios();
        Buscar(); 
    }
     private OAnimacion Animacion = null;
     private OAnimacion Animacion2 = null;
     private OAnimacion Animacion3 = null;
     
    
     
     private void ListarUsuarios(){
        Proveedor = new CProveedor().Listar();
        MTProveedor MUProveedor = new MTProveedor(Proveedor);
        tableProveedor.setModel(MUProveedor);
    }
     
      private void Buscar(){ 
          
        MTProveedor MProveedor = new MTProveedor(new CProveedor().Busqueda(txtBusqueda.getText(), comboBusqueda.getSelectedIndex()));
        tableProveedor.setModel(MProveedor);
        
      }
     /*public Boolean Validar(){
     Boolean lDevuelve = false;
     int Ult= this.txtRut.getText().length();
     int Largo = this.txtRut.getText().length() -3;//19068257-4
     int Constante = 2;
     int Suma = 0;
     int Digito = 0;
     
     for (int i= Largo; i >=0; i--){
     
     Suma= Suma + Integer.parseInt(this.txtRut.getText().substring(i,i+1)) * Constante;
     Constante = Constante + 1 ;
     if (Constante == 8){
     Constante =2; }
     }
     String Ultimo = this.txtRut.getText().substring(Ult-1).toUpperCase();
     Digito =11 - (Suma % 11);
     if (Digito==10 && Ultimo.equals("K")){
     lDevuelve=true;
     }else{
     
     if(Digito == 11 && Ultimo.equals("0")){
     lDevuelve=true;
     }else{
     if (Digito == Integer.parseInt(Ultimo)){
     lDevuelve=true;
     }
     }
     }
     return lDevuelve;
     }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RUT = new java.awt.Label();
        label2 = new java.awt.Label();
        label1 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProveedor = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtRSocial = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDesactivar = new javax.swing.JButton();
        labTitulo = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        label6 = new java.awt.Label();
        txtApellido = new javax.swing.JTextField();
        txtRut2 = new javax.swing.JFormattedTextField();
        txtMaskTelefono = new javax.swing.JFormattedTextField();
        comboBusqueda = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        butBuscar = new javax.swing.JButton();
        butBuscar1 = new javax.swing.JButton();
        butImprimir = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1000, 525));
        setPreferredSize(new java.awt.Dimension(1000, 525));

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 525));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 525));

        RUT.setText("RUT");

        label2.setText("Nombre");

        label1.setText("Direccion");

        label3.setText("Razon social");

        label4.setText("Telefono");

        label5.setText("E-Mail");

        tableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Razon Social", "Nombre", "Telefono", "E-mail", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProveedor);

        txtEmail.setToolTipText("");
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_limpio_24.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_agregar_32.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_editar_32.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDesactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_cancelar_32.png"))); // NOI18N
        btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarActionPerformed(evt);
            }
        });

        labTitulo.setBackground(new java.awt.Color(102, 102, 255));
        labTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitulo.setText("Proveedor");
        labTitulo.setOpaque(true);

        btnComprar.setText("Compra");

        label6.setText("Apellido");

        try {
            txtRut2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRut2ActionPerformed(evt);
            }
        });
        txtRut2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRut2KeyReleased(evt);
            }
        });

        txtMaskTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("# #### ####"))));
        txtMaskTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaskTelefonoActionPerformed(evt);
            }
        });
        txtMaskTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaskTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaskTelefonoKeyTyped(evt);
            }
        });

        comboBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Razon Social", "Rut", "Nombre" }));

        jLabel1.setText("Buscar");

        butBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_buscar_24.png"))); // NOI18N
        butBuscar.setToolTipText("Buscar Cliente");
        butBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        butBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBuscarActionPerformed(evt);
            }
        });

        butBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_cancelar_32.png"))); // NOI18N
        butBuscar1.setToolTipText("Buscar Cliente");
        butBuscar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        butBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBuscar1ActionPerformed(evt);
            }
        });

        butImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/r_ico_imprimir_32.png"))); // NOI18N
        butImprimir.setText("Imprimir");
        butImprimir.setToolTipText("Imprimir");
        butImprimir.setFocusable(false);
        butImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butImprimir.setMaximumSize(new java.awt.Dimension(69, 69));
        butImprimir.setMinimumSize(new java.awt.Dimension(69, 69));
        butImprimir.setPreferredSize(new java.awt.Dimension(69, 69));
        butImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        butImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDireccion))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(17, 17, 17)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtRut2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                        .addComponent(btnGuardar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDesactivar)
                                        .addGap(58, 58, 58))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                                    .addComponent(txtMaskTelefono))
                                .addGap(52, 52, 52))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(comboBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(btnComprar)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtRut2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaskTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(butBuscar)
                        .addGap(238, 238, 238))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDesactivar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnCancelar))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnComprar)
                                    .addComponent(comboBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(butBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(butImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(236, 236, 236))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
            this.txtRSocial.setText("");
            this.txtNombre.setText("");
            this.txtApellido.setText("");
            this.txtMaskTelefono.setText("");
            this.txtEmail.setText("");
            this.txtDireccion.setText("");
            this.txtRut2.setText("");  
            txtRut2.setEditable(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        OError validar = new CVerificar(txtRut2.getText()).Validar();
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        // El email a validar
        String email = txtEmail.getText();

        Matcher mather = pattern.matcher(email);

        if (mather.find() == true) {
            if (validar.isConfirma()) {
                OError Insertar = new CProveedor(0, txtRSocial.getText(), txtNombre.getText(), txtApellido.getText(), Integer.parseInt(txtMaskTelefono.getText()), txtEmail.getText(), txtDireccion.getText(), txtRut2.getText(), true).Insertar();
                if (Insertar.isConfirma()) {
                    System.out.println("rut valido");
                    ListarUsuarios();
                    this.txtRSocial.setText("");
                    this.txtNombre.setText("");
                    this.txtApellido.setText("");
                    this.txtMaskTelefono.setText("");
                    this.txtEmail.setText("");
                    this.txtDireccion.setText("");
                    this.txtRut2.setText("");
                }
            } else {
                /*  System.out.println("rut invalido no se puede guardar");
            DError Mensaje = new DError(new javax.swing.JDialog(), true);
            Mensaje.labMensaje.setText(validar.getMensaje());
            Mensaje.setVisible(true);
            ListarUsuarios(); */
                if (Animacion == null) {
                    Animacion = new OAnimacion(txtRut2);
                    Animacion.EjecutarTxt();
                    txtRut2.setToolTipText("ERROR");
                    //txtRut.
                }
            }
        } else {
            if (Animacion == null) {
                Animacion = new OAnimacion(txtRut2);
                Animacion.EjecutarTxt();
                txtRut2.setToolTipText("Email invalido");
            }

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtRut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRut2ActionPerformed
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter("########-#");
        } catch (ParseException ex) {
            Logger.getLogger(PProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFormattedTextField textField = new JFormattedTextField(formatter);
        JOptionPane.showMessageDialog(null, textField);
    }//GEN-LAST:event_txtRut2ActionPerformed

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed
        OProveedor provee = ((MTProveedor) tableProveedor.getModel()).getProveedor().get(tableProveedor.getSelectedRow());
        OError Error = new CProveedor(provee.getId(), provee.getRsocial(), provee.getNombre(), provee.getApellido(), provee.getTelefono(), provee.getCorreo(), provee.getDireccion(), provee.getRut(), false).Eliminar();
        if (Error.isConfirma()){
            DCorrecto Mensaje = new DCorrecto(new javax.swing.JDialog(), true);
            Mensaje.labMensaje.setText(Error.getMensaje());
            Mensaje.setVisible(true);
            ListarUsuarios();
            
        }else{
            
        }
        System.out.println(Error.getMensaje());
    }//GEN-LAST:event_btnDesactivarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        OError validar = new CVerificar(txtRut2.getText()).Validar();
        OProveedor provee = ((MTProveedor) tableProveedor.getModel()).getProveedor().get(tableProveedor.getSelectedRow());
        if (validar.isConfirma()) {
            OError Editar = new CProveedor(Integer.valueOf(provee.getId()), txtRSocial.getText(), txtNombre.getText(), txtApellido.getText(), Integer.parseInt(txtMaskTelefono.getText()), txtEmail.getText(), txtDireccion.getText(), txtRut2.getText(), true).Editar();

            if (Editar.isConfirma()) {

                ListarUsuarios();
                this.txtRSocial.setText("");
                this.txtNombre.setText("");
                this.txtApellido.setText("");
                this.txtMaskTelefono.setText("");
                this.txtEmail.setText("");
                this.txtDireccion.setText("");
                this.txtRut2.setText("");
            }
        } else {
            System.out.println("rut invalido no se puede guardar");
            DError Mensaje = new DError(new javax.swing.JDialog(), true);
            Mensaje.labMensaje.setText(validar.getMensaje());
            Mensaje.setVisible(true);
            ListarUsuarios();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tableProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProveedorMouseClicked
        MTProveedor provee = (MTProveedor) tableProveedor.getModel();
        // comuna.getUsuarios().get(datos.getSelectedRow()).getId();
        
        txtRSocial.setText(provee.getProveedor().get(tableProveedor.getSelectedRow()).getRsocial());
        txtNombre.setText(provee.getProveedor().get(tableProveedor.getSelectedRow()).getNombre());
        txtApellido.setText(provee.getProveedor().get(tableProveedor.getSelectedRow()).getApellido());
        txtMaskTelefono.setText(String.valueOf(provee.getProveedor().get(tableProveedor.getSelectedRow()).getTelefono()));
        txtEmail.setText(provee.getProveedor().get(tableProveedor.getSelectedRow()).getCorreo());
        txtDireccion.setText(provee.getProveedor().get(tableProveedor.getSelectedRow()).getDireccion());
        txtRut2.setText(provee.getProveedor().get(tableProveedor.getSelectedRow()).getRut());
        txtRut2.setEditable(false);
        
    }//GEN-LAST:event_tableProveedorMouseClicked

    private void txtRut2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRut2KeyReleased
         if(Animacion != null){
            Animacion.DetenerTxt();
            Animacion = null;
            txtRut2.setToolTipText(null);
        }
    }//GEN-LAST:event_txtRut2KeyReleased

    private void txtMaskTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaskTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaskTelefonoActionPerformed

    private void txtMaskTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaskTelefonoKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            if((txtMaskTelefono.getText().length() == 9)){
            
               getToolkit().beep();
               evt.consume();
               txtMaskTelefono.setToolTipText("Ingrese solo numeros"); 
            } 
        }else{
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtMaskTelefonoKeyTyped

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
      
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        if(Animacion2 != null){
            Animacion2.DetenerTxt();
            Animacion2 = null;
            txtEmail.setToolTipText(null);
        }
                                       
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtMaskTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaskTelefonoKeyReleased
        if(Animacion3 != null){
            Animacion3.DetenerTxt();
            Animacion3 = null;
            txtMaskTelefono.setToolTipText(null);
        }
    }//GEN-LAST:event_txtMaskTelefonoKeyReleased

    private void butBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBuscarActionPerformed
        
        Buscar ();
    
    }//GEN-LAST:event_butBuscarActionPerformed

    private void butBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBuscar1ActionPerformed
        ListarUsuarios();
        txtBusqueda.setText("");
    }//GEN-LAST:event_butBuscar1ActionPerformed

    private void butImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butImprimirActionPerformed
       Imprimir();
    }//GEN-LAST:event_butImprimirActionPerformed
    
    private void Imprimir(){
        CVerificar impri = new CVerificar();
        impri.Imprimir(tableProveedor, labTitulo.getText());
    }
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label RUT;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton butBuscar;
    private javax.swing.JButton butBuscar1;
    private javax.swing.JButton butImprimir;
    private javax.swing.JComboBox<String> comboBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labTitulo;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JTable tableProveedor;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtMaskTelefono;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRSocial;
    private javax.swing.JFormattedTextField txtRut2;
    // End of variables declaration//GEN-END:variables

    
}



