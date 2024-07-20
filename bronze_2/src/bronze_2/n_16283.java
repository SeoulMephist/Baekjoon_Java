package bronze_2;
import java.util.*;

public class n_16283 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int result_x = 0;
        int result_y = 0;
        int cnt = 0;

        for (int x = 1; x < 1000; x++) {
            for (int y = 1; y < 1000; y++) {
                if ((a*x + b*y == w) && (x + y == n)) {
                    result_x = x;
                    result_y = y;
                    cnt++;
                }
            }
        }
        if (cnt >= 2 || cnt == 0) {
            System.out.print(-1);
        }
        else {
            System.out.printf("%d %d", result_x, result_y);
        }
    }
}
