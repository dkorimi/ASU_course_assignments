import java.util.Scanner;

public class RotateStrings {
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		String a[] =new String[t];
		String b[] = new String[t];
		reader.nextLine();
		for(int i=0;i<t;i++) {
			a[i] = reader.nextLine();
			b[i] = reader.nextLine();
		}
		
		String c = rotateClock(b[0]);
		String d = rotateAntiClock(b[0]);
		
		
	}
	
	public static String rotateClock(String str) {
		int l = str.length();
		String st = str.substring(0, 2);
		String st1 = str.substring(2,l);
		System.out.println(st1+st);
		return st1;
	}
	
	public static String rotateAntiClock(String str) {
		int l = str.length();
		String st = str.substring(l-2,l);
		String st1 = str.substring(0,l-2);
		System.out.println(st+st1);
		return st1;
	}

}
