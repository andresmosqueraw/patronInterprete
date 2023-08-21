// Paso 2. Crear clases concretas para la gramática.
public class Suma implements Expresion {
    private Expresion izquierda;
    private Expresion derecha;

    public Suma(Expresion izquierda, Expresion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    @Override
    public int interpretar() {
        // Suma de dos expresiones
        // (izquierda + derecha)
        // (5 + 3)
        // (8)
        return izquierda.interpretar() + derecha.interpretar();
    }
}
