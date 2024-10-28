public class reto01 {

    public static void main(String[] args) {
        // Operadores
        int suma = 3 + 3;
        int resta = 3 - 1;
        int multiplicacion = 3 * 4;
        float division = 5 / 2;
        int modulo = 5 % 2; // Deja el resto de la division
        // A todos se les puede poner = para que lo haga con la propia varible
        suma %= 4;
        boolean and = true && false; // AND
        boolean or = false || false; // OR
        for (int i = 10; i <= 55; i++) {
            if ((i % 2 == 0) && (i != 16) && (i % 3 != 0)) {
                System.out.println(i);
            }

            System.out.println(suma + resta + multiplicacion + division + modulo);
            System.out.println(and);
            System.out.println(or);
        }
    }
}
