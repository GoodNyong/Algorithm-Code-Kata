package solution;

public class Q09 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 1000) + 1;
        System.out.println("n : " + n);
        System.out.println("result : " + solution(n));
    }

    public static int solution(int n) {
        int ans = 0;
        for (int i = 0; i <= n; i += 2) ans += i;
        return ans;
    }
}
