package org.example;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu(){};

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");

    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque arañazo");

    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco");

    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque impact trueno");

    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque puño trueno");

    }
}
