package ud1.examples;

import java.util.Locale;
import java.util.Scanner;

    public class DebugVariables {
        public static void main(String[] args) {
            //El scanner sirve para introducir los números en pantalla*/
            Scanner in = new Scanner(System.in).useLocale(Locale.US);
            //Esto es para introducir por pantalla el mensaje del scanner para introducir el num*/
            System.out.print("Introdueix el primer número: ");
            int x = in.nextInt();
            System.out.print("Introdueix el segon número: ");
            int y = in.nextInt();
//Esto son todos los tipos de combinaciones de operaciones*/
            int s = x + y;
            int r = x - y;
            int m = x * y;
            int d = x / y;
            int mod = x % y;
//El %d significa como int es decir que es un número entero, pero para lo que sirve este comando es para hacer la operación de arriba
// Luego en el final que pone x y r sirve para cambiar el resultado del %d y que salga por pantalla y que tu puedas poner cualquier numero
// Y tambien todos los %d como están entre comillas sirve para que se muestren por pantalla y salga asi la operación*/
            System.out.printf("%d + %d = %d\n", x, y, s);
            System.out.printf("%d - %d = %d\n", x, y, r);
            System.out.printf("%d * %d = %d\n", x, y, m);
            System.out.printf("%d / %d = %d\n", x, y, d);
            System.out.printf("%d %% %d = %d\n", x, y, mod);
//Esto sirve para decir si es verdadero o falso (boolean) por ejemplo si x en 4 e y es 7 saldra falso porq
// y es mayor que x y en la operación pone que x tiene que ser mayor que y
// La otra operación es para sacar el resto de la division de arriva si es par sale 0 true y si no sale 1 false
// Boolean sirve para decir si te sale verdadero o false*/
            boolean b1 = x > y;
            boolean b2 = y % 2 == 0;
//Esto es igual que lo que hemos explicado antes y int solo te sacara un numero entero
// El porcentaje s es un string una cadena de caracteres*/
            System.out.printf("%d > %d = %s\n", x, y, b1);
            System.out.printf("%d %% 2 == 0 = %s\n", y, b2);
//Esto es para sacar lo de NOT AND OR XOR(esta ordenado igual que abajo)*/
            boolean n = !b1;
            boolean a = b1 && b2;
            boolean o = b1 || b2;
            boolean xo = b1 ^ b2;
//%s → convierte el valor que se le pase en cadena de texto(abajo) y lo imprime.
//b1 y n son las variables cuyos valores se van a colocar en lugar de esos %s.
//El primer %s se reemplaza por el primer valor (b1).
//El segundo %s se reemplaza por el segundo valor (n).
//\n → hace un salto de línea al final.
// Dependiendo de cada operación si sale 0 es false y si sale 1 es true*/
            System.out.printf("!%s = %s\n", b1, n);
            System.out.printf("%s && %s = %s\n", b1, b2, a);
            System.out.printf("%s || %s = %s\n", b1, b2, o);
            System.out.printf("%s ^ %s = %s\n", b1, b2, xo);
        }
    }
