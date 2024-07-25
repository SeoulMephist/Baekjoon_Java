package bronze_3;
import java.io.*;
import java.util.StringTokenizer;

public class n_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int[][] arr = new int[t][3];
        int[][] result = new int[t][2];

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 2; j++){
                if (arr[i][2] % arr[i][0] == 0){
                    result[i][0] = arr[i][0];
                }
                else{
                    result[i][0] = arr[i][2] % arr[i][0]; //층
                }

                if (arr[i][2] % arr[i][0] == 0){
                    result[i][1] = arr[i][2] / arr[i][0];
                }
                else{
                    result[i][1] = arr[i][2] / arr[i][0] + 1; //호수
                }
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.println(result[i][0] * 100 + result[i][1]);
        }
    }
}