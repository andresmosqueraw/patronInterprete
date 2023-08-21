// Paso 2. Crear clases concretas para la gramática.
public class Resta implements Expresion {
    private Expresion izquierda;
    private Expresion derecha;

    public Resta(Expresion izquierda, Expresion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    @Override
    public int interpretar() {
        // Resta de dos expresiones
        // (izquierda - derecha)
        // (5 - 2)
        // (3)
        return izquierda.interpretar() - derecha.interpretar();
    }
}
