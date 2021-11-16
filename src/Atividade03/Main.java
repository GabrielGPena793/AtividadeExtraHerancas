package Atividade03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha seu ingresso, digite 1 - Normal ou 2 - Vip");
        int resposta = scanner.nextInt();

        if (resposta == 1){
            Normal ingressoNormal = new Normal(80);
            ingressoNormal.imprimir();
            double valor = ingressoNormal.imprimeValor();
            System.out.println("valor do ingresso: R$" + valor);
        }else {
            System.out.println("Ingresso vip selecionado");
            System.out.println("Escolha o camorote, digite 1 - Camarote superior ou 2 - Camarote inferior");
            resposta = scanner.nextInt();

            if (resposta == 1) {
                CamaroteSuperior superior = new CamaroteSuperior(80,40,30);
                double valor = superior.imprimeValor();
                System.out.println("Camarote Superior selecionado, valor do ingresso: R$" + valor);
            }else {
                CamaroteInferior inferior = new CamaroteInferior(80,40);
                double valor = inferior.imprimeValor();

                System.out.println("Camarote inferior selecionado, valor do ingresso: R$" + valor);
            }
        }
    }
}
