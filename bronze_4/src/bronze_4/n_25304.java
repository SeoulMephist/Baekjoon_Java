package bronze_4;

import java.util.*;

public class n_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            int num = sc.nextInt();
            total += price * num;
        }
        if (total == x) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
