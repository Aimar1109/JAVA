import java.util.Arrays;

public class reto04 {
    public static void main(String[] args) {
        String java = "Java";
        String python = "Python";
        System.out.println(String.format("Se programr en %s y %s", java, python));
        System.out.println(java.equals(python));
        String[] letras = java.split("");
        for (String letra : letras) {
            System.out.println(letra);
        }
        System.out.println(letras[0]);
        System.out.println(java.indexOf("a"));
        System.out.println(java.substring(0, 2));
        System.out.println(java.trim()); // Borra los espacios en blanco al inicio y al final
        System.out.println(java.length());
        System.out.println(java.charAt(0));
        System.out.println(java.hashCode());
        System.out.println(java.codePointAt(1));
        System.out.println(java.compareTo("av"));
        System.out.println(java.concat(python));
        System.out.println(java.repeat(2));
        System.out.println(java.replace("av", "py"));
        System.out.println(polindronos("raddar"));
        System.out.println(anagramas("amor", "roma"));
        System.out.println(isograma("dientes"));
    }

    public static boolean polindronos(String palabra) {
        String[] letras = palabra.split("");
        int mitad = palabra.length() / 2;
        for (int i = 0; i < mitad; i++) {
            System.out.println(i);
            if (!letras[i].equals(letras[((palabra.length() - 1) - i)])) {
                return false;
            }
        }
        return true;
    }

    public static boolean anagramas(String palabra1, String palabra2) {
        if (palabra1.length() != palabra2.length()) {
            return false;
        }
        char[] letras1 = palabra1.toCharArray();
        char[] letras2 = palabra2.toCharArray();
        Arrays.sort(letras1);
        Arrays.sort(letras2);
        if (Arrays.equals(letras1, letras2)) {
            return true;
        }
        return false;
    }

    public static boolean isograma(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            for (int x = i + 1; x < palabra.length(); x++) {
                if (palabra.charAt(i) == palabra.charAt(x)) {
                    return false;
                }
            }
        }
        return true;
    }
}