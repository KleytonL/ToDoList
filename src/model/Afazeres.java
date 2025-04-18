package model;

import java.time.LocalDate;

public class Afazeres {
    private String nome;
    private String descricao;
    private LocalDate data;

    public Afazeres() {}

    public Afazeres(String nome, String descricao, LocalDate data) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
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

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData(){
        return data;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "- Data: " + data + "\n" +
                "Descrição: " + descricao;
    }

}
