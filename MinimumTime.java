import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumTime {
	public static void main (String[] args) {
	Scanner reader = new Scanner(System.in);
	int n = reader.nextInt();
	int a[] = new int[n];
	List<Integer> list = new ArrayList<>();
	
	for (int i = 0;i<n;i++) {
		a[i] = reader.nextInt();
		int c[] = new int[a[i]];
		int d[] = new int[a[i]];
		int s=0;
		int t=0;
		int sum=0;
		int sum1 =0;
		
		
		for (int j = 0;j<a[i];j++) {
			c[j] = reader.nextInt();
			sum = sum + c[j];
		}
		for (int j = 0;j<a[i];j++) {
			d[j] = reader.nextInt();
			sum1 = sum1 + d[j];
		}
		
		for (int k =0;k<a[i];k++) {
			s = s+ c[k];
			k++;
		}
		for (int k =0;k<a[i];k++) {
			t = t+ d[k];
			k++;
		}
		if (((sum-s)+t) > ((sum1-t)+s)) {
			list.add((sum1-t)+s);
		} else {
			list.add((sum-s)+t);
		}
	}
	
	for (int p=0;p<list.size();p++) {
		System.out.println(list.get(p));
	}
}
}
