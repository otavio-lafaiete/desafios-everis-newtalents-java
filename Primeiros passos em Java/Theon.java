import java.io.IOException;
import java.util.Scanner;

public class Theon {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        int T, menor = 0, posMenor = 0;

        menor = leitor.nextInt();

        for (int i = 1; i < N; i++) {

            T = leitor.nextInt();

            if (T < menor) {
                menor = T;
                posMenor = i;
            }
        }

        posMenor++;

        System.out.println(posMenor);
    }

}
