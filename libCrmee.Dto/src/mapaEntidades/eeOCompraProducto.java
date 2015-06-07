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
public class eeOCompraProducto {
    private int IdOrdCompraProducto;
    private int IdOrdenCompra;
    private int IdProducto;
    private boolean IdEstado;
    private Date FechaCreacion;
    private double Valor;
    private int Cantidad;

    /**
     * @return the IdOrdCompraProducto
     */
    public int getIdOrdCompraProducto() {
        return IdOrdCompraProducto;
    }

    /**
     * @param IdOrdCompraProducto the IdOrdCompraProducto to set
     */
    public void setIdOrdCompraProducto(int IdOrdCompraProducto) {
        this.IdOrdCompraProducto = IdOrdCompraProducto;
    }

    /**
     * @return the IdOrdenCompra
     */
    public int getIdOrdenCompra() {
        return IdOrdenCompra;
    }

    /**
     * @param IdOrdenCompra the IdOrdenCompra to set
     */
    public void setIdOrdenCompra(int IdOrdenCompra) {
        this.IdOrdenCompra = IdOrdenCompra;
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
     * @return the Valor
     */
    public double getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public eeOCompraProducto(int IdOrdCompraProducto, int IdOrdenCompra, int IdProducto, boolean IdEstado, Date FechaCreacion, double Valor, int Cantidad) {
        this.IdOrdCompraProducto = IdOrdCompraProducto;
        this.IdOrdenCompra = IdOrdenCompra;
        this.IdProducto = IdProducto;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
        this.Valor = Valor;
        this.Cantidad = Cantidad;
    }

    public eeOCompraProducto() {
    }
}
