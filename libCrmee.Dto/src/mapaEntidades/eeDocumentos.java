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
public class eeDocumentos {
    private int IdDocumentos;
    private String Nombre;
    private Blob Documento;
    private int TipoDocumento;
    private String extension;
    private String Observaciones;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdDocumentos
     */
    public int getIdDocumentos() {
        return IdDocumentos;
    }

    /**
     * @param IdDocumentos the IdDocumentos to set
     */
    public void setIdDocumentos(int IdDocumentos) {
        this.IdDocumentos = IdDocumentos;
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
     * @return the Documento
     */
    public Blob getDocumento() {
        return Documento;
    }

    /**
     * @param Documento the Documento to set
     */
    public void setDocumento(Blob Documento) {
        this.Documento = Documento;
    }

    /**
     * @return the TipoDocumento
     */
    public int getTipoDocumento() {
        return TipoDocumento;
    }

    /**
     * @param TipoDocumento the TipoDocumento to set
     */
    public void setTipoDocumento(int TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    /**
     * @return the extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * @param extension the extension to set
     */
    public void setExtension(String extension) {
        this.extension = extension;
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

    public eeDocumentos(int IdDocumentos, String Nombre, Blob Documento, int TipoDocumento, String extension, String Observaciones, boolean IdEstado, Date FechaCreacion) {
        this.IdDocumentos = IdDocumentos;
        this.Nombre = Nombre;
        this.Documento = Documento;
        this.TipoDocumento = TipoDocumento;
        this.extension = extension;
        this.Observaciones = Observaciones;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeDocumentos() {
    }
}
