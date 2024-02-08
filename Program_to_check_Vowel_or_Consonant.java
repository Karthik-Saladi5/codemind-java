import java.util.*;
public class demo{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      char a=sc.next().charAt(0);
      String ans;
      if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
      ans="Vowel";
    else ans="Consonant";
      System.out.println(ans);
    }
}