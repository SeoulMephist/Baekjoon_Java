import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        int tmp = 0;

        for (int i = 0; i < 10; i++) {
            tmp = result;
            result += Integer.parseInt(br.readLine());

            if (result >= 100) {
                if (result - 100 <= 100 - tmp) {
                    System.out.println(result);
                }
                else {
                    System.out.println(tmp);
                }
                return;
            }
        }

        System.out.println(result);
    }
}
