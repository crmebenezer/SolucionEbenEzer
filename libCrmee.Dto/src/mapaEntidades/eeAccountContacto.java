/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapaEntidades;

import java.util.Date;

/**
 *
 * @author Pheonyx
 */
public class eeAccountContacto {
    
  private int IdAccountContacto;
  private int IdAccount;
  private int IdContacto;
  private String Observaciones;
  private int IdEstado;
  private Date FechaCreacion;
  
    public eeAccountContacto(int IdAccountContacto, int IdAccount, int IdContacto, String Observaciones, int IdEstado,Date FechaCreacion) {
        this.IdAccountContacto = IdAccountContacto;
        this.IdAccount = IdAccount;
        this.IdContacto = IdContacto;
        this.Observaciones = Observaciones;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeAccountContacto() {
    }

    /**
     * @return the IdAccountContacto
     */
    public int getIdAccountContacto() {
        return IdAccountContacto;
    }

    /**
     * @param IdAccountContacto the IdAccountContacto to set
     */
    public void setIdAccountContacto(int IdAccountContacto) {
        this.IdAccountContacto = IdAccountContacto;
    }

    /**
     * @return the IdAccount
     */
    public int getIdAccount() {
        return IdAccount;
    }

    /**
     * @param IdAccount the IdAccount to set
     */
    public void setIdAccount(int IdAccount) {
        this.IdAccount = IdAccount;
    }

    /**
     * @return the IdContacto
     */
    public int getIdContacto() {
        return IdContacto;
    }

    /**
     * @param IdContacto the IdContacto to set
     */
    public void setIdContacto(int IdContacto) {
        this.IdContacto = IdContacto;
    }

    /**
     * @return the Observaciones
     */
    public String getObservaciones() {
        return Observaciones;
    }

    /**
     * @param Observaciones the Observaciones to set
     */
    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    /**
     * @return the IdEstado
     */
    public int getIdEstado() {
        return IdEstado;
    }

    /**
     * @param IdEstado the IdEstado to set
     */
    public void setIdEstado(int IdEstado) {
        this.IdEstado = IdEstado;
    }

    /**
     * @return the FechaCreacion
     */
    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    /**
     * @param FechaCreacion the FechaCreacion to set
     */
    public void setFechaCreacion(Date FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }
    
}
