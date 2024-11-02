import java.util.ArrayList;
import java.util.Stack;

public class reto08 {
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.addPila("A");
        pila.addPila("B");
        pila.addPila("C");
        pila.popPila();
        System.out.println(pila.getPila());

        Cola cola = new Cola();
        cola.addCola("1");
        cola.addCola("2");
        cola.addCola("3");
        cola.popCola();
        System.out.println(cola.getCola());
    }
}

class Pila {
    Stack<String> lista = new Stack<>();

    // Constructor
    public Pila() {
    }

    public void addPila(String object) {
        this.lista.add(object);
    }

    public void popPila() {
        this.lista.pop();
    }

    public Stack<String> getPila() {
        return this.lista;
    }
}

class Cola {
    Stack<String> lista = new Stack<>();

    // Constructor
    public Cola() {
    }

    public void addCola(String object) {
        this.lista.add(object);
    }

    public void popCola() {
        this.lista.pop();
    }

    public Stack<String> getCola() {
        return this.lista;
    }
}