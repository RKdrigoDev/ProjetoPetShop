package br.petshop.animal;

public abstract class Animal {
    private String  nome;
    private double peso;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
