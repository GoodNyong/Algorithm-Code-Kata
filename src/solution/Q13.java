package solution;

public class Q13 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100000000) + 1;
        System.out.println("n : " + n);
        System.out.println("result : " + solution(n));
    }

    public static int solution(int n) {
        int ans = 0;
        while(n>0) {
            ans += n%10;
            n/=10;
        }
        return ans;
    }

}
