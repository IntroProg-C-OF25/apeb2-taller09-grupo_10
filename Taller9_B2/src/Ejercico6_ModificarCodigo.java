
/** *
 * Analice el siguiente código
 *
 * Scanner entrada = new Scanner(System.in);
 * String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
 * String inicial;
 * boolean bandera = true;
 * while(bandera){
 * System.out.println("Ingrese una letra");
 * inicial = entrada.nextLine();
 * }
 * Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario ingrese por teclado
 * una letra que coincida con la primera letra de los "nombres" contenidos en del arreglo estudiantes.
 * Debe usar un ciclo repetitivo para recorrer el arreglo estudiantes, y no quemar de forma constante dichas iniciales,
 * imagine que estudiantes podría contener millón de nombres, por lo que fijar iniciales, es ineficiente.
 */
import java.util.Scanner;

public class Ejercico6_ModificarCodigo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true, encontrado = false;
        while (bandera) {
            System.out.print("Ingrese una letra: ");
            inicial = entrada.nextLine();
            for (String estudiante : estudiantes) {
                if (estudiante.startsWith(inicial)) {
                    System.out.println("Coincidencia encontrada en: " + estudiante);
                    encontrado = true;
                    bandera = false;
                    break;                    
                }
            }
            if (encontrado == false) {
                System.out.println("No coincide con ningun nombre, intente de nuevo");
            }

        }
        
    }
}
/***
 * run:
 * Ingrese una letra: G
 * No coincide con ningun nombre, intente de nuevo
 * Ingrese una letra: V
 * No coincide con ningun nombre, intente de nuevo
 * Ingrese una letra: M
 * Coincidencia encontrada en: Mark
 */
