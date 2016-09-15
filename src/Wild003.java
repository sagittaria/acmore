import java.util.*;

public class Wild003 {
//来自https://www.hackerrank.com/challenges/compare-the-triplets
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        in.close();
        int sumA = ((a0>b0) ? 1:0)+((a1>b1) ? 1:0)+((a2>b2) ? 1:0);
        int sumB = ((a0<b0) ? 1:0)+((a1<b1) ? 1:0)+((a2<b2) ? 1:0);
//巧用三元运算符把布尔值转换成 1和0
        System.out.println(sumA+" "+sumB);        
    }
}
