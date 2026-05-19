package br.petshop.petshop;

import br.petshop.animal.Animal;
import br.petshop.interfaces.Calculavel;
import br.petshop.interfaces.Relatorio;
import br.petshop.servico.Atendimento;
import br.petshop.servico.Servico;

import java.util.ArrayList;

public class PetShop implements Relatorio, Calculavel {
    private ArrayList<Animal> listaAnimal= new ArrayList<>();
    private ArrayList<Servico> listaServico=new ArrayList<>();
    private ArrayList<Atendimento> listaAtendimento=new ArrayList<>();

    public void cadastrarAnimal(Animal a){
        listaAnimal.add(a);
    }
    public void registrarServico(Servico s){
        listaServico.add(s);
    }

    @Override
    public double calcularTotal() {
        double total =0;
        for (Servico i: listaServico){

        }
    }

    @Override
    public String gerarResumo() {
        String resumo = "=== RELATÓRIO ===\n";
        for (Animal a : listaAnimal){
            resumo+= a.getNome()+"- Peso: "+a.getPeso()+"kg\n";
        }
        return resumo;
    }
}
