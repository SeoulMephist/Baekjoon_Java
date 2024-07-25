package bronze_5;
import java.io.*;
import java.util.StringTokenizer;

public class n_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        int tmp = 0;

        for (int i = 0; i < 5; i++) {
            tmp = Integer.parseInt(st.nextToken());
            sum += tmp*tmp;
        }

        System.out.printf("%d", sum%10);
    }
}
