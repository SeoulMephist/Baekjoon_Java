package bronze_3;
import java.util.*;

public class n_14568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        for (int x = 2; n-4 >= x; x += 2) {
            for (int y = 1; n-x-y >= 3; y += 2) {
                result ++;
            }
        }
        System.out.println(result);
    }
}
