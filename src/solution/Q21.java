package solution;

public class Q21 {
    public static void main(String[] args) {
        int[] testCases = {
                1234,
                -1234, // 음수 테스트
                0,      // 0 테스트
                1,      // 한 자리 수 테스트
                13,     // 두 자리 수 테스트
                805,    // 세 자리 수 테스트
                7090,   // 네 자리 수 테스트
                10000,  // 다섯 자리 수 테스트
                (int) (Math.random() * 1000) + 1,
                987654321 // 큰 수 테스트
        };

        for (int n : testCases) {
            System.out.println("n: " + n + ", 결과: " + solution(n));
        }
    }

    public static boolean solution(int x) {
        if (x < 1) return false;
        int tmp = x;
        int sum = 0;
        while (tmp > 0) {
            sum += tmp % 10;
            tmp /= 10;
        }
        return x % sum == 0;
    }

}
