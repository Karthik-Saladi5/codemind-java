import java.util.*;
public class demo{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int cp=sc.nextInt();
      int sp=sc.nextInt();
      double ans=((cp-sp)/(double)cp)*100.0;
      System.out.printf("%.2f",ans);
    }
}