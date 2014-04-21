/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import datos.conexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Transaccion {
 
    private int idTransaccion;
    private String debeTransaccion;
    private String haberTransaccion;
    private String referenciaTransaccion;
    private int Cuenta_idCuenta;
    private int Asiento_idAsiento;

    public Transaccion() {
    }

    public Transaccion(int idTransaccion, String debeTransaccion, String haberTransaccion, String referenciaTransaccion, int Cuenta_idCuenta, int Asiento_idAsiento) {
        this.idTransaccion = idTransaccion;
        this.debeTransaccion = debeTransaccion;
        this.haberTransaccion = haberTransaccion;
        this.referenciaTransaccion = referenciaTransaccion;
        this.Cuenta_idCuenta = Cuenta_idCuenta;
        this.Asiento_idAsiento = Asiento_idAsiento;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getDebeTransaccion() {
        return debeTransaccion;
    }

    public void setDebeTransaccion(String debeTransaccion) {
        this.debeTransaccion = debeTransaccion;
    }

    public String getHaberTransaccion() {
        return haberTransaccion;
    }

    public void setHaberTransaccion(String haberTransaccion) {
        this.haberTransaccion = haberTransaccion;
    }

    public String getReferenciaTransaccion() {
        return referenciaTransaccion;
    }

    public void setReferenciaTransaccion(String referenciaTransaccion) {
        this.referenciaTransaccion = referenciaTransaccion;
    }

    public int getCuenta_idCuenta() {
        return Cuenta_idCuenta;
    }

    public void setCuenta_idCuenta(int Cuenta_idCuenta) {
        this.Cuenta_idCuenta = Cuenta_idCuenta;
    }

    public int getAsiento_idAsiento() {
        return Asiento_idAsiento;
    }

    public void setAsiento_idAsiento(int Asiento_idAsiento) {
        this.Asiento_idAsiento = Asiento_idAsiento;
    }
    
    public Transaccion consultaLibroMayor (){
        
        try {
            // TODO add your handling code here:
            conexionBD con = new conexionBD();
            ResultSet rs  = con.consultar("select idPaciente,nombres,apellidos,representanteLegal from paciente where nombresapellidos='"+"'");
            
            if(!rs.first()){//recorre el resultset al siguiente registro si es que existen
                    JOptionPane.showMessageDialog(null, "El paciente no existe..!");
            }
            else{
                rs.beforeFirst();//regresa el puntero al primer registro
                //tablaPacientes.setRowCount(0);        
                while(rs.next()){
                    Object fila[] = {rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)};
                    //tablaPacientes.addRow(fila);            
                }
            }
        } catch (SQLException ex) {
            //Logger.getLogger(IntFrmPacientesRegistrados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
}
