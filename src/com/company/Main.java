package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Exercicio 1 correcao
        String apelido = "Gomez";
        int idade = 35;
        boolean False;
        double saldo = 45857.90;
        String nome1 = "Julian";

        //Exercicio 2 nomes de variaveis errados
        //  String 1nome;  numero nao pode ser usado na primeira letra da variavel
        //String @pellido; arroba nao pode ser usado na variavel
        //boolean carteira de motorista; espaco nao pode ser usado na variavel
        //double altura da pessoa; certo seria double altura_da_pessoa;
        //int quantidade-de-filhos; "-" nao pode ser usado na variavel


        // Exercicio 3
        int precoDoDia = 2;

        System.out.println("Digite a quantidade de dias: ");
        Scanner teclado = new Scanner(System.in);
        int numeroDedias = teclado.nextInt();

        double custoTotalCampanha = precoDoDia * numeroDedias;
        System.out.println("O custo total da campanha é : "+custoTotalCampanha);

        // Exercicio 4
        double premioTotal;

        double imposto1 = 0.0245; // 2.45 / 100 porcentagem
        double imposto2 = 0.15;
        double impost3 = 0.03;
        double totalImposto = imposto1+imposto2+impost3;
        System.out.println("Valor total de imposto: "+totalImposto);

        System.out.printf("Digite o valor do Premio: ");
        //usando a variavel teclado ja declarada no exercicio 3
        double valorDoPremio = teclado.nextDouble();


        double valorDoPremioComImposto = valorDoPremio - (valorDoPremio * totalImposto) ;
        System.out.println("valor total a receber com impostos " + valorDoPremioComImposto);

    }
}
