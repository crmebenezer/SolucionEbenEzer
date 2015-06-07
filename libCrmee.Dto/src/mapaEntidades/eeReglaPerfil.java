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
public class eeReglaPerfil {
    private int IdReglaPerfil;
    private int IdPerfil;
    private String NombreModulo;
    private boolean PermisoVer;
    private boolean PermisoActualizar;
    private boolean PermisoEliminar;
    private String DescripcionRegla;
    private boolean IdEstado;
    private Date FechaCreacion;

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
     * @return the NombreModulo
     */
    public String getNombreModulo() {
        return NombreModulo;
    }

    /**
     * @param NombreModulo the NombreModulo to set
     */
    public void setNombreModulo(String NombreModulo) {
        this.NombreModulo = NombreModulo;
    }

    /**
     * @return the PermisoVer
     */
    public boolean isPermisoVer() {
        return PermisoVer;
    }

    /**
     * @param PermisoVer the PermisoVer to set
     */
    public void setPermisoVer(boolean PermisoVer) {
        this.PermisoVer = PermisoVer;
    }

    /**
     * @return the PermisoActualizar
     */
    public boolean isPermisoActualizar() {
        return PermisoActualizar;
    }

    /**
     * @param PermisoActualizar the PermisoActualizar to set
     */
    public void setPermisoActualizar(boolean PermisoActualizar) {
        this.PermisoActualizar = PermisoActualizar;
    }

    /**
     * @return the PermisoEliminar
     */
    public boolean isPermisoEliminar() {
        return PermisoEliminar;
    }

    /**
     * @param PermisoEliminar the PermisoEliminar to set
     */
    public void setPermisoEliminar(boolean PermisoEliminar) {
        this.PermisoEliminar = PermisoEliminar;
    }

    /**
     * @return the DescripcionRegla
     */
    public String getDescripcionRegla() {
        return DescripcionRegla;
    }

    /**
     * @param DescripcionRegla the DescripcionRegla to set
     */
    public void setDescripcionRegla(String DescripcionRegla) {
        this.DescripcionRegla = DescripcionRegla;
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

    public eeReglaPerfil(int IdReglaPerfil, int IdPerfil, String NombreModulo, boolean PermisoVer, boolean PermisoActualizar, boolean PermisoEliminar, String DescripcionRegla, boolean IdEstado, Date FechaCreacion) {
        this.IdReglaPerfil = IdReglaPerfil;
        this.IdPerfil = IdPerfil;
        this.NombreModulo = NombreModulo;
        this.PermisoVer = PermisoVer;
        this.PermisoActualizar = PermisoActualizar;
        this.PermisoEliminar = PermisoEliminar;
        this.DescripcionRegla = DescripcionRegla;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeReglaPerfil() {
    }
}
