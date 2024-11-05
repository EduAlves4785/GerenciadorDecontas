package application;

import entities.Despesa;
import entities.Gerenciador;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Despesa> despesas=new ArrayList<Despesa>();
        Gerenciador gerencia = new Gerenciador(despesas);

        char exit = 'T';

        while (exit == 'T') {
            System.out.println("");
            System.out.println("------ Gerenciador de despesas ------");
            System.out.println("");
            System.out.println("Qual operacao deseja fazer?");
            System.out.println("Digite 1 para adicionar uma despesa");
            System.out.println("Digite 2 para remover uma despesa");
            System.out.println("Digite 3 para listar suas despesas");
            System.out.println("Digite 4 para calcular o total de suas despesas");
            System.out.println("Ditie 5 para sair");
            System.out.print(": ");
            int operacao = sc.nextInt();

            if (operacao != 1 && operacao != 2 && operacao != 3 && operacao != 4 && operacao != 5) {
                System.out.println(" ");
                System.out.println("Operacao invalida!");
                System.out.println(" ");
            }
            
            if (operacao == 1) {
                System.out.print("Digite o dia: ");
                int dia = sc.nextInt();
                System.out.print("Digite o mes, apenas em numero: ");
                int mes = sc.nextInt();
                System.out.print("Digite o ano: ");
                int ano = sc.nextInt();
                System.out.println(" ");

                LocalDate data = LocalDate.of(ano,mes,dia);

                sc.nextLine();
                System.out.print("Faca uma breve descricao de sua despesa: ");
                String descricao = sc.nextLine();
                
                System.out.println("");

                System.out.print("Digite o valor da despesa: ");
                double valorDespesa = sc.nextDouble();
                
                System.out.println("");

                gerencia.adicionarDespesa(new Despesa(data,descricao,valorDespesa));
                System.out.println("Nova despesa adicionada, atualizando lista: ");
                gerencia.listarDespesas();

            }
            
            if (operacao == 2){
                System.out.println("Qual despesa deseja remover?");
                System.out.println("------------------------");
                gerencia.listarDespesas();
                System.out.println("------------------------");
                System.out.print("Coloque o numero correspondente: ");
                gerencia.removerDespesa(sc.nextInt()-1);
                System.out.println("");
                System.out.println("Despesa removida, lista atualizada: ");
                gerencia.listarDespesas();
            }
            
            if (operacao == 3){
                gerencia.listarDespesas();
            }
            
            if (operacao == 4){
                System.out.println("----------------------------------");
                System.out.println("Valor total de suas despesas:");
                System.out.println(gerencia.calcularTotal());
                System.out.println("----------------------------------");
            }
            
            if (operacao == 5){
                exit='F';
            }
        }

        
        sc.close();
    }
    
}
