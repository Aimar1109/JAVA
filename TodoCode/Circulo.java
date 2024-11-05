package TodoCode;

public class Circulo implements Figura, Dibujable, Rotable {

    private double radio;

    public Circulo() {

    }

    public Circulo(double radio, double x, double y) {
        this.radio = radio;
    }

    @Override // Sobreescritura
    public double calcularArea() {
        double pi = 3.14d;
        return (radio * radio) * pi;
    }

    @Override
    public void rotar() {
        System.out.println("Hola estoy rotando un circulo");
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un circulo"); 
    }
}
