import java.util.Scanner;
import java.util.Stack;

// Paso 3: Usar las clases que creamos
public class InterpreteDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su expresion (ejemplo: 5 + 3 - 2):");
        String input = scanner.nextLine();

        Expresion expresion = parse(input);
        int resultado = expresion.interpretar();
        System.out.println("Resultado: " + resultado);
    }

    // Método que recibe una expresión en notación polaca inversa
    // y devuelve un objeto Expresion que representa dicha expresión
    // (en este caso, un árbol de expresiones)
    public static Expresion parse(String s) {
        // Dividimos la expresión en tokens
        // (en este caso, en números y operadores)
        String[] tokens = s.split(" ");
        // Creamos una pila para ir guardando las expresiones
        // (en este caso, los números y operadores)
        // a medida que los vamos interpretando
        Stack<Expresion> stack = new Stack<>();

        // Recorremos los tokens
        // (en este caso, los números y operadores)
        // y vamos creando el árbol de expresiones
        // (en este caso, las sumas y restas)
        // a medida que los vamos interpretando
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                // Incrementamos i para movernos al próximo número
                i++;
                // Creamos la expresión de la suma
                Expresion rightSum = new Numero(Integer.parseInt(tokens[i]));
                Expresion leftSum = stack.pop();
                stack.push(new Suma(leftSum, rightSum));
            } else if (tokens[i].equals("-")) {
                // Incrementamos i para movernos al próximo número
                i++;
                // Creamos la expresión de la resta
                Expresion rightSub = new Numero(Integer.parseInt(tokens[i]));
                Expresion leftSub = stack.pop();
                stack.push(new Resta(leftSub, rightSub));
            } else {
                // Creamos la expresión del número
                // y la agregamos a la pila
                // (en este caso, el número)
                stack.push(new Numero(Integer.parseInt(tokens[i])));
            }
        }

        // Al finalizar, la pila debería tener un único elemento
        // que es la expresión completa
        // (en este caso, el árbol de expresiones completo)
        // que devolvemos
        return stack.pop();
    }
}


/* Este es un ejemplo básico. En la vida real, este patrón puede
 ser bastante complejo, especialmente cuando se trata de interpretar
 lenguajes con una gramática amplia. Sin embargo, el principio es el mismo:
 descomponer el problema en partes más pequeñas, donde cada parte del
 lenguaje tiene su propia clase de intérprete. */