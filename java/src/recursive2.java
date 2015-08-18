import java.util.Scanner;
import java.util.Random;
public class recursive2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		Random rdn=new Random();
		int n = rdn.nextInt(1001);
		System.out.print(n+"\t");
	    fun(n);
		
	}
public static void fun(int n){
	int v1=(n-(n%100))/100;
	if(v1>5){
		System.out.print("500 : "+1+"\t");
		v1 = v1-5;
		System.out.print("100 : "+v1+"\t");
	}else{
		System.out.print("500 : "+0+"\t");
		System.out.print("100 : "+v1+"\t");
	}
	n = n%100;
	int v2=(n-(n%10))/10;
	if(v2>5){
		System.out.print("50 : "+1+"\t");
		v2 = v2-5;
		System.out.print("10 : "+v2+"\t");
	}else{
		System.out.print("50 : "+0+"\t");
		System.out.print("10 : "+v2+"\t");
	}
	n = n%10;
	int v3=n-(n%1);
	if(v3>5){
		System.out.print("5 : "+1+"\t");
		v3 = v3-5;
		System.out.print("1 : "+v3+"\t");
	}else{
		System.out.print("5 : "+0+"\t");
		System.out.print("1 : "+v3+"\t");
	}
}
}
