import java.io.IOException;
import java.util.Scanner;

public class ThorChuva {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        int casaComprado = 0;
        int casaSobrando = 0;
        int trabComprado = 0;
        int trabSobrando = 0;

        for (int i = 0; i < N; i++) {

            String SD, SN;
            SD = leitor.next();
            SN = leitor.next();

            if (SD.equals("chuva")) {

                if(casaSobrando == 0){

                    casaComprado++;
                    trabSobrando++;
                }else{
                    casaSobrando--;
                    trabSobrando++;
                }
            }

            if(SN.equals("chuva")){

                if(trabSobrando == 0){

                    trabComprado++;
                    casaSobrando++;
                }else{
                    trabSobrando--;
                    casaSobrando++;
                }
            }


        }
        System.out.println(casaComprado + " " + trabComprado);
    }

}