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
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    public static long factorial(int n) {
        // TODO: Implementar con bucle
        return 0;
    }

    /*
     * HUGO
     */
    public static boolean esPrimo(int n) {
        // TODO: Implementar comprobación de primo
        return false;
    }

    /*
     * MÉTODO GENERAL (YA FUNCIONA)
     */
    public static int aleatorio(int min, int max) {
        return (int)(min + Math.random() * (max - min + 1));
    }
}