package org.example;


import java.util.ArrayList;
import java.util.List;

// 1 a 1 Un objeto a una clase
// 1 a N
// N a N Muchos objetos de una clase pueden relacionarse con muchos de otro
public class Main {
    public static void main(String[] args) {
        Auto aut = new Auto();
        aut.setId(1L);
        aut.setMarca("Renault");
        aut.setModelo("Duster");

        List<Propietario> listaPropietarios = new ArrayList<>();
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();

        prop1.setId(35L);
        prop1.setNombre("Aimar");
        prop1.setNombre("Mardones");

        prop2.setId(23L);
        prop2.setNombre("Nagore");
        prop2.setNombre("Saitua");

        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);

        aut.setListaPropietarios(listaPropietarios);

        System.out.println(listaPropietarios.toString());

        System.out.println("El auto " + aut.getMarca() + " " + aut.getModelo() + " que tiene los siguietes " +
                "proietarios " + aut.getListaPropietarios().toString());


    }
}