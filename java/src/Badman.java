import java.util.Scanner;
public class Badman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入身高");
		int H=scn.nextInt();
		System.out.println("請輸入體重");
		int W=scn.nextInt();
		if(H>=165 && W<=45){
			System.out.println("追");
		}else{
			System.out.println("不追");
		}
		
	}

}
