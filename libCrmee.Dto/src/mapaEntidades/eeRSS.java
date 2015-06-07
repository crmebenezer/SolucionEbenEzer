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
public class eeRSS {
    private int IdRSS;
    private String Nombre;
    private String Descripcion;
    private String DireccionWeb;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdRSS
     */
    public int getIdRSS() {
        return IdRSS;
    }

    /**
     * @param IdRSS the IdRSS to set
     */
    public void setIdRSS(int IdRSS) {
        this.IdRSS = IdRSS;
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
     * @return the DireccionWeb
     */
    public String getDireccionWeb() {
        return DireccionWeb;
    }

    /**
     * @param DireccionWeb the DireccionWeb to set
     */
    public void setDireccionWeb(String DireccionWeb) {
        this.DireccionWeb = DireccionWeb;
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

    public eeRSS(int IdRSS, String Nombre, String Descripcion, String DireccionWeb, boolean IdEstado, Date FechaCreacion) {
        this.IdRSS = IdRSS;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.DireccionWeb = DireccionWeb;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeRSS() {
    }
}
