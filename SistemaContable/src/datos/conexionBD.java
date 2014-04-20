/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Victor
 */
public class conexionBD {
    
    
    static Connection conn = null;
    static Statement st = null;
    static ResultSet rs = null;
    
    static String nombreBD = "mydb";
    static String login = "root";
    static String password = "base1";//*********************CAMBIAR CLAVER************************************
    static String url = "jdbc:mysql://localhost/" + nombreBD;
    
    public static Connection Enlace(Connection conn) throws SQLException{
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,login,password);

        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(ConeccionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }

        return conn;
    }

    /**
     * Metodo para cargar los datos de una base de datos
     * @return
     */
    public ResultSet cargarDatosBD(String nombreTabla){

        try {
            conn = Enlace(conn);
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("select * from " + nombreTabla);
            //conn.close();
        } catch (SQLException ex) {
            //Logger.getLogger(ConeccionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error metodo Cargar Datos BD");
        }        
    return rs;
    }

     /**
     * Metodo para insertar los datos en la base de datos
     * @param nombreTabla
     * @param parteSentencia
     */
    public void insertarDatosBD(String nombreTabla, String parteSentencia){
        try {
            conn = Enlace(conn);
            st = (Statement) conn.createStatement();
            st.execute("insert into " + nombreTabla + " values(" + parteSentencia  +  ")");
            System.out.println("insert into " + nombreTabla + " values(" + parteSentencia  +  ")");
            //conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null,"La tupla ya existe...!!!");
        }
    }

    
    public int numeroTuplas(String nombreTabla){
        int numTuplas = 0;
        try {
            conn = Enlace(conn);
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("select count(*) from " + nombreTabla );
            //conn.close();
            //System.out.print(rs);
            rs.next();
            numTuplas = Integer.parseInt(rs.getString(1));
            
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    return numTuplas;
    }

    /**
     * Metodo Realizar una consulta aplicando joins left
     * @return
     */
    public ResultSet consultaJoin(String sentencia){

        try {
            conn = Enlace(conn);
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("select " + sentencia);
            //conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error consulta Join");
        }
    return rs;
    }

    /**
     * Metodo para realizar una consulta like
     * @param tabla
     * @param atributo
     * @param datoBuscado
     * @return
     */
    public ResultSet buscarLike(String tabla, String atributos, String datoBuscado, String buscarpor){        
        try {
            conn = Enlace(conn);
            st = (Statement) conn.createStatement();
            //cade = "SELECT "+ atributo+" FROM " + tabla + " WHERE " + atributo+ " like '%"+ datoBuscado +"%'";
            //System.out.print(cade);
            rs = st.executeQuery("SELECT "+ atributos+" FROM " + tabla + " WHERE " + buscarpor+ " like '%"+ datoBuscado +"%'");
            //conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    return rs;
    }

    public void ActualizarDatos(String nombreTabla, String parteSentencia, String campoAct ){
        String sent = null;
        try {
            conn = Enlace(conn);
            st = (Statement) conn.createStatement();
            //sent = "update " + nombreTabla + " set " + parteSentencia + " where " + campoAct;
            //System.out.print(sent);
            st.execute("update " + nombreTabla + " set " + parteSentencia + " where " + campoAct);
            //conn.close();
        } catch (SQLException ex) {
            //Logger.getLogger(ConeccionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error al actualizar los datos!!!");
        }

    }

    /**
     * Metodo para buscar un dato en la bse de datos
     * @param tabla
     * @param datoBuscado a buscar
     * @return
     */
    public ResultSet buscarBD(String tabla, String atributo, String datoBuscado){
        String cade = null;
        try {
            conn = Enlace(conn);
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("SELECT * FROM " + tabla + " WHERE "+atributo+ " = '"+ datoBuscado +"'");
            //rs = st.executeQuery("select * from usuario");
            //conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    return rs;
    }
    
    
    /**
     * Metodo para realizar una consulta cualquiera enviando la sentencia
     * @param tabla
     * @param datoBuscado a buscar
     * @return
     */
    public ResultSet consultar(String consulta){
        String cade = null;
        try {
            conn = Enlace(conn);
            st = (Statement) conn.createStatement();
            //rs = st.executeQuery("SELECT * FROM " + tabla + " WHERE "+atributo+ " = '"+ datoBuscado +"'");
            rs = st.executeQuery(consulta);
            //conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    return rs;
    }
   
    public void ejecutarSentencia(String sentencia){
        
        try{
            conn = Enlace(conn);
            st = (Statement) conn.createStatement();
            st.execute(sentencia);              
            //conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
