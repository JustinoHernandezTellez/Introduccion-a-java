import java.util.EmptyStackException;

class Nodo<T> {
    T dato;
    Nodo<T> siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class Pila<T> {
    private Nodo<T> tope;

    public Pila() {
        this.tope = null;
    }

    public void push(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        nuevoNodo.siguiente = tope;
        tope = nuevoNodo;
    }

    public T pop() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        T valor = tope.dato;
        tope = tope.siguiente;
        return valor;
    }

    public T peek() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        return tope.dato;
    }

    public boolean estaVacia() {
        return tope == null;
    }
}
public class pila {
    public static void main(String[] args) {
        Pila<Integer> miPila = new Pila<>();

        miPila.push(10);
        miPila.push(20);
        miPila.push(30);

        System.out.println("Elemento en el tope: " + miPila.peek());
        System.out.println("Extrayendo: " + miPila.pop());
        System.out.println("Nuevo tope: " + miPila.peek());
    }
}

