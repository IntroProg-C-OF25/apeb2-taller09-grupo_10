
/** *
 * FIGURA 2
 * Con el objetivo practicar el uso del ciclo repetitivo for,
 * se propone que dado un límite, se presenten las siguientes figuras.
 * Por ejemplo si el límite es 4:
 */
public class Ejercicio1_Figura2 {

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
        }
    }
}
/**
 * *
 *
 ***
 *****
 *******
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */
