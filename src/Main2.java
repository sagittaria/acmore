//这题还是错的，WA
//测试用例里估计有超大数字，参考【HDU 1002 (高精度加法运算）】http://blog.csdn.net/pengwill97/article/details/52267809
import java.util.Scanner;

public class Main2{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int i=0;i<t;i++){
    	long a = in.nextLong();
    	long b = in.nextLong();
    	System.out.printf("Case %d:\n%d + %d = %d\n\n",i+1,a,b,a+b);
    }
    in.close();
  }
}