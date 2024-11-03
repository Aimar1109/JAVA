package reto09;

import java.util.ArrayList;

public class Gerente extends Empleado {

    private ArrayList<GerenteDeProyecto> empleados = new ArrayList<>();

    public Gerente() {

    }

    public Gerente(int id, String nombre, ArrayList<GerenteDeProyecto> empleados) {
        super(id, nombre);
        this.empleados = empleados;
    }

    public ArrayList<GerenteDeProyecto> getEmpleados() {
        return this.empleados;
    }

    public void setEmpleados(ArrayList<GerenteDeProyecto> empleados) {
        for (int i = 0; i < empleados.size(); i++) {
            GerenteDeProyecto empleado = empleados.get(i);
            empleado.setJefe(this);
        }
        this.empleados = empleados;
    }
}
