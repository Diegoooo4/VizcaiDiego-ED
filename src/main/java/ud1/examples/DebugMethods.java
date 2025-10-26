package ud1.examples;

import java.util.Locale;
import java.util.Scanner;

public class DebugMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introdueix dos nombres enters: ");
        int a = in.nextInt();
        int b = in.nextInt();
//nextIntlee el siguiente valor que el usuario escriba y lo convierte en un entero
// Entonces:
//int a = in.nextInt(); → espera que el usuario teclee un número entero y lo guarda en la variable a.
//int b = in.nextInt(); → espera otro número y lo guarda en la variable b.
// es típico en Java cuando se usa la clase Scanner para leer datos desde la entrada estándar (el teclado).
//¿Qué significa?
//in seguramente es un objeto de la clase Scanner, creado así antes:*/
        suma(a, b);
        resta(a, b);
        multiplicacio(a, b);
        divisio(a, b);
    }

    public static void suma(int a, int b) {
        int result = a + b;
        System.out.printf("%d + %d = %d\n", a, b, result);
    }

    public static void resta(int a, int b) {
        int result = a - b;
        System.out.printf("%d - %d = %d\n", a, b, result);
    }

    public static void multiplicacio(int a, int b) {
        int result = a * b;
        System.out.printf("%d * %d = %d\n", a, b, result);
    }

    public static void divisio(int a, int b) {
        int result = a / b;
        System.out.printf("%d / %d = %d\n", a, b, result);
    }
}