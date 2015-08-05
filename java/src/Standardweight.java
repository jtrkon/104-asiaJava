import java.util.Scanner;
public class Standardweight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入性別   男:1  女:2");
		int S=scn.nextInt();
		System.out.print("請輸入身高");
		int H=scn.nextInt();
		double W;
		
		if(S == 1){
			W = (H - 170) * 0.6 + 62;
			System.out.print("標準體重:"+W);
		}else{
			W = (H - 158) * 0.5 + 52;
			System.out.print("標準體重:"+W);
		}
		
	}

}
