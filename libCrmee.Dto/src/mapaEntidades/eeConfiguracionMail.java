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
public class eeConfiguracionMail {
    private int IdConfiguracionMail;
    private String Nombre;
    private String Descripcion;
    private String NombreServidor;
    private int IdTipoServicio;
    private String Mail;
    private String ServidorEntrada;
    private String ServidorSalida;
    private String NombreUsuario;
    private String Contrasena;
    private boolean RequiereAutenticacionContrasenaSegura;
    private boolean AutenticacionSMTRequerida;
    private int PuertoEntrada;
    private int PuertoSalida;
    private String DireccionServicioProveedorSMS;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdConfiguracionMail
     */
    public int getIdConfiguracionMail() {
        return IdConfiguracionMail;
    }

    /**
     * @param IdConfiguracionMail the IdConfiguracionMail to set
     */
    public void setIdConfiguracionMail(int IdConfiguracionMail) {
        this.IdConfiguracionMail = IdConfiguracionMail;
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
     * @return the NombreServidor
     */
    public String getNombreServidor() {
        return NombreServidor;
    }

    /**
     * @param NombreServidor the NombreServidor to set
     */
    public void setNombreServidor(String NombreServidor) {
        this.NombreServidor = NombreServidor;
    }

    /**
     * @return the IdTipoServicio
     */
    public int getIdTipoServicio() {
        return IdTipoServicio;
    }

    /**
     * @param IdTipoServicio the IdTipoServicio to set
     */
    public void setIdTipoServicio(int IdTipoServicio) {
        this.IdTipoServicio = IdTipoServicio;
    }

    /**
     * @return the Mail
     */
    public String getMail() {
        return Mail;
    }

    /**
     * @param Mail the Mail to set
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * @return the ServidorEntrada
     */
    public String getServidorEntrada() {
        return ServidorEntrada;
    }

    /**
     * @param ServidorEntrada the ServidorEntrada to set
     */
    public void setServidorEntrada(String ServidorEntrada) {
        this.ServidorEntrada = ServidorEntrada;
    }

    /**
     * @return the ServidorSalida
     */
    public String getServidorSalida() {
        return ServidorSalida;
    }

    /**
     * @param ServidorSalida the ServidorSalida to set
     */
    public void setServidorSalida(String ServidorSalida) {
        this.ServidorSalida = ServidorSalida;
    }

    /**
     * @return the NombreUsuario
     */
    public String getNombreUsuario() {
        return NombreUsuario;
    }

    /**
     * @param NombreUsuario the NombreUsuario to set
     */
    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    /**
     * @return the Contrasena
     */
    public String getContrasena() {
        return Contrasena;
    }

    /**
     * @param Contrasena the Contrasena to set
     */
    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    /**
     * @return the RequiereAutenticacionContrasenaSegura
     */
    public boolean isRequiereAutenticacionContrasenaSegura() {
        return RequiereAutenticacionContrasenaSegura;
    }

    /**
     * @param RequiereAutenticacionContrasenaSegura the RequiereAutenticacionContrasenaSegura to set
     */
    public void setRequiereAutenticacionContrasenaSegura(boolean RequiereAutenticacionContrasenaSegura) {
        this.RequiereAutenticacionContrasenaSegura = RequiereAutenticacionContrasenaSegura;
    }

    /**
     * @return the AutenticacionSMTRequerida
     */
    public boolean isAutenticacionSMTRequerida() {
        return AutenticacionSMTRequerida;
    }

    /**
     * @param AutenticacionSMTRequerida the AutenticacionSMTRequerida to set
     */
    public void setAutenticacionSMTRequerida(boolean AutenticacionSMTRequerida) {
        this.AutenticacionSMTRequerida = AutenticacionSMTRequerida;
    }

    /**
     * @return the PuertoEntrada
     */
    public int getPuertoEntrada() {
        return PuertoEntrada;
    }

    /**
     * @param PuertoEntrada the PuertoEntrada to set
     */
    public void setPuertoEntrada(int PuertoEntrada) {
        this.PuertoEntrada = PuertoEntrada;
    }

    /**
     * @return the PuertoSalida
     */
    public int getPuertoSalida() {
        return PuertoSalida;
    }

    /**
     * @param PuertoSalida the PuertoSalida to set
     */
    public void setPuertoSalida(int PuertoSalida) {
        this.PuertoSalida = PuertoSalida;
    }

    /**
     * @return the DireccionServicioProveedorSMS
     */
    public String getDireccionServicioProveedorSMS() {
        return DireccionServicioProveedorSMS;
    }

    /**
     * @param DireccionServicioProveedorSMS the DireccionServicioProveedorSMS to set
     */
    public void setDireccionServicioProveedorSMS(String DireccionServicioProveedorSMS) {
        this.DireccionServicioProveedorSMS = DireccionServicioProveedorSMS;
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

    public eeConfiguracionMail(int IdConfiguracionMail, String Nombre, String Descripcion, String NombreServidor, int IdTipoServicio, String Mail, String ServidorEntrada, String ServidorSalida, String NombreUsuario, String Contrasena, boolean RequiereAutenticacionContrasenaSegura, boolean AutenticacionSMTRequerida, int PuertoEntrada, int PuertoSalida, String DireccionServicioProveedorSMS, boolean IdEstado, Date FechaCreacion) {
        this.IdConfiguracionMail = IdConfiguracionMail;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.NombreServidor = NombreServidor;
        this.IdTipoServicio = IdTipoServicio;
        this.Mail = Mail;
        this.ServidorEntrada = ServidorEntrada;
        this.ServidorSalida = ServidorSalida;
        this.NombreUsuario = NombreUsuario;
        this.Contrasena = Contrasena;
        this.RequiereAutenticacionContrasenaSegura = RequiereAutenticacionContrasenaSegura;
        this.AutenticacionSMTRequerida = AutenticacionSMTRequerida;
        this.PuertoEntrada = PuertoEntrada;
        this.PuertoSalida = PuertoSalida;
        this.DireccionServicioProveedorSMS = DireccionServicioProveedorSMS;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeConfiguracionMail() {
    }
    
}
