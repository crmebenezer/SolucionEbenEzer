/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapaEntidades;

import java.sql.Date;

/**
 *
 * @author Pheonyx
 */
public class eeContactoDireccion {
    private int IdContactoDireccion;
    private int IdContacto;
    private int IdDireccion;
    private String Observaciones;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdContactoDireccion
     */
    public int getIdContactoDireccion() {
        return IdContactoDireccion;
    }

    /**
     * @param IdContactoDireccion the IdContactoDireccion to set
     */
    public void setIdContactoDireccion(int IdContactoDireccion) {
        this.IdContactoDireccion = IdContactoDireccion;
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

    public eeContactoDireccion(int IdContactoDireccion, int IdContacto, int IdDireccion, String Observaciones, boolean IdEstado, Date FechaCreacion) {
        this.IdContactoDireccion = IdContactoDireccion;
        this.IdContacto = IdContacto;
        this.IdDireccion = IdDireccion;
        this.Observaciones = Observaciones;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeContactoDireccion() {
    }
}
