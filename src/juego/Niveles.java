package juego;

import java.util.Scanner;

public class Niveles {

    /*
     * ==========================
     * AYOUB
     * Nivel 1 -> Sumatorio
     * ==========================
     */
    public static boolean nivel1(Scanner sc) {
        // TODO: Implementar nivel 1
        return true;
    }

    /*
     * ==========================
     * AYOUB
     * Nivel 2 -> Productorio
     * ==========================
     */
    public static boolean nivel2(Scanner sc) {
        // TODO: Implementar nivel 2
        return true;
    }

    /*
     * ==========================
     * HUGO
     * Nivel 3 -> Factorial N/10
     * ==========================
     */
    public static boolean nivel3(Scanner sc) {
        // TODO: Implementar nivel 3
        return true;
    }

    /*
     * ==========================
     * PATRI
     * Nivel 4 -> Número primo
     * ==========================
     */
    public static boolean nivel4(Scanner sc) {
        int P = Utils.aleatorio(10, 100);
        
        System.out.println("Nivel 4");
        System.out.println("El número es: " + P);
        System.out.println("Si es primo introduce 1, si no 0");
        
        boolean esPrimo = Utils.esPrimo(P);
        int resultadoCorrecto = esPrimo ? 1 : 0;
        
        System.out.print("Respuesta: ");
        int respuestaUsuario = sc.nextInt();
        
        return respuestaUsuario == resultadoCorrecto;
    }
    
    public static boolean nivel4(Scanner sc) {
        // TODO: Implementar nivel 4
        return true;
    }

    /*
     * ==========================
     * HUGO
     * Nivel 5 -> Factorial M + S
     * ==========================
     */
    public static boolean nivel5(Scanner sc) {
        // TODO: Implementar nivel 5
        return true;
    }
}