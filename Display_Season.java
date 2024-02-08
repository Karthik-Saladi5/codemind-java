import java.util.*;
public class demo{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String ans;
      if(n==2 || n==3) ans="Spring";
      else if(n==4 || n==5 || n==6) ans="Summer";
      else if(n==11 || n==12 || n==1) ans="Winter";
      else if(n==7 || n==8 || n==9 || n==10) ans="Rainy";
      else ans="-1";
      System.out.println(ans);
    }
}