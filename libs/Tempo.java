package libs;

public class Tempo {
    //Chamar para começar a contar o tempo
public static long medirTempoIniciar(){
    long tempo_inicio = System.currentTimeMillis();

    return tempo_inicio;
}

//Chamar para parar de contar o tempo
public static double medirTempoFinalizarSegundos(long tempo_inicio){
    long tempo_fim = System.currentTimeMillis();

    double duracao_segundos = (tempo_fim - tempo_inicio) / 1000.0;

    return duracao_segundos;
}
}
