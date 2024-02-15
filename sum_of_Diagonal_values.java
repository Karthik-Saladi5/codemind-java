import java.util.*;
public class demo{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(),m=sc.nextInt(),s=0;
      int[][] arr=new int[n][m];
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
            if(i==j || i+j==n-1) s+=arr[i][j];
          }
      }
      System.out.println(s);
    }
}