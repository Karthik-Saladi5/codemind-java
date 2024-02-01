import java.util.*;
public class demo{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt(), c=sc.nextInt();
      double s=(a+b+c)/2.0;
      double ans=Math.sqrt(s*(s-a)*(s-b)*(s-c)*1.0);
      System.out.printf("%.2f",ans);
    }
}