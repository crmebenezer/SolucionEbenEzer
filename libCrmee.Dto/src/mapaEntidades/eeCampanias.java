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
public class eeCampanias {

    private int IdCampanas;
    private String Nombre;
    private String Descripcon;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdCampanas
     */
    public int getIdCampanas() {
        return IdCampanas;
    }

    /**
     * @param IdCampanas the IdCampanas to set
     */
    public void setIdCampanas(int IdCampanas) {
        this.IdCampanas = IdCampanas;
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
     * @return the Descripcon
     */
    public String getDescripcon() {
        return Descripcon;
    }

    /**
     * @param Descripcon the Descripcon to set
     */
    public void setDescripcon(String Descripcon) {
        this.Descripcon = Descripcon;
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

    public eeCampanias(int IdCampanas, String Nombre, String Descripcon, boolean IdEstado, Date FechaCreacion) {
        this.IdCampanas = IdCampanas;
        this.Nombre = Nombre;
        this.Descripcon = Descripcon;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeCampanias() {
    }        
}
