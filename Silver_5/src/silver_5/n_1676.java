package silver_5;
import java.io.*;

public class n_1676 {
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        cnt = 0;

        while (n >= 5) {
            cnt += n / 5;
            n /= 5;
        }

        System.out.println(cnt);
    }
}
