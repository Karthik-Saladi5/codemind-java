import java.util.*;
public class demo{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      System.out.println(a<3 ? "LIGHT" : (a>=3 && a<7 ? "MODERATE" : "HEAVY"));
    }
}