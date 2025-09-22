package solution;

import java.util.Arrays;

public class Q17 {
    public static void main(String[] args) {
//        long num = (long) (Math.random() * 10000000000L) + 1;
        long num = 10000000000L;
        System.out.println("num : " + num);
        System.out.println("result : " + Arrays.toString(solution(num)));
    }

    public static int[] solution(long num) {
        int[] ans = new int[Long.toString(num).length()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = (int) (num % 10);
            num /= 10;
        }
        return ans;
    }
}
