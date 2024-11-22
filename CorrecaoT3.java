import trabalhos.T3;

public class CorrecaoT3{
    public static void main(String[] args){
        q1(); //Mostrar inteiros
        q2(); //Filtrar Maiores
        q3(); //Filtrar Menores
        q4(); //Aplicar e lógico
        q5(); //Aplicar ou lógico
        q6(); //Aplicar Máscara
        q7(); //União
        q8(); //Interseção
        q9(); //Diferença
        q10(); //Triangulo de Pascal
        q11(); //MatrizTransposta
        q12(); //Permutacao de Linhas
        q13(); //Multiplicação de matrizes
    }    

    public static void q1(){
        System.out.println("## Questão 01 - Mostrar inteiros ##");
        int[] vetor = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        char sep = 'x';

        T3.mostrarInteiros(vetor, sep);
    }

    public static void q2(){
        System.out.println("## Questão 02 - Filtrar Maiores ##");
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 5;
        int[] retorno;

        retorno = T3.filtrarMaiores(vetor, x);
        mostrarVetor(retorno);

        System.out.println();
    }

    public static void q3(){
        System.out.println("## Questão 03 - Filtrar Menores ##");

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 5;
        int[] retorno;

        retorno = T3.filtrarMenores(vetor, x);
        mostrarVetor(retorno);

        System.out.println();
    }

    public static void q4(){
        System.out.println("## Questão 04 - Aplicar e lógico ##");

        boolean[] va = {true, false, false, true};
        boolean[] vb = {true, true, false, false};
        boolean[] retorno;

        retorno = T3.aplicarELogico(va, vb);
        mostrarVetor(retorno);

        System.out.println();
    }

    public static void q5(){
        System.out.println("## Questão 05 - Aplicar ou lógico ##");

        boolean[] va = {true, false, false, true};
        boolean[] vb = {true, true, false, false};
        boolean[] retorno;

        retorno = T3.aplicarOuLogico(va, vb);
        mostrarVetor(retorno);

        System.out.println();
    }

    public static void q6(){
        System.out.println("## Questão 06 - Aplicar Máscara ##");

        int[] v1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean[] mascara1 = {true, false, true, false, true, false, false, false, false, true};
        int[] retorno1;

        retorno1 = T3.aplicarMascara(v1, mascara1);
        mostrarVetor(retorno1);


        System.out.println();
    }

    public static void q7(){
        System.out.println("## Questão 07 - União ##");

        int[] va_1 = {1, 2, 3, 4};
        int[] vb_1 = {6, 7, 8, 9};
        int[] retorno_1;

        retorno_1 = T3.uniao(va_1, vb_1);
        mostrarVetor(retorno_1);

        int[] va_2 = {1, 2, 3, 4, 5, 6, 7};
        int[] vb_2 = {5, 6, 7, 8, 9, 10};
        int[] retorno_2;

        retorno_2 = T3.uniao(va_2, vb_2);
        mostrarVetor(retorno_2);

        int[] va_3 = {1, 1, 1, 1};
        int[] vb_3 = {2, 2, 2, 2};
        int[] retorno_3;

        retorno_3 = T3.uniao(va_3, vb_3);
        mostrarVetor(retorno_3);

        int[] va_4 = {1, 1, 1, 1};
        int[] vb_4 = {};
        int[] retorno_4;

        retorno_4 = T3.uniao(va_4, vb_4);
        mostrarVetor(retorno_4);

        int[] va_5 = {};
        int[] vb_5 = {};
        int[] retorno_5;

        retorno_5 = T3.uniao(va_4, vb_5);
        mostrarVetor(retorno_5);


        System.out.println();
    }

    public static void q8(){
        System.out.println("## Questão 08 - Interseção ##");

        int[] va_1 = {1, 2, 3, 4};
        int[] vb_1 = {6, 7, 8, 9};
        int[] retorno_1;

        retorno_1 = T3.intersecao(va_1, vb_1);
        mostrarVetor(retorno_1);

        int[] va_2 = {1, 2, 3, 4, 5, 6, 7};
        int[] vb_2 = {5, 6, 7, 8, 9, 10};
        int[] retorno_2;

        retorno_2 = T3.intersecao(va_2, vb_2);
        mostrarVetor(retorno_2);

        int[] va_3 = {1, 1, 1, 1};
        int[] vb_3 = {2, 2, 2, 2};
        int[] retorno_3;

        retorno_3 = T3.intersecao(va_3, vb_3);
        mostrarVetor(retorno_3);

        int[] va_4 = {1, 1, 1, 1};
        int[] vb_4 = {};
        int[] retorno_4;

        retorno_4 = T3.intersecao(va_4, vb_4);
        mostrarVetor(retorno_4);

        int[] va_5 = {};
        int[] vb_5 = {};
        int[] retorno_5;

        retorno_5 = T3.intersecao(va_4, vb_5);
        mostrarVetor(retorno_5);


        System.out.println();
    }

