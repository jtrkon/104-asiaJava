import java.util.Scanner;
public class university21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入上學期總學分");
		int U=scn.nextInt();
		System.out.print("請輸入下學期總學分");
		int D=scn.nextInt();
		
		if(U + D >= 22){
			System.out.print("在學");
		}else{
			System.out.print("退學");
		}
		
	}

}
