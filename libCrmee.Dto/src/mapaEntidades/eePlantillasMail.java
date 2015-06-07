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
public class eePlantillasMail {
    private int IdPlantillasMail;
    private String Nombre;
    private String Descripcion;
    private String ContenidoPlantilla;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdPlantillasMail
     */
    public int getIdPlantillasMail() {
        return IdPlantillasMail;
    }

    /**
     * @param IdPlantillasMail the IdPlantillasMail to set
     */
    public void setIdPlantillasMail(int IdPlantillasMail) {
        this.IdPlantillasMail = IdPlantillasMail;
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
     * @return the ContenidoPlantilla
     */
    public String getContenidoPlantilla() {
        return ContenidoPlantilla;
    }

    /**
     * @param ContenidoPlantilla the ContenidoPlantilla to set
     */
    public void setContenidoPlantilla(String ContenidoPlantilla) {
        this.ContenidoPlantilla = ContenidoPlantilla;
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

    public eePlantillasMail(int IdPlantillasMail, String Nombre, String Descripcion, String ContenidoPlantilla, boolean IdEstado, Date FechaCreacion) {
        this.IdPlantillasMail = IdPlantillasMail;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.ContenidoPlantilla = ContenidoPlantilla;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eePlantillasMail() {
    }
}
