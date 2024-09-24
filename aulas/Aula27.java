package aulas;

import libs.Vetores;

public class Aula27 {
    public static void aula() {
        System.out.println("++ Aula do dia 24/09/2024 ++");

        // exLerInteiro();
        exLeituraVetorInteiro();
        exBuscarPosicao();
    }

    public static void exLeituraVetorInteiro() {
        int n = 4;
        int[] valores;

        System.out.println("Digite " + n + " valores: ");

        valores = Vetores.lerInteiro(n);

        Vetores.mostrar(valores);
    }

    public static void exBuscarPosicao() {
        int[] valores = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int valor = 0;
        int pos_inicial = 0;
        int pos;

        pos = Vetores.obterPosicao(valores, valor, pos_inicial);

        System.out.println(pos);
    }
}
