package bronze_2;
import java.io.*;
import java.util.StringTokenizer;

public class n_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];
        boolean check = true;

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (arr[0] == 1){
            for (int i = 1; i < 7; i++) {
                if (arr[i] > arr[i+1]){
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("ascending");
        }
        else if (arr[0] == 8){
            for (int i = 1; i < 7; i++) {
                if (arr[i] < arr[i+1]){
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("descending");
        }

        else{
            System.out.println("mixed");
        }
    }
}
