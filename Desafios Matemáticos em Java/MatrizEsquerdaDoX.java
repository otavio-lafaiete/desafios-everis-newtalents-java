import java.io.IOException;
import java.util.Scanner;

public class MatrizEsquerdaDoX{

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

        for (int i = 1; i <= M.length/2 - 1; i++) {
            for (int j = 0; j < M[i].length/2 - 1; j++){
                if (i + j < i * 2) soma += M[i][j];
            }
        }

        for (int i = 6; i < M.length - 1; i++) {
            for (int j = 0; j < M[i].length/2 - 1; j++){
                if (i + j < M.length - 1) soma += M[i][j];
            }
        }

        if (O == 'M') soma /= 30;
        System.out.println(String.format("%.1f", soma));
    }

}