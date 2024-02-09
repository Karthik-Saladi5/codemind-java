import java.util.*;
public class demo{
    static boolean check(String n){
        // if(n.length()>10) return false;
        char[] arr=n.toCharArray();
        for(int i=0;i<=6;i++){
            if(arr[i]==arr[i+1] && arr[i]==arr[i+2]) return true;
            if(arr[i]==arr[i+1]+1 && arr[i+1]==arr[i+2]+1) return true;
            if(arr[i]==arr[i+1]-1 && arr[i+1]==arr[i+2]-1) return true;
        }
        for(char digit='0';digit<='9';digit++){
            int c=0;
            for(int i=0;i<10;i++){
                if(arr[i]==digit) c++;
            }
            if(c>=5) return true;
        }
        return false;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String n=sc.next();
      if(n.length()!=10) {
         System.out.println(-1);
         return;
      }
      System.out.println(check(n) ? "FANCY NUMBER":"NOT A FANCY NUMBER");
    }
}