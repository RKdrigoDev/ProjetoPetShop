package br.petshop.servico;

import br.petshop.animal.Animal;

public abstract class Servico {
    String descricao;
    int duracao;

    public Servico(String descricao, int duracao) {
        this.descricao = descricao;
        this.duracao = duracao;
        }
    public abstract double calcularCusto(Animal a);

}

