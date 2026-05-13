package br.petshop.servico;

import br.petshop.animal.Animal;

import java.util.Scanner;

public class Banho extends Servico{
    public Banho(String descricao, int duracao, Animal animal) {
        super(descricao,duracao,animal);

    }
    public double calcularCusto(Animal a){
        Scanner sc=new Scanner(System.in);
        double custo;
        custo=a.calcularPrecoBase()+(duracao*0.5);
        return custo;
    }
}
