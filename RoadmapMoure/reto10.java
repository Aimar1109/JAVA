
public class reto10 {
    public static void main(String[] args) {
        try {
            int resultado = 3/0;
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("No se puede dividir por cero!");
        }
        int edades[] = {14, 15, 12, 18};
        try {
            int primero = edades[4];
            System.out.println(primero);
        } catch (Exception e) {
            System.out.println("Index out of range!");
        }

        try{
            System.out.println(positiveDivision(1,-1));
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double positiveDivision(int numerator, int denominator) {
        if (numerator < 0 || denominator < 0) {
            throw new NegativeNumberException("No negativos");
        }
        double result = numerator / denominator;
        return result;

    }

    public static class NegativeNumberException extends RuntimeException {

        public NegativeNumberException(String message) {
            super(message);
        }
    
    }
}