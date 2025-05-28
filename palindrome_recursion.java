import java.util.Scanner;
public class Main {
    static boolean palind(String s,int i) {
        if (i>=s.length()/2) {
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-1-i)) 
        {
            return false;
        }
        return palind(s,i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if (palind(s,0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

