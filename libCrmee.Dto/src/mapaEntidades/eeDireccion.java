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
public class eeDireccion {
    private int IdDireccion;
    private int IdPais;
    private int IdProvincia;
    private int IdComuna;
    private String Direccion;
    private int IdTipoDireccion;
    private boolean IdEstado;
    private Date FechaCreacion;

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
     * @return the IdPais
     */
    public int getIdPais() {
        return IdPais;
    }

    /**
     * @param IdPais the IdPais to set
     */
    public void setIdPais(int IdPais) {
        this.IdPais = IdPais;
    }

    /**
     * @return the IdProvincia
     */
    public int getIdProvincia() {
        return IdProvincia;
    }

    /**
     * @param IdProvincia the IdProvincia to set
     */
    public void setIdProvincia(int IdProvincia) {
        this.IdProvincia = IdProvincia;
    }

    /**
     * @return the IdComuna
     */
    public int getIdComuna() {
        return IdComuna;
    }

    /**
     * @param IdComuna the IdComuna to set
     */
    public void setIdComuna(int IdComuna) {
        this.IdComuna = IdComuna;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the IdTipoDireccion
     */
    public int getIdTipoDireccion() {
        return IdTipoDireccion;
    }

    /**
     * @param IdTipoDireccion the IdTipoDireccion to set
     */
    public void setIdTipoDireccion(int IdTipoDireccion) {
        this.IdTipoDireccion = IdTipoDireccion;
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

    public eeDireccion(int IdDireccion, int IdPais, int IdProvincia, int IdComuna, String Direccion, int IdTipoDireccion, boolean IdEstado, Date FechaCreacion) {
        this.IdDireccion = IdDireccion;
        this.IdPais = IdPais;
        this.IdProvincia = IdProvincia;
        this.IdComuna = IdComuna;
        this.Direccion = Direccion;
        this.IdTipoDireccion = IdTipoDireccion;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeDireccion() {
    }
}
