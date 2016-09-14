import java.util.Scanner;

public class Main1{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int a;
    while (in.hasNext()){
    	int res = 0;
    	a = in.nextInt();
    	for(int i=1;i<=a;i++)
    		res+=i;
    	System.out.println(res);
    	System.out.println();
    }
    in.close();
  }
}