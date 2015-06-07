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
public class eePais {
    private int IdPais;
    private String Nombre;
    private String Nacionalidad;
    private int IdMoneda;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdPais
     */
    public int getIdPais() {
        return IdPais;
    }

    /**
     * @param IdPais the IdPais to set
     */
    public void setIdPais(int IdPais) {
        this.IdPais = IdPais;
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
     * @return the Nacionalidad
     */
    public String getNacionalidad() {
        return Nacionalidad;
    }

    /**
     * @param Nacionalidad the Nacionalidad to set
     */
    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    /**
     * @return the IdMoneda
     */
    public int getIdMoneda() {
        return IdMoneda;
    }

    /**
     * @param IdMoneda the IdMoneda to set
     */
    public void setIdMoneda(int IdMoneda) {
        this.IdMoneda = IdMoneda;
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

    public eePais(int IdPais, String Nombre, String Nacionalidad, int IdMoneda, boolean IdEstado, Date FechaCreacion) {
        this.IdPais = IdPais;
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.IdMoneda = IdMoneda;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eePais() {
    }
}
