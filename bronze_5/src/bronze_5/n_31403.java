package bronze_5;
import java.io.*;

public class n_31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String result2 = "";
        result2 += a;
        result2 += b;

        int second_result = Integer.parseInt(result2);


        System.out.println(a + b - c);
        System.out.println(second_result - c);
    }
}
