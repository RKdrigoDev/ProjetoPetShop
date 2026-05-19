package br.petshop.animal;



public class Cachorro extends Animal {

    public Cachorro(String nome, double peso) {
        super (nome,peso);
    }
    public double calcularPrecoBase(){
        double preco;
        System.out.println("digite o peso do seu cachorro --> ");
        if (getPeso()<=10){
            preco=40;
        } else if (getPeso()<=25) {
            preco=60;

        }
        else {
            preco=85;
        }
        return preco;
    }
}

