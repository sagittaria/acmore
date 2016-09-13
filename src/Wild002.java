import java.util.Scanner;

public class Wild002 {
//来自https://www.hackerrank.com/challenges/java-output-formatting
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //减号表示靠左，03d的0表示前补零
                System.out.printf("%-15s%03d\n",s1,x);
            }
            System.out.println("================================");
    }
}
//减号表示靠左，03d的0表示前补零