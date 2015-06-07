/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapaEntidades;

import java.sql.Blob;
import java.sql.Date;

/**
 *
 * @author Pheonyx
 */
public class eeDatosUsuario {
    private int IdDataUser;
    private int RUT;
    private char DV;
    private String Nombres;
    private String Paterno;
    private String Materno;
    private Date FechaNacimiento;
    private Blob Foto;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdDataUser
     */
    public int getIdDataUser() {
        return IdDataUser;
    }

    /**
     * @param IdDataUser the IdDataUser to set
     */
    public void setIdDataUser(int IdDataUser) {
        this.IdDataUser = IdDataUser;
    }

    /**
     * @return the RUT
     */
    public int getRUT() {
        return RUT;
    }

    /**
     * @param RUT the RUT to set
     */
    public void setRUT(int RUT) {
        this.RUT = RUT;
    }

    /**
     * @return the DV
     */
    public char getDV() {
        return DV;
    }

    /**
     * @param DV the DV to set
     */
    public void setDV(char DV) {
        this.DV = DV;
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
     * @return the Foto
     */
    public Blob getFoto() {
        return Foto;
    }

    /**
     * @param Foto the Foto to set
     */
    public void setFoto(Blob Foto) {
        this.Foto = Foto;
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

    public eeDatosUsuario(int IdDataUser, int RUT, char DV, String Nombres, String Paterno, String Materno, Date FechaNacimiento, Blob Foto, boolean IdEstado, Date FechaCreacion) {
        this.IdDataUser = IdDataUser;
        this.RUT = RUT;
        this.DV = DV;
        this.Nombres = Nombres;
        this.Paterno = Paterno;
        this.Materno = Materno;
        this.FechaNacimiento = FechaNacimiento;
        this.Foto = Foto;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }    

    public eeDatosUsuario() {
    }
}
