public class reto02 {
    public static void main(String[] args) {
        // pertenece a la clase general y no a los objetos especificos
        System.out.println("Esta es una funcion estatica que no retorna nada");

        // STATIC
        // sinStatic(); -> ERROR porque al no ser static hay que crear una clase
        reto02 prueba = new reto02();
        prueba.sinStatic();

        conStatic();

        // RETURNS
        int sumar = suma(1, 2);
        System.out.println(sumar);

        boolean mayorDeEdad = mayorEdad(19);
        System.out.println(mayorDeEdad);

        // PRIVATE
        privado();

        // NO se puede crear una funcion dentro de otra

        // Variables locales y globales
        // public static int contador = 0;

        // EXTRA
        int contador;
        contador = extra("hola", "java");
        System.out.println(contador);

    }

    public void sinStatic() {
        System.out.println("Hola");
    }

    public static void conStatic() {
        System.out.println("Hola java");
    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static boolean mayorEdad(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    private static void privado() {
        System.out.println("privado");
    }

    public static void global() {
        System.out.println("");
    }

    public static int extra(String string1, String string2) {
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(string1 + " " + string2);
            } else if (i % 3 == 0) {
                System.out.println(string1);
            } else if (i % 5 == 0) {
                System.out.println(string2);
            } else {
                System.out.println(i);
                contador++;
            }
        }
        return contador;
    }
}
