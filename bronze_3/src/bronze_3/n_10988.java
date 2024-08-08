package bronze_3;
import java.io.*;

public class n_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int result = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }
}
