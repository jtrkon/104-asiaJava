import java.util.Scanner;
public class drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入飲料店名稱");
		String N=scn.next();
		System.out.print("請輸入飲料名稱");
		String D=scn.next();
		System.out.print("請輸入價錢");
		int M=scn.nextInt();
		
		if(N.equals("五十嵐")){
			System.out.print("不是");
		}else{
			if(M >= 45){
				System.out.print("不是");
			}else{
				if(D.equals("綠茶") || D.equals("咖啡")){
					System.out.print("是");
				}else{
					System.out.print("不是");
				}
			}
		}
		
	}

}
