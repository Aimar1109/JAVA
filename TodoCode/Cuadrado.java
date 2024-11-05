package TodoCode;

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
