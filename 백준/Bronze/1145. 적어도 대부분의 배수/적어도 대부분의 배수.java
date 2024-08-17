import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] input = new int[5];
        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        for (int ans = 4; ans <= 941094; ans++) {
            cnt = 0;

            for (int i = 0; i < 5; i++) {
                if (ans % input[i] == 0) {
                    cnt++;
                }
            }

            if (cnt >= 3) {
                System.out.println(ans);
                return;
            }
        }
    }
}
