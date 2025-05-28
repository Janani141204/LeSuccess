import java.util.*;
public class Main{
  public static void main(String[] a){
    String s=new Scanner(System.in);
    String r="";
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      int x=0;
      for(int j=0;j<r.length();j++){
        if(r.charAt(j)==c){
          x=1;
          break;
        }
      }
      if(x==0)
      {r+=c;
    }
    }
    System.out.println(r);
  }
}
