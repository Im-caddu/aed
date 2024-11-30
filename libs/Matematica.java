package libs;

public class Matematica {
    
    public static int maior(int a, int b) {
        if (a>b) {
            return a;
        }

        return b;
    }
    
    public static int menor(int a, int b) {
        if (a<b) {
            return a;
        }

        return b;
    }

    public static int potencia(int x, int y) {
        int i;
        int k = x;

        if (y==0) {
            return 1;
        }

        for (i=0; i<y; i++) {
            k = k*x;
        }

        return k;
    }

    public static int obterValorPos (int x, int k) {
        return (x % Matematica.potencia(10, k)) / Matematica.potencia(10, k-1);
    }
}
