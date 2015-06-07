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
public class eeProspecto {
    private int IdProspecto;
    private String Nombres;
    private String Paterno;
    private String Materno;
    private int IdDireccion;
    private String eMail;
    private String Fono;
    private String Fax;
    private String Celular;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdProspecto
     */
    public int getIdProspecto() {
        return IdProspecto;
    }

    /**
     * @param IdProspecto the IdProspecto to set
     */
    public void setIdProspecto(int IdProspecto) {
        this.IdProspecto = IdProspecto;
    }

    /**
     * @return the Nombres
     */
    public String getNombres() {
        return Nombres;
    }

    /**
     * @param Nombres the Nombres to set
     */
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    /**
     * @return the Paterno
     */
    public String getPaterno() {
        return Paterno;
    }

    /**
     * @param Paterno the Paterno to set
     */
    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    /**
     * @return the Materno
     */
    public String getMaterno() {
        return Materno;
    }

    /**
     * @param Materno the Materno to set
     */
    public void setMaterno(String Materno) {
        this.Materno = Materno;
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
     * @return the eMail
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * @return the Fono
     */
    public String getFono() {
        return Fono;
    }

    /**
     * @param Fono the Fono to set
     */
    public void setFono(String Fono) {
        this.Fono = Fono;
    }

    /**
     * @return the Fax
     */
    public String getFax() {
        return Fax;
    }

    /**
     * @param Fax the Fax to set
     */
    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
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

    public eeProspecto(int IdProspecto, String Nombres, String Paterno, String Materno, int IdDireccion, String eMail, String Fono, String Fax, String Celular, boolean IdEstado, Date FechaCreacion) {
        this.IdProspecto = IdProspecto;
        this.Nombres = Nombres;
        this.Paterno = Paterno;
        this.Materno = Materno;
        this.IdDireccion = IdDireccion;
        this.eMail = eMail;
        this.Fono = Fono;
        this.Fax = Fax;
        this.Celular = Celular;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeProspecto() {
    }
}
