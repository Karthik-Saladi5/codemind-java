import java.util.*;
public class demo{
    static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i*i<=n;i++) if(n%i==0) return false;
        return true;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      int n=sc.nextInt(),c=0;
      for(int i=m;i<=n;i++) if(isPrime(i)) c++;
      System.out.println(c);
    }
}