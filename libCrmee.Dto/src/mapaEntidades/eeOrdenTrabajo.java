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
public class eeOrdenTrabajo {
    private int IdOrdenTrabajo;
    private String Nombre;
    private String Descripcion;
    private int IdAccount;
    private int IdDireccion;
    private double Total;
    private Date FechaCreacion;
    private boolean IdEstado;

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
     * @return the Total
     */
    public double getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(double Total) {
        this.Total = Total;
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

    public eeOrdenTrabajo(int IdOrdenTrabajo, String Nombre, String Descripcion, int IdAccount, int IdDireccion, double Total, Date FechaCreacion, boolean IdEstado) {
        this.IdOrdenTrabajo = IdOrdenTrabajo;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.IdAccount = IdAccount;
        this.IdDireccion = IdDireccion;
        this.Total = Total;
        this.FechaCreacion = FechaCreacion;
        this.IdEstado = IdEstado;
    }

    public eeOrdenTrabajo() {
    }
}
