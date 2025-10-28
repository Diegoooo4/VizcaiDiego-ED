package ud2.exercises;
import java.util.Scanner;
import java.util.Locale;

public class Basic0perations {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in).useLocale(Locale.US);
	System.out.print("Dime el primer numero: ");
            int a = in.nextInt();
	System.out.print("Dime el segundo numero: ");
            int b = in.nextInt();

	int divisio = a / b;
	System.out.print("Division: "+divisio);
    }
}
