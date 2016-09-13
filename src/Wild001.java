import java.util.Scanner;

public class Wild001 {
//来自https://www.hackerrank.com/challenges/java-stdin-stdout
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // 用来clean buffer的
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
//nextInt 一直往下走直到读到一个整数；nextDouble 一直往下走直到读到一个浮点数

//如果依次输入：   2 回车 3.14 回车 "A Be Pi" 回车
//buffer里是 2①\n3.14③\n④A Be Pi\n⑤

//nextInt()一下读了一个2，scan变指在①
//nextDouble()一下读到3.14，scan变指到③
//如果此时直接 String s = scan.nextLine();，那么读到的是③和④之间的内容<即没有内容，最后一个换行符表示“一行读完了”>

//所以需要先 scan.nextLine(); 让 scaner “读完一行”（变指到④处）
//这样才能读到A Be Pi，并能因为⑤前的\n而知这行读完了