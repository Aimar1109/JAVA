package reto09;

import java.util.ArrayList;

public class reto09 {

    public static void main(String[] args) {

        Programador vectorProgramadors[] = new Programador[4];
        vectorProgramadors[0] = new Programador();
        vectorProgramadors[1] = new Programador();
        vectorProgramadors[2] = new Programador();
        vectorProgramadors[3] = new Programador();

        GerenteDeProyecto vectorGerenteDeProyectos[] = new GerenteDeProyecto[2];
        vectorGerenteDeProyectos[0] = new GerenteDeProyecto();
        vectorGerenteDeProyectos[1] = new GerenteDeProyecto();

        Gerente gerente = new Gerente();
        gerente.setId(1);
        gerente.setNombre("paco");

        vectorGerenteDeProyectos[0].setId(0);
        vectorGerenteDeProyectos[0].setNombre("lukas");

        vectorGerenteDeProyectos[1].setId(1);
        vectorGerenteDeProyectos[1].setNombre("iratxe");

        vectorProgramadors[0].setId(0);
        vectorProgramadors[0].setNombre("juan");

        vectorProgramadors[1].setId(1);
        vectorProgramadors[1].setNombre("nagore");

        vectorProgramadors[2].setId(2);
        vectorProgramadors[2].setNombre("julen");

        vectorProgramadors[3].setId(3);
        vectorProgramadors[3].setNombre("aimar");

        ArrayList<GerenteDeProyecto> gerentesdDeProyectos = new ArrayList<>();
        gerentesdDeProyectos.add(vectorGerenteDeProyectos[0]);
        gerentesdDeProyectos.add(vectorGerenteDeProyectos[1]);
        gerente.setEmpleados(gerentesdDeProyectos);

        ArrayList<Programador> programadores1 = new ArrayList<>();
        programadores1.add(vectorProgramadors[0]);
        programadores1.add(vectorProgramadors[1]);

        vectorGerenteDeProyectos[0].setEmpleados(programadores1);

        ArrayList<Programador> programadores2 = new ArrayList<>();
        programadores2.add(vectorProgramadors[2]);
        programadores2.add(vectorProgramadors[3]);

        vectorGerenteDeProyectos[1].setEmpleados(programadores2);

        System.out.println(vectorProgramadors[0].getJefe().getNombre());
        System.out.println(vectorProgramadors[3].getJefe().getNombre());

        System.out.println(vectorGerenteDeProyectos[0].getJefe().getNombre());

    }
}
