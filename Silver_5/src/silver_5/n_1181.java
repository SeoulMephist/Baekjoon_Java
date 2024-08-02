package silver_5;
import java.io.*;

public class n_1181 {
    static String[] input;
    static int[] length;
    static int bufferL;
    static int bufferA

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        input = new String[n];
        length = new int[n];


        for (int i = 0; i < n; i++) {
            input[i] = br.readLine();
            length[i] = input[i].length();
        }

        for (int i = 0; i < n; i++) {

        }
    }
}
