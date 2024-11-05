/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.List;

/**
 *
 * @author EUARO
 */
public class Gerenciador {
    private List<Despesa> despesas;

    public Gerenciador(List<Despesa> despesas) {
        this.despesas = despesas;
    }

    public void adicionarDespesa(Despesa despesa){
        despesas.add(despesa);
    }
    
    public void removerDespesa(int indice){
        despesas.remove(indice);
    }

    public void listarDespesas(){
        System.out.println("Despesas atuais: ");
        int count=1;
        for (Despesa despesa : despesas) {
            System.out.println("-------------------");
            System.out.println("Despesa "+count+": \n"+despesa);
            System.out.println("-------------------");
            count++;
        }
    }
    
    public Double calcularTotal(){
        double total=0;
        for (Despesa despesa : despesas) {
            total+=despesa.getValor();
        }
        return total;
    }
  
}
