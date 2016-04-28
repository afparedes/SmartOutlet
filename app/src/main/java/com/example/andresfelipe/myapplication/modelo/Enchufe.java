package com.example.andresfelipe.myapplication.modelo;

/**
 * Created by AndresFelipe on 27/04/2016.
 */
public class Enchufe {
    private int id;
    private boolean estado;
    private String consumo;
    private String urlConsumo;
    private String urlEstado;

    public Enchufe(){

    }
    public void Encender(){

    }
    public void Apagar(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getUrlConsumo() {
        return urlConsumo;
    }

    public void setUrlConsumo(String urlConsumo) {
        this.urlConsumo = urlConsumo;
    }

    public String getUrlEstado() {
        return urlEstado;
    }

    public void setUrlEstado(String urlEstado) {
        this.urlEstado = urlEstado;
    }
}
