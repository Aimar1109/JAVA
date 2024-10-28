// https://www.java.com/es/

public class reto00 {

    public static void main(String[] args) {
        // Comentario de una linea
        /*
         * Comentario en varias lineas
         */
        // VARIABLES
        String holaMundo = "Hola, mundo!";
        final int constanteEdad = 18;
        // Variables primitivas
        char caracter = 'a'; // Caracter solo uno
        int entero = 1; // Numero entero
        float decimal = 1.33f; // Un decimal(32bits)
        boolean buleano = true; // True o False
        double decimalLargo = 1.333d; // Un decimal(64bits)
        byte numero_8bits = 127; // 8 bites de -128 a 127
        short numero_16bits = 32767; // 16 bites hasta 32767
        long numero_64bits = 23; // 64 bits de numero entero
        // String es un clase que consiste en una cadena de caracteres
        String holaJava = "Hola, Java!";

        System.out.println(holaJava);
        System.out.println(holaMundo + caracter + entero + decimal + buleano + decimalLargo + numero_16bits
                + numero_64bits + numero_8bits + constanteEdad);
    }

}
