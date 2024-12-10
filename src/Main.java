
import java.sql.SQLOutput;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tamanho;

        System.out.printf("Quantos numero vc irá digita? ");
        tamanho = sc.nextInt();

        double[] array = new double[tamanho];

        for (int i = 0; i < tamanho; i++){
            System.out.println("Digite um numero: ");
            array[i] = sc.nextDouble();
        }

        System.out.println("NUMEROS DIGITADOS:");
        for (double atual : array){
            System.out.println(atual);
        }

        // Exercicio 2 | Negativos
        System.out.println("-------------------------------");
        int n, numberNegativos;

        System.out.printf("Quantos numeros vc vai digitar?: ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMERO NEGATIVOS:");

        for(int atual : vetor ){
            if(atual < 0){
                System.out.println(atual);
            }
        }


        System.out.println("-------------------------------");
        // Exercicio 3 | Soma_vetor

        double   soma, media;
        int nDigitado;

        soma = 0;


        System.out.printf("Quantos numeros voce vai digitar? ");
        nDigitado = sc.nextInt();

        double[] nArray = new double[nDigitado];

        for(int i = 0; i < nDigitado; i++){
            System.out.printf("Digite um numero: ");
            nArray[i] = sc.nextDouble();
        }

        for (double atual : nArray){
            soma += atual;
        }

        System.out.printf("VALORES = ");
        for (double atual : nArray){
            System.out.printf("%.1f ", atual);
        }

        media = soma / nDigitado;

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        System.out.println("-------------------------------");
        // Exercicio 4 | Alturas

        int nPessoas, nMenores;
        double alturaTotal, alturaMedia, porcentagem;


        System.out.printf("Quantas pessoas serão digitadas: ");
        nPessoas = sc.nextInt();

        String[] nomes = new String[nPessoas];
        int[] idades = new int[nPessoas];
        double[] alturas = new double[nPessoas];

        for(int i = 0; i < nPessoas; i++){
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.printf("Nome: ");
            nomes[i] = sc.next();
            System.out.printf("Idade: ");
            idades[i] = sc.nextInt();
            System.out.printf("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        nMenores = 0;
        alturaTotal = 0;

        for(int i = 0; i < nPessoas; i++){
            if (idades[i] < 16){
                nMenores++;
            }
            alturaTotal += alturas[i];
        }


        alturaMedia = alturaTotal / nPessoas;
        porcentagem = ((double)nMenores / nPessoas) * 100.0;

        System.out.printf("Altura media: %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);

        for(int i = 0; i < nPessoas; i++){
            if(idades[i] < 16){
                System.out.printf("%s\n", nomes[i]);
            }
        }

        System.out.println("-------------------------------");
        // Exercicio 5 | numeros_pares

        int nDigitado2, paresQntd;

        paresQntd = 0;

        System.out.printf("Quantos numeros vc vai digitar?(numeros_pares)");
        nDigitado2 = sc.nextInt();

        int[] array2 = new int[nDigitado2];

        for(int i = 0; i < nDigitado2; i++){
            System.out.printf("Digite um numero:");
            array2[i] = sc.nextInt();
        }

        System.out.println("\nNUMEORS PARES");

        for(int atual : array2){
            if(atual % 2 == 0){
                System.out.printf("%d ",atual);
                paresQntd++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", paresQntd);


        System.out.println("-------------------------------");
        // Exercicio 6 | maior posição

        int nDigitados3, pMaior;
        double nMaior;


        System.out.printf("Quantos numeros voce vai digitar? (maior posição) ");
        nDigitados3 = sc.nextInt();

        double[] array3 = new double[nDigitados3];

        for(int i = 0; i < nDigitados3; i++){
            System.out.printf("Digite um numero: ");
            array3[i] = sc.nextDouble();
        }


        nMaior = array3[0];
        pMaior = 0;

        for(int i = 0; i < nDigitados3; i++){
            if(array3[i] > nMaior){
                nMaior = array3[i];
                pMaior = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.1f\n", nMaior);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d\n", pMaior);

        System.out.println("-------------------------------");
        // Exercicio 7 | soma vetores

        int somaVetores, valores;

        System.out.printf("Quantos valores vai ter cada vetor? ");
        valores = sc.nextInt();

        int[] vetorA = new int[valores];
        int[] vetorB = new int[valores];
        int[] vetorC = new int[valores];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < valores; i++){
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < valores; i++){
            vetorB[i] = sc.nextInt();
        }


        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i < valores; i++){
           vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }

        System.out.println("-------------------------------");
        // Exercicio 8 | abaixo da media

        int nElementos;
        double mediaVetor, somaTotal, abaixo;

        somaTotal = 0.0;

        System.out.printf("Quantos elementos vai ter o vetor? ");
        nElementos = sc.nextInt();

        double[] array4 = new double[nElementos];

        for (int i = 0; i < nElementos; i++){
            System.out.printf("Digite um numero: ");
            array4[i] = sc.nextDouble();
        }

        for(double atual : array4){
            somaTotal += atual;
        }

        mediaVetor = somaTotal / (double)nElementos;


        System.out.printf("MEDIA DO VETOR = %.3f\n", mediaVetor);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for(double atual : array4){
            if(atual < mediaVetor){
                abaixo = atual;
                System.out.println(abaixo);
            }
        }

        System.out.println("-------------------------------");
        // Exercicio 9 | media pares

        int nElementos2,nPares, somaPares;
        double mediaPares;

        nPares = 0;
        somaPares = 0;

        System.out.printf("Quantos elementos vai ter o vetor?(media_pares) ");
        nElementos2 = sc.nextInt();

        int[] array5 = new int[nElementos2];

        for(int i = 0; i < nElementos2; i++){
            System.out.printf("Digite um numero: ");
            array5[i] = sc.nextInt();
        }


        for (int atual : array5){
            if(atual % 2 == 0){
                somaPares += atual;
                nPares++;
            }
        }

        if(nPares == 0){
            System.out.println("NENHUM NUMERO PAR");
        }else{
            mediaPares = (double)somaPares / nPares;
            System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
        }

        System.out.println("-------------------------------");
        // Exercicio 10 | mais_velho

        int qntdPessoas, maiorIdade;
        String  maisVelho = "";

        maiorIdade = -1;



        System.out.printf("Quantas pessoas você vai digitar? (mais_Velho) ");
        qntdPessoas = sc.nextInt();

        String[] arrayNome = new String[qntdPessoas];
        int[] arrayIdade = new int[qntdPessoas];

        for(int i = 0; i < qntdPessoas; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.printf("Nome: ");
            arrayNome[i] = sc.next();
            System.out.printf("Idade: ");
            arrayIdade[i] = sc.nextInt();

        }

        for(int i = 0; i < qntdPessoas; i++){
            if(arrayIdade[i] > maiorIdade ){
                maiorIdade = arrayIdade[i];
                maisVelho = arrayNome[i];

            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", maisVelho);


        System.out.println("-------------------------------");
        // Exercicio 11 | aprovados

        int numberDigitado2;
        double mediaAluno;

        System.out.printf("Quantos alunos serão digitados? ");
        numberDigitado2 = sc.nextInt();

        String[] alunoNome = new String[numberDigitado2];
        double[] nota1 = new double[numberDigitado2];
        double[] nota2 = new double[numberDigitado2];


        for (int i = 0; i < numberDigitado2; i++){
            System.out.println("Digite nome, primeira e segunda nota %do \n" + (i+1));
            sc.nextLine();
            alunoNome[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovado:");
        for(int i = 0; i < numberDigitado2; i++){
            mediaAluno = (nota1[i] + nota2[i]) / 2;
            if (mediaAluno > 6 ){
                System.out.printf("%s\n", alunoNome[i]);
            }
        }

        System.out.println("-------------------------------");
        // Exercicio 12 | dados_pessoas

        int pessoasQntd, nHomens, nMulheres;
        double maiorAltura, menorAltura, mediaAlturaM, somaAltura;


        nHomens = 0;
        nMulheres = 0;
        somaAltura = 0;

        System.out.printf("Quantas pessoas serão digitadas? (dados_pessoas)" );
        pessoasQntd = sc.nextInt();

        double[] alturaPessoa = new double[pessoasQntd];
        String[] generoPessoa = new String[pessoasQntd];


        for( int i = 0; i < pessoasQntd; i++){
            System.out.printf("Altura da %dª pessoa: ", (i + 1));
            alturaPessoa[i] = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Gênero da %dª pessoa: ", (i + 1));
            generoPessoa[i] = sc.nextLine();
        }
        menorAltura = alturaPessoa[0];
        maiorAltura = alturaPessoa[0];
        for (int i = 0; i < pessoasQntd; i++){
            if(maiorAltura < alturaPessoa[i]){
                maiorAltura = alturaPessoa[i];
            }
            if(maiorAltura > alturaPessoa[i]){
                menorAltura = alturaPessoa[i];
            }

        }

        for (int i = 0; i < pessoasQntd; i++){
            if(generoPessoa[i] == "F") {
                somaAltura += alturaPessoa[i];
                nMulheres++;
            }else{
                nHomens++;
            }


        }

        mediaAlturaM = somaAltura / nMulheres;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaM);
        System.out.printf("Numero de homens = %d\n", mediaAlturaM);



    }
}