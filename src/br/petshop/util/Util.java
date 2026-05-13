package br.petshop.util;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
public class Util {
    public void menu(){
        String aux;

        aux= """
                1. Cadastrar Animal
                2. Registrar Serviço
                3. Calcular Conta Total
                4. Imprimir Relatório
                5. Finalizar
                """;
        int opcao=0;
        do{

            try{
                opcao=parseInt(showInputDialog(aux));
            }
            catch(NumberFormatException e){
                showMessageDialog(null,"a opção ser um" + "numero inteiro");
            }
        }while (opcao!=5);
    }

}
