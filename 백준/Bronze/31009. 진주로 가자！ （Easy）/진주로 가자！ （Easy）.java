import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String str;
        int[] rate;
        int j_rate = 0;
        int j_up = 0;

        rate = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            str = st.nextToken();
            rate[i] = Integer.parseInt(st.nextToken());

            if (str.equals("jinju")) {
               j_rate = rate[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (rate[i] > j_rate) {
                j_up++;
            }
        }
        System.out.println(j_rate);
        System.out.println(j_up);
    }
}
