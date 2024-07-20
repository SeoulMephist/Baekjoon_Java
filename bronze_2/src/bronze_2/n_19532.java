package bronze_2;
import java.util.*;

public class n_19532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int x;
        int y;

        for (x = -999; x <= 999; x++) {
            for (y = -999; y <= 999; y++) {
                if ((a * x + b * y == c) && (d * x + e * y == f)){
                    System.out.printf("%d %d\n", x, y);
                    break;
                }
            }
        }
    }
}
