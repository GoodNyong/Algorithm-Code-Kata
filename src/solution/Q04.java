package solution;

public class Q04 {
    public static  void main(String[] args) {
        int n1 = (int)(Math.random() * 121);
        System.out.println("n1 : " + n1);
        System.out.println("result : " + solution(n1));
    }

    public static int solution(int n1){
        return 2023 - n1;
    }
}
