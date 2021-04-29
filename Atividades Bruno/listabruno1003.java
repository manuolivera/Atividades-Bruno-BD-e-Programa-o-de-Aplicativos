//1
public static int produto(int a, int b){
        return a * b;
    }
int n1 = 10, n2 = 5;
        int r = produto(n1, n2);
        System.out.println("Produto: " + r);
//2
public static int divisao(int a, int b){
        return a / b;
    }
 System.out.println("Divisão: " + divisao(n1,n2));
//3
imprimir1_100();
public static void imprimir1_100(){
        for(int i=1; i<=100 ; i++){
            System.out.print(i + " ");
        }
    }
//4
public static void imprimirVetor(int []a){
         for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
    }
int []v1 = {1,2,3,4,5};
        int []v2 = {1,2,3,4,5};
        int []res = new int[5];
        
        for(int i=0; i<v1.length; i++)
            res[i] = v1[i] + v2[i];
        
        imprimirVetor(v1);
        imprimirVetor(v2);
        imprimirVetor(res);
//5
int []vet1 = {10,20,30,40,50};
        int []vet2 = new int[5];
        
        for(int i=0, j=4; i<vet1.length; i++, j--)
            vet2[i] = vet1[j];            
        
        imprimirVetor(vet1);
        imprimirVetor(vet2);
//6
int []idade = {16,17,20,16,22,18,19,16,18,20};
        int menorIdade = 120;
        for(int i=0; i<idade.length; i++){
            if(idade[i] < menorIdade)
                menorIdade = idade[i];
        }
        System.out.println("Menor Idade: "+menorIdade);
        
        int qtdIgualMenorIdade = 0;
        for(int i=0; i<idade.length; i++){
            if(idade[i] == menorIdade)
                qtdIgualMenorIdade++;
        }
        System.out.println("A qtd de idade igual(is) a menor idade é: " + qtdIgualMenorIdade);    
//7
char []g = {'a','a','a','a','a','b','b','b','b','b'};
        char []r = {'a','a','a','a','a','c','c','c','c','c'};
        
        int acertos = 0;
        for(int i=0; i<g.length; i++){
            if(g[i] != r[i])//errou
                System.out.println("Errou a questão: " + (i+1));
            else //acertou
                acertos++;
        }
        if(acertos >= 6)
            System.out.println("Aprovado com "+acertos+" acertos");
        else 
            System.out.println("Reprova
 System.out.println("Reprovado com "+acertos+" acertos");
//8
int []vA = {45,8,20,13,15,9,10,8,51,14};
        int []vB = new int[5];
        int j=0;
        for(int i=0; i<vA.length; i++){
            if(i %2== 0){ //se a posição for par
                vB[j] = vA[i];
                j++;
            }
        }
        imprimirVetor(vA);
        imprimirVetor(vB);

 int []vC = new int[5];
        for(int i=0; i<vB.length; i++){
            vC[i] = vA[i]+vB[i];
        }
        imprimirVetor(vC);
}    
    //1ª
    public static int produto(int a, int b){
        return a * b;
    }
    
    //2ª
    public static int divisao(int a, int b){
        return a / b;
    }
    
    //3ª 
    public static void imprimir1_100(){
        for(int i=1; i<=100 ; i++){
            System.out.print(i + " ");
        }
        imprimir101_200();
    }
    public static void imprimir101_200(){
        for(int i=101; i<=200 ; i++){
            System.out.print(i + " ");
        }
        imprimir201_300();
    }
    public static void imprimir201_300(){
        for(int i=201; i<=300 ; i++){
            System.out.print(i + " ");
        }
    }
    
    public static void imprimirVetor(int []a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}

     