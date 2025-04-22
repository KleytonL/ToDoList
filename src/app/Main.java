package app;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import model.*;

public class Main {
    public static void main(String[] args) {

        int opt;

        Scanner sc = new Scanner(System.in);
        List<Afazeres> listas = new ArrayList<>();

        System.out.println("----- Lista de Afazeres! -----");

        do {
            System.out.println("\n------- Menu principal -------");
            System.out.println("------------------------------");
            System.out.println("--- 1 - Criar nova lista -----");
            System.out.println("----- 2 - Deletar lista ------");
            System.out.println("---- 3 - Mostrar listas ------");
            System.out.println("---------- 0 - Sair ----------");
            System.out.println("------------------------------");
            System.out.print("Escolha uma alternativa: ");
            opt = sc.nextInt();

            switch(opt) {
                case 1:
                    System.out.println("Defina seu objetivo: ");
                    sc.nextLine();
                    String objetivo = sc.nextLine();

                    System.out.println("Defina a meta: ");
                    String meta = sc.nextLine();

                    listas.add(new Afazeres(objetivo, meta));

                    System.out.println("Afazer adicionado a lista...");
                    break;
                case 2:
                    System.out.println("Escolha a lista que deseja deletar: ");
                    int i = sc.nextInt();
                    listas.remove((i-1));

                    System.out.println("Afazer removido da lista...");
                    break;
                case 3:
                    for(Afazeres l : listas) {
                        System.out.println(l);
                    }
                    break;
                case 0:
                    System.out.println("Terminando programa...");
                    break;
            }

        } while (opt != 0);
    }
}