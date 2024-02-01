import java.util.*;
public class demo{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int s=sc.nextInt();
      System.out.println("H:M:S-"+s/3600+":"+(s%3600)/60+":"+s%60);
    }
}