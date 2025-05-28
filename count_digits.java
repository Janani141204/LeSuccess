import java.util.Scanner;
public class Main
{

    static int count(int n) {
        if (n<10)
        {
        return 1;
        }
        return 1+count(n/10);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(count(n));
    }
}
