import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine(),w=sc.next();
    String[] a=s.split(" ");
    int c=0;
    for(int i=0;i<a.length;i++)
      if(a[i].equals(w))c++;
    System.out.println(c);
  }
}
