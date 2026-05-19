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
    public void gerarAtendimento(Animal a, Servico s){
        Atendimento t= new Atendimento(a,s);
        listaAtendimento.add(t);
    }

    @Override
    public double calcularTotal() {
        double custo;
        double total =0;
        for (Atendimento t: listaAtendimento){
            Animal animal=t.getAnimal();
            Servico servico=t.getServico();
            custo=servico.calcularCusto(animal);
            total+=custo;

        }
        return total;
    }

    @Override
    public String gerarResumo() {
        String resumo = "=== RELATÓRIO ===\n\n";

        resumo += "--- ANIMAIS ---\n";
        for (Animal a : listaAnimal) {
            resumo += "• " + a.getNome() + " - " + a.getPeso() + "kg\n";
        }

        resumo += "\n--- SERVIÇOS DISPONÍVEIS ---\n";
        for (Servico s : listaServico) {
            resumo += "• " + s.getDescricao() + " (" + s.getDuracao() + " min)\n";
        }

        resumo += "\n--- ATENDIMENTOS ---\n";
        for (Atendimento atend : listaAtendimento) {
            double custo = atend.getServico().calcularCusto(atend.getAnimal());
            resumo += "• " + atend.getAnimal().getNome() + " - "
                    + atend.getServico().getDescricao()
                    + " - R$ " + String.format("%.2f", custo) + "\n";
        }

        resumo += "\n--- TOTAL ---\n";
        resumo += "Total: R$ " + String.format("%.2f", calcularTotal()) + "\n";

        return resumo;

    }
}
