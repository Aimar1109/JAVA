import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reto07 {
    public static void main(String[] args) {
        // PILAS Y COLAS

        // Pilas -> LIFO (Last In, First out)
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(3);
        pila.push(2);

        System.err.println(pila);

        // System.out.println(pila.remove(0)); -> lo permite porque stack extiende la clase vector
        // ver el ultimo elemento
        System.out.println(pila.peek());
        // ver el ultimo elemento y eliminirlo
        System.out.println(pila.pop());
        // ver pila despues de eliminar el ultimo elemento
        System.out.println(pila);


        // Colas -> FIFO (First In, First out)
        Queue<String> cola = new ArrayDeque<>();
        cola.add("aimar");
        cola.add("julen");
        cola.add("juanma");
        cola.add("nagore");
        
        System.out.println(cola);

        // ver primer elemento sin eliminarlo
        System.out.println(cola.peek());
        // ver el primer elemento y eliminarlo
        System.out.println(cola.poll());
        System.out.println(cola);
        
        Scanner scanner = new Scanner(System.in);
        buscador(scanner);
        System.out.println();
        impresora(scanner);

    }

    public static void buscador(Scanner scanner) {
        Stack<String> pila = new Stack<>();
        Stack<String> pila2 = new Stack<>();

        boolean exit = false;
        String pagina;

        while (!exit) {
            System.out.print("\nDirigete a la siguiente pagina o forward o backward o exit: ");
            pagina = scanner.next();
            if (pagina.equals("exit")) {
                exit = true;
                continue;
            } else if (pagina.equals("forward")) {
                if (pila2.isEmpty()) {
                    System.out.println("No hay paginas posteriores");
                } else {
                    pila.push(pila2.pop());
                    System.out.println(pila);
                    System.out.println("Visualizando la pagina: "+pila.peek());
                }
                continue;
            } else if (pagina.equals("backward")) {
                if (pila.isEmpty()) {
                    System.out.println("No hay paginas anteriores");
                } else {
                    pila2.add(pila.pop());
                    System.out.println(pila);
                    System.out.println("Visualizando la pagina: "+pila.peek());
                }
                continue;
            }
            pila2.clear();
            pila.push(pagina);
            System.out.println(pila);            
            System.out.println("Visualizando la pagina: "+pila.peek());
        }
    }

    public static void impresora(Scanner scanner) {
        Queue<String> cola = new ArrayDeque<>();
        boolean exit = false;
        int menu;
        String archivo;

        while (!exit) {
            System.out.print("\nIMPRRESORA:"+
                                "\n1) Agregar archivo"+
                                "\n2) Imprimir archivo"+
                                "\n3) Imprimir todo"+
                                "\n4) Borrar archivo" +
                                "\n5) Borrar todo" +
                                "\n6) Exit"+
                                "\nQue quieres hacer: "
                                );
            menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("Nombre del archivo: ");
                archivo = scanner.next();
                cola.add(archivo);
                System.out.println(archivo + " añadido a la lista de la impresora.");
            } else if (menu == 2) {
                archivo = cola.poll();
                System.out.println(archivo + " ha sido impreso.");
            } else if (menu == 3) {
                System.out.println(cola + " han sido impresos.");
                cola.clear();
            } else if (menu == 4) {
                archivo = cola.poll();
                System.out.println(archivo + " ha sido eliminado.");
            } else if (menu == 5) {
                System.out.println(cola + " han sido eliminados.");
                cola.clear();
            } else {
                exit = true;
                continue;
            }
            System.out.println(cola);

        }
    }
}
