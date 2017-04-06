import java.util.Scanner;

public class ReplaceTheBit {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		int a[] = new int[t];
		int b[] = new int[t];
		int c[] = new int[t];
		int k = 0;
		char v1 = 0;
		for(int i=0;i<t;i++){
			a[i] = reader.nextInt();
			b[i] = reader.nextInt();
			b[i] = b[i] - 1;
			String bit = Integer.toBinaryString(a[i]);
			char[] bitString = bit.toCharArray();
			char var = bitString[b[i]];
			if (Character.getNumericValue(var) == 1) {
				bitString[b[i]] = '0';
				bit = String.valueOf(bitString);
				c[k] = Integer.parseInt(bit, 2);
			} else {
				c[k] = Integer.parseInt(bit, 2);
			}			
			k++;
		}		
		for (int l =0; l<t;l++){
	    	System.out.println(c[l]);
	    }
	}
}
