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
public class eeProvincia {
    private int IdProvincia;
    private int IdPais;
    private String Nombre;
    private String Observaciones;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdProvincia
     */
    public int getIdProvincia() {
        return IdProvincia;
    }

    /**
     * @param IdProvincia the IdProvincia to set
     */
    public void setIdProvincia(int IdProvincia) {
        this.IdProvincia = IdProvincia;
    }

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
     * @return the Observaciones
     */
    public String getObservaciones() {
        return Observaciones;
    }

    /**
     * @param Observaciones the Observaciones to set
     */
    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
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

    public eeProvincia(int IdProvincia, int IdPais, String Nombre, String Observaciones, boolean IdEstado, Date FechaCreacion) {
        this.IdProvincia = IdProvincia;
        this.IdPais = IdPais;
        this.Nombre = Nombre;
        this.Observaciones = Observaciones;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeProvincia() {
    }
}
