import java.util.*;
public class demo{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      double b=sc.nextDouble(),
      hra=sc.nextDouble(),
      da=sc.nextDouble();
      System.out.printf("%.2f
%.2f",b*0.12,b+hra+da+0.12*b);
    }
}