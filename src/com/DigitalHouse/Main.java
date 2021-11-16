package com.DigitalHouse;

import Atividade02.CarroCorrida;

public class Main {

    public static void main(String[] args) {

//        Pessoa albertEinstein = new Pessoa(14,03,1879, "Albert Einstein");
//
//        albertEinstein.calculaIdade();
//        albertEinstein.informarIdade();
//
//        Pessoa isaacNewton = new Pessoa(04,01,1643, "Isaac Newton");
//        isaacNewton.calculaIdade();
//        isaacNewton.informarIdade();

        // =========================== exercicio 2

        CarroCorrida carro = new  CarroCorrida(2, "Airton", "Ferrai", 250.99f, 0f, false );

        carro.ligar();
        carro.acelerar(150f);
        carro.acelerar(20);
        carro.desligar();
        carro.frear(0.50f);
        carro.parar();
        carro.desligar();

    }
}
