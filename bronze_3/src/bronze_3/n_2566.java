package bronze_3;
import java.io.*;
import java.util.StringTokenizer;

public class n_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        int cmp = -1;
        int row = 0;
        int col = 0;

        for (int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++){
                cmp = Integer.parseInt(st.nextToken());
                if (cmp > max){
                    max = cmp;
                    row = i + 1;
                    col = j + 1;
                }
            }
        }
        System.out.printf("%d\n%d %d", max, row, col);
    }
}

