import java.util.*;
import java.io.*;

class Solution{
//来自https://www.hackerrank.com/challenges/java-loops	
    public static void main(String []argh){
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
}