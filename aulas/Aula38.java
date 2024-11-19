package aulas;
import libs.Vetores;

public class Aula38 {
    public static void aula() {
        System.out.println("++ Aula 38 dia 19/11/2024 ++");

        ex01();
        ex02();
        // ex03();
    }

    public static void ex01() {
        System.out.println("Ordenação - Insertion Sort");
        int[] v0 = {17, 5, 0, 18, 2, 9};

        Vetores.ordenarInsertionSort(v0);
        int [] v2 = Vetores.gerarValoresAleatorios(100, 10, 50);
        Vetores.ordenarInsertionSort(v2);
        Vetores.mostrar(v0);
        Vetores.mostrar(v2);
    }

    public static void ex02() {
        System.out.println("Ordenação - Selection Sort");
        
        int[] v0 = {17, 5, 0, 18, 2, 9};
        Vetores.ordenarSelectionSort(v0);
        Vetores.mostrar(v0);

        int [] v2 = Vetores.gerarValoresAleatorios(100, 10, 50);
        Vetores.ordenarSelectionSort(v2);
        Vetores.mostrar(v2);
    }

    // public static void ex03() {
    //     System.out.println("Ordenação - Merge Sort");

    //     int[] v0 = {17, 5, 0, 18, 2, 9};
    //     int[] v1 = Vetores.gerarValoresAleatorios(100, 10, 50);

    //     int[] v2 = Vetores.ordenarMergeSort(v0, v1);
    //     Vetores.mostrar(v2);
    // }
}
