
/**
 * FIGURA 1
 *Con el objetivo practicar el uso del ciclo repetitivo for,
 * se propone que dado un límite, se presenten las siguientes figuras.
 * Por ejemplo si el límite es 4:
 * @author Carlitos Ismael
 */
public class Ejercicio1_Figuras {

    public static void main(String[] args) {
        int limit = 4;
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
/***
 *
 **
 ***
 ****
 *BUILD SUCCESSFUL (total time: 0 seconds)
 */
