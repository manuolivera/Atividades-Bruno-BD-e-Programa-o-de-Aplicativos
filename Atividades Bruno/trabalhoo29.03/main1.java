
package sample;

import java.util.Scanner;
import sample.model.exe1;

public class main1 {
    public main1() {
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        exe1 e = new exe1();
        exe1 e2 = new exe1();
        System.out.println("Digite o nome da primeira pessoa: ");
        e.nome = leitura.nextLine();
        System.out.println("Digite o nome da segunda pessoa: ");
        e2.nome = leitura.nextLine();
        System.out.println("Digite a idade de " + e.nome);
        e.idade = leitura.nextInt();
        System.out.println("Digite a idade de " + e2.nome);
        e2.idade = leitura.nextInt();
        System.out.println("Dados da Primeira pessoa:\n" + e.imprimir());
        System.out.println("Dados da Segunda pessoa:\n" + e2.imprimir());
        if (e.idade > e2.idade) {
            System.out.println("Pessoa mais velha: " + e.nome);
        } else if (e.idade == e2.idade) {
            System.out.println("As idades são iguais");
        } else {
            System.out.println("Pessoa mais velha: " + e2.nome);
        }

    }
}
