package bronze_1;
import java.io.*;

public class n_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String result;


        while (true) {
            String num = br.readLine();
            result = "yes";

            if (num.equals("0"))
                return;

            for (int i = 0; i < num.length()/2; i++) {
                if (num.charAt(i) == num.charAt(num.length()-1-i)) {
                    continue;
                }
                else {
                    result = "no";
                    break;
                }
            }

            System.out.println(result);
        }
    }
}
