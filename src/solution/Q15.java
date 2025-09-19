package solution;

public class Q15 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 1000000) + 3;
        System.out.println("n : " + n);
        System.out.println("result : " + solution(n));
    }

    public static int solution(int n) {
        int ans = 1;
        while (n % ans != 1) { ans++; }
        return ans;
    }
}
