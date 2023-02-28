package Clases;

import java.util.Date;

public class Vuelo implements Comparable<Vuelo>{
    private String nombre, origen, destino;
    private Date fechallegada;
    private int numPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechallegada, int numPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechallegada = fechallegada;
        this.numPasajeros = numPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechallegada() {
        return fechallegada;
    }

    public void setFechallegada(Date fechallegada) {
        this.fechallegada = fechallegada;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fechallegada=" + fechallegada +
                ", numPasajeros=" + numPasajeros +
                "}";
    }

    @Override
    public int compareTo(Vuelo v) {
        if(v == null){ return 1;}
        else{ return getFechallegada().compareTo(v.getFechallegada());}
    }
}