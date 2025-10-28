package ud2.exercises;
import java.util.Scanner;
import java.util.Locale;

public class Basic0perations {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in).useLocale(Locale.US);
            System.out.print("Dime el primer número: ");
            int a = in.nextInt();
            System.out.print("Dime el segundo número: ");
            int b = in.nextInt();

            int suma = a + b;
            System.out.print("Suma: "+suma);
    }
}

