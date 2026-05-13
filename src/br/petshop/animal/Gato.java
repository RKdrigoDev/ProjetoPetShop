package br.petshop.animal;

import java.util.Scanner;

public class Gato extends Animal {
    private String pelo;
    public Gato(String nome, double peso) {
        super(nome, peso);
        pelo="";
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public double calcularPrecoBase(){
        Scanner sc=new Scanner(System.in);
        double preco;

        do {
            System.out.println("o pelo do seu gato é longo ou curto");
            pelo=sc.next();
        }while (!pelo.equalsIgnoreCase("curto")&&!pelo.equalsIgnoreCase("longo"));
        if (pelo.equalsIgnoreCase("longo")){
            preco=65;
        }
        else {
            preco=45;
        }
        return preco;
    }
}
