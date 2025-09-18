package solution;

public class Q08 {
    public static void main(String[] args) {
        int angle = (int)(Math.random() * 180) + 1;
        System.out.println("angle : " + angle);
        System.out.println("result : " + solution(angle));
    }

    public static int solution(int angle) {
        int ans;
        if(angle > 0 && angle < 90) ans = 1;
        else if(angle == 90) ans = 2;
        else if(angle > 90 && angle < 180) ans =3;
        else ans = 4;
        return ans;
    }
}
