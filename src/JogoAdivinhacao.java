import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main (String[] args){

        Scanner leitura = new Scanner(System.in);

        int numeroGerado = new Random().nextInt(100);
        int tentativa = 0;

        while(tentativa < 5){
            System.out.println("Informe um número entre 0 e 100:");
            int numeroDigitado = leitura.nextInt();
            tentativa++;

            if (numeroDigitado == numeroGerado){
                System.out.println("Parabéns você acertou!!!");
                break;

            }else if(numeroDigitado < numeroGerado){
                System.out.println("O número digitado é menor que o número gerado");

            }else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }
        if (tentativa == 5){
            System.out.println("Você não conseguiu adivinhar o número, o número gerado tinha sido:"+numeroGerado);
        }
    }

}
