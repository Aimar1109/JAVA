package reto09;

public class Programador extends Empleado {
    private GerenteDeProyecto jefe = new GerenteDeProyecto();

    public Programador() {

    }

    public Programador(int id, String nombre, GerenteDeProyecto jefe) {
        super(id, nombre);
        this.jefe = jefe;
    }

    public GerenteDeProyecto getJefe() {
        return this.jefe;
    }

    public void setJefe(GerenteDeProyecto jefe) {
        this.jefe = jefe;
    }
}
