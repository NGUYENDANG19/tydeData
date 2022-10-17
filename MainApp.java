package Basic.dev;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var Scanner = new Scanner(System.in);
		System.out.println("nhap vao 3 so thuc duong a, b, c:");
		
		var a = Scanner.nextDouble();
		var b = Scanner.nextDouble();
		var c = Scanner.nextDouble();
		
		if (a<=0 || b<=0 || c<=0 )	{
			System.out.println("khong");
		}else if	((a+b>c) || (a+c>b) && (b+c>a))	{
			System.out.println("co");
		}else {
			System.out.println("khong");
		}
		
		
	}

}
