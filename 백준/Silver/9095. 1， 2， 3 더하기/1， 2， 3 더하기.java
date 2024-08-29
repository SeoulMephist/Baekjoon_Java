import java.io.*;

public class Main {
    static int cnt;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            sb.append(combination(n)).append("\n");
        }
        System.out.println(sb);
    }

    static int combination(int input) {
        if (input == 0) {
            return 1;
        }

        if (input < 0) {
            return 0;
        }
        int cnt = 0;
        cnt += combination(input - 1);
        cnt += combination(input - 2);
        cnt += combination(input - 3);

        return cnt;
    }
}
