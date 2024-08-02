package silver_2;
import java.io.*;
import java.util.StringTokenizer;

public class n_2961 {
    static int[][] arr;
    static int n;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        result = Integer.MAX_VALUE;
        arr = new int[n][2];
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        recur(0, 1, 0);
    }

    static void recur(int depth, int sin, int sun) {
        if (depth == n) {
            for (int i = 0; i < depth; i++) {
                if (result > arr[i][0]) {
                    result = 10;
                }
            }
        }

        for (int i = 0; i < depth; i++) {

        }

        recur(depth + 1, sin, sun);
        recur(depth, sin, sun);
    }
}
