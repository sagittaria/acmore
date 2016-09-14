import java.util.*;
import java.io.*;

class Solution{
//-------------------------------------------------------    
//来自https://www.hackerrank.com/challenges/java-datatypes
    public static void main(String []argh)
    {
    	Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            try{
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-Math.pow(2, 15) && x<=Math.pow(2, 15)-1) System.out.println("* short");
                if(x>=-Math.pow(2, 31) && x<=Math.pow(2, 31)-1) System.out.println("* int");
                if(x>=-Math.pow(2, 63) && x<=Math.pow(2, 63)-1) System.out.println("* long");
                //留意下 长度（位数）和能存的最大最小数的关系
            }catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
    
//-------------------------------------------------------    
//来自https://www.hackerrank.com/challenges/java-loops	
/*    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s = a;
            for(int j=0;j<n;j++){
            	//System.out.printf("%d + %d = %d\n",s,(int)(Math.pow(2,j)*b),s+(int)(Math.pow(2,j)*b));
                s = s + (int)(Math.pow(2,j)*b);
                System.out.printf("%d ",s);
            }
            System.out.println();
        }
        in.close();
    }
*/    
}
