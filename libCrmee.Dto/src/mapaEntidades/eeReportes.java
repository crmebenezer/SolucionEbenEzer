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
public class eeReportes {
    private int IdReportes;
    private String Nombre;
    private String Descripcion;
    private int IdDetalleReporte;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdReportes
     */
    public int getIdReportes() {
        return IdReportes;
    }

    /**
     * @param IdReportes the IdReportes to set
     */
    public void setIdReportes(int IdReportes) {
        this.IdReportes = IdReportes;
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
     * @return the IdDetalleReporte
     */
    public int getIdDetalleReporte() {
        return IdDetalleReporte;
    }

    /**
     * @param IdDetalleReporte the IdDetalleReporte to set
     */
    public void setIdDetalleReporte(int IdDetalleReporte) {
        this.IdDetalleReporte = IdDetalleReporte;
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

    public eeReportes(int IdReportes, String Nombre, String Descripcion, int IdDetalleReporte, boolean IdEstado, Date FechaCreacion) {
        this.IdReportes = IdReportes;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.IdDetalleReporte = IdDetalleReporte;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeReportes() {
    }
}
