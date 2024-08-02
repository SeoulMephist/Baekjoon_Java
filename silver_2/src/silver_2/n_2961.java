package silver_2;
import java.io.*;
import java.util.*;

public class n_2961 {
    static int[][] arr;
    static int n;
    static int result;
    static int tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        result = Integer.MAX_VALUE;
        tmp = 0;
        arr = new int[n][2];
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        recur(0, 1, 0);
        System.out.println(result);
    }

    static void recur(int depth, int sin, int sun) {
        if (depth == n) {
            if (sin == 0 || sun == 0)
                return;
            result = Math.min(result, Math.abs(sin - sun));
            return;
        }

        recur(depth + 1, sin * arr[depth][0], sun + arr[depth][1]);
        recur(depth + 1, sin, sun);
    }
}
