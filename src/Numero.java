// Paso 2. Crear clases concretas para la gramática.
public class Numero implements Expresion {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int interpretar() {
        return numero;
    }
}