    public static void q9(){
        System.out.println("## Questão 09 - Diferença ##");

        int[] va_1 = {1, 2, 3, 4};
        int[] vb_1 = {6, 7, 8, 9};
        int[] retorno_1;

        retorno_1 = T3.diferenca(va_1, vb_1);
        mostrarVetor(retorno_1);

        int[] va_2 = {1, 2, 3, 4, 5, 6, 7};
        int[] vb_2 = {5, 6, 7, 8, 9, 10};
        int[] retorno_2;

        retorno_2 = T3.diferenca(va_2, vb_2);
        mostrarVetor(retorno_2);

        int[] va_3 = {1, 1, 1, 1};
        int[] vb_3 = {2, 2, 2, 2};
        int[] retorno_3;

        retorno_3 = T3.diferenca(va_3, vb_3);
        mostrarVetor(retorno_3);

        int[] va_4 = {1, 1, 1, 1};
        int[] vb_4 = {};
        int[] retorno_4;

        retorno_4 = T3.diferenca(va_4, vb_4);
        mostrarVetor(retorno_4);

        int[] va_5 = {};
        int[] vb_5 = {};
        int[] retorno_5;

        retorno_5 = T3.diferenca(va_4, vb_5);
        mostrarVetor(retorno_5);


        System.out.println();
    }

    public static void q10(){
        System.out.println("## Questão 10 - Triangulo de Pascal ##");
        
        mostrarMatriz(T3.trianguloDePascal(5));

        mostrarMatriz(T3.trianguloDePascal(10));

        System.out.println();
    }

    public static void q11(){
        System.out.println("## Questão 11 - Matriz Transposta ##");
        
        int[][] m_1 = {{1,2,3},{4,5,6},{7,8,9}};
        mostrarMatriz(T3.matrizTranspor(m_1));

        int[][] m_2 = {{11,2,3,4,15},{12,2,3,4,25},{13,2,3,4,35},{14,2,3,4,45},{15,2,3,4,55}};
        mostrarMatriz(T3.matrizTranspor(m_2));

        System.out.println();
    }

    public static void q12(){
        System.out.println("## Questão 12 - Permutacao de Linhas ##");
        
        int[][] m_1 = {{1,2,3},{4,5,6},{7,8,9}};
        mostrarMatriz(T3.matrizPermutacaoLinhas(m_1, 0, 2));

        int[][] m_2 = {{11,2,3,4,15},{12,2,3,4,25},{13,2,3,4,35},{14,2,3,4,45},{15,2,3,4,55}};
        mostrarMatriz(T3.matrizPermutacaoLinhas(m_2, 1,4));

        System.out.println();
    }

    public static void q13(){
        System.out.println("## Questão 13 - Multiplicação de matrizes ##");
        
        int[][] m1_a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] m2_a = {{1,0,0},{0,1,0},{0,0,0}};
        mostrarMatriz(T3.matrizMultInt(m1_a, m2_a));

        int[][] m1_b = {{11,2,3,4,15},{12,2,3,4,25},{13,2,3,4,35},{14,2,3,4,45},{15,2,3,4,55}};
        int[][] m2_b = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        mostrarMatriz(T3.matrizMultInt(m1_b, m2_b));

        System.out.println();
    }

    public static void mostrarVetor(int v[]){

        for(int i=0; i<v.length;i++){
            System.out.printf("%d ", v[i]);
        }
        System.out.println();

    }

    public static void mostrarMatriz(int m[][]){

        for(int i=0; i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.printf("%d ", m[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void mostrarVetor(boolean v[]){

        for(int i=0; i<v.length;i++){
            System.out.printf("%b ", v[i]);
        }
        System.out.println();

    }
}