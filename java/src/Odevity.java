import java.util.Scanner;
public class Odevity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一個整數");
		int A=scn.nextInt();
		
		if(A%2 == 0){
			System.out.print(A+"為偶數");
		}else{
			System.out.print(A+"為奇數");
		}
		
	}

}
