import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int result = 0;
        int cnt = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < k * n; i++) {

            if (Integer.parseInt(st.nextToken()) == 0) {
                cnt++;
            }

            if ((i + 1) % k == 0 && cnt < p) {
                result++;
                cnt = 0;
            }

            else if ((i + 1) % k == 0) {
                cnt = 0;
            }
        }
        System.out.println(result);
    }
}
