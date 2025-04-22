package model;

import java.time.LocalDate;
import util.Formatador;

public class Afazeres {
    private String nome;
    private String descricao;
    private LocalDate data = LocalDate.now();

    public Afazeres() {}

    public Afazeres(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "\n----- Objetivo: " + nome + " --- Criado dia: " + Formatador.formatDate(data) + " -----\n" +
                " * Meta: " + descricao + "\n";
    }

}
