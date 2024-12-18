
public class Ejercicio1_Figura3 {

    public static void main(String[] args) {

        int limit = 4;
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= limit - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < limit) {

                for (int j = limit - 1; j >= i; j--) {
                    for (int k = 1; k <= limit - j; k++) {
                        System.out.print(" ");

                    }
                    for (int k = 1; k <= (2 * j - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }
        }
    }
}
