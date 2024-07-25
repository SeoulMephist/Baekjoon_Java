package bronze_5;
import java.io.*;

public class n_27866 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int n = Integer.parseInt(br.readLine());

        System.out.println(str.charAt(n-1));
    }
}
