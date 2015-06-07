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
public class eeAuditoria {
    private int idAuditoria;
    private int IdModulo;
    private int IdUsuario;
    private String NombreModulo;
    private Blob OldData;
    private Blob NewData;
    private int TipoAccion;
    private Date FechaAccion;
    private int UsuarioAccion;
    private boolean IdEstado;

    /**
     * @return the idAuditoria
     */
    public int getIdAuditoria() {
        return idAuditoria;
    }

    /**
     * @param idAuditoria the idAuditoria to set
     */
    public void setIdAuditoria(int idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    /**
     * @return the IdModulo
     */
    public int getIdModulo() {
        return IdModulo;
    }

    /**
     * @param IdModulo the IdModulo to set
     */
    public void setIdModulo(int IdModulo) {
        this.IdModulo = IdModulo;
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
     * @return the NombreModulo
     */
    public String getNombreModulo() {
        return NombreModulo;
    }

    /**
     * @param NombreModulo the NombreModulo to set
     */
    public void setNombreModulo(String NombreModulo) {
        this.NombreModulo = NombreModulo;
    }

    /**
     * @return the OldData
     */
    public Blob getOldData() {
        return OldData;
    }

    /**
     * @param OldData the OldData to set
     */
    public void setOldData(Blob OldData) {
        this.OldData = OldData;
    }

    /**
     * @return the NewData
     */
    public Blob getNewData() {
        return NewData;
    }

    /**
     * @param NewData the NewData to set
     */
    public void setNewData(Blob NewData) {
        this.NewData = NewData;
    }

    /**
     * @return the TipoAccion
     */
    public int getTipoAccion() {
        return TipoAccion;
    }

    /**
     * @param TipoAccion the TipoAccion to set
     */
    public void setTipoAccion(int TipoAccion) {
        this.TipoAccion = TipoAccion;
    }

    /**
     * @return the FechaAccion
     */
    public Date getFechaAccion() {
        return FechaAccion;
    }

    /**
     * @param FechaAccion the FechaAccion to set
     */
    public void setFechaAccion(Date FechaAccion) {
        this.FechaAccion = FechaAccion;
    }

    /**
     * @return the UsuarioAccion
     */
    public int getUsuarioAccion() {
        return UsuarioAccion;
    }

    /**
     * @param UsuarioAccion the UsuarioAccion to set
     */
    public void setUsuarioAccion(int UsuarioAccion) {
        this.UsuarioAccion = UsuarioAccion;
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

    public eeAuditoria(int idAuditoria, int IdModulo, int IdUsuario, String NombreModulo, Blob OldData, Blob NewData, int TipoAccion, Date FechaAccion, int UsuarioAccion, boolean IdEstado) {
        this.idAuditoria = idAuditoria;
        this.IdModulo = IdModulo;
        this.IdUsuario = IdUsuario;
        this.NombreModulo = NombreModulo;
        this.OldData = OldData;
        this.NewData = NewData;
        this.TipoAccion = TipoAccion;
        this.FechaAccion = FechaAccion;
        this.UsuarioAccion = UsuarioAccion;
        this.IdEstado = IdEstado;
    }

    public eeAuditoria() {
    }
    
}
