import java.util.*;
public class demo{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t!=0){
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
          System.out.println(a>(b+c) || b>(a+c) || c>(a+b) ? "YES":"NO");
          t--;
      }
    }
}