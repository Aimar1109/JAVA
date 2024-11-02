package TodoCode;

import java.util.ArrayList;

public class Herencia {
    public static void main(String[] args) {

        Empleado juan = new Empleado();
        ArrayList<Float> notas = new ArrayList<>();
        notas.add(10f);
        notas.add(9f);
        notas.add(8.5f);

        juan.setFullName("aimar", "mardones");
        System.out.println(juan.getFullName());

        Persona aimar = new Persona("aimar", "mardones", 8, "a@gmail.com");
        Empleado juanma = new Empleado(2000d, "ferrovial", "juanma", "mardo", 51, "j@gmail.com");
        Estudiante julen = new Estudiante(notas, "julen", "mard", 16, "j@gmail.com");
        aimar.getFullName();
        juanma.getFullName();
        julen.getFullName();
    }
}
