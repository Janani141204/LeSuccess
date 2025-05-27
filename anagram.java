import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str1=sc.next();
    String str2=sc.next();
    char[] s1=str1.toCharArray();
    char[] s2=str2.toCharArray();
    Arrays.sort(s1);
    Arrays.sort(s2);
    if(Arrays.equals(s1,s2)){
      System.out.println("anagram");
    } else {
      System.out.println("not anagram");
    }
  }
}
