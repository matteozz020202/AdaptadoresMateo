package com.example.adaptadoresmateo.clases;

public class Moto {
    String imagen;
    String modelo;
    String year;
    String valor;

    public Moto(String imagen, String modelo, String year, String valor) {
        this.imagen = imagen;
        this.modelo = modelo;
        this.year = year;
        this.valor = valor;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
