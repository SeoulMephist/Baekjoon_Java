import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while (true) {
            str = br.readLine();

            if (str.equals("EOI"))
                return;

            str = str.toLowerCase();

            if (str.contains("nemo")) {
                System.out.println("Found");
            }
            else {
                System.out.println("Missing");
            }
        }
    }
}
