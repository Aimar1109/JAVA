package TodoCode;

public class Empleado extends Persona {
    Double salario;
    String empresa;

    public Empleado() {
    }

    public Empleado(Double salario, String empresa, String name, String surname, int age, String email) {
        super(name, surname, age, email);
        this.salario = salario;
        this.empresa = empresa;
    }

    public Double getSalario() {
        return this.salario;
    }
}