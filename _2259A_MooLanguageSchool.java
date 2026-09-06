import java.util.*;

public class _2259A_MooLanguageSchool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();

            int answer = 0;

            // Check each farm
            for (int i = 0; i < n; i += k) {
                boolean allNhoj = true;

                for (int j = i; j < i + k; j++) {
                    if (s.charAt(j) == '0') {
                        allNhoj = false;
                        break;
                    }
                }

                if (allNhoj) {
                    answer++;
                }
            }

            System.out.println(answer);
        }

        sc.close();
    }
}