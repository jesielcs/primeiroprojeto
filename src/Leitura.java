import java.util.Scanner;

public class Leitura {
    public static void main (String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Qual ano de lançamento:");
        int anoLancamento = leitura.nextInt();

        System.out.println("Digite sua avaliação:");
        double avaliacao= leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);

        leitura.close();

    }
}
