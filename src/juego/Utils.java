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