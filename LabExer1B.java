import java.util.Scanner;
public class LabExer1B{
	public static void main
		(String[]args){
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the integer");
		int x = sc.nextInt();
		
		showNumberPlus10(x);
		showNumberPlus100(x);
		showNumberPlus1000(x);
	}
		
		public static void showNumberPlus10(int xwes)
			{
			 xwes = xwes + 10;
			System.out.println("plus 10 is" +xwes);
		}
		
			public static void showNumberPlus100(int wes1)
			{
			 wes1 = wes1 + 100;
			System.out.println("plus 100 is" +wes1);
		}
		
			public static void showNumberPlus1000(int wes2)
			{
			wes2 = wes2 + 1000;
			System.out.println("plus 1000 is" +wes2);
		}
		
}