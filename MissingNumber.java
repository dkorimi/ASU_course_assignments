import java.util.Scanner;

public class MissingNumber {
	public static void main (String[] args) {	
		Scanner reader = new Scanner(System.in);
	    int a = reader.nextInt();
	    int t = 0;
	    int p = 0;
	    int d[] = new int[a];
	    for (int j = 0; j <a; j++) {
	    	int b = reader.nextInt();
	    	int c[] = new int[b];
	    		for (int i = 0 ;i<b-1;i++) {
	    			c[i] = reader.nextInt();	    			
	    		}
	    		for (int k = 1; k<b+1;k++){
	    			for(int l = 0;l<b-1;l++){
	    				if( k != c[l]){
	    				t++;
	    				}
	    			}
	    			if(t == b-1) {
	    				d[p] = k;
	    				p++;
	    			}
	    			t=0;
	    		}
	    }	    
	    for (int q = 0;q<a;q++) {
	    	System.out.println(d[q]);
	    }	    
	}
}
