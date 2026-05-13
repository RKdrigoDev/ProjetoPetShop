package br.petshop.animal;

import java.util.Scanner;

public class Cachorro extends Animal {

    public Cachorro(String nome, double peso) {
        super (nome,peso);
    }
    public double calcularPrecoBase(){
        double preco;
        Scanner sc=new Scanner(System.in);
        System.out.println("digite o peso do seu cachorro --> ");
        peso= sc.nextDouble();
        if (peso<=10){
            preco=40;
        } else if (peso<=25) {
            preco=60;

        }
        else {
            preco=85;
        }
        return preco;
    }
}

