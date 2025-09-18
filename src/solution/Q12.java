package solution;

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100) + 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = (int) (Math.random() * 20001) -10000;
        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("result : " + solution(arr));
    }

    public static double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }

}
