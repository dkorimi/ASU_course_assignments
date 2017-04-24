import java.util.*;
import java.lang.*;
import java.io.*;

public class GeekCoffee {
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		for (int i = 0;i<n;i++) {
			a[i] = reader.nextInt();
			b[i] = reader.nextInt();
			
			if (b[i] == 1) {
				c[i] = a[i];
			} else {
			
			for (int j = 0; j <b[i]-1; j++) {
				c[i] = a[i]/2;
				a[i] = c[i];
				}
			}
		}
	
		for (int k = 0; k<n;k++) {
			System.out.println(c[k]);
		}
	
	}

}
