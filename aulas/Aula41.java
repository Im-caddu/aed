package aulas;

import libs.Vetores;

public class Aula41 {
    public static void aula() {
        System.out.println("++ Aula 41 dia 03/12/2024 ++");

        ex01();
        // ex02();
        // ex03();
    }

    public static void ex01() {
        System.out.println("## Radix Sort ##");

        int meio;

        int[] v0 = {7, 2, 9, 2, 7, 1, 9, 2, 0};
        System.out.println("Entrada: ");
        Vetores.mostrar(v0);
        int[] v0_ordenado = Vetores.ordenarRadixSort(v0);
        System.out.println("Saída: ");
        Vetores.mostrar(v0_ordenado);

        System.out.println("-----");
    }
}
