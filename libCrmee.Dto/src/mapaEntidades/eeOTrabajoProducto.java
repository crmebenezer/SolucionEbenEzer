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
public class eeOTrabajoProducto {
    private int IdOrdTrabajoProducto;
    private int IdOrdenTrabajo;
    private int IdProducto;
    private boolean IdEstado;
    private Date FechaCreacion;
    private int Cantidads;

    /**
     * @return the IdOrdTrabajoProducto
     */
    public int getIdOrdTrabajoProducto() {
        return IdOrdTrabajoProducto;
    }

    /**
     * @param IdOrdTrabajoProducto the IdOrdTrabajoProducto to set
     */
    public void setIdOrdTrabajoProducto(int IdOrdTrabajoProducto) {
        this.IdOrdTrabajoProducto = IdOrdTrabajoProducto;
    }

    /**
     * @return the IdOrdenTrabajo
     */
    public int getIdOrdenTrabajo() {
        return IdOrdenTrabajo;
    }

    /**
     * @param IdOrdenTrabajo the IdOrdenTrabajo to set
     */
    public void setIdOrdenTrabajo(int IdOrdenTrabajo) {
        this.IdOrdenTrabajo = IdOrdenTrabajo;
    }

    /**
     * @return the IdProducto
     */
    public int getIdProducto() {
        return IdProducto;
    }

    /**
     * @param IdProducto the IdProducto to set
     */
    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
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

    /**
     * @return the Cantidads
     */
    public int getCantidads() {
        return Cantidads;
    }

    /**
     * @param Cantidads the Cantidads to set
     */
    public void setCantidads(int Cantidads) {
        this.Cantidads = Cantidads;
    }

    public eeOTrabajoProducto(int IdOrdTrabajoProducto, int IdOrdenTrabajo, int IdProducto, boolean IdEstado, Date FechaCreacion, int Cantidads) {
        this.IdOrdTrabajoProducto = IdOrdTrabajoProducto;
        this.IdOrdenTrabajo = IdOrdenTrabajo;
        this.IdProducto = IdProducto;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
        this.Cantidads = Cantidads;
    }

    public eeOTrabajoProducto() {
    }
}
