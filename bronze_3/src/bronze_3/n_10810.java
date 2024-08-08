package bronze_3;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int l;
        int j;
        int k;

        int[] box = new int[n];
        Arrays.fill(box, 0);

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            l = Integer.parseInt(st.nextToken()) - 1;
            j = Integer.parseInt(st.nextToken()) - 1;
            k = Integer.parseInt(st.nextToken());

            for (int x = l; x <= j; x++) {
                box[x] = k;
            }
        }

        for (int i = 0; i < n; i++) {
            sb.append(box[i]).append(" ");
        }
        System.out.println(sb);
    }
}
