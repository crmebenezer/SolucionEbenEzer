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
public class eeUserPerfil {
    private int IdUserPerfilcol;
    private int IdPerfil;
    private int IdUser;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdUserPerfilcol
     */
    public int getIdUserPerfilcol() {
        return IdUserPerfilcol;
    }

    /**
     * @param IdUserPerfilcol the IdUserPerfilcol to set
     */
    public void setIdUserPerfilcol(int IdUserPerfilcol) {
        this.IdUserPerfilcol = IdUserPerfilcol;
    }

    /**
     * @return the IdPerfil
     */
    public int getIdPerfil() {
        return IdPerfil;
    }

    /**
     * @param IdPerfil the IdPerfil to set
     */
    public void setIdPerfil(int IdPerfil) {
        this.IdPerfil = IdPerfil;
    }

    /**
     * @return the IdUser
     */
    public int getIdUser() {
        return IdUser;
    }

    /**
     * @param IdUser the IdUser to set
     */
    public void setIdUser(int IdUser) {
        this.IdUser = IdUser;
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

    public eeUserPerfil(int IdUserPerfilcol, int IdPerfil, int IdUser, boolean IdEstado, Date FechaCreacion) {
        this.IdUserPerfilcol = IdUserPerfilcol;
        this.IdPerfil = IdPerfil;
        this.IdUser = IdUser;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeUserPerfil() {
    }
}
