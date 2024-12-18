
public class Ejercicio1_Figura3 {

    public static void main(String[] args) {

        int limit = 4;
        for (int i = 1; i <= limit; i++) {

            for (int j = i; j < limit; j++) {
               System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = limit - 1; i >= 1; i--) {

            for (int j = limit; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/***
 
    *
   ***
  *****
 *******
  *****
   ***
    *
 *BUILD SUCCESSFUL (total time: 0 seconds)
 */
