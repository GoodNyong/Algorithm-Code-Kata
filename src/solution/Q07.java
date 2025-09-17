package solution;

public class Q07 {
    public static void main(String[] args) {
        int n1 = (int) (Math.random() * 100) + 1;
        int n2 = (int) (Math.random() * 100) + 1;
        System.out.println("n1 : " + n1);
        System.out.println("n2 : " + n2);
        System.out.println("result : " + solution(n1, n2));
    }

    public static int solution(int n1, int n2) {
        return (int)((n1*1.0)/n2*1000);
    }
}
