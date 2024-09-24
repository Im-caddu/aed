package libs;

public class Vetores {
    public static int[] alocarInteiros(int n) {
        int [] vetor;
        int i = 0;
        vetor = new int[n];

        for (i=0;i < vetor.length; i++) {
            vetor[i] = 0;
        }
        return vetor;
    }

    public static void mostrar (int[] v) {
        int i;
        System.out.print("[");
        for (i=0; i<v.length; i++) {
            System.out.print(v[i] + " ");

            if (i < v.length-1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
    }

    public static int[] lerInteiro(int n) {
        int[] valores = alocarInteiros(n);
        int i;

        Entrada.abrir();
        for (i=0; i<n; i++) {
            valores[i] = Entrada.lerInt();
        }
        Entrada.fechar();

        return valores;
    }

    public static int obterPosicao(int[] vetor, int valor_buscar, int pos_inicial) {
        int i;
        
        for (i = pos_inicial; i < vetor.length; i++){
            if (vetor[i] == valor_buscar) {
                return i;
            }
        }
        return -1;
    }
}
