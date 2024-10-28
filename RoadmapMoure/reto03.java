import java.util.*;

public class reto03 {
    public static void main(String[] args) {
        // Lista
        // Coleccion ordenada, permite duplicados y acceso posicional
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("Python");
        System.out.println(lista);
        System.out.println(lista.get(0));

        // Set
        // Coleccion que no permite duplicados
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Rojo");
        conjunto.add("Verde");
        conjunto.add("Verde");
        System.out.println(conjunto);

        // Map
        // Lo que seria un diccionario en python, clave unica
        HashMap<String, Long> mapa = new HashMap<>();
        mapa.put("uno", 1L);
        mapa.put("dos", 2L);
        System.out.println(mapa);
        System.out.println(mapa.get("uno"));

        // Cola(Queue)
        // Una colección que opera bajo el principio de "primero en entrar, primero en
        // salir" (FIFO).
        Queue<String> cola = new LinkedList<>();
        cola.add("Primero");
        cola.add("Segundo");
        System.out.println(cola.element());
        System.out.println(cola);

        agendaContactos();
    }

    public static void agendaContactos() {
        HashMap<String, Long> contactos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean display = true;

        while (display) {
            int operacion = menu(scanner);
            contactos = selector(contactos, operacion, scanner);
            display = continuar(scanner);
        }
    }

    public static int menu(Scanner scanner) {
        System.out.println("MENU:");
        System.out.println("1) Buscar contacto.");
        System.out.println("2) Insertar contacto.");
        System.out.println("3) Actualizacion de contacto");
        System.out.println("4) Eliminacion de contacto");
        System.out.println("Que operacion quieres realizar: ");
        int operacion = scanner.nextInt();
        return operacion;
    }

    public static HashMap<String, Long> selector(HashMap<String, Long> contactos, int operacion, Scanner scanner) {
        switch (operacion) {
            case 1:
                busqueda(contactos, scanner);
                break;
            case 2:
                contactos = insertarContacto(contactos, scanner);
                break;
            case 3:
                contactos = actualizacion(contactos, scanner);
                break;
            case 4:
                contactos = eliminacion(contactos, scanner);
                break;
        }

        return contactos;
    }

    // BUSQUEDA
    public static Long busqueda(HashMap<String, Long> contactos, Scanner scanner) {
        System.out.println("Introduce el nombre del contacto:");
        String nombre = scanner.next();
        Long numero = contactos.get(nombre);
        System.out.println("El numero de " + nombre + " es: " + numero);
        return numero;
    }

    // AÑADIR CONTACTO
    public static HashMap<String, Long> insertarContacto(HashMap<String, Long> contactos, Scanner scanner) {
        System.out.println("Introduce el nombre del contacto que quieres añadir: ");
        String nombre = scanner.next();
        System.out.println("Introduce el numero de telefono de " + nombre + ":");
        Long numeroTelefono = scanner.nextLong();

        contactos.put(nombre, numeroTelefono);
        return contactos;
    }

    // ACTUALIZAR CONTACTO
    public static HashMap<String, Long> actualizacion(HashMap<String, Long> contactos, Scanner scanner) {
        System.out.println("Introduce el nombre del contacto que quieres actualizar:");
        String nombre = scanner.next();
        Long numero = contactos.get(nombre);
        System.out.println("El numero de " + nombre + " es: " + numero);
        System.out.println("Introduce el nuevo numero de " + nombre + ":");
        Long numeroTelefono = scanner.nextLong();
        contactos.put(nombre, numeroTelefono);
        System.out.println("El numero de " + nombre + " ahora es: " + numeroTelefono);
        return contactos;
    }

    // ELIMINAR CONTACTO
    public static HashMap<String, Long> eliminacion(HashMap<String, Long> contactos, Scanner scanner) {
        System.out.println("Introduce el nombre del contacto que quieres eliminar:");
        String nombre = scanner.next();
        System.out
                .println("El contacto " + nombre + " con el numero " + contactos.get(nombre) + ", ha sido eliminado.");
        contactos.remove(nombre);
        return contactos;
    }

    // CONTINUAR
    public static boolean continuar(Scanner scanner) {
        System.out.println("Quieres continuar haciendo operaciones(si/no): ");
        String respuesta = scanner.next();
        if (respuesta.equals("si")) {
            System.out.println(respuesta);
            return true;
        } else {
            return false;
        }
    }
}
