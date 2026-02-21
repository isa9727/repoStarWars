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
    	
    	 int N = Utils.aleatorio(50, 100);
    	 int valor = N / 10;
    	 
    	 System.out.println("Nivel 3");
    	 System.out.println("N = " + N);
    	 System.out.println("Calcula el factorial de " + valor);
    	 
    	 long resultadoCorrecto = Utils.factorial(valor);
    	 
    	 System.out.print("Respuesta: ");
    	 long respuestaUsuario = sc.nextLong();
    	 
    	 return respuestaUsuario == resultadoCorrecto;
    	}

    /*
     * ==========================
     * PATRI
     * Nivel 4 -> Número primo
     * ==========================
     */
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
    	
    	 int M = Utils.aleatorio(5, 10);
    	 int S = Utils.aleatorio(5, 10);
    	 
    	 System.out.println("Nivel 5");
    	 System.out.println("M = " + M + " , S = " + S);
    	 System.out.println("Calcula factorial(M) + factorial(S)");
    	 
    	 long resultadoCorrecto = Utils.factorial(M) + Utils.factorial(S);
    	 
    	 System.out.print("Respuesta: ");
    	 long respuestaUsuario = sc.nextLong();
    	 
    	 return respuestaUsuario == resultadoCorrecto;
    	}