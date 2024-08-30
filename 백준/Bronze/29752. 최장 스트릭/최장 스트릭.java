import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int tmp;
        int cnt = 0;
        int max = 0;

        st = new StringTokenizer(br.readLine());


        for (int i = 0; i < n; i++) {
            tmp = Integer.parseInt(st.nextToken());

            if (tmp > 0) {
                cnt++;
            }
            if (tmp == 0) {
                if (max <= cnt) {
                    max = cnt;
                }
                cnt = 0;
            }
        }

        if (cnt > max) {
            max = cnt;
        }

        System.out.println(max);
    }
}
