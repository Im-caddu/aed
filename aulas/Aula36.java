package aulas;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import libs.Vetores;
import libs.Tempo;

public class Aula36 {
    public static void aula() {
        System.out.println("++ Aula 36 dia 08/11/2024 ++");
        System.out.println("## Listas e Conjuntos ##");
        // ex01();
        ex02();
        // ex03();
        // ex04();
    }

    public static void ex01() {
        // LinkedList <Integer> lista = new LinkedList<>();
        ArrayList <Integer> lista = new ArrayList<>();
        int i;
        int x;

        lista.add(1);
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60);
        lista.add(10);
        lista.add(20);
        lista.add(30);

        // for ()
    }

    public static void ex02() {
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);
        conjunto.add(40);
        conjunto.add(20);
        conjunto.add(50);

        for (int y: conjunto) {
            System.out.println(y);
        }

        System.out.printf("Elemento 30 está no conjunto? %b\n", conjunto.contains(30));
        System.out.printf("Elemento 70 está no conjunto? %b\n", conjunto.contains(70));

        Iterator<Integer> it = conjunto.iterator();
        System.out.println(it.hashCode());
    }
}
