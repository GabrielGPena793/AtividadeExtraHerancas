package Atividade01;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private int idade, diaNasc, mesNasc, anoNasc;
    private String nome;

    public Pessoa(int diaNasc, int mesNasc, int anoNasc, String nome) {
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.nome = nome;
    }

    public void calculaIdade(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataPessoa = LocalDate.of(this.anoNasc,this.mesNasc,this.diaNasc);

        Period periodo = Period.between(dataPessoa, dataAtual);
        this.idade = periodo.getYears();
    }

    public void informarIdade(){
        System.out.println(this.nome + " a sua idade atual é " + this.idade + " anos" );
    }

    public void ajustaDataDeNascimento(int ano, int mes, int dia){
        this.anoNasc = ano;
        this.mesNasc = mes;
        this.diaNasc = dia;
    };
}
