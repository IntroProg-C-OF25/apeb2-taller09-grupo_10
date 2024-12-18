
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibonacci_Primos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de términos
        System.out.print("Ingrese el número de términos de la serie: ");
        int N = scanner.nextInt();

        // Listas para almacenar Fibonacci y primos
        List<Integer> fibonacci = new ArrayList<>();
        List<Integer> primos = new ArrayList<>();

        // Generar números de Fibonacci
        fibonacci.add(1); // Primer término
        fibonacci.add(1); // Segundo término
        for (int i = 2; i < N; i++) {
            fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
        }

        // Generar números primos
        int numero = 2;
        while (primos.size() < N) {
            if (esPrimo(numero)) {
                primos.add(numero);
            }
            numero++;
        }

        // Mostrar la serie
        System.out.println("La serie es:");
        for (int i = 0; i < N; i++) {
            System.out.println(fibonacci.get(i) + "/" + primos.get(i));
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


