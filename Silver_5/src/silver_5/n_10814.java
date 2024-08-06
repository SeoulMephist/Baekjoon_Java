package silver_5;
import java.io.*;
import java.util.*;

public class n_10814 {
    static String[][] set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        set = new String[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                set[i][j] = st.nextToken();
            }
        }

        Arrays.sort(set, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(set[i][j] + " ");
            }
            System.out.println();
        }
    }
}
