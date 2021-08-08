import java.io.IOException;
import java.util.Scanner;

public class  MatrizDireitaDoX{

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 7; j <= 11; j++) {
                if (i + j >= 12) soma += M[i][j];
            }
        }

        for (int i = 6; i <= 10; i++) {
            for (int j = 7; j <= 11; j++) {
                if (i + j > i*2) soma += M[i][j];
            }
        }

        if (O == 'M') soma /= 30;
        System.out.println(String.format("%.1f", soma));
    }

}