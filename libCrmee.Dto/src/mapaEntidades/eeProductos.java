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
public class eeProductos {
    private int IdProductos;
    private String Nombre;
    private int IdCategoriaProducto;
    private int IdTipoProducto;
    private String Descripcion;
    private boolean IdEstado;
    private int Stock;
    private Date FechaIngreso;
    private float Valor;

    /**
     * @return the IdProductos
     */
    public int getIdProductos() {
        return IdProductos;
    }

    /**
     * @param IdProductos the IdProductos to set
     */
    public void setIdProductos(int IdProductos) {
        this.IdProductos = IdProductos;
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
     * @return the IdCategoriaProducto
     */
    public int getIdCategoriaProducto() {
        return IdCategoriaProducto;
    }

    /**
     * @param IdCategoriaProducto the IdCategoriaProducto to set
     */
    public void setIdCategoriaProducto(int IdCategoriaProducto) {
        this.IdCategoriaProducto = IdCategoriaProducto;
    }

    /**
     * @return the IdTipoProducto
     */
    public int getIdTipoProducto() {
        return IdTipoProducto;
    }

    /**
     * @param IdTipoProducto the IdTipoProducto to set
     */
    public void setIdTipoProducto(int IdTipoProducto) {
        this.IdTipoProducto = IdTipoProducto;
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
     * @return the Stock
     */
    public int getStock() {
        return Stock;
    }

    /**
     * @param Stock the Stock to set
     */
    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    /**
     * @return the FechaIngreso
     */
    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    /**
     * @param FechaIngreso the FechaIngreso to set
     */
    public void setFechaIngreso(Date FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    /**
     * @return the Valor
     */
    public float getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public eeProductos(int IdProductos, String Nombre, int IdCategoriaProducto, int IdTipoProducto, String Descripcion, boolean IdEstado, int Stock, Date FechaIngreso, float Valor) {
        this.IdProductos = IdProductos;
        this.Nombre = Nombre;
        this.IdCategoriaProducto = IdCategoriaProducto;
        this.IdTipoProducto = IdTipoProducto;
        this.Descripcion = Descripcion;
        this.IdEstado = IdEstado;
        this.Stock = Stock;
        this.FechaIngreso = FechaIngreso;
        this.Valor = Valor;
    }

    public eeProductos() {
    }
}
