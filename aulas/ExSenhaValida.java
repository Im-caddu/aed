package aulas;

import libs.Entrada;

public class ExSenhaValida {

    public static void aula() {
        System.out.println("++ Exercício feito no dia 24/09/2024 ++");

        exSenhaValida();
    }
    public static void exSenhaValida() {
    Entrada.abrir();

    String SenhaValida = "4a5r9j03";

    String SenhaInformada = Entrada.lerPalavra("Digite a senha: ");

    Entrada.fechar();

    if (SenhaInformada.equals(SenhaValida)) {
        System.out.println("ACESSO PERMITIDO");
    } else {
        System.out.println("ACESSO BLOQUEADO");
    }
    
    }
}