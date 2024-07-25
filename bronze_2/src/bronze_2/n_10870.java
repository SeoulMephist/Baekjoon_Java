package bronze_2;
import java.io.*;

public class n_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result;
        result = pibonacci(n+1);
        System.out.println(result);
    }

    public static int pibonacci(int n) {
        if (n == 1){
            return 0;
        }
        else if (n == 2){
            return 1;
        }

        return(pibonacci(n-1) + pibonacci(n-2));
    }
}
