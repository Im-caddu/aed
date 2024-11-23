package aulas;
import libs.Vetores;

public class Aula39 {
    public static void aula() {
        System.out.println("++ Aula 39 dia 22/11/2024 ++");
        System.out.println("## Ordenação - Merge Sort");

        // ex01(); //Subvetor
        ex02();
        // ex03();
    }

    public static void ex01() {
        System.out.println("## Teste subvetor ##");
        int meio;
        
        int[] v0 = {4, 1, 7, 0, 8, 5, 2, 9, 6, 3};
        System.out.println("Entrada: ");
        Vetores.mostrar(v0);
        meio = v0.length / 2;
        int[] v0_subvetor_esq = Vetores.subVetor(v0, 0, meio);
        Vetores.mostrar(v0_subvetor_esq);
        int[] v0_subvetor_dir = Vetores.subVetor(v0, meio, v0.length);
        Vetores.mostrar(v0_subvetor_dir);
        
        System.out.println("-----");
    }

    public static void ex02() {
        
        int[] v0 = {4, 1, 7, 0, 8, 5, 2, 9, 6, 3};
        System.out.println("Entrada: ");
        Vetores.mostrar(v0);

        int [] v0_ordenado = Vetores.ordenarMergeSort(v0);
        System.out.println("Saida: ");
        Vetores.mostrar(v0_ordenado);
    }

    // public static void ex03() {
    //     System.out.println("Ordenação - Merge Sort");

    //     int[] v0 = {17, 5, 0, 18, 2, 9};
    //     int[] v1 = Vetores.gerarValoresAleatorios(100, 10, 50);

    //     int[] v2 = Vetores.ordenarMergeSort(v0, v1);
    //     Vetores.mostrar(v2);
    // }
}
