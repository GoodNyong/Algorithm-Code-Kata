package solution;

public class Q19 {
    public static void main(String[] args) {
        long[] testCases = {
            1L,
            4L,
            9L,
            13L,
            25L,
            100L,
            121L,
            50000000000000L,
            50000000000001L,
            12345678987654321L,
            99999999999999L,
            123456789L,
            987654321L
        };
        for (long i : testCases) {
            long n = i;
            System.out.println("n : " + n);
            System.out.println("result : " + solution(n));
            System.out.println("----------------------");
        }
    }

    public static long solution(long n) {
        long x = (long) Math.sqrt(n);
        if(x*x == n) return (x+1)*(x+1);
        else return -1;
    }

}
