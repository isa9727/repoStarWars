package juego;

public class Utils {

    /*
     * AYOUB
     */
    public static int sumatorio(int a, int b) {
        // TODO: Implementar con bucle
        return 0;
    }

    /*
     * AYOUB
     */
    public static long productorio(int a, int b) {
        // TODO: Implementar con bucle
        return 0;
    }

    /*
     * PATRI
     */
    public static long factorial(int n) {
        // TODO: Implementar con bucle
        return 0;
    }

    /*
     * HUGO
     */
    public static long factorial(int n) {
    	 long resultado = 1;
    	 for (int i = 1; i <= n; i++) {
    	 resultado *= i;
    	 }
    	 return resultado;
    	}

    /*
     * MÉTODO GENERAL (YA FUNCIONA)
     */
    public static int aleatorio(int min, int max) {
        return (int)(min + Math.random() * (max - min + 1));
    }
}