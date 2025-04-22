package app;

import java.util.Scanner;
import model.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome, descricao;

        System.out.println("Lista de Afazeres!");

        System.out.println("Escolha o nome da sua lista: ");
        nome = sc.nextLine();

        System.out.println("Escreva a descrição da lista");
        descricao = sc.nextLine();

        Afazeres lista1 = new Afazeres(nome, descricao);

        System.out.println(lista1);

    }
}