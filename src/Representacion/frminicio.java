
package Representacion;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class frminicio extends javax.swing.JFrame {

    // Instanciamos cada formulario
    
    frmplancha form1 = new frmplancha();
    frmproveedor form2 = new frmproveedor();
    frmcliente form3 =new frmcliente();
    frmsalida form4 = new frmsalida();
    frmventa form5 =new frmventa();
    
    public frminicio() {
        initComponents();
        this.setExtendedState(frminicio.MAXIMIZED_BOTH);
        this.setTitle("Gigantografías Master");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        escritorio = new javax.swing.JDesktopPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lblidusuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblacceso = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        musismaster = new javax.swing.JMenu();
        muarchivos = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        musalidas = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        muregistrar = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        muconfiguraciones = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        muherramientas = new javax.swing.JMenu();
        mureportes = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        musalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(102, 153, 255));

        jDesktopPane1.setBackground(new java.awt.Color(0, 153, 153));

        lblidusuario.setText("IdUsuario");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jRadioButton1.setBackground(new java.awt.Color(0, 153, 153));
        grupo.add(jRadioButton1);
        jRadioButton1.setText("Ventas");

        jRadioButton2.setBackground(new java.awt.Color(0, 153, 153));
        grupo.add(jRadioButton2);
        jRadioButton2.setText("Salidas PD");

        jRadioButton3.setBackground(new java.awt.Color(0, 153, 153));
        grupo.add(jRadioButton3);
        jRadioButton3.setText("Entradas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Operaciones");

        jButton1.setText("Realizar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lblacceso.setText("Tipo_Usuairo");

        lblapellido.setText("Apellido");

        lblnombre.setText("Nombre");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblapellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblacceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblidusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblidusuario)
                .addGap(18, 18, 18)
                .addComponent(lblnombre)
                .addGap(18, 18, 18)
                .addComponent(lblapellido)
                .addGap(18, 18, 18)
                .addComponent(lblacceso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(lblidusuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblacceso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblapellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        musismaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/Inicio.png"))); // NOI18N
        musismaster.setMnemonic('f');
        musismaster.setText("SisMaster");
        menuBar.add(musismaster);

        muarchivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/Archivo.png"))); // NOI18N
        muarchivos.setMnemonic('e');
        muarchivos.setText("Archivos");

        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/hoja.png"))); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Planchas");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        muarchivos.add(cutMenuItem);

        copyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/proveedor.png"))); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Proveedores");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        muarchivos.add(copyMenuItem);

        menuBar.add(muarchivos);

        musalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/salida.png"))); // NOI18N
        musalidas.setMnemonic('h');
        musalidas.setText("Salidas");

        contentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/ventas.png"))); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Venta");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        musalidas.add(contentMenuItem);

        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/daños.png"))); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Producción o Daño");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        musalidas.add(aboutMenuItem);

        menuBar.add(musalidas);

        muregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/agregar.png"))); // NOI18N
        muregistrar.setText("Registrar");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/clientes.png"))); // NOI18N
        jMenuItem3.setText("Clientes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        muregistrar.add(jMenuItem3);

        menuBar.add(muregistrar);

        muconfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/Configuraciones.png"))); // NOI18N
        muconfiguraciones.setText("Configuraciones");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/usuarios.png"))); // NOI18N
        jMenuItem1.setText("Usuarios y Accesos");
        muconfiguraciones.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        muconfiguraciones.add(jMenuItem2);

        menuBar.add(muconfiguraciones);

        muherramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/Herramientas.png"))); // NOI18N
        muherramientas.setText("Herramientas");
        menuBar.add(muherramientas);

        mureportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/reporte.png"))); // NOI18N
        mureportes.setText("Reportes");
        menuBar.add(mureportes);

        jMenu5.setText("Ayuda");
        menuBar.add(jMenu5);

        musalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/Salir.png"))); // NOI18N
        musalir.setText("Salir");
        musalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musalirMouseClicked(evt);
            }
        });
        menuBar.add(musalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void CentrarVentanaInterna(JInternalFrame internalFrame ){           //  centra el jinternalframe y la muestra en el jDesktop
        int x = (escritorio.getWidth()/2) - internalFrame.getWidth()/2;
        int y = (escritorio.getHeight()/2) - internalFrame.getHeight()/2;
        if(internalFrame.isShowing()){
            internalFrame.setLocation(x,y);
        }
        else{
            escritorio.add(internalFrame);
            internalFrame.setLocation(x,y);
            internalFrame.show();
            internalFrame.toFront();
        }
    }
        
    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        // TODO add your handling code here:
        
        if(form1.isShowing() || form1.isIcon()){    // Si la instancia esta visible o esta Minimizada (osea que no existe dentro del MDI)
            
            JOptionPane.showMessageDialog(rootPane, "La ventana que intenta abrir ya está abierta, cierre la ventana actual e intente nuevamente");
            
        }
        else{
            
            CentrarVentanaInterna(form1);
            
            //frmplancha form = new frmplancha();
            //form.show();
            
            //form1 = new frmplancha();
            //escritorio.add(form1);
            //form1.toFront();
            //form1.setVisible(true);
            //form1.show();
        }
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void musalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
        //this.dispose();
    }//GEN-LAST:event_musalirMouseClicked

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        // TODO add your handling code here:
        if(form2.isShowing() || form2.isIcon()){
            JOptionPane.showMessageDialog(rootPane, "La ventana que intenta abrir ya está abierta, cierre la ventana actual e intente nuevamente");
        }
        else{
            CentrarVentanaInterna(form2);
        }
        //frmproveedor form= new frmproveedor();
        //escritorio.add(form);
        //form.toFront();
        //form.setVisible(true);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        if(form3.isShowing() || form3.isIcon()){
            JOptionPane.showMessageDialog(rootPane, "La ventana que intenta abrir ya está abierta, cierre la ventana actual e intente nuevamente");
        }
        else{
            CentrarVentanaInterna(form3);
        }
        //frmcliente form=new frmcliente();
        //escritorio.add(form);
        //form.toFront();
        //form.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
        if(form4.isShowing() || form4.isIcon()){
            JOptionPane.showMessageDialog(rootPane, "La ventana que intenta abrir ya está abierta, cierre la ventana actual e intente nuevamente");
        }
        else{
            CentrarVentanaInterna(form4);
        }
        //frmsalida form =new frmsalida();
        //escritorio.add(form);
        //form.toFront();
        //form.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        // TODO add your handling code here:
        if(form5.isShowing() || form5.isIcon()){
            JOptionPane.showMessageDialog(rootPane, "La ventana que intenta abrir ya está abierta, cierre la ventana actual e intente nuevamente");
        }
        else{
            CentrarVentanaInterna(form5);
        }
        //frmventa form =new frmventa();
        //frminicio.escritorio.add(form);
        //form.toFront();
        //form.setVisible(true);
    }//GEN-LAST:event_contentMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frminicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    public static javax.swing.JLabel lblacceso;
    public static javax.swing.JLabel lblapellido;
    public static javax.swing.JLabel lblidusuario;
    public static javax.swing.JLabel lblnombre;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JMenu muarchivos;
    public static javax.swing.JMenu muconfiguraciones;
    private javax.swing.JMenu muherramientas;
    private javax.swing.JMenu muregistrar;
    private javax.swing.JMenu mureportes;
    private javax.swing.JMenu musalidas;
    private javax.swing.JMenu musalir;
    private javax.swing.JMenu musismaster;
    // End of variables declaration//GEN-END:variables

}
