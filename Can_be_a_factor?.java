import java.util.*;
public class demo{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=Math.abs(a-b);
          System.out.println(c>=a || a==b ? "YES" : "NO");
      }
    }
}