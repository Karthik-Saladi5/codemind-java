import java.util.*;
public class demo{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String octalString=sc.next();
      int octalDecimal=Integer.parseInt(octalString,8);
      System.out.println(octalDecimal);
    }
}