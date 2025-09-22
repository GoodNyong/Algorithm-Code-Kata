package solution;

public class Q18 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 99999 * 2) - 99999 + 1;
        String s = ""+n;
        System.out.println("s : " + s);
        System.out.println("result : " + solution(s));
    }

    public static int solution(String s) {
       return Integer.parseInt(s);
    }

}
