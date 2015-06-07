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
public class eeProveedor {
    private int IdProveedores;
    private String RazonSocial;
    private String Descripcion;
    private int IdDireccion;
    private int Rut;
    private char Dv;
    private int IdContacto;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdProveedores
     */
    public int getIdProveedores() {
        return IdProveedores;
    }

    /**
     * @param IdProveedores the IdProveedores to set
     */
    public void setIdProveedores(int IdProveedores) {
        this.IdProveedores = IdProveedores;
    }

    /**
     * @return the RazonSocial
     */
    public String getRazonSocial() {
        return RazonSocial;
    }

    /**
     * @param RazonSocial the RazonSocial to set
     */
    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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
     * @return the Rut
     */
    public int getRut() {
        return Rut;
    }

    /**
     * @param Rut the Rut to set
     */
    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    /**
     * @return the Dv
     */
    public char getDv() {
        return Dv;
    }

    /**
     * @param Dv the Dv to set
     */
    public void setDv(char Dv) {
        this.Dv = Dv;
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

    public eeProveedor(int IdProveedores, String RazonSocial, String Descripcion, int IdDireccion, int Rut, char Dv, int IdContacto, boolean IdEstado, Date FechaCreacion) {
        this.IdProveedores = IdProveedores;
        this.RazonSocial = RazonSocial;
        this.Descripcion = Descripcion;
        this.IdDireccion = IdDireccion;
        this.Rut = Rut;
        this.Dv = Dv;
        this.IdContacto = IdContacto;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeProveedor() {
    }
}
