import java.util.*;
import java.io.*;

class Solution{

}

//-------------------------------------标准差
//来自https://www.hackerrank.com/challenges/s10-standard-deviation	
	/*public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double sum=0.0;
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
			sum+=a[i];
		}
		double mean=sum/n;
		double fenmu=0.0;
		for(int i=0;i<n;i++){
			fenmu+=(a[i]-mean)*(a[i]-mean);
		}
		System.out.printf("%.1f",Math.sqrt(fenmu/n));
  }*/

//-------------------------------------Calendar 留意 getInstance、get和set方法；另，数组是{}！
//来自https://www.hackerrank.com/challenges/30-review-loop
  /*public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String month = in.next();
      String day = in.next();
      String year = in.next();
      int mm=Integer.parseInt(month)-1;
      int dd=Integer.parseInt(day);
      int yy=Integer.parseInt(year);
      Calendar c = Calendar.getInstance();
      c.set(yy, mm, dd);
      String[] weekdays={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
      System.out.println(weekdays[c.get(Calendar.DAY_OF_WEEK)-1]);
  }*/

//-------------------------------------------------------s.charAt(j) 取字符串里某个位置的字符
//来自https://www.hackerrank.com/challenges/30-review-loop
/*    public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      in.nextLine();
      for(int i=0;i<t;i++){
      	String s=in.nextLine();
      	for(int j=0;j<s.length();j+=2){
      		System.out.printf("%s",s.charAt(j));
      	}
      	System.out.print(" ");
      	for(int j=1;j<s.length();j+=2){
      		System.out.printf("%s",s.charAt(j));
      	}
      	System.out.print("\n");
      }        
      in.close();
  }*/

//-------------------------------------------------------
//来自https://www.hackerrank.com/challenges/staircase
  /*public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=0;i<n;i++){
      	for(int j=0;j<n-i-1;j++){
      		System.out.print(" ");
      	}
      	for(int m=0;m<i+1;m++){
      		System.out.print("#");
      	}
      	System.out.println();
      }
  }*/

//其实没什么记录价值	
/*public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    int neg=0,zero=0,pos=0;
    for(int arr_i=0; arr_i < n; arr_i++){
        arr[arr_i] = in.nextInt();
        neg=neg+((arr[arr_i]<0) ? 1:0);
        zero=zero+((arr[arr_i]==0) ? 1:0);
        pos=pos+((arr[arr_i]>0) ? 1:0);
    }
    System.out.printf("%.6f\n%.6f\n%.6f",(double)pos/n,(double)zero/n,(double)neg/n);
    // (double)pos/n 不要写成 (double)(pos/n)
}*/

//-------------------------------------------------------
//来自https://www.hackerrank.com/challenges/s10-interquartile-range	
	/*public static void main(String[] args) {
  	Scanner sc=new Scanner(System.in);
  	int n=sc.nextInt();
  	int[] x=new int[n];
  	int[] f=new int[n];
  	int sum=0;
  	for(int i=0;i<n;i++){
  		x[i]=sc.nextInt();
  	}
  	for(int i=0;i<n;i++){
  		f[i]=sc.nextInt();
  		sum+=f[i];
  	}
  	sc.close();
  	int[] s=new int[sum];
  	int sIndex=0;
  	for(int i=0;i<n;i++){
  		for(int j=0;j<f[i];j++){
  			s[sIndex]=x[i];
  			sIndex=sIndex+1;
  		}
  	}
  	//System.out.println(Arrays.toString(s));
  	Arrays.sort(s);
  	int[] sl=new int[sum/2];
      int[] sh=new int[sum/2];
      int q1=0,q3=0;  
      for(int i=0;i<sum/2;i++){
      	sl[i]=s[i];
      	if(sum%2==1){
      		sh[i]=s[i+sum/2+1];
      	}else{
      		sh[i]=s[i+sum/2];
      	}        	
      }
      q1=getMedian(sl,sum/2);
      q3=getMedian(sh,sum/2);
      System.out.printf("%.1f",(double)(q3-q1));
  }
  
  public static int getMedian(int[] c, int l){
    	int med=0;
    	if(l%2==0){
    		med=(c[l/2] + c[l/2-1])/2;
    	}else{
    		med=c[(l-1)/2];
    	}    	
    	return med;
    }*/

//-------------------------------------------------------
//不是笔记，练手感的。	
/*	static private int B,H;//这里两行前的static都是必须的
	static boolean flag=false;//否则错误提示：Cannot make a static reference to the non-static field flag
	static{
	    Scanner sc=new Scanner(System.in);
	    B = sc.nextInt();
	    H = sc.nextInt();
	    if(B>0 && H>0){
	        flag=true;
	    }else{
	       System.out.println("java.lang.Exception: Breadth and height must be positive"); 
	    }
	}
	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}*/

//-------------------------------------------------------	
//来自https://www.hackerrank.com/challenges/java-end-of-file	
/*	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=1;
		while(sc.hasNextLine()){
			System.out.println(x++ + " " + sc.nextLine());
		}
		//System.out.println("while finished.");// ctrl+z(win7) to break [while]
	}*/

//-------------------------------------------------------
//https://www.hackerrank.com/challenges/s10-quartiles	
/*    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] a=new int[n];
      int[] al=new int[n/2];
      int[] ah=new int[n/2];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      Arrays.sort(a);
      int q1=0,q2=0,q3=0;  
      for(int i=0;i<n/2;i++){
      	al[i]=a[i];
      	if(n%2==1){
      		ah[i]=a[i+n/2+1];
      	}else{
      		ah[i]=a[i+n/2];
      	}        	
      }
      q1=getMedian(al,n/2);
      q2=getMedian(a,n);
      q3=getMedian(ah,n/2);
      System.out.println(q1);
      System.out.println(q2);
      System.out.println(q3);
  }
  public static int getMedian(int[] c, int l){
  	int med=0;
  	if(l%2==0){
  		med=(c[l/2] + c[l/2-1])/2;
  	}else{
  		med=c[(l-1)/2];
  	}    	
  	return med;
  }*/

//-------------------------------------------------------
//来自https://www.hackerrank.com/challenges/s10-basic-statistics
/*	public static void main(String[] args) {
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
	}*/

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