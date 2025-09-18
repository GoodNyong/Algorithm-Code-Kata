package solution;

public class Q11 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * ((long) Integer.MAX_VALUE - Integer.MIN_VALUE + 1) + Integer.MIN_VALUE);
        System.out.println("n : " + n);
        System.out.println("result : " + solution(n));
    }

    public static String solution(int n) {
        return (n%2 == 0)?"Even":"Odd";
    }

}
