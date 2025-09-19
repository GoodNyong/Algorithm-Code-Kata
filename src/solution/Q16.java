package solution;

import java.util.Arrays;

public class Q16 {
    public static void main(String[] args) {
        long x = (long) (Math.random() * 20000001) - 10000000;
        int n = (int) (Math.random() * 1000) + 1;
        System.out.println("x : " + x);
        System.out.println("n : " + n);
        System.out.println("result : " + Arrays.toString(solution(x, n)));
    }

    public static long[] solution(long x, int n) {
        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            ans[i] = (long) x * (i + 1);  // 오버플로우 발생해도 무시
        }
        return ans;
    }
}
