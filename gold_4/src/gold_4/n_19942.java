package gold_4;
import java.io.*;
import java.util.StringTokenizer;

public class n_19942 {
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n][4];

        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            arr[i][3] = Integer.parseInt(st.nextToken());
        }

        recur (0, 0, 0, 0 ,0);
    }

    static void recur (int depth, int mp, int mf, int ms, int mv) {


        recur (depth + 1, mp, mf, ms, mv);
        recur (depth + 1, mp, mf, ms, mv);
    }
}
