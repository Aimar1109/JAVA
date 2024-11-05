package reto11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {
        
        Producto lista[] = new Producto[5];

        lista[0] = new Producto(0, "Agua", 0, 1.15d);
        lista[1] = new Producto(1, "Pan", 0, 1d);
        lista[2] = new Producto(2, "Pasta", 0, 2.5d);
        lista[3] = new Producto(3, "Arroz", 0, 1.75d);
        lista[4] = new Producto(4, "Sal", 0, 0.5d);

        Path path = Path.of("tienda.txt");

        try {
            path = Files.createFile(path);
            for (int i = 0; i < lista.length; i++) {
                appendProducto(path, lista[i]);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }

        Scanner scanner = new Scanner(System.in);

        Producto azucar = new Producto(5, "Azucar", 0,3.25d);
        appendProducto(path, azucar);

        // System.out.println(buscarProducto(path, "Azucar").getNombre());
        
        actualizarProducto(path, "Agua", scanner);
        // actualizarProducto(path, "Pan", scanner);
        // actualizarProducto(path, "Pasta", scanner);
        // actualizarProducto(path, "Arroz", scanner);
        // actualizarProducto(path, "Sal", scanner);

        eliminarProducto(path, "Azucar");

        System.out.println(ventaTotal(path));

        File hola = path.toFile();
        hola.delete();
    }

    public static void appendProducto(Path path, Producto producto) {
        try {
            Files.writeString(path, producto.getFraseTodo()+"\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static Producto buscarProducto(Path path, String nombre) {
        String[] linea_producto;
        
        try (BufferedReader lector = new BufferedReader(new FileReader("tienda.txt"))) {
            String linea;
            while ((linea = lector.readLine())!= null) {
                linea_producto = linea.split(", ");
                if (nombre.equals(linea_producto[1])) {
                    Producto producto = new Producto(Integer.parseInt(linea_producto[0]), linea_producto[1], Integer.parseInt(linea_producto[2]), Double.parseDouble(linea_producto[3]));
                    return producto;
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        return new Producto();
    }

    public static void actualizarProducto(Path path, String nombre, Scanner scanner) {

        System.out.println(nombre.toUpperCase()+":");

        System.out.print("Que quieres actualizar la cantidad vendida o el precio o las dos: ");
        String opcion = scanner.next();
        
        Producto producto = buscarProducto(path, nombre);

        if (opcion.equals("cantidad")) {
            System.out.print("Cuantos " + nombre.toLowerCase() +" se han vendido: ");
            int cantidad = Integer.parseInt(scanner.next());
            producto.setCantidad(cantidad);
        } else if (opcion.equals("precio")){
            System.out.print("Cual es el precio de " + nombre.toLowerCase() +": ");
            Double precio = Double.parseDouble(scanner.next());
            producto.setPrecio(precio);
        } else {
            System.out.print("Cuantos " + nombre.toLowerCase() +" se han vendido: ");
            int cantidad = Integer.parseInt(scanner.next());
            producto.setCantidad(cantidad);
            System.out.print("Cual es el precio de " + nombre.toLowerCase() +": ");
            Double precio = Double.parseDouble(scanner.next());
            producto.setPrecio(precio);
        }

        List<String> archivo = extraerContenido(path);

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("tienda.txt"))) {
            for (String linea : archivo) {
                String[] linea_comp = linea.split(", ");
                if (Integer.parseInt(linea_comp[0]) == producto.getId()) {
                    linea = producto.getFraseTodo();
                }
                escritor.write(linea);
                escritor.newLine();
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    public static void eliminarProducto(Path path, String nombre) {
        List<String> archivo = extraerContenido(path);

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("tienda.txt"))) {
            for (String linea : archivo) {
                String[] nombre_comp = linea.split(", ");
                if (nombre.equals(nombre_comp[1])) {
                    continue;
                }
                escritor.write(linea);
                escritor.newLine();
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static List<String> extraerContenido(Path path) {
        List<String> archivo = new ArrayList<>();

        try ( BufferedReader lector = new BufferedReader(new FileReader("tienda.txt")) ) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                archivo.add(linea);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        return archivo;
    }

    public static Double ventaTotal(Path path) {
        List<String> archivo = extraerContenido(path);
        Producto productos[] = new Producto[5];
        for (int i = 0; i < archivo.size(); i++) {
            String[] linea = archivo.get(i).split(", ");
            productos[i] = buscarProducto(path, linea[1]);
        }
        double total = 0d;
        for (int i = 0; i < productos.length; i++) {
            total += productos[i].getVenta();
        }
        return total;
    }
}
