package libs;

import java.util.Scanner;

public class Entrada {
    
    public static Scanner entrada;

    public static void abrir() {
        entrada = new Scanner(System.in);
    }

    public static void fechar() {
        entrada.close();
    }

    public static int lerInt() {
        return entrada.nextInt();
    }

    public static int lerInt(String msg) {
        System.out.println(msg);
        return entrada.nextInt();
    }

    public static double lerDouble() {
        return entrada.nextDouble();
    }

    public static double lerDouble(String msg) {
        System.out.println(msg);
        return entrada.nextDouble();
    }

    public static String lerPalavra() {
        return entrada.next();
    }

    public static String lerPalavra(String msg) {
        System.out.println(msg);
        return entrada.next();
    }

    public static String lerLinha() {
        return entrada.nextLine();
    }

    public static String lerLinha(String msg) {
        System.out.println(msg);
        return entrada.nextLine();
    }
}
