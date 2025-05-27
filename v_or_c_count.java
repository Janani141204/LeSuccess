import java.util.*;
public class Main{
  public static void main(String[] args){
    String s=new Scanner(System.in).nextLine().toLowerCase();
    int v=0,c=0;
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(ch>='a'&&ch<='z'){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')v++;
        else c++;
      }
    }
    System.out.println("Vowels: "+v+", Consonants: "+c);
  }
}
