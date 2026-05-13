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

    @Override
    public double calcularTotal() {
        return 0;
    }

    @Override
    public String gerarResumo() {
        return "";
    }
}
