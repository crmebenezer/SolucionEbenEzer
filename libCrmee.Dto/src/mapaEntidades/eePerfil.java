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
public class eePerfil {
    private int IdPerfil;
    private int IdReglaPerfil;
    private String Nombre;
    private String Descipcion;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdPerfil
     */
    public int getIdPerfil() {
        return IdPerfil;
    }

    /**
     * @param IdPerfil the IdPerfil to set
     */
    public void setIdPerfil(int IdPerfil) {
        this.IdPerfil = IdPerfil;
    }

    /**
     * @return the IdReglaPerfil
     */
    public int getIdReglaPerfil() {
        return IdReglaPerfil;
    }

    /**
     * @param IdReglaPerfil the IdReglaPerfil to set
     */
    public void setIdReglaPerfil(int IdReglaPerfil) {
        this.IdReglaPerfil = IdReglaPerfil;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Descipcion
     */
    public String getDescipcion() {
        return Descipcion;
    }

    /**
     * @param Descipcion the Descipcion to set
     */
    public void setDescipcion(String Descipcion) {
        this.Descipcion = Descipcion;
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

    public eePerfil(int IdPerfil, int IdReglaPerfil, String Nombre, String Descipcion, boolean IdEstado, Date FechaCreacion) {
        this.IdPerfil = IdPerfil;
        this.IdReglaPerfil = IdReglaPerfil;
        this.Nombre = Nombre;
        this.Descipcion = Descipcion;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eePerfil() {
    }    
}
