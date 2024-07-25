package silver_5;
import java.io.*;

public class n_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int start = 665;
        int start_copy = start;
        int relay = 0;
        int cnt = 0;

        while (true) {
            if (cnt == n) {
                break;
            }
            else {
                start++;
                start_copy = start;
            }

            while (start_copy != 0){
                if (start_copy % 10 == 6){
                    relay++;
                }
                else {
                    relay = 0;
                }

                if (relay == 3) {
                    cnt++;
                    break;
                }
                start_copy = start_copy / 10;
            }
            relay = 0;
        }
        System.out.println(start);
    }
}
