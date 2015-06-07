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
public class eeComuna {
    
    private int IdComuna;
    private int IdProvincia;
    private String Nombre;
    private String Observaciones;
    private boolean IdEstado;
    private Date FechaCreacion;

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

    public eeComuna(int IdComuna, int IdProvincia, String Nombre, String Observaciones, boolean IdEstado, Date FechaCreacion) {
        this.IdComuna = IdComuna;
        this.IdProvincia = IdProvincia;
        this.Nombre = Nombre;
        this.Observaciones = Observaciones;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeComuna() {
    }
    
}
