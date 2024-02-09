import java.util.*;
public class demo{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(),c=0;
      for(int i=2;i<n;i++) if(n%i==0) c++;
      System.out.println(c==0 ? "Prime" : "Not Prime");
    }
}