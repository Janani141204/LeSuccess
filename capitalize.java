import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String[] words=s.split(" ");
    String res="";
    for (int i=0;i<words.length; i++) {
      if (words[i].length()>0) {
        res+=words[i].substring(0,1).toUpperCase()+words[i].substring(1);
        if (i<words.length-1)
        {
            res+=" ";
      }
    }
    }
    System.out.println(res);
  }
}
