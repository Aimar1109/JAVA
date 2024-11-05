package TodoCode;

// Son plantillas para las clases.
// Clases abstractas tienen sus variables, pero cada clase solo puede tener un padre
// Interfaces solo tienen metodos, pero cada clase puede implementar todas las interfaces que quieras
public class Cuadrado implements Figura, Dibujable {

    private double lado;

    public Cuadrado() {

    }

    public Cuadrado(double lado, double x, double y) {
        this.lado = lado;
    }

    @Override // Sobreescritura
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un cuadrado");
    }
}
