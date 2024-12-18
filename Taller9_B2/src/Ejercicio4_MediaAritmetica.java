
/** *
 * Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética y cuantos están por debajo de la medía aritmética.
 * int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
 */
public class Ejercicio4_MediaAritmetica {

    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int nums = 0, up = 0, down = 0;
        double prom = 0;
        for (int i = 0; i < arreglo.length; i++) {
            nums += arreglo[i];
        }
        prom = nums / arreglo.length;
        System.out.println("La media aritmetica es: " + prom);
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > prom) {
                up++;
            } else {
                down++;
            }
        }
        System.out.println("Los que estan por arriba de la media aritmetica son: " + up + " numeros");
        System.out.println("Los que estan por debajo de la media aritmetica son: " + down + " numeros");

    }

}
