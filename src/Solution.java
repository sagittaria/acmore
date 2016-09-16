import java.util.*;
import java.io.*;

class Solution{
//-------------------------------------------------------    
//来自https://www.hackerrank.com/challenges/s10-basic-statistics
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		int[] a = new int[n];
		int[] count = new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
			sum+=a[i];
		}
		in.close();
		Arrays.sort(a);
		
		System.out.printf("%.1f\n", (double)sum/n);//mean
		if(n%2==0){
			System.out.printf("%.1f\n", (double)(a[n/2] + a[n/2-1])/2);//median
		}else{
			System.out.printf("%.1f\n", (double)a[(n-1)/2]);//median
		}
		
		for(int j=0;j<n;j++){
			int value = a[j];
			for(int k=0;k<n;k++){
				if(a[k]==value){
					count[j]+=1;
				}//获取每个元素的出现次数
			}
		}
		//System.out.println(Arrays.toString(count));
		
		int max_occurrency_index=0;
		for(int m=1;m<n;m++){
			if(count[m]>count[max_occurrency_index]){
				max_occurrency_index=m;
			}//找出count里的最大值，获取最大值的下标
		}//因为a已经是有序的，如[1,1,1,2,2,2,2,2,4,4,4]，count就是[3,3,3,5,5,5,5,5,3,3,3]
		//拿到“第一个”最大的值的下标（也就是count里第一个“5”的下标）即可。
		System.out.println(a[max_occurrency_index]);//mode		
	}
}
//-------------------------------------------------------    
//来自https://www.hackerrank.com/challenges/diagonal-difference
/*    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();   
      int a[][] = new int[n][n];
      int diag1 = 0;
      int diag2 = 0;
      for(int a_i=0; a_i < n; a_i++){
          for(int a_j=0; a_j < n; a_j++){
              a[a_i][a_j] = in.nextInt();
              if(a_i==a_j) diag1=diag1+a[a_i][a_j];
              if((a_i+a_j)==(n-1)) diag2=diag2+a[a_i][a_j];
          }
      }
      System.out.println(Math.abs(diag1-diag2));
  }
*/  

//-------------------------------------------------------    
//来自https://www.hackerrank.com/challenges/java-datatypes
/*  public static void main(String []argh)
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
*/
    
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