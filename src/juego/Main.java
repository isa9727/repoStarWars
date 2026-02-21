package juego;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // INICIO
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===");
        System.out.println("Presiona Intro para comenzar...");
        sc.nextLine();

        // FLUJO DE NIVELES
        if (!Niveles.nivel1(sc)) { perder(); fin(); sc.close(); return; }
        if (!Niveles.nivel2(sc)) { perder(); fin(); sc.close(); return; }
        if (!Niveles.nivel3(sc)) { perder(); fin(); sc.close(); return; }
        if (!Niveles.nivel4(sc)) { perder(); fin(); sc.close(); return; }
        if (!Niveles.nivel5(sc)) { perder(); fin(); sc.close(); return; }

        ganar();
        fin();
        sc.close();
    }

    public static void ganar() {
        System.out.println("¡Has salvado la galaxia!");
    }

    public static void perder() {
        System.out.println("Has fallado la misión...");
    }

    public static void fin() {
        System.out.println("Gracias por jugar.");
    }
}
