import java.util.*;

public class Chocolate_factory_leetcode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt();
		}
		int in = 0;
		for(int j=0;j<n;j++) {
			if(ar[j]!=0) {
				ar[in++] = ar[j];
			}
		}
		if(in<n) {
			for(int i=in;i<n;i++) {
				ar[i]=0;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(ar[i] + " ");
		}
	}
}