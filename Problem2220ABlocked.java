import java.util.*;

public class Problem2220ABlocked {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Sort in decreasing order
            Arrays.sort(a);

            // Check for duplicate elements
            boolean possible = true;

            for (int i = 0; i < n - 1; i++) {
                if (a[i] == a[i + 1]) {
                    possible = false;
                    break;
                }
            }

            if (!possible) {
                System.out.println(-1);
            } else {
                // Print in decreasing order
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}