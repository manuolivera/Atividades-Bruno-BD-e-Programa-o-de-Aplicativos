class Main {
  public static void main(String[] args) {

  //Atividade 1
    double notaP1 = 5;
    double notaP2 = 5;
    double media = (notaP1 + notaP2)/2;

    if(media >= 6){
      System.out.println("Você foi aprovado");
    }
    else if(media < 6){
      System.out.println("Você foi para exame");
    }
      double notaExame = 5;
      double novaMedia = (media + notaExame)/2;
      if(novaMedia >= 6){
        System.out.println("Você foi aprovado pelo exame");
      }
      else if (novaMedia < 6){
        System.out.println("Você foi reprovado pelo exame");
      }

  System.out.println(" ");
  //Atividade 2
    int idade = 10;

    if(idade <= 10){
     System.out.println("Infantil"); 
    }
    else if(idade <= 13){
      System.out.println("infanto juvenil");
    }
    else if(idade <= 18){
      System.out.println("juvenil");
    }
    else if(idade > 18){
      System.out.println("Adulto");
    }

  System.out.println(" ");
  //Atividade 3

    //Codigos dos produtos
    int produto1 = 1;
    int produto2 = 2;
    int produto3 = 3;
    int produto4 = 4;
    int produto5 = 5;

    //Nome dos produtos
    String nomeProduto1 = "Cachorro Quente";
    String nomeProduto2 = "X-Salada";
    String nomeProduto3 = "X-Bacon";
    String nomeProduto4 = "Torrada simples";
    String nomeProduto5 = "Refrigerante";

    //Valores produtos
    double valorProduto1 = 4.0;
    double valorProduto2 = 4.50;
    double valorProduto3 = 5.00;
    double valorProduto4 = 2.00;
    double valorProduto5 = 1.50;

    //Quantidade itens
    int qtdItem1 = 8;
    int qtdItem2 = 4;
    int qtdItem3 = 10;
    int qtdItem4 = 0;
    int qtdItem5 = 2;

    //Valor total
    double valorTotal = (
      (valorProduto1 * qtdItem1)
      +
      (valorProduto2 * qtdItem2)
      +
      (valorProduto3 * qtdItem3)
      +
      (valorProduto4 * qtdItem4)
      +
      (valorProduto5 * qtdItem5));

    System.out.println(qtdItem1 + "x " + nomeProduto1);
    System.out.println(qtdItem2 + "x " + nomeProduto2);
    System.out.println(qtdItem3 + "x " + nomeProduto3);
    System.out.println(qtdItem4 + "x " + nomeProduto4);
    System.out.println(qtdItem5 + "x " + nomeProduto5);
    System.out.println("Você deve pagar: " + valorTotal + " reais");

    System.out.println(" ");
    //Atividade 4

    //Valores peças
    double valorPeca1 = 20;

    //Classficiação
    int A = 1;
    int B = 2;
    int C = 3;
    int D = 4;

    //Classficiação da peça
    int classficiaçãoPeca1 = 4;

    //Estrutura if e else
    if(classficiaçãoPeca1 == 1){
      System.out.println("Você recebeu 10% de desconto");
      System.out.println(valorPeca1 * 0.9);
    }
    else if(classficiaçãoPeca1 == 2){
      System.out.println("Você recebeu 15% de desconto");
      System.out.println(valorPeca1 * 0.85);
    }
    else if(classficiaçãoPeca1 == 3){
      System.out.println("Você recebeu 20% de desconto");
      System.out.println(valorPeca1 * 0.8);
    }
    else if(classficiaçãoPeca1 == 4){
      System.out.println("Você recebeu 5% de acrésimo");
      System.out.println(valorPeca1 * 1.05);
    }

  }
}