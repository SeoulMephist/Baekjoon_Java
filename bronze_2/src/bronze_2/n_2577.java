package bronze_2;
import java.io.*;
import java.util.*;

public class n_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int result = a * b * c;

        String str = String.valueOf(result);
        int[] arr = new int[10];
        Arrays.fill(arr,0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - '0' == 0){
                arr[0]++;
            }
            else if (str.charAt(i) - '0' == 1){
                arr[1]++;
            }
            else if (str.charAt(i) - '0' == 2){
                arr[2]++;
            }
            else if (str.charAt(i) - '0' == 3){
                arr[3]++;
            }
            else if (str.charAt(i) - '0' == 4){
                arr[4]++;
            }
            else if (str.charAt(i) - '0' == 5){
                arr[5]++;
            }
            else if (str.charAt(i) - '0' == 6){
                arr[6]++;
            }
            else if (str.charAt(i) - '0' == 7){
                arr[7]++;
            }
            else if (str.charAt(i) - '0' == 8){
                arr[8]++;
            }
            else if (str.charAt(i) - '0' == 9){
                arr[9]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
