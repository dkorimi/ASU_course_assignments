import java.util.Scanner;
import java.lang.*;

public class ProductOfNumbers {
public static void main (String[] args) {
		
		Scanner reader = new Scanner(System.in);
	    int t = reader.nextInt();
	    int a[] = new int[t];
	    int b[] = new int[t];
	    int p = 0;
	    for (int i = 0;i<t;i++){
	    	a[i] = reader.nextInt();
	    	int c[] = new int[a[i]];
	    	int k =0;
	    	int sum =0; 	    	
	    	for (int j = 1;j<a[i]+1;j++){
	    		c[k]= (int) (Math.floor(a[i]/j));
	    		sum = sum + c[k]*j;
	    		k++;
	    	}	    	
	    	b[p] = sum;
	    	p++;
	    }	    
	    for (int l =0; l<t;l++){
	    	System.out.println(b[l]);
	    }
	}
}
