package br.petshop.servico;

import br.petshop.animal.Animal;

public abstract class Servico {
    String descricao;
    int duracao;
    Animal animal;

    public Servico(String descricao, int duracao, Animal animal) {
        this.descricao = descricao;
        this.duracao = duracao;
        this.animal=animal;
        }
    public abstract double calcularCusto(Animal a);

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", duracao=" + duracao +
                 animal.toString() +
                '}';
    }
}

