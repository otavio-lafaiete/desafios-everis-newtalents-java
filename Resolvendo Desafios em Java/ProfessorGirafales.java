import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;


public class ProfessorGirafales {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {

        String owner, l,color, size;
        String[] details;
        Tshirt[] tshirts;
        Tshirt tshirt;
        int N;

        l = read();

        N = toInt(l);
        tshirts = new Tshirt[N];

        while (!(l = read()).equals("0")) {

            owner = l;

            l = read();

            details = l.split(" ");
            color = details[0];
            size = details[1];

            tshirt = new Tshirt(size, color, owner);

            tshirts[N - 1] = tshirt;
            N--;
        }

        Arrays.sort(tshirts, new Comparator<Tshirt>() {
            @Override
            public int compare(Tshirt t1, Tshirt t2) {

                String color1 = t1.getColor();
                String color2 = t2.getColor();

                int diff = color1.compareTo(color2);

                if (diff != 0) {

                    return diff;
                } else {

                    String size1 = t1.getSize();
                    String size2 = t2.getSize();

                    diff = size2.compareTo(size1);
                }
                if (diff != 0) {

                    return diff;
                }
                return t1.getOwner().compareTo(t2.getOwner());
            }
        });

        for(Tshirt t: tshirts){

            out.println(String.format("%s %s %s", t.getColor(), t.getSize(), t.getOwner()));
        }
        out.close();
        in.close();
    }


    private static String read() throws IOException {
        return in.readLine();
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}

class Tshirt {

    private String size;
    private String color;
    private String owner;

    public Tshirt(String size, String color, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
    }
}