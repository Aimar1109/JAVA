package TodoCode;

public class Encapsulamiento {

    public static void main(String[] args) {
        // Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(15, "Aimar", "Mardones");

        System.out.println("id: " + alu2.getId());
        System.out.println("nombre: " + alu2.getNombre());
        System.out.println("apellido: " + alu2.getApellido());

    }
}
