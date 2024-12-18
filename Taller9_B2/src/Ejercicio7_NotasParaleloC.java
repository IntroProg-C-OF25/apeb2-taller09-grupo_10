/** *
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al finalizar el ciclo, la Dirección de la carrera de Computación a solicitado las siguientes estadísticas en función a los promedios obtenidos del ciclo por estudiantes (use 1 arreglo, no matrices, y para el promedio por estudiante, no ingrese el valor, si se debe autogenerar).
 *
 * Promedio del ciclo, del paralelo C.
 * Listado de estudiantes con su nota por encima del promedio.
 * Listado de estudiantes con su nota por debajo del promedio.
 * Estudiante con la mejor calificación.
 * Estudiante con la calificación mas baja.
 */
public class Ejercicio7_NotasParaleloC {

    public static void main(String[] args) {

        int lim = 28, mejor = 0, peor = 0;
        double notas[] = new double[lim];
        double sumNotas = 0, promedio = 0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.random() * 10;
        }
        double better = notas[0], bad = notas[0];
        for (int i = 0; i < notas.length; i++) {
            sumNotas += notas[i];
        }
        promedio = sumNotas / notas.length;
        System.out.println("El promedio del ciclo del paralelo C es: " + promedio);
        System.out.println("");
        System.out.println("ESTUDIANTES CON NOTA POR ENCIMA DEL PROMEDIO");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > promedio) {
                System.out.println("Estudiante " + i + " nota: " + notas[i]);
            }
        }
        System.out.println("");
        System.out.println("ESTUDIANTES CON NOTA POR DEBAJO DEL PROMEDIO");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < promedio) {
                System.out.println("Estudiante " + i + " nota: " + notas[i]);
            }
        }
        for (int i = 0; i < notas.length; i++) {
            if (better < notas[i]) {
                better = notas[i];
                mejor = i;

            }
            if (bad > notas[i]) {
                bad = notas[i];
                peor = i;
            }
        }
        System.out.println("El Estudiante " + mejor + " tiene la mejor nota: " + better);
        System.out.println("El Estudiante " + peor + " tiene la peor nota: " + bad);
    }
}
/**
 * *
 * run: El promedio del ciclo del paralelo C es: 5.645684011560623
 *
 * ESTUDIANTES CON NOTA POR ENCIMA DEL PROMEDIO 
 * Estudiante 0 nota: 8.683313045388594 
 * Estudiante 1 nota: 8.796290596043102 
 * Estudiante 2 nota: 8.69645376282881 
 * Estudiante 3 nota: 6.921777469114336 
 * Estudiante 6 nota: 6.922022171640848 
 * Estudiante 7 nota: 8.139087677332228 
 * Estudiante 8 nota: 7.304727428756958 
 * Estudiante 10 nota: 9.637495946682584 
 * Estudiante 11 nota: 9.026616344354858 
 * Estudiante 17 nota: 8.609814260510644 
 * Estudiante 21 nota: 9.984894152783179 
 * Estudiante 22 nota: 6.487924884692403 
 * Estudiante 26 nota: 8.142953721192196 
 * Estudiante 27 nota: 7.255347802418602
 *
 * ESTUDIANTES CON NOTA POR DEBAJO DEL PROMEDIO 
 * Estudiante 4 nota: 4.820933560559196 
 * Estudiante 5 nota: 4.052930894722229 
 * Estudiante 9 nota: 3.545297589158297 
 * Estudiante 12 nota: 2.847833238247662 
 * Estudiante 13 nota: 1.7982375480077972 
 * Estudiante 14 nota: 3.8623684129944302 
 * Estudiante 15 nota: 2.995137948533274 
 * Estudiante 16 nota: 1.8401823648931126 
 * Estudiante 18 nota: 4.954008382386906 
 * Estudiante 19 nota: 1.4533264007914637 
 * Estudiante 20 nota: 2.7252554022581457 
 * Estudiante 23 nota: 1.5865899738283817 
 * Estudiante 24 nota: 4.471943576510348 
 * Estudiante 25 nota: 2.5163877670668624 
 * El Estudiante 21 tiene la mejor nota: 9.984894152783179
 * El Estudiante 19 tiene la peor nota: 1.4533264007914637
 */
