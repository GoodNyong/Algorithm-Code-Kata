package solution;

public class Q23 {
    public static void main(String[] args) {
        long[] testCases = {
                1L, // 최소값
                2L, // 짝수
                6L, // 예시값
                27L, // Collatz 유명값
                626331L,
                837799L, // Collatz 최대 사이클 예시
                7999999L, // 최대 근접값
                (long) (Math.random() * 7999999) + 1, // 랜덤값1
                (long) (Math.random() * 7999999) + 1, // 랜덤값2
                (long) (Math.random() * 7999999) + 1, // 랜덤값3
                (long) (Math.random() * 7999999) + 1, // 랜덤값4
                (long) (Math.random() * 7999999) + 1  // 랜덤값5
        };

        for (long n : testCases) {
            System.out.println("n: " + n + ", 결과: " + solution(n));
        }
    }

    public static int solution(long n) {
        int ans = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            ans++;
            if (ans >= 500) return -1;
        }
        return ans;
    }
}
