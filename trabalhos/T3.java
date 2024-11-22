package trabalhos;

public class T3 {
    public static void mostrarInteiros(int[] vetor, char sep) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(sep);
            }
        }
        System.out.println();
    }
    

    public static int[] filtrarMaiores(int[] vetor, int x) {
        int[] result = new int[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > x) {
                result = adicionarAoFinal(result, vetor[i]);
            }
        }

        return result;
    }

    public static int[] adicionarAoFinal(int[] vetor, int valor) {
        int[] novoVetor = new int[vetor.length + 1];

        for (int i = 0; i < vetor.length; i++) {
            novoVetor[i] = vetor[i];
        }

        novoVetor[novoVetor.length - 1] = valor;

        return novoVetor;
    }

    public static int[] filtrarMenores(int[] vetor, int x) {
        int[] result = new int[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < x) {
                result = adicionarAoFinal(result, vetor[i]);
            }
        }

        return result;
    }
}