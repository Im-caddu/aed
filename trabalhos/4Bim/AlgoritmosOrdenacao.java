import java.util.Random;
import java.util.Arrays;

public class AlgoritmosOrdenacao {

    public static void main(String[] args) {
        int[] tamanhos = {100, 1000, 10000, 100000, 1000000}; // Tamanhos dos vetores

        for (int tamanho : tamanhos) {
            int[] vetorOriginal = gerarValoresAleatorios(tamanho, 0, 100);

            System.out.println("\nTamanho do vetor: " + tamanho);
            System.out.println("Vetor original: " + Arrays.toString(vetorOriginal));

            medirTempo("Bubble Sort", vetorOriginal, Vetores::ordenarBubbleSort);
            medirTempo("Insertion Sort", vetorOriginal, Vetores::ordenarInsertionSort);
            medirTempo("Selection Sort", vetorOriginal, Vetores::ordenarSelectionSort);
            medirTempo("Merge Sort", vetorOriginal, Vetores::ordenarMergeSortWrapper);
            medirTempo("Quick Sort", vetorOriginal, Vetores::ordenarQuickSortWrapper);
            medirTempo("Radix Sort", vetorOriginal, Vetores::ordenarRadixSort);
            medirTempo("Counting Sort", vetorOriginal, Vetores::ordenarCountingSort);
        }
    }

    public static int[] medirTempo(String nomeAlgoritmo, int[] vetorOriginal, FuncaoOrdenacao algoritmo) {
        int[] vetorCopia = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
        long tempoInicio = medirTempoIniciar();
    
        int[] vetorOrdenado = algoritmo.ordenar(vetorCopia);
    
        double tempoSegundos = medirTempoFinalizarSegundos(tempoInicio);
        System.out.println(nomeAlgoritmo + " levou " + tempoSegundos + " segundos");
    
        return vetorOrdenado; // Retorna o vetor ordenado, caso necessário
    }
    

    public static int[] gerarValoresAleatorios(int n, int valorMin, int valorMax) {
        Random random = new Random();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = random.nextInt(valorMax - valorMin + 1) + valorMin;
        }

        return vetor;
    }

    public static long medirTempoIniciar() {
        return System.currentTimeMillis();
    }

    public static double medirTempoFinalizarSegundos(long tempoInicio) {
        long tempoFim = System.currentTimeMillis();
        return (tempoFim - tempoInicio) / 1000.0;
    }

    interface FuncaoOrdenacao {
        int[] ordenar(int[] array);
    }
}

class Vetores {

    public static int[] ordenarBubbleSort(int[] v) {
        int n = v.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    trocar(v, j, j + 1);
                }
            }
        }
        return v;
    }

    public static int[] ordenarInsertionSort(int[] v) {
        int i, j;
        for (i = 1; i < v.length; i++) {
            j = i;

            while (j > 0 && v[j] < v[j - 1]) {
                trocar(v, j, j - 1);
                j--;
            }
        }
        return v;
    }

    public static int[] ordenarSelectionSort(int[] v) {
        int i, j, menor_val, menor_pos;

        for (i = 0; i < v.length - 1; i++) {
            menor_val = v[i];
            menor_pos = i;

            for (j = i + 1; j < v.length; j++) {
                if (v[j] < menor_val) {
                    menor_val = v[j];
                    menor_pos = j;
                }
            }

            trocar(v, i, menor_pos);
        }
        return v;
    }

    public static int[] ordenarMergeSortWrapper(int[] v) {
        return ordenarMergeSort(v);
    }

    public static int[] ordenarMergeSort(int[] v) {
        int[] ve_ordenado, vd_ordenado, v_ordenado;

        if (v.length <= 1) {
            return v;
        }

        int[] v_esq, v_dir;
        int meio;

        meio = v.length / 2;
        v_esq = subVetor(v, 0, meio);
        v_dir = subVetor(v, meio, v.length);

        ve_ordenado = ordenarMergeSort(v_esq);
        vd_ordenado = ordenarMergeSort(v_dir);

        v_ordenado = merge(ve_ordenado, vd_ordenado);

        return v_ordenado;
    }

    public static int[] ordenarQuickSortWrapper(int[] v) {
        return ordenarQuickSort(v, 0, v.length - 1);
    }

    public static int[] ordenarQuickSort(int[] v, int ini, int fim) {
        if (ini < fim) {
            int pos_pivot = quickSortPartCormen(v, ini, fim);
            ordenarQuickSort(v, ini, pos_pivot - 1);
            ordenarQuickSort(v, pos_pivot + 1, fim);
        }
        return v;
    }

    public static int quickSortPartCormen(int[] v, int ini, int fim) {
        int pivot = v[fim];
        int pos_menores = ini - 1;

        for (int i = ini; i < fim; i++) {
            if (v[i] <= pivot) {
                pos_menores++;
                trocar(v, pos_menores, i);
            }
        }

        pos_menores++;
        trocar(v, pos_menores, fim);
        return pos_menores;
    }

    public static int[] ordenarRadixSort(int[] v) {
        int maior_valor = maior(v);
        int k = 1;

        while (maior_valor / (int) Math.pow(10, k) > 0) {
            k++;
        }

        for (int i = 1; i <= k; i++) {
            v = ordenarCountingSort(v, i);
        }

        return v;
    }

    public static int[] ordenarCountingSort(int[] v, int k) {
        int[] contadores = new int[10];
        int[] contadores_acumulado = new int[10];
        int[] resultado = new int[v.length];

        for (int value : v) {
            int pos = Matematica.obterValorPos(value, k);
            contadores[pos]++;
        }

        for (int i = 1; i < contadores.length; i++) {
            contadores_acumulado[i] = contadores[i - 1] + contadores_acumulado[i - 1];
        }

        for (int value : v) {
            int pos = Matematica.obterValorPos(value, k);
            resultado[contadores_acumulado[pos]++] = value;
        }

        return resultado;
    }

    public static int maior(int[] v) {
        int maior_valor = v[0];
        for (int j : v) {
            if (j > maior_valor) {
                maior_valor = j;
            }
        }
        return maior_valor;
    }

    public static int[] merge(int[] va, int[] vb) {
        int[] vc = new int[va.length + vb.length];
        int i = 0, j = 0, k = 0;

        while (i < va.length && j < vb.length) {
            if (va[i] < vb[j]) {
                vc[k++] = va[i++];
            } else {
                vc[k++] = vb[j++];
            }
        }

        while (i < va.length) {
            vc[k++] = va[i++];
        }

        while (j < vb.length) {
            vc[k++] = vb[j++];
        }

        return vc;
    }

    public static int[] subVetor(int[] v, int ini, int fim) {
        int[] sub_vetor = new int[fim - ini];
        System.arraycopy(v, ini, sub_vetor, 0, fim - ini);
        return sub_vetor;
    }

    public static void trocar(int[] v, int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
}

class Matematica {
    public static int obterValorPos(int valor, int pos) {
        return (valor / (int) Math.pow(10, pos - 1)) % 10;
    }
}
