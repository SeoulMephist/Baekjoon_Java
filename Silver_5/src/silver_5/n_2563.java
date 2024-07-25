package silver_5;
import java.io.*;
import java.util.StringTokenizer;

public class n_2563 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] field = new int[101][101];

        int n = Integer.parseInt(br.readLine());

        int[][] input = new int[n][2];

        //입력값 저장
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //색종이가 붙여져 있는 부분 채우기
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < 10; k++){
                for (int l = 0; l < 10; l++){
                    if (field[input[i][1]+k][input[i][0]+l] == 0){
                        field[input[i][1]+k][input[i][0]+l] = 1;
                        cnt++;
                    }
                }
            }
        }

        System.out.printf("%d", cnt);
    }
}
