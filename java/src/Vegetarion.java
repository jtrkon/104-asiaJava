import java.util.Scanner;
public class Vegetarion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入今天是星期幾");
		int D=scn.nextInt();
		System.out.println("請輸入今天日期是幾號");
		int M=scn.nextInt();
		
		if(M == 7 || M == 17 || M == 27){
			System.out.println("今天吃肉");
		}else{
			if(D == 2 || D == 4 || D == 6){
				System.out.println("今天吃素");
			}else{
				System.out.println("今天吃肉");
			}
		}
		
	}

}
