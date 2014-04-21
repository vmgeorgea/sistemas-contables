/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

/**
 *
 * @author user
 */
public class Cuenta {
public String codigo;
public String numero;
public String descripcion;
public String categoria;
public int idtipo;
public String saldoinicial;
public String saldofinal;
public int cuentapadre;

    public Cuenta() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public String getSaldoinicial() {
        return saldoinicial;
    }

    public void setSaldoinicial(String saldoinicial) {
        this.saldoinicial = saldoinicial;
    }

    public String getSaldofinal() {
        return saldofinal;
    }

    public void setSaldofinal(String saldofinal) {
        this.saldofinal = saldofinal;
    }

    public int getCuentapadre() {
        return cuentapadre;
    }

    public void setCuentapadre(int cuentapadre) {
        this.cuentapadre = cuentapadre;
    }

}
