import java.io.*;

public class Main {
    static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        result = 1;
        if (n == 0) {
            System.out.println(1);
            return;
        }
        recur(1, n);
        System.out.println(result);
    }

    public static void recur(int start, int n) {
        if (start == n+1) {
            return;
        }
        result *= start;
        recur(start + 1, n);
    }
}
