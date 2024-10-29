public class reto06 {

    public static void main(String[] args) {
        recursiva(100);
    }

    public static void recursiva(int num) {
        System.out.println(num);
        if (num > 1) {
            recursiva(num-1);
        }
    }

    public static void factorial() {
        
    }
}