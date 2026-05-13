package br.petshop.animal;

public abstract class Animal {
    String nome;
    double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }
    public abstract double calcularPrecoBase();

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                '}';
    }
}
