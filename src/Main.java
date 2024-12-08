
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

        System.out.printf("\nQUANTIDADE DE PARES = %d\n", paresQntd);

    }
}