public class reto05 {
    public static void main(String[] args) {

        // Paso de variable por valor
        int value1 = 1;
        int value2 = value1; // copia el valor de 1

        value2 += 1;

        System.out.println(value1);
        System.out.println(value2);
        
        /*
         * Paso de variables por referencia: en Java no existe el paso por referencia, aunque algo muy similar ocurre
         * con los objetos, ya que se guardan cómo una dirección de memoria y al pasarla cómo parámetro, se envía la
         * dirección de memoria y se trabaja sobre esos datos (lo que significa que cambiamos el objeto al cambiar los
         * datos asociados con una dirección de memoria concreta).
         */

        User user1 = new User("Aimar", 18);
        System.out.println(user1);

        User user2 = user1;
        user2.setNombre("Juanma");
        
        System.out.println(user1);

        user1.setEdad(17);

        System.out.println(user2.getEdad());


        
    }
}

class User {
    String nombre;
    int edad;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    // Constructor
    public User(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Método que se invoca de forma automática al querer mostrar el objeto por consola.
    @Override
    public String toString() {
        return nombre;
    }
}
