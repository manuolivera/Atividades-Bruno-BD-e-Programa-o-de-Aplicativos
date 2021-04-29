package sample;

import sample.Model.Conta;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner valores1 = new Scanner(System.in);
        Conta conta1 = new Conta("120830");
        conta1.setNomeTitular("Emanuelli De Oliveira");
        conta1.simOuNao();
        System.out.println(conta1);

        conta1.deposito();
        System.out.println(conta1);


        System.out.println("Você solicitou um saque, digite o valor:");
        double saque = valores1.nextDouble();
        conta1.saque(saque);
        System.out.println(conta1);

        conta1.trocarNome();


        System.out.println(conta1);


        System.out.println("segunda conta:\n\n");

        Conta conta2 = new Conta("301012");
        conta2.setNomeTitular("Valentina De Oliveira");
        conta2.simOuNao();
        System.out.println(conta2);

        conta2.deposito();
        System.out.println(conta2);


        System.out.println("Você solicitou um saque, digite o valor:");
        double saque2 = valores1.nextDouble();
        conta2.saque(saque2);
        System.out.println(conta2);

        conta2.trocarNome();

        System.out.println(conta2);


        System.out.println("terceira conta:\n\n");

        Conta conta3 = new Conta("");
        conta3.setNomeTitular("João Anacleto");
        conta3.simOuNao();
        System.out.println(conta3);
        conta3.deposito();
        System.out.println(conta3);


        System.out.println("Você solicitou um saque, digite o valor:");
        double saque3 = valores1.nextDouble();
        conta3.saque(saque3);
        System.out.println(conta3);

        conta3.trocarNome();

        System.out.println(conta3);

    }
}
