package aulas;

public class Aula23 {
    public static void main(String[] args) {
        String st1, st2, st3;
        int i;
  
        st1 = "Algoritmos";
        st2 = "Estruturas de dados";
  
        System.out.println(st1.equals(st2));     // false
        System.out.println(st1.length());        // 10
        System.out.println(st1.charAt(7));       // 'm'
        System.out.println(st1.substring(0, 4)); // "Algo"
        System.out.println(st1.toUpperCase());   // "ALGORITMOS"
        System.out.println(st1.toLowerCase());   // "algoritmos"
        System.out.println(st1.concat(st2));     // "AlgoritmosEstruturas de dados"
        System.out.println(st1.concat(" e ").concat(st2));// "Algoritmos e Estruturas de dados"
        System.out.println(st1 + " e " + st2);   // "Algoritmos e Estruturas de dados"
        st3 = st1 + " e " + st2; // st3 = "Algoritmos e Estruturas de dados"
        System.out.println(st3); // "Algoritmos e Estruturas de dados"
  
        for (i = 0; i < st1.length(); i++) {     // Percorre cada caractere
            System.out.println(st1.charAt(i));   // Mostra Cada caractere de "Algoritmos"
        }
    }
}