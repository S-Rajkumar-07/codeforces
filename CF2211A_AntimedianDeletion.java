import java.util.*;

public class CF2211A_AntimedianDeletion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                sc.nextInt();
            }

            if (n == 1) {
                System.out.println(1);
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print(2 + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}