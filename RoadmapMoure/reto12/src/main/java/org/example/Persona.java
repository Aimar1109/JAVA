package org.example;

import org.json.JSONArray;

public class Persona {
    private String nombre;
    private Integer edad;
    private String nacimiento;
    private JSONArray lenguajes = new JSONArray();

    public Persona(){}

    public Persona(String nombre, Integer edad, String nacimiento, JSONArray lenguajes) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.lenguajes = lenguajes;
    }


    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setLenguajes(JSONArray lenguajes) {
        this.lenguajes = lenguajes;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public JSONArray getLenguajes() {
        return lenguajes;
    }

}
