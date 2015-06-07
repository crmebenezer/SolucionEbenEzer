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
public class eeOrdenCompra {
    private int IdOrdenesCompra;
    private String Nombre;
    private String Descripcion;
    private int IdAccount;
    private double TotalOrdenCompra;
    private int IdOrdenTrabajo;
    private int IdDireccion;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdOrdenesCompra
     */
    public int getIdOrdenesCompra() {
        return IdOrdenesCompra;
    }

    /**
     * @param IdOrdenesCompra the IdOrdenesCompra to set
     */
    public void setIdOrdenesCompra(int IdOrdenesCompra) {
        this.IdOrdenesCompra = IdOrdenesCompra;
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
     * @return the TotalOrdenCompra
     */
    public double getTotalOrdenCompra() {
        return TotalOrdenCompra;
    }

    /**
     * @param TotalOrdenCompra the TotalOrdenCompra to set
     */
    public void setTotalOrdenCompra(double TotalOrdenCompra) {
        this.TotalOrdenCompra = TotalOrdenCompra;
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
     * @return the IdDireccion
     */
    public int getIdDireccion() {
        return IdDireccion;
    }

    /**
     * @param IdDireccion the IdDireccion to set
     */
    public void setIdDireccion(int IdDireccion) {
        this.IdDireccion = IdDireccion;
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

    public eeOrdenCompra(int IdOrdenesCompra, String Nombre, String Descripcion, int IdAccount, double TotalOrdenCompra, int IdOrdenTrabajo, int IdDireccion, boolean IdEstado, Date FechaCreacion) {
        this.IdOrdenesCompra = IdOrdenesCompra;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.IdAccount = IdAccount;
        this.TotalOrdenCompra = TotalOrdenCompra;
        this.IdOrdenTrabajo = IdOrdenTrabajo;
        this.IdDireccion = IdDireccion;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeOrdenCompra() {
    }
}
