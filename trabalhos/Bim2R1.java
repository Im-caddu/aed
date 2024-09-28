package trabalhos;

// import libs.Entrada;

public class Bim2R1 {
    //Recuperação sobre recursividade
    public static void trabalho () {
        System.out.println("++ Recuperação: Recursividade ++");
        mod(0, 0);
    }

    public static int mod (int x, int y) {
        // Entrada.abrir();
        // x = Entrada.lerInt("Digite o primeiro número: ");
        // y = Entrada.lerInt("Digite o segundo número: ");
        // Entrada.fechar();
        x = 8;
        y = 2;


        int calc;

        calc = x % y;
        
        // if (x>y) {
        //     return mod(x-y, y);
        // }

        if (x<y) {
            return x;
        }

        if (x==y) {
            return 0;
        }

        return calc;

        System.out.println("+ calc +");
    }
}
