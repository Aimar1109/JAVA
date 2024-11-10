package org.example;

public class Charmander extends Pokemon implements IFuego{

    public Charmander(){};

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque arañazo");

    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque mordisco");

    }

    @Override
    public void atacarPuniooFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque puño fuego");

    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola soy Charmander y este es mi ataque lanza llamas");

    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque ascuas");

    }
}
