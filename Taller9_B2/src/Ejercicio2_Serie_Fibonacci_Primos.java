
/** *
 * Ejercicio 2
 * Escriba un programa que permita presentar la siguiente serie:
 * 1/2, 1/3, 2/5, 3/7, 5/11, 8/13, . . . fibonaccis / primos
 */
import java.util.Scanner;

public class Ejercicio2_Serie_Fibonacci_Primos {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int lim, a = 0, b = 1, c, primo = 2;
        System.out.print("Ingrese el limite de la serie: ");
        lim = tcl.nextInt();
        for (int i = 0; i < lim; i++) {
            c = a + b;
            a = b;
            b = c;

            while (true) {
                int v = 0;
                for (int j = 1; j <= primo; j++) {
                    if (primo % j == 0) {
                        v++;
                    }
                }
                if (v == 2) {
                    break;
                } else {
                    primo++;
                }
            }
            System.out.println(a + "/" + primo);
            primo++;

        }

    }
}
