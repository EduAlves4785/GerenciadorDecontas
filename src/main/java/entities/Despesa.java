/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author EDUARDO
 */
public class Despesa {
    private LocalDate data;
    private String descricao;
    private Double valor;
    
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy",Locale.getDefault());
    
    public Despesa(LocalDate data, String descricao, Double valor) {
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return 
                "| Descricao: "+this.descricao+"\n"
        +       "| Valor: R$"+this.valor+"\n"
        +       "| Data: "+data.format(fmt1);
    }

}
