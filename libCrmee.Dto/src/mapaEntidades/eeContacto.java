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
public class eeContacto {
    private int IdContacto;
    private int Rut;
    private char Dv;
    private String Nombres;
    private String Paterno;
    private String Materno;
    private Date FechaNacimiento;
    private String eMail;
    private int IdNacionalidad;
    private int IdDireccion;
    private String Fono;
    private String Celular;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdContacto
     */
    public int getIdContacto() {
        return IdContacto;
    }

    /**
     * @param IdContacto the IdContacto to set
     */
    public void setIdContacto(int IdContacto) {
        this.IdContacto = IdContacto;
    }

    /**
     * @return the Rut
     */
    public int getRut() {
        return Rut;
    }

    /**
     * @param Rut the Rut to set
     */
    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    /**
     * @return the Dv
     */
    public char getDv() {
        return Dv;
    }

    /**
     * @param Dv the Dv to set
     */
    public void setDv(char Dv) {
        this.Dv = Dv;
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
     * @return the FechaNacimiento
     */
    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    /**
     * @param FechaNacimiento the FechaNacimiento to set
     */
    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
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
     * @return the IdNacionalidad
     */
    public int getIdNacionalidad() {
        return IdNacionalidad;
    }

    /**
     * @param IdNacionalidad the IdNacionalidad to set
     */
    public void setIdNacionalidad(int IdNacionalidad) {
        this.IdNacionalidad = IdNacionalidad;
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

    public eeContacto(int IdContacto, int Rut, char Dv, String Nombres, String Paterno, String Materno, Date FechaNacimiento, String eMail, int IdNacionalidad, int IdDireccion, String Fono, String Celular, boolean IdEstado, Date FechaCreacion) {
        this.IdContacto = IdContacto;
        this.Rut = Rut;
        this.Dv = Dv;
        this.Nombres = Nombres;
        this.Paterno = Paterno;
        this.Materno = Materno;
        this.FechaNacimiento = FechaNacimiento;
        this.eMail = eMail;
        this.IdNacionalidad = IdNacionalidad;
        this.IdDireccion = IdDireccion;
        this.Fono = Fono;
        this.Celular = Celular;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeContacto() {
    }
    
}
