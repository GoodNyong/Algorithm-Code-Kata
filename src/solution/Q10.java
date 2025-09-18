package solution;

import java.util.Arrays;

public class Q10 {
    public double solution(int[] numbers) {
        double ans = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        ans = (double) sum / numbers.length;
        return ans;
//        다른 풀이 1.
//        Arrays.stream(numbers).average().orElse(0);

//        다른 풀이 2.
//        for(int i: numbers){
//            sum+=i;
//        }
    }
}
