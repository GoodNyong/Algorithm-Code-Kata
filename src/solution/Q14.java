package solution;

public class Q14 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 3001) ;
        System.out.println("n : " + n);
        System.out.println("result : " + solution(n));
    }

    public static int solution(int n) {
        int sum = 0;
        int tmp = 1;
        System.out.print("약수 : ");
        while(tmp <= n) {
           if(n%tmp == 0) {
               sum += tmp;
               System.out.print(tmp + " ");
           }
            tmp++;
        }
        System.out.println();
        return sum;
    }

}
