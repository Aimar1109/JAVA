package org.example;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle(){};

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje");

    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque arañazo");

    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Squirtle y este es mi ataque modisco");

    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y este es mi ataque hidro bomba");

    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataque burbuja");

    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y este es mi ataque pistola agua");

    }
}
