package TodoCode;

import java.util.ArrayList;

public class Estudiante extends Persona {

    ArrayList<Float> notas = new ArrayList<>();

    public Estudiante() {
    }

    public Estudiante(ArrayList<Float> notas, String name, String surname, int age, String email) {
        super(name, surname, age, email);
        this.notas = notas;
    }

    public void addMark(Float mark) {
        this.notas.add(mark);
    }

    public ArrayList<Float> getNotas() {
        return this.notas;
    }

    public Float mediaNotas() {
        if (!this.notas.isEmpty()) {
            Float suma = 0f;
            for (int i = 0; i < notas.size(); i++) {
                suma += notas.get(i);
            }
            return suma / notas.size();
        } else {
            return 0f;
        }
    }
}
