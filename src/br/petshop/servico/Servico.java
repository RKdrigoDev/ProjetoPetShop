package br.petshop.servico;

import br.petshop.animal.Animal;

public abstract class Servico {
    private String descricao;
    private int duracao;

    public Servico(String descricao, int duracao) {
        this.descricao = descricao;
        this.duracao = duracao;
        }
    public abstract double calcularCusto(Animal a);

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}

