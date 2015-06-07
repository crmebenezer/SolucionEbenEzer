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
public class eeFacturas {
    private int IdFacturas;
    private String Nombre;
    private String Descripcion;
    private int IdAccount;
    private int IdOrdenTrabajo;
    private int IdTipoVenta;
    private double TotalFactura;
    private int IdEstadoFactura;
    private Date FechaCreacion;
    private boolean IdEstado;

    /**
     * @return the IdFacturas
     */
    public int getIdFacturas() {
        return IdFacturas;
    }

    /**
     * @param IdFacturas the IdFacturas to set
     */
    public void setIdFacturas(int IdFacturas) {
        this.IdFacturas = IdFacturas;
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
     * @return the IdAccount
     */
    public int getIdAccount() {
        return IdAccount;
    }

    /**
     * @param IdAccount the IdAccount to set
     */
    public void setIdAccount(int IdAccount) {
        this.IdAccount = IdAccount;
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
     * @return the TotalFactura
     */
    public double getTotalFactura() {
        return TotalFactura;
    }

    /**
     * @param TotalFactura the TotalFactura to set
     */
    public void setTotalFactura(double TotalFactura) {
        this.TotalFactura = TotalFactura;
    }

    /**
     * @return the IdEstadoFactura
     */
    public int getIdEstadoFactura() {
        return IdEstadoFactura;
    }

    /**
     * @param IdEstadoFactura the IdEstadoFactura to set
     */
    public void setIdEstadoFactura(int IdEstadoFactura) {
        this.IdEstadoFactura = IdEstadoFactura;
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

    public eeFacturas(int IdFacturas, String Nombre, String Descripcion, int IdAccount, int IdOrdenTrabajo, int IdTipoVenta, double TotalFactura, int IdEstadoFactura, Date FechaCreacion, boolean IdEstado) {
        this.IdFacturas = IdFacturas;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.IdAccount = IdAccount;
        this.IdOrdenTrabajo = IdOrdenTrabajo;
        this.IdTipoVenta = IdTipoVenta;
        this.TotalFactura = TotalFactura;
        this.IdEstadoFactura = IdEstadoFactura;
        this.FechaCreacion = FechaCreacion;
        this.IdEstado = IdEstado;
    }

    public eeFacturas() {
    }
}
