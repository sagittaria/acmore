import java.util.*;

public class Main7 {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int a;
	    while (in.hasNext()){
	      a = in.nextInt();
	      //pai(a);
	      System.out.printf("%.1f",pai(a));
	    }
	    in.close();
	}
	
	public static double pai(int n){
		double res=0.0;
		int flag=1;
		for(int i=1; i<=n; i++){
			//并不明确 [flag 为double]、[1.0]、[2.0]是否全部都是必须的，可以自己做实验：
			//System.out.printf("res+(...)= %f + %f = %f \n", res,flag*(1.0/(2.0*i-1)),res+flag*(1.0/(2.0*i-1)));
			//res = res + flag*(1.0/(2.0*i-1));
			//res = res + flag*(1/(2*i-1));
			//res = res + flag*(1.0/(2*i-1));
			res = res + flag*(1/(2.0*i-1));
			//个人理解：由于括号的优先级，要确保第一步（2*i）得到是浮点数，所以里面改成 2.0*i 外面其他都不用改了
			flag=flag*(-1);
		}
		return res*4;
	}

}
