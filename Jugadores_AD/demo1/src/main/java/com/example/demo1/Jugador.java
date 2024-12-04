package com.example.demo1;

public class Jugador {

    int id;
    String nombre;
    String equipo;
    int ano;
    String posicion;

    public Jugador(int id, String posicion, int ano, String equipo, String nombre) {
        this.id = id;
        this.posicion = posicion;
        this.ano = ano;
        this.equipo = equipo;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Jugador(){

    }
}
