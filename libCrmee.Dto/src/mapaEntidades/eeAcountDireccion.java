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
public class eeAcountDireccion {
 
    private int IdaccDcc;
    private int IdAccount;
    private int IdDireccion;
    private String Observaciones;
    private boolean IdEstado;
    private Date FechaCreacion;



    public eeAcountDireccion(int IdaccDcc, int IdAccount, int IdDireccion, String Observaciones, boolean IdEstado, Date FechaCreacion) {
        this.IdaccDcc = IdaccDcc;
        this.IdAccount = IdAccount;
        this.IdDireccion = IdDireccion;
        this.Observaciones = Observaciones;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeAcountDireccion() {
    }

    /**
     * @return the IdaccDcc
     */
    public int getIdaccDcc() {
        return IdaccDcc;
    }

    /**
     * @param IdaccDcc the IdaccDcc to set
     */
    public void setIdaccDcc(int IdaccDcc) {
        this.IdaccDcc = IdaccDcc;
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
     * @return the IdDireccion
     */
    public int getIdDireccion() {
        return IdDireccion;
    }

    /**
     * @param IdDireccion the IdDireccion to set
     */
    public void setIdDireccion(int IdDireccion) {
        this.IdDireccion = IdDireccion;
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
    public boolean isIdEstado() {
        return IdEstado;
    }

    /**
     * @param IdEstado the IdEstado to set
     */
    public void setIdEstado(boolean IdEstado) {
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
