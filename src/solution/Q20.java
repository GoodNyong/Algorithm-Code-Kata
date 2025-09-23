package solution;

public class Q20 {
    public static void main(String[] args) {
        long[] testCases = {
                0L,                // 최소값
                1L,                // 최소값
                100200300L,        // 0이 포함된 수
                12605745L,
                (long) (Math.random() * 8000000000L)+ 1,
                1111111111L,       // 중복된 수
                -1234567890L,      // 음수(이상치)
                999999999999999999L, // 매우 큰 수
                9223372036854775807L // long 최대값
        };
        for (long n : testCases) {
            System.out.println("n : " + n);
            System.out.println("result : " + solution(n));
        }
    }

    public static long solution(long n) {
        n = Math.abs(n); // 음수 처리
        if (n < 10) return n; // 0 또는 한 자리 수는 그대로 반환
        char[] digits = Long.toString(n).toCharArray();
        java.util.Arrays.sort(digits);
        StringBuilder sb = new StringBuilder(new String(digits)).reverse();
        return Long.parseLong(sb.toString());
    }

}
