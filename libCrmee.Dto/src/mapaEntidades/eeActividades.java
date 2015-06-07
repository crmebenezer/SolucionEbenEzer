/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapaEntidades;

import java.util.Date;

/**
 *
 * @author Pheonyx
 */
public class eeActividades {
    private int IdActividad;
    private String Nombre;
    private String Descripcion;
    private int IdTipoactividad;
    private String Mensaje;
    private Date FechaDesde;
    private Date FechaHasta;
    private boolean IdEstado;
    private Date FechaCreacion;


    public eeActividades(int IdActividad, String Nombre, String Descripcion, int IdTipoactividad, String Mensaje, Date FechaDesde, Date FechaHasta, boolean IdEstado, Date FechaCreacion) {
        this.IdActividad = IdActividad;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.IdTipoactividad = IdTipoactividad;
        this.Mensaje = Mensaje;
        this.FechaDesde = FechaDesde;
        this.FechaHasta = FechaHasta;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeActividades() {
    }

    /**
     * @return the IdActividad
     */
    public int getIdActividad() {
        return IdActividad;
    }

    /**
     * @param IdActividad the IdActividad to set
     */
    public void setIdActividad(int IdActividad) {
        this.IdActividad = IdActividad;
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
     * @return the IdTipoactividad
     */
    public int getIdTipoactividad() {
        return IdTipoactividad;
    }

    /**
     * @param IdTipoactividad the IdTipoactividad to set
     */
    public void setIdTipoactividad(int IdTipoactividad) {
        this.IdTipoactividad = IdTipoactividad;
    }

    /**
     * @return the Mensaje
     */
    public String getMensaje() {
        return Mensaje;
    }

    /**
     * @param Mensaje the Mensaje to set
     */
    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    /**
     * @return the FechaDesde
     */
    public Date getFechaDesde() {
        return FechaDesde;
    }

    /**
     * @param FechaDesde the FechaDesde to set
     */
    public void setFechaDesde(Date FechaDesde) {
        this.FechaDesde = FechaDesde;
    }

    /**
     * @return the FechaHasta
     */
    public Date getFechaHasta() {
        return FechaHasta;
    }

    /**
     * @param FechaHasta the FechaHasta to set
     */
    public void setFechaHasta(Date FechaHasta) {
        this.FechaHasta = FechaHasta;
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
    
    
}
