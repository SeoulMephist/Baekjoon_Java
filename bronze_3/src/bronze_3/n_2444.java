package bronze_3;
import java.io.*;

public class n_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int line = 1; line <= n; line++) {
            for (int blank = 0; blank < n - line; blank++) {
                System.out.print(" ");
            }
            for (int star = 0; star < (2 * line) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int line = n; line > 1; line--) {
            for (int blank = 0; blank <= n - line; blank++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * line - 3; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
