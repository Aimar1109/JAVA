public class reto06 {

    public static void main(String[] args) {
        recursiva(100);
        System.out.println(factorial(5));
        System.out.println(fibonacci(11));

    }

    public static void recursiva(int num) {
        System.out.println(num);
        if (num > 1) {
            recursiva(num - 1);
        }
    }

    public static int factorial(int num) {
        int total;
        if (num > 0) {
            return total = num * factorial(num - 1);
        } else {
            return 1;
        }
    }

    public static int fibonacci(int pos) {
        /*
         * int num_bef = 0;
         * int num = 1;
         * int pasar;
         */
        if (pos <= 1) {
            return pos;
        } else {
            // MANERA CUTRE

            /*
             * for (int i = 2; i <= pos; i++) {
             * pasar = num;
             * num += num_bef;
             * num_bef = pasar;
             * }
             */

            return fibonacci(pos - 1) + fibonacci(pos - 2);
        }
        // return num;
    }

}