/* El patrón de diseño Intérprete se utiliza para definir una
representación gramatical para un lenguaje y proporcionar un
intérprete para esta gramática. Es especialmente útil para
trabajar con lenguajes y procesadores de lenguaje.

Vamos a comenzar con un ejemplo simple para interpretar una
expresión aritmética básica. Supongamos que sólo queremos
interpretar sumas y restas de números enteros.
 */

/* Paso 1. Esta interfaz define un método interpretar() que es implementado
por todas las clases concretas que representan la gramática. */

public interface Expresion {
    // Método que interpreta la expresión
    // y devuelve el resultado de la misma
    // (en este caso, un entero)
    int interpretar();
}
