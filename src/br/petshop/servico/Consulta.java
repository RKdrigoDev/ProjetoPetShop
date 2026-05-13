package br.petshop.servico;

import br.petshop.animal.Animal;

public class Consulta extends Servico{
    public Consulta(String descricao, int duracao, Animal animal) {
        super(descricao, duracao, animal);
    }
    public double calcularCusto(Animal a){
        double preco;
        preco=a.calcularPrecoBase()+35;
        return preco;
    }
}
