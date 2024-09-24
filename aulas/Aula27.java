package aulas;

import libs.Vetores;

public class Aula27 {
    public static void aula() {
        System.out.println("++ Aula do dia 24/09/2024 ++");

        // exLerInteiro();
        exLeituraVetorInteiro();
    }

    public static void exLeituraVetorInteiro() {
        int n = 4;
        int[] valores;

        System.out.println("Digite " + n + " valores: ");

        valores = Vetores.lerInteiro(n);

        Vetores.mostrar(valores);
    }

}
