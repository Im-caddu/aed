package trabalhos;

public class Bim2R2 {
    public static int mdcRec(int x, int y){
        // MDC recursivo
        // http://darlonv.github.io/conteudo/AED/recursividade-ex
        
        //#######################################
        //Implemente aqui sua solução

        
        return 0; //modifique para o retorno correto
        //#######################################
    }

    public static int potenciaRec(int x, int y){
        // Potencia recursiva
        // http://darlonv.github.io/conteudo/AED/recursividade-ex

        //#######################################
        //Implemente aqui sua solução


        return 0; //modifique para o retorno correto
        //#######################################
    }

    public static int fibonacciRec(int x){
        // Fibonacci recursivo
        // http://darlonv.github.io/conteudo/AED/recursividade-ex

        //#######################################
        //Implemente aqui sua solução


        return 0; //modifique para o retorno correto
        //#######################################
    }

    public static void testes(){
        
        testesMDCRec();
        testesPotenciaRec();
        testesFibonacciRec();
    }

    public static boolean testeMDCRec(int x, int y, int re){

        int ro = mdcRec(x, y); 
        if( ro != re)
        {
            System.err.printf("x: %d - y: %d - esperado: %d - retornado: %d\n", x, y, re, ro);
            return false;
        }

        return true;
    }

    public static void testesMDCRec(){
        int x, y;
        int re;
        boolean ok = true;

        x = 5; y = 5; re = 5;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 5; y = 1; re = 1;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 5; y = 10; re = 5;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 5; y = 9; re = 1;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 5; y = 4; re = 1;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 10; y = 15; re = 5;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 5; y = 20; re = 5;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 6; y = 9; re = 3;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 6; y = 15; re = 3;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 114; y = 779; re = 19;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 114; y = 780; re = 6;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 114; y = 779; re = 19;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 490; y = 28; re = 14;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 490; y = 30; re = 10;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 555; y = 900; re = 15;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 555; y = 925; re = 185;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 590; y = 20; re = 10;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 590; y = 36; re = 2;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 590; y = 177; re = 59;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 590; y = 236; re = 118;
        if(!testeMDCRec(x, y, re)) ok = false;

        x = 793; y = 427; re = 61;
        if(!testeMDCRec(x, y, re)) ok = false;

        if(ok){
            System.out.println("Testes MDC ok!");
        }else{
            System.err.println("Testes MDC com erros.");
        }

    }

    

    public static boolean testePotenciaRec(int x, int y, int re){
        int ro = potenciaRec(x, y); 
        if( ro != re)
        {
            System.err.printf("x: %d - y: %d - esperado: %d - retornado: %d\n", x, y, re, ro);
            return false;
        }

        return true;
    }

    public static void testesPotenciaRec(){
        int x, y;
        int re;
        boolean ok = true;


        x = 1; y = 1; re = 1;
        if(!testePotenciaRec(x, y, re)) ok = false;

        x = 1; y = 10; re = 1;
        if(!testePotenciaRec(x, y, re)) ok = false;

        x = 1; y = 0; re = 1;
        if(!testePotenciaRec(x, y, re)) ok = false;
        
        x = 10; y = 1; re = 10;
        if(!testePotenciaRec(x, y, re)) ok = false;

        x = 10; y = 2; re = 100;
        if(!testePotenciaRec(x, y, re)) ok = false;

        x = 10; y = 3; re = 1000;
        if(!testePotenciaRec(x, y, re)) ok = false;

        x = 3; y = 3; re = 27;
        if(!testePotenciaRec(x, y, re)) ok = false;

        x = 5; y = 0; re = 1;
        if(!testePotenciaRec(x, y, re)) ok = false;

        x = 5; y = 1; re = 5;
        if(!testePotenciaRec(x, y, re)) ok = false;

        x = 5; y = 2; re = 25;
        if(!testePotenciaRec(x, y, re)) ok = false;

        x = 5; y = 3; re = 125;
        if(!testePotenciaRec(x, y, re)) ok = false;

        x = 5; y = 4; re = 625;
        if(!testePotenciaRec(x, y, re)) ok = false;

        x = 5; y = 5; re = 3125;
        if(!testePotenciaRec(x, y, re)) ok = false;

        x = 5; y = 6; re = 15625;
        if(!testePotenciaRec(x, y, re)) ok = false;

        x = 5; y = 5; re = 3125;
        if(!testePotenciaRec(x, y, re)) ok = false;

        x = 0; y = 1; re = 0;
        if(!testePotenciaRec(x, y, re)) ok = false;

        x = 0; y = 2; re = 0;
        if(!testePotenciaRec(x, y, re)) ok = false;

        x = 0; y = 3; re = 0;
        if(!testePotenciaRec(x, y, re)) ok = false;


        if(ok){
            System.out.println("Testes potencia ok!");
        }else{
            System.err.println("Testes potencia com erros.");
        }

    }

    public static boolean testeFibonacciRec(int x, int re){
        int ro = fibonacciRec(x); 
        if( ro != re)
        {
            System.err.printf("x: %d - esperado: %d - retornado: %d\n", x, re, ro);
            return false;
        }

        return true;
    }

    public static void testesFibonacciRec(){
        int x;
        int re;
        boolean ok = true;


        x = 1; re = 1;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 2; re = 1;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 3; re = 2;
        if(!testeFibonacciRec(x, re)) ok = false;
        
        x = 4; re = 3;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 5; re = 5;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 6; ; re = 8;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 7; re = 13;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 8; re = 21;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 9; re = 34;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 10; re = 55;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 11; re = 89;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 12; re = 144;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 13; re = 233;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 14; re = 377;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 15; re = 610;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 16; re = 987;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 17; re = 1597;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 18; re = 2584;
        if(!testeFibonacciRec(x, re)) ok = false;

        x = 20; re = 6765;
        if(!testeFibonacciRec(x, re)) ok = false;

        if(ok){
            System.out.println("Testes Fibonacci ok!");
        }else{
            System.err.println("Testes Fibonacci com erros.");
        }

    }
}
