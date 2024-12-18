
import java.util.Scanner;

public class Ejercicio3_Aplicacion {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        System.out.print("INGRESE EL NUMERO DE MARCAS: ");
        int num_marcas = ingreso.nextInt();
        ingreso.nextLine();
        String[] marcas = new String[num_marcas];
        for (int i = 0; i < num_marcas; i++) {
            System.out.println("INGRESAR LA MARCA DEL VEHICULO " + (i + 1) + ":");
            String marca = ingreso.nextLine();

            if (marca.startsWith("A") || marca.startsWith("C") || marca.startsWith("T")) {
                i--;
            } else {
                marcas[i] = marca;
            }
        }
        System.out.println("Marcas ingresadas:");
        for (String marca : marcas) {
            System.out.println("----" + marca + "----");
        }

    }
}
/***
 * run-single:
 *INGRESE EL NUMERO DE MARCAS: 5
 *INGRESAR LA MARCA DEL VEHICULO 1:
 *chevrolet
 *INGRESAR LA MARCA DEL VEHICULO 2:
 *bmw
 *INGRESAR LA MARCA DEL VEHICULO 3:
 *hyundai
 *INGRESAR LA MARCA DEL VEHICULO 4:
 *toyota
 *INGRESAR LA MARCA DEL VEHICULO 5:
 *mazda
 *Marcas ingresadas:
 *----chevrolet----
 *----bmw----
 *----hyundai----
 *----toyota----
 *----mazda----
 *BUILD SUCCESSFUL (total time: 23 seconds)
*/
