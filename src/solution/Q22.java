package solution;

public class Q22 {
    public static void main(String[] args) {
        int[][] testCases = {
                {3, 5},
                {5, 3},
                {0, 0},
                {-3, 3},
                {-10000000, 10000000},
                {7, 7},
                {-5, -3},
                {100, 100},
                {-100, 100},
                {1, 2}
        };

        for (int[] pair : testCases) {
            int a = pair[0];
            int b = pair[1];
            System.out.println("a: " + a + ", b: " + b + ", 결과: " + solution(a, b));
        }

        // 랜덤 숫자 쌍 2개 추가 테스트
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < 2; i++) {
            int a = rand.nextInt(20000001) - 10000000; // -10000000 ~ 10000000
            int b = rand.nextInt(20000001) - 10000000;
            System.out.println("[랜덤] a: " + a + ", b: " + b + ", 결과: " + solution(a, b));
        }
    }

    public static long solution(int a, int b) {
        if (a == b) return a;
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        return (max - min + 1) * (min + max) / 2;
    }

}
