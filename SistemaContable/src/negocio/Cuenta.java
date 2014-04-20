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
public String idtipo;
public String idcategoria;
public String saldoinicial;
public String saldofinal;
public String cuentapadre;

    public Cuenta() {
    }

    public Cuenta(String codigo, String numero, String descripcion, String idtipo, String idcategoria, String saldoinicial, String saldofinal, String cuentapadre) {
        this.codigo = codigo;
        this.numero = numero;
        this.descripcion = descripcion;
        this.idtipo = idtipo;
        this.idcategoria = idcategoria;
        this.saldoinicial = saldoinicial;
        this.saldofinal = saldofinal;
        this.cuentapadre = cuentapadre;
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

    public String getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(String idtipo) {
        this.idtipo = idtipo;
    }

    public String getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(String idcategoria) {
        this.idcategoria = idcategoria;
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

    public String getCuentapadre() {
        return cuentapadre;
    }

    public void setCuentapadre(String cuentapadre) {
        this.cuentapadre = cuentapadre;
    }

}
