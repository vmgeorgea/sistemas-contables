/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import datos.conexionBD;
import java.awt.event.ItemEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.Cuenta;
/**
 *
 * @author user
 */
public class FrmCuenta extends javax.swing.JDialog {
Object parent;
    /**
     * Creates new form FrmCuenta1
     */
    public FrmCuenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        llenarComboTipo();
        llenarComboCuenta();
        llenarComboCategoria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtNumeroCuenta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jcbTipo = new javax.swing.JComboBox();
        jcbCategoria = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSaldoInicial = new javax.swing.JTextField();
        jcbCuentaPadre = new javax.swing.JComboBox();
        txtSaldoFinal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("Descripcion");

        jLabel6.setText("Saldo inicial");

        jLabel2.setText("Numero de cuenta");

        jLabel7.setText("Saldo final");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Cuenta padre");

        jButton2.setText("Modificar");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jcbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTipoItemStateChanged(evt);
            }
        });

        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija...", "GRUPO", "DETALLE" }));

        jLabel5.setText("Categoria");

        jLabel4.setText("Tipo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumeroCuenta)
                    .addComponent(jcbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbCategoria, 0, 88, Short.MAX_VALUE)
                    .addComponent(txtSaldoInicial)
                    .addComponent(txtSaldoFinal)
                    .addComponent(jcbCuentaPadre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSaldoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcbCuentaPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cuenta c =  new Cuenta();
        conexionBD con = new conexionBD();
        try {
            if(txtNumeroCuenta.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese el numero de cuenta...!");
                return;
            }
            if(txtDescripcion.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese la descripcion de cuenta...!");
                return;
            }
            if(jcbTipo.getSelectedItem().equals("Elija...")){
                JOptionPane.showMessageDialog(null, "Elija el tipo de cuenta...!");
                return;
            }
            if(jcbCategoria.getSelectedItem().equals("Elija...")){
                JOptionPane.showMessageDialog(null, "Elija la categoria de cuenta...!");
                return;
            }

            c.setNumero(txtNumeroCuenta.getText().toUpperCase());
            c.setDescripcion(txtDescripcion.getText().toUpperCase());

            if(jcbTipo.getSelectedItem().equals("Elija...")){
                JOptionPane.showMessageDialog(null, "Elija el tipo de cuenta...!");
            }else{
                ResultSet rs1 = null;
                rs1 = con.buscarBD("tipo", "nombreTipo", jcbTipo.getSelectedItem().toString().toUpperCase());
                if(!rs1.first()){//recorre el resultset al siguiente registro si es que existen
                    JOptionPane.showMessageDialog(null, "El tipo ingresada no existe..!","Error",JOptionPane.ERROR_MESSAGE);

                }
                else{
                    int val=  rs1.getInt(1);
                    c.setIdtipo(val);
                }
            }
            c.setCategoria(jcbCategoria.getSelectedItem().toString().toUpperCase());
            if(txtSaldoInicial.getText().equals("")){
                c.setSaldoinicial("0,0");
            }else{
                c.setSaldoinicial(txtSaldoInicial.getText().toUpperCase());
            }
            if(txtSaldoFinal.getText().equals("")){
                c.setSaldofinal("0,0");
            }else{
                c.setSaldofinal(txtSaldoFinal.getText().toUpperCase());
            }

            if(jcbCuentaPadre.getSelectedItem().equals("Elija...")){
                c.setCuentapadre(0);
            }else{
                ResultSet rs3 = null;
                rs3 = con.buscarBD("cuenta", "descripcionCuenta", jcbCuentaPadre.getSelectedItem().toString().toUpperCase());
                if(!rs3.first()){//recorre el resultset al siguiente registro si es que existen
                    JOptionPane.showMessageDialog(null, "La cuenta ingresada no existe..!","Error",JOptionPane.ERROR_MESSAGE);

                }
                else{
                    int val=  rs3.getInt(1);
                    c.setCuentapadre(val);
                }
            }

            ResultSet rs2 = con.consultar("select * from cuenta where descripcionCuenta ='"+c.getDescripcion()+"'");
            if(rs2.first()){//recorre el resultset al siguiente registro si es que existen
                JOptionPane.showMessageDialog(null, "La cuenta con esta descripcion ya existe..!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            con.insertarDatosBD("cuenta","null,'"+c.getNumero()+"','"+c.getDescripcion()
                +"','"+c.getCategoria()+"','"+c.getSaldoinicial()+"','"+c.getSaldofinal()+"',"
                +c.getCuentapadre()+","+c.getIdtipo());

            IntFrmPlanCuentas aux = new IntFrmPlanCuentas();
            aux = (IntFrmPlanCuentas) parent;
            JOptionPane.showMessageDialog(null, "Los datos de la cuenta nueva han sido guardados con exito...");
            aux.llenarTablaCuentas();

        } catch (SQLException ex) {
            Logger.getLogger(FrmCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.hide();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTipoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if(jcbTipo.getSelectedItem().toString().equals("Agregar...")){
                FrmTipo ft = new FrmTipo(null, true);
                ft.parent = this;
                ft.setLocationRelativeTo(null);
                ft.setVisible(true);
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoItemStateChanged
 public void llenarComboTipo(){
        conexionBD con = new conexionBD();
        ResultSet rs = null;        
        rs = con.cargarDatosBD("tipo");
        jcbTipo.removeAllItems();
        try { 
            jcbTipo.addItem("Elija...");
            while(rs.next()){
                  String val=  rs.getString(2);                  
                    jcbTipo.addItem(val);
            }
            jcbTipo.addItem("Agregar...");
        } catch (SQLException ex) {
            Logger.getLogger(FrmCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void llenarComboCuenta(){
        conexionBD con = new conexionBD();
        ResultSet rs = null;        
        rs = con.cargarDatosBD("cuenta");
        jcbCuentaPadre.removeAllItems();
        try { 
            jcbCuentaPadre.addItem("Elija...");
            while(rs.next()){
                  String val=  rs.getString(3);                  
                    jcbCuentaPadre.addItem(val);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void llenarComboCategoria(){
        jcbCategoria.removeAllItems();
        jcbCategoria.addItem("Elija...");          
        jcbCategoria.addItem("GRUPO");
        jcbCategoria.addItem("DETALLE");
        
    }    
    
    public void actualizarComboTipo(String pro){
        jcbTipo.setSelectedItem(pro);
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
            java.util.logging.Logger.getLogger(FrmCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCuenta dialog = new FrmCuenta(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbCategoria;
    private javax.swing.JComboBox jcbCuentaPadre;
    private javax.swing.JComboBox jcbTipo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNumeroCuenta;
    private javax.swing.JTextField txtSaldoFinal;
    private javax.swing.JTextField txtSaldoInicial;
    // End of variables declaration//GEN-END:variables
}