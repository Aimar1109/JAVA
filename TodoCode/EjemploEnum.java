public class EjemploEnum {

    enum Color {
        ROJO, AZUL, VERDE, NARANJA, NEGRO, BLANCO
    }

    public static void main(String[] args) {

        Color color = Color.ROJO;

        System.out.println(color);

        for (Color c : Color.values()) {
            System.out.println(c);
        }
    }
}
