package reto09;

import java.util.ArrayList;

public class GerenteDeProyecto extends Empleado {

    private Gerente jefe = new Gerente();
    private ArrayList<Programador> empleados = new ArrayList<>();

    public GerenteDeProyecto() {

    }

    public GerenteDeProyecto(int id, String nombre, ArrayList<Programador> empleados, Gerente jefe) {
        super(id, nombre);
        this.empleados = empleados;
        this.jefe = jefe;
    }

    public ArrayList<Programador> getEmpleados() {
        return this.empleados;
    }

    public void setEmpleados(ArrayList<Programador> empleados) {
        for (int i = 0; i < empleados.size(); i++) {
            Programador empleado = empleados.get(i);
            empleado.setJefe(this);
        }
        this.empleados = empleados;
    }

    public Gerente getJefe() {
        return this.jefe;
    }

    public void setJefe(Gerente jefe) {
        this.jefe = jefe;
    }
}
