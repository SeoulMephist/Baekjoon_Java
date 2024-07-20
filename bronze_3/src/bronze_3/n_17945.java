package bronze_3;
import java.util.*;

public class n_17945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ans = new int[2];
        ans[1] = -2002;

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = -2001;
        int cnt = 0;

        while (x >= -2001 && x <= 2001 && cnt < 2) {
            if (x * x + 2 * a * x + b == 0)
            {
                ans[cnt] = x;
                cnt ++;
            }
            x++;
        }

        if (ans[1] == -2002)
        {
            System.out.printf("%d", ans[0]);
        }
        else {
            System.out.printf("%d %d", ans[0], ans[1]);
        }
    }
}
