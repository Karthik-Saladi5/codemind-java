import java.util.*;
public class demo{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String yearString=sc.next();
      char[] year=yearString.toCharArray();
      System.out.println(year[2]+""+year[3]);
    }
}