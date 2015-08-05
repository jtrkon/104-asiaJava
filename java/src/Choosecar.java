import java.util.Scanner;
public class Choosecar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入傾角");
		int D=scn.nextInt();
		System.out.println("請輸入兩輪軸心之軸距");
		int R=scn.nextInt();
		System.out.println("請輸入輪胎尺寸");
		int S=scn.nextInt();
		
		if(D>=43 && R>=130 && S==12){
			System.out.println("是");
		}else{
			System.out.println("不是");
		}
		
	}

}
