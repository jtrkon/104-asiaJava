import java.util.Scanner;
import java.util.Random;
public class recursive1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		Random rdn=new Random();
		int r = rdn.nextInt(1001);
		System.out.print(r+"\t");
	    fun(r);
		
	}
public static void fun(int n){
	int v1=(n-(n%1000))/1000;
	System.out.print("千 = "+v1+"\t");
	n = n%1000;
	int v2=(n-(n%100))/100;
	System.out.print("百 = "+v2+"\t");
	n = n%100;
	int v3=(n-(n%10))/10;
	System.out.print("十 = "+v3+"\t");
	n = n%10;
	int v4=n-(n%1);
	System.out.print("個 = "+v4);
}
}
