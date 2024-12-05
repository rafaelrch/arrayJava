
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
    }
}