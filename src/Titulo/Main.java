package Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Title titulo = new Title("O nome do vento");
        Title titulo2 = new Title("A crônica do matador do Rei");
        Title titulo3 = new Title("O mago");

        ArrayList<Title> arrayListaDeTitulos = new ArrayList<>();
        arrayListaDeTitulos.add(titulo);
        arrayListaDeTitulos.add(titulo2);
        arrayListaDeTitulos.add(titulo3);

        System.out.println(arrayListaDeTitulos);

        Collections.sort(arrayListaDeTitulos);
        System.out.println(arrayListaDeTitulos);
        
        List<Title> listaTitulos = new ArrayList<>();
        listaTitulos.add(titulo);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);

        System.out.println(listaTitulos);
        Collections.sort(listaTitulos);
        System.out.println(listaTitulos);

        List<Title> linkedListaDeTitulos = new LinkedList<>();
        linkedListaDeTitulos.add(titulo);
        linkedListaDeTitulos.add(titulo2);
        linkedListaDeTitulos.add(titulo3);

        System.out.println(linkedListaDeTitulos);
        Collections.sort(linkedListaDeTitulos);
        System.out.println(linkedListaDeTitulos);
    }
}
