
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




    }
}