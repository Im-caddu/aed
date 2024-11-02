package aulas;

import libs.Vetores;
import libs.Tempo;

public class Aula34 {
    public static void aula() {
        System.out.println("++ Aula 34 dia 01/11/2024 ++");

        // ex01();
        // ex02();
        // ex03();
        ex04();
    }

    public static void ex01() {
        
    }

    public static void ex02() {
        int[] v = Vetores.gerarValoresAleatorios(510000000, 0, 100000000);
        int x = -1;

        int pos;

        long tempo_inicio = Tempo.medirTempoIniciar();
        pos = Vetores.buscaSequencial(v, x);
        double tempo_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);

        if (pos != -1) {
            System.out.printf("Valor %d encontrado na posicao %d.\n", x, pos);
        } else {
            System.out.printf("Valor %d não encontrado.\n", x);
        }

        System.out.printf("Tempo de busca sequencial com %d elementos: %f segundos\n", v.length, tempo_segundos);
    }

    public static void ex03() {
        //int i;

        //for (i=0; ) {

        //}
    }

    public static void ex04() {
        System.out.println("Gerando valores aleatorios...");
        int[] v = Vetores.gerarValoresAleatoriosOrdenado(510000000, 0, 100000000);
        int x = -1;
        long tempo_inicio;
        double tempo_segundos;

        int pos;

        System.out.println("Executando Busca Linear...");
        tempo_inicio = Tempo.medirTempoIniciar();
        pos = Vetores.buscaSequencial(v, x);
        tempo_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);

        System.out.printf("Tempo de busca sequencial com %d elementos: %f segundos\n", v.length, tempo_segundos);

        //Busca Binaria
        System.out.println("Executando Busca Binaria...");
        tempo_inicio = Tempo.medirTempoIniciar();
        pos = Vetores.buscaBinaria(v, x);
        tempo_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);

        System.out.printf("Tempo de busca binaria com %d elementos: %f segundos\n", v.length, tempo_segundos);
    }
}
