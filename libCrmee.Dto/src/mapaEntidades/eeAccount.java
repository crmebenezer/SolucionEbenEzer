/*;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapaEntidades;

import java.util.Date;

/**
 *
 * @author Pheonyx
 */
public class eeAccount {
    
    
    private int IdAccount;
    private String RutBusiness;
    private String dvBusiness;   
    private String RazonSocial;
    private String eMail;
    private String Fono;
    private String Fax;
    private int IdContacto;
    private int IdDireccion;
    private int IdUsuario;
    private boolean IdEstado;
    private Date FechaCreacion;

    public eeAccount(int IdAccount, String RutBusiness, String dvBusiness, String RazonSocial, String eMail, String Fono, String Fax, int IdContacto, int IdDireccion, int IdUsuario, boolean IdEstado, Date FechaCreacion) {
        this.IdAccount = IdAccount;
        this.RutBusiness = RutBusiness;
        this.dvBusiness = dvBusiness;      
        this.RazonSocial = RazonSocial;
        this.eMail = eMail;
        this.Fono = Fono;
        this.Fax = Fax;
        this.IdContacto = IdContacto;
        this.IdDireccion = IdDireccion;
        this.IdUsuario = IdUsuario;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeAccount() {
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
     * @return the RutBusiness
     */
    public String getRutBusiness() {
        return RutBusiness;
    }

    /**
     * @param RutBusiness the RutBusiness to set
     */
    public void setRutBusiness(String RutBusiness) {
        this.RutBusiness = RutBusiness;
    }

    /**
     * @return the dvBusiness
     */
    public String getDvBusiness() {
        return dvBusiness;
    }

    /**
     * @param dvBusiness the dvBusiness to set
     */
    public void setDvBusiness(String dvBusiness) {
        this.dvBusiness = dvBusiness;
    }

    /**
     * @return the RazonSocial
     */
    public String getRazonSocial() {
        return RazonSocial;
    }

    /**
     * @param RazonSocial the RazonSocial to set
     */
    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
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
     * @return the IdUsuario
     */
    public int getIdUsuario() {
        return IdUsuario;
    }

    /**
     * @param IdUsuario the IdUsuario to set
     */
    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
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
    
    
}
