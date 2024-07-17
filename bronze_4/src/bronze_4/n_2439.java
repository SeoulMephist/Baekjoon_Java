package bronze_4;
import java.util.*;

public class n_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int line = 0; line < n; line++) {
            for (int blank = n-1; blank > line; blank--) {
                System.out.print(" ");
            }
            for (int star = 0; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
