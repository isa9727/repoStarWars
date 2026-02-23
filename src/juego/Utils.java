package juego;

public class Utils {
	public static int sumatorio(int a, int b) {
		int suma = 0;
		for (int i = a; i <= b; i++) {
		suma += i;
		}
		return suma;
		}

	public static long productorio(int a, int b) {
		long producto = 1;
		for (int i = a; i <= b; i++) {
		producto *= i;
		}
		return producto;
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