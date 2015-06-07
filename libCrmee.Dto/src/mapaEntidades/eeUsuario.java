/*
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
public class eeUsuario {
    private int idUser;
    private String UserName;
    private String Password;
    private Date RunTimeSession;
    private int idDataUser;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the idUser
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the RunTimeSession
     */
    public Date getRunTimeSession() {
        return RunTimeSession;
    }

    /**
     * @param RunTimeSession the RunTimeSession to set
     */
    public void setRunTimeSession(Date RunTimeSession) {
        this.RunTimeSession = RunTimeSession;
    }

    /**
     * @return the idDataUser
     */
    public int getIdDataUser() {
        return idDataUser;
    }

    /**
     * @param idDataUser the idDataUser to set
     */
    public void setIdDataUser(int idDataUser) {
        this.idDataUser = idDataUser;
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

    public eeUsuario(int idUser, String UserName, String Password, Date RunTimeSession, int idDataUser, boolean IdEstado, Date FechaCreacion) {
        this.idUser = idUser;
        this.UserName = UserName;
        this.Password = Password;
        this.RunTimeSession = RunTimeSession;
        this.idDataUser = idDataUser;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeUsuario() {
    }
}
