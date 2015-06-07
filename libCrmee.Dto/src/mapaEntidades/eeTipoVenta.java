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
public class eeTipoVenta {
    private int IdTipoVenta;
    private String Nombre;
    private String Descripcion;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdTipoVenta
     */
    public int getIdTipoVenta() {
        return IdTipoVenta;
    }

    /**
     * @param IdTipoVenta the IdTipoVenta to set
     */
    public void setIdTipoVenta(int IdTipoVenta) {
        this.IdTipoVenta = IdTipoVenta;
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

    public eeTipoVenta(int IdTipoVenta, String Nombre, String Descripcion, boolean IdEstado, Date FechaCreacion) {
        this.IdTipoVenta = IdTipoVenta;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeTipoVenta() {
    }
    
}
