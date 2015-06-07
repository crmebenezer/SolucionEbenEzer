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
public class eeTipoMoneda {
    private int IdTipoMoneda;
    private String Nombre;
    private String Descripcion;
    private float Valor;
    private float ValorDolar;
    private boolean IdEstado;
    private Date FechaCreacion;

    /**
     * @return the IdTipoMoneda
     */
    public int getIdTipoMoneda() {
        return IdTipoMoneda;
    }

    /**
     * @param IdTipoMoneda the IdTipoMoneda to set
     */
    public void setIdTipoMoneda(int IdTipoMoneda) {
        this.IdTipoMoneda = IdTipoMoneda;
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
     * @return the Valor
     */
    public float getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the ValorDolar
     */
    public float getValorDolar() {
        return ValorDolar;
    }

    /**
     * @param ValorDolar the ValorDolar to set
     */
    public void setValorDolar(float ValorDolar) {
        this.ValorDolar = ValorDolar;
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

    public eeTipoMoneda(int IdTipoMoneda, String Nombre, String Descripcion, float Valor, float ValorDolar, boolean IdEstado, Date FechaCreacion) {
        this.IdTipoMoneda = IdTipoMoneda;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Valor = Valor;
        this.ValorDolar = ValorDolar;
        this.IdEstado = IdEstado;
        this.FechaCreacion = FechaCreacion;
    }

    public eeTipoMoneda() {
    }
}
