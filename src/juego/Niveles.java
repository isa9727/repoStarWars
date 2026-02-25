package juego;

import java.util.Scanner;

public class Niveles {

	public static boolean nivel1(Scanner sc) {

		int S1 = Utils.aleatorio(1, 10);
		int S2 = Utils.aleatorio(20, 30);

		System.out.println("Nivel 1");
		System.out.println("Calcula el sumatorio entre " + S1 + " y " + S2);

		int resultadoCorrecto = Utils.sumatorio(S1, S2);

		System.out.print("Respuesta: ");
		int respuestaUsuario = sc.nextInt();

		return respuestaUsuario == resultadoCorrecto;
		}
    

	public static boolean nivel2(Scanner sc) {

		int P1 = Utils.aleatorio(1, 7);
		int P2 = Utils.aleatorio(8, 12);

		System.out.println("Nivel 2");
		System.out.println("Calcula el productorio entre " + P1 + " y " + P2);

		long resultadoCorrecto = Utils.productorio(P1, P2);

		System.out.print("Respuesta: ");
		long respuestaUsuario = sc.nextLong();

		return respuestaUsuario == resultadoCorrecto;
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

}