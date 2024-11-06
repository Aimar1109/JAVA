package TodoCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Listas {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>(); 
        // Solo se pueden agregar elementos al final pero cada elemento tiene un indice
        array.add("hola");
        
        System.out.println(array.get(0));
        List<String> linked = new LinkedList<>(); 
        // Todos estan relacionados por punteros, puedes agregar elementos alfinal y alprincipio
        // cada elemento no tiene ningun indice por lo que tienes que hacer un foreach
        linked.add("que");
        linked.add(0, "tal");
        System.out.println(linked.get(0));


        Map<Integer,String> mapaEmpleados = new HashMap<>();
        // Lo que en python seria un diccionario, el cual funciona con clave: valor
        mapaEmpleados.put(1523, "Juan");
        mapaEmpleados.put(1524, "Nagore");
        mapaEmpleados.put(1525, "Julen");
        mapaEmpleados.put(1526, "Aimar");
        mapaEmpleados.put(1527, "Juanma");

        System.out.println(mapaEmpleados.get(1523));
        System.out.println(mapaEmpleados.keySet());
        System.out.println(mapaEmpleados.values());

    }
}
